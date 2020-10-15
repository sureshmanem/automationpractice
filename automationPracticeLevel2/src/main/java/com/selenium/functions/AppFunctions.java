package com.selenium.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.selenium.interfaces.AppObjects;
import com.selenium.setup.DriverSetup;

public class AppFunctions implements AppObjects{
	
	static WebDriverWait wait = new WebDriverWait(DriverSetup.driver, 10);

	public static void fnClick(By objName,String objDescription) {
		
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(objName));
			if(DriverSetup.driver.findElement(objName).isDisplayed()) {
				DriverSetup.driver.findElement(objName).click();
				Reporter.log("Clicked on " + objDescription);
			}else {
				Reporter.log("The "+objName+" is not dispalyed");
			}
		}catch(Exception e) {
			Reporter.log("Click function exception reported for " + objName + " and exception is " + e);
		}
	}
	
	public static void fnEnterValue(By objName,String strValue,String objDescription) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(objName));
			if(DriverSetup.driver.findElement(objName).isDisplayed()) {
				DriverSetup.driver.findElement(objName).clear();
				DriverSetup.driver.findElement(objName).sendKeys(strValue);
				Reporter.log("The value entered for " + objDescription + " is "+strValue);
			}else {
				Reporter.log("The "+objName+" is not dispalyed");
			}
		}catch(Exception e) {
			Reporter.log("Enter function exception reported for " + objName + " and exception is " + e);
		}
	}
	
	public static void fnSelectByText(By objName,String strValue,String objDescription) {
		try {
			
			
				Select stState = new Select(DriverSetup.driver.findElement(objName));
				stState.selectByVisibleText(strValue);
				Reporter.log("The value selected for " + objDescription + " is "+strValue);
			
		}catch(Exception e) {
			Reporter.log("Enter function exception reported for " + objName + " and exception is " + e);
		}
	}
	
	public static void fnGetText(By objName,String objDescription) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(objName));
			if(DriverSetup.driver.findElement(objName).isDisplayed()) {
				Reporter.log("The Value for " + objDescription + " is "+DriverSetup.driver.findElement(objName).getText().trim());
			}else {
				Reporter.log("The "+objName+" is not dispalyed");
			}
		}catch(Exception e) {
			Reporter.log("GetText function exception reported for " + objName + " and exception is " + e);
		}
	}
	
	public static void fnMouseOver(By objName,String objDescription) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(objName));
			if(DriverSetup.driver.findElement(objName).isDisplayed()) {
				Actions actions = new Actions(DriverSetup.driver);
				WebElement target = DriverSetup.driver.findElement(objName);
				actions.moveToElement(target).perform();
			}else {
				Reporter.log("The "+objName+" is not dispalyed");
			}
		}catch(Exception e) {
			Reporter.log("GetText function exception reported for " + objName + " and exception is " + e);
		}
	}
	
	
}
