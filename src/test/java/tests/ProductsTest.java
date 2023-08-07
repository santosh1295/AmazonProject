package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.ProductsPage;

public class ProductsTest extends Base{
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
	public void verifyproductsPageTitle() {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.searchProductOnSearchBox(prop.getProperty("validproduct"));
		productspage.clickOnSearchIcon();
		Assert.assertEquals(productspage.getProductsPageTitle(),prop.getProperty("ExpectedProductsPageTitle"));

	}
	
	@Test(priority=2)
	public void verifySortByFeatureNavigateOnProductsPage() {
	
		ProductsPage productspage = new ProductsPage(driver);
		productspage.SortByFeatureNavigate();
		Assert.assertTrue(productspage.SortByFeatureNavigate());
		
	}
	
	@Test(priority=3)
	public void verifySortByFeatureApplyWithLowToHighPriceOnProductsPage() {
	
		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickonSortByFeatureDropDownMenu();
		productspage.clickOnLowToHighPriceOption();
		
	}
	
	@Test(priority=4)
	public void verifySortByFeatureApplyWithHighToLowPriceOnProductsPage() throws InterruptedException {
	
		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickonSortByFeatureDropDownMenu1();
		productspage.clickOnHighToLowPriceOption();
		
	}
	
	@Test(priority=5)
	public void verifySortByFeatureApplyWithAvgCustomerReviewOnProductsPage() throws InterruptedException {
	
		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickonSortByFeatureDropDownMenu2();
		productspage.clickOnAvgCustomerReviewOption();
		
	}
	
	@Test(priority=6)
	public void verifySortByFeatureApplyWithNewestArrivalsOnProductsPage() throws InterruptedException {
	
		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickonSortByFeatureDropDownMenu3();
		productspage.clickOnNewestArrivalsOption();
		
	}
	
	@Test(priority=7)
	public void verifyAvilablePriceRangeOptionApplyForPriceFilterOnProductsPage() throws InterruptedException {
		
		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickOn₹1000_₹5000PriceRange();
		
	}
	
	
	@Test(priority=8)
	public void MinMaxPriceFilterBoxWorkingOnProductsPage() {
		
		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickOn₹1000_₹5000PriceRange();
		productspage.clickOnMinPriceFilterBox(prop.getProperty("ValidMinPrice"));
		productspage.clickOnMaxPriceFilterBox(prop.getProperty("ValidMaxPrice"));
		productspage.clickOnPriceFilterGoButton();
		
	}
	
	@Test(priority=9)
	public void verifyProductPageTitle() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickOnProduct();
		productspage.getProductPageTitle();
		Assert.assertEquals(productspage.getProductPageTitle(),prop.getProperty("ExpectedProductPageTitle"));

	}
	
	@Test(priority=10)
	public void verifyProductNameNavigateOnProductPageAndValidateWithValidProductName() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.navigateProductName();
		productspage.getProductName();
		Assert.assertEquals(productspage.getProductName(),prop.getProperty("validproduct"));

	}
	
	@Test(priority=11)
	public void verifyProductPriceNavigateOnProductPage() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.navigateProductPrice();
		Assert.assertTrue(productspage.navigateProductPrice());

	}
	
	@Test(priority=12)
	public void verifyProductAvilableInStockOnProductPage() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.checkProductAvilableInStockText();
		Assert.assertEquals(productspage.checkProductAvilableInStockText(),prop.getProperty("ProductAvilable"));

	}
	
	@Test(priority=13)
	public void verifyAddToCartButtonNavigateOnProductPage() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.AddToCartButtonNavigate();
		Assert.assertTrue(productspage.AddToCartButtonNavigate());

	}
	
	@Test(priority=14)
	public void verifyProductAddToCart() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickOnAddToCartButton();
		Assert.assertEquals(productspage.getMassageProductAddedToCart(),prop.getProperty("ProductAddedToCartMessage"));

	}
	
}