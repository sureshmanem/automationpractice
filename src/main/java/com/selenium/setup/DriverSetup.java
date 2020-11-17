package com.selenium.setup;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class DriverSetup {

	public static WebDriver driver;
	public String workingDir = System.getProperty("user.dir");
	public Properties properties = null;
	
	@BeforeSuite
	public void readExcelFile(){
		String configFile = workingDir + "/config/AppConfig.properties";

		try {
			File file = new File(configFile);
			FileInputStream fileInput = new FileInputStream(file);
			properties = new Properties();
			properties.load(fileInput);
			fileInput.close();
		} catch (Exception e) {
			Reporter.log("Config File Loading Failed");
		}
	}
	
	@BeforeTest
	public void fnLaunchBrowser() {
		
		String browserName = properties.getProperty("browser");

		if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", workingDir + "/resources/geckodriver");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		driver.navigate().to(properties.getProperty("appURL"));
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
