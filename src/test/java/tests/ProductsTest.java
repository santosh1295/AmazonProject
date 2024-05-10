package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.ProductsPage;

public class ProductsTest extends SearchTest {

	@Test(priority = 24)
	public void verifyproductsPageTitle() {

		ProductsPage productspage = new ProductsPage(driver);
		Assert.assertEquals(productspage.getProductsPageTitle(), prop.getProperty("ExpectedProductsPageTitle"));

	}

	@Test(priority = 25)
	public void verifySortByFeatureNavigateOnProductsPage() {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.SortByFeatureNavigate();
		Assert.assertTrue(productspage.SortByFeatureNavigate());

	}

	@Test(priority = 26)
	public void verifySortByFeatureApplyWithLowToHighPriceOnProductsPage() {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickonSortByFeatureDropDownMenu();
		productspage.clickOnLowToHighPriceOption();

	}

	@Test(priority = 27)
	public void verifySortByFeatureApplyWithHighToLowPriceOnProductsPage() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickonSortByFeatureDropDownMenu1();
		productspage.clickOnHighToLowPriceOption();

	}

	@Test(priority = 28)
	public void verifySortByFeatureApplyWithAvgCustomerReviewOnProductsPage() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickonSortByFeatureDropDownMenu2();
		productspage.clickOnAvgCustomerReviewOption();

	}

	@Test(priority = 29)
	public void verifySortByFeatureApplyWithNewestArrivalsOnProductsPage() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickonSortByFeatureDropDownMenu3();
		productspage.clickOnNewestArrivalsOption();

	}

	@Test(priority = 30)
	public void verifyAvilablePriceRangeOptionApplyForPriceFilterOnProductsPage() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickOn₹1000_₹5000PriceRange();

	}

	@Test(priority = 31)
	public void MinMaxPriceFilterBoxWorkingOnProductsPage() {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickOn₹1000_₹5000PriceRange();
		productspage.clickOnMinPriceFilterBox(prop.getProperty("ValidMinPrice"));
		productspage.clickOnMaxPriceFilterBox(prop.getProperty("ValidMaxPrice"));
		productspage.clickOnPriceFilterGoButton();

	}

	@Test(priority = 32)
	public void verifyProductPageTitle() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickOnProduct();
		productspage.getProductPageTitle();
		Assert.assertEquals(productspage.getProductPageTitle(), prop.getProperty("ExpectedProductPageTitle"));

	}

	@Test(priority = 33)
	public void verifyProductNameNavigateOnProductPageAndValidateWithValidProductName() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.navigateProductName();
		productspage.getProductName();
		Assert.assertEquals(productspage.getProductName(), prop.getProperty("validproduct"));

	}

	@Test(priority = 34)
	public void verifyProductPriceNavigateOnProductPage() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.navigateProductPrice();
		Assert.assertTrue(productspage.navigateProductPrice());

	}

	@Test(priority = 35)
	public void verifyProductAvilableInStockOnProductPage() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.checkProductAvilableInStockText();
		Assert.assertEquals(productspage.checkProductAvilableInStockText(), prop.getProperty("ProductAvilable"));

	}

	@Test(priority = 36)
	public void verifyAddToCartButtonNavigateOnProductPage() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.AddToCartButtonNavigate();
		Assert.assertTrue(productspage.AddToCartButtonNavigate());

	}

	@Test(priority = 37)
	public void verifyProductAddToCart() throws InterruptedException {

		ProductsPage productspage = new ProductsPage(driver);
		productspage.clickOnAddToCartButton();
		Assert.assertEquals(productspage.getMassageProductAddedToCart(), prop.getProperty("ProductAddedToCartMessage"));

	}

}