package com.selenium.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.functions.AppFunctions;
import com.selenium.interfaces.AppObjects;
import com.selenium.setup.DriverSetup;
import com.selenium.setup.ExcelUtils;

public class Registration extends DriverSetup implements AppObjects {

	
	WebDriver driver;

	@Test(dataProvider = "customer_information")
	public void testRegistration(String strFname, String strLName, String strEmail, String strPassword,
			String strAFName, String strALName, String strAddr, String strCity, String strState, String strZip,
			String strCountry, String strMobile, String strAlias) throws Exception {

		AppFunctions.fnClick(btnSignIn,"Sign In");
		AppFunctions.fnEnterValue(txtEmail, strEmail, "Email ID");
		AppFunctions.fnClick(btnEmailCreate,"Sign In");

		AppFunctions.fnEnterValue(txtFirstName, strFname, "First Name");
		AppFunctions.fnEnterValue(txtLastName, strLName, "Last Name");
		AppFunctions.fnEnterValue(txtPassword, strPassword, "Password");
		AppFunctions.fnEnterValue(txtAFirstName, strAFName, "Address First Name");
		AppFunctions.fnEnterValue(txtALastName, strALName, "Address Last Name");
		AppFunctions.fnEnterValue(txtAddress, strAddr, "Address");
		AppFunctions.fnEnterValue(txtCity, strCity, "City");
		AppFunctions.fnSelectByText(dlState, strState, "State");
		AppFunctions.fnEnterValue(txtZipCode, strZip, "Zip Code");
		AppFunctions.fnSelectByText(dlCountry, strCountry, "Country");
		AppFunctions.fnEnterValue(txtMobile, strMobile, "Zip Code");
		AppFunctions.fnEnterValue(txtAddr, strAlias, "Zip Code");
		AppFunctions.fnClick(btnRegister, "Register");
		AppFunctions.fnClick(btnLogout, "LogOut");

	}

	@DataProvider(name = "customer_information")
	public Object[][] getExcelData() throws Exception {
		return ExcelUtils.readExcelData("customer_information");
	}
}
