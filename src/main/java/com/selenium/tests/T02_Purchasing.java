package com.selenium.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.interfaces.AppObjects;
import com.selenium.reusables.AppFunctions;
import com.selenium.setup.DriverSetup;
import com.selenium.setup.ExcelUtils;

public class T02_Purchasing extends DriverSetup implements AppObjects {

	@Test(dataProvider = "customer_information")
	public void testPurchasing(String strFname, String strLName, String strEmail, String strPassword, String AFName,
			String ALName, String strAddr, String strCity, String strState, String strZip, String strCountry,
			String strMobile, String strAlias) throws Exception {

		AppFunctions.fnClick(btnSignIn, "Sign In");
		AppFunctions.fnEnterValue(txtEmailID, strEmail, "Email ID");
		AppFunctions.fnEnterValue(txtPassword, strPassword, "Password");
		AppFunctions.fnClick(btnSubmitLogin, "Submit Login");
		AppFunctions.fnMouseOver(lnkWoman, "Women Link");
		AppFunctions.fnClick(lnkWomanTShirt, "T-Shirt");
		AppFunctions.fnClick(imgMerchandise, "Merchandise");
		AppFunctions.fnClick(lnkAddToCart, "Add-To-Cart");
		AppFunctions.fnGetText(lblProductPrice, "Product Price");
		AppFunctions.fnGetText(lblTotalPrice, "Total Price");
		AppFunctions.fnClick(lnkProceed, "Proceed");
		AppFunctions.fnClick(lnkSummaryProceed, "Proceed Summary");
		AppFunctions.fnClick(lnkProcessAddress, "Process Address");
		AppFunctions.fnClick(chkAgree, "Agree");
		AppFunctions.fnClick(lnkProcessCarrier, "Process Carrier");
		AppFunctions.fnClick(lnkPayByBank, "PayByBank");
		AppFunctions.fnClick(lnkConfirmOrder, "Confirm Order");
		AppFunctions.fnGetText(lblConfirmation, "Final Confirmation");
		AppFunctions.fnClick(lblIUserName, "User Name");
		AppFunctions.fnClick(lblOrderHistory, "Order History");
		AppFunctions.fnGetText(lblOrderReference, "Order Reference");
		AppFunctions.fnGetText(lblOrderTotalPrice, "Order Price");
		AppFunctions.fnClick(btnLogout, "LogOut");
		AppFunctions.fnGetText(btnSignIn, "Home Page");
	}

	@DataProvider(name = "customer_information")
	public Object[][] getExcelData() throws Exception {
		return ExcelUtils.readExcelData("customer_information");
	}
}
