package com.selenium.interfaces;

import org.openqa.selenium.By;

public interface AppObjects {
	
	public static By btnSignIn = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a");
	public static By txtEmail = By.id("email_create");
	public static By btnEmailCreate = By.id("SubmitCreate");
	public static By lblErrorMessage = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[1]/ol/li");
	
	public static By txtFirstName = By.id("customer_firstname");
	public static By txtLastName = By.id("customer_lastname");
	public static By txtPassword = By.id("passwd");
	
	public static By txtAFirstName = By.id("firstname");
	public static By txtALastName = By.id("lastname");
	public static By txtAddress = By.id("address1");
	public static By txtCity = By.id("city");
	public static By dlState = By.id("id_state");
	public static By txtZipCode = By.id("postcode");
	public static By dlCountry = By.id("id_country");
	public static By txtMobile = By.id("phone_mobile");
	public static By txtAddr = By.id("alias");
	public static By btnRegister = By.id("submitAccount");
	
	public static By btnLogout = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[2]/a");

	public static By txtEmailID = By.id("email");
	public static By btnSubmitLogin = By.id("SubmitLogin");
	public static By lblIUserName = By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a/span");
	
	public static By lnkWoman = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a");
	public static By lnkWomanTShirt = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/ul/li[1]/ul/li[1]/a");
	public static By imgMerchandise = By.xpath("/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[2]/h5/a");
	public static By lnkAddToCart = By.id("add_to_cart");
	public static By lblProductPrice = By.id("layer_cart_product_price");
	public static By lblTotalPrice = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[3]/span");
	public static By lnkProceed = By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a");
	public static By lnkSummaryProceed = By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]");
	public static By lnkProcessAddress = By.name("processAddress");
	// public static By chkAgree = By.id("cgv");
	public static By chkAgree = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span");
	public static By lnkProcessCarrier = By.name("processCarrier");
	public static By lnkPayByBank = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a");
	public static By lnkConfirmOrder = By.xpath("/html/body/div/div[2]/div/div[3]/div/form/p/button/span");
	public static By lblConfirmation = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/p/strong");
	
	public static By lblOrderHistory = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[1]/ul/li[1]/a/span");
	public static By lblOrderReference = By.xpath("/html/body/div/div[2]/div/div[3]/div/div/table/tbody/tr/td[1]/a");
	public static By lblOrderTotalPrice = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/table/tbody/tr[1]/td[3]/span");

}
