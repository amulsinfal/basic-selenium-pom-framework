package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;

public class ProductsTest extends BaseTest{
	
	@Test (priority = 1)
	public void verifyProductCount(){
		int actualProductCount = new LoginPage(driver).validLogin("standard_user", "secret_sauce").getProductCount();
		int expectedProductCount = 6;
		Assert.assertEquals(actualProductCount, expectedProductCount, "Products count on the Products page a mis-match.");
	}
	
	@Test (priority = 2)
	public void verifyProductIsPresent(){
		boolean  actualResult = new LoginPage(driver).validLogin("standard_user", "secret_sauce").isProductPresent("Sauce Labs Bike Light");
		Assert.assertTrue(actualResult, "Product missing on the Products page.");
	}
}
