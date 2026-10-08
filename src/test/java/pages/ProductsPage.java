package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

	// members
	private WebDriver driver;

	// Locators
	private By pageHeaderLocator = By.cssSelector("span[data-test='title']");
	private By productsLocator = By.cssSelector("div.inventory_item");
	private By productsNameLocator = By.cssSelector("div[data-test='inventory-item-name']");
	private By menuButtonLocator = By.id("react-burger-menu-btn");
	private By logoutLinkLocator = By.id("logout_sidebar_link");
	
	// Constructor
	public ProductsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Actions/Methods
	public String getPageHeader() {
		return driver.findElement(pageHeaderLocator).getText();
	}

	public int getProductCount() {
		List<WebElement> allProducts = driver.findElements(productsLocator);
		return allProducts.size();
	}

	public boolean isProductPresent(String expProductName) {
		List<WebElement> allProductsName = driver.findElements(productsNameLocator);
		for(int i = 0; i < allProductsName.size(); i++) {
			if(allProductsName.get(i).getText().equalsIgnoreCase(expProductName)){
				return true;
			}
		}
		return false;
	}
	
	public LoginPage clickLogout() {
		driver.findElement(menuButtonLocator).click();
		driver.findElement(logoutLinkLocator).click();
		return new LoginPage(driver);
	}
}
