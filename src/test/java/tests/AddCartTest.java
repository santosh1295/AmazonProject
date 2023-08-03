package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.AccountPage;
import pageobjects.AddCartPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;


public class AddCartTest extends Base{

public WebDriver driver;
	
	@BeforeClass
	public void setup() throws IOException {
	    
		driver = initializeBrowser();
		driver.navigate().to(prop.getProperty("url"));
		
	}
	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
	}
	
	@Test(priority=1)
	public void VerifyCartPageTitle() {
	
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.clickOnsearchBoxField(prop.getProperty("productName"));
		addCartPage.clickOnsubmitField();
		addCartPage.clickOnProduct();
        addCartPage.clickOnAddCart();
        addCartPage.clickOnCart();
        addCartPage.getCartPageTitle();
	    Assert.assertEquals(addCartPage.getCartPageTitle(), prop.getProperty("ExpectedCartPageTitle"));
	}
	
	@Test(priority=2)
	public void verifyProductName() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.getProductName();
		Assert.assertEquals(addCartPage.getProductName(), prop.getProperty("ProductNameOnCartPage"));
	}
	
	@Test(priority=3)
	public void VerifyProductPriceNavigate() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.getProductPrice();
		Assert.assertTrue(addCartPage.getProductPrice());
	}
	
	@Test(priority=4)
	public void verifyProductAvailableInStock() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.checkProductAvailableInStock();
		Assert.assertTrue(addCartPage.checkProductAvailableInStock());
	}
	
	@Test(priority=5)
	public void verifyProductImageNavigate() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.checkProductImageNavigate();
		Assert.assertTrue(addCartPage.checkProductImageNavigate());
	}
	
	@Test(priority=6)
	public void verifyGiftCheckBoxCheckUnchecked() throws InterruptedException {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.clickOnUnCheckCheckBox();
		addCartPage.clickOnCheckCheckBox();
	}
	
	@Test(priority=7)
	public void verifyQuantityDropDownNavigate() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.checkQuantityDropDownNavigate();
		Assert.assertTrue(addCartPage.checkQuantityDropDownNavigate());
		
	} 	
	
	@Test(priority=8)
	public void VarifyApplyQuantityWisePrice() throws InterruptedException {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.clickOnQuantityDropDown();
		addCartPage.clickOnQuantity4();
		Assert.assertTrue(addCartPage.checkApplyQuantityPrice());
		
	} 
	
	@Test(priority=9)
	public void verifyDeleteOptionNavigate() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.checkDeleteOptionNavigate();
		Assert.assertTrue(addCartPage.checkDeleteOptionNavigate());
		
	} 
	@Test(priority=10)
	public void verifyProceedToBuyButtonNavigate() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.checkProceedToBuyButtonNavigate();
		Assert.assertTrue(addCartPage.checkProceedToBuyButtonNavigate());
		
	} 
	
}