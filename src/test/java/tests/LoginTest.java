package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest{
	
	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {
		String actualPageHeader = new LoginPage(driver).validLogin("standard_user", "secret_sauce").getPageHeader();
		String expectedPageHeader = "Products";
		Assert.assertEquals(actualPageHeader, expectedPageHeader, "Page header mis-match.");
	}
	
	@Test(priority = 2)
	public void verifyLoginWithInvalidCredentials() {
		String actualErrorMessage = new LoginPage(driver).invalidLogin("invalid_user", "invalid_pass").getErrorMessage();
		String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mis-match.");
	}
	
	@Test(priority = 3)
	public void verifyLoginWithLockedAccountCredentials() {
		String actualErrorMessage = new LoginPage(driver).invalidLogin("locked_out_user", "secret_sauce").getErrorMessage();
		String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
		Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error message mis-match.");
	}
}
