package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.AddCartPage;

public class AddCartTest extends ProductsTest {

	@Test(priority = 38)
	public void VerifyCartPageTitle() {

		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.clickOnCart();
		addCartPage.getCartPageTitle();
		Assert.assertEquals(addCartPage.getCartPageTitle(), prop.getProperty("ExpectedCartPageTitle"));
	}

	@Test(priority = 39)
	public void verifyProductName() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.getProductName();
		Assert.assertEquals(addCartPage.getProductName(), prop.getProperty("ProductNameOnCartPage"));
	}

	@Test(priority = 40)
	public void VerifyProductPriceNavigate() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.getProductPrice();
		Assert.assertTrue(addCartPage.getProductPrice());
	}

	@Test(priority = 41)
	public void verifyProductAvailableInStock() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.checkProductAvailableInStock();
		Assert.assertTrue(addCartPage.checkProductAvailableInStock());
	}

	@Test(priority = 42)
	public void verifyProductImageNavigate() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.checkProductImageNavigate();
		Assert.assertTrue(addCartPage.checkProductImageNavigate());
	}

	@Test(priority = 43)
	public void verifyGiftCheckBoxCheckUnchecked() throws InterruptedException {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.clickOnUnCheckCheckBox();
		addCartPage.clickOnCheckCheckBox();
	}

	@Test(priority = 44)
	public void verifyQuantityDropDownNavigate() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.checkQuantityDropDownNavigate();
		Assert.assertTrue(addCartPage.checkQuantityDropDownNavigate());

	}

	@Test(priority = 45)
	public void VarifyApplyQuantityWisePrice() throws InterruptedException {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.clickOnQuantityDropDown();
		addCartPage.clickOnQuantity4();
		Assert.assertTrue(addCartPage.checkApplyQuantityPrice());

	}

	@Test(priority = 46)
	public void verifyDeleteOptionNavigate() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.checkDeleteOptionNavigate();
		Assert.assertTrue(addCartPage.checkDeleteOptionNavigate());

	}

	@Test(priority = 47)
	public void verifyProceedToBuyButtonNavigate() {
		AddCartPage addCartPage = new AddCartPage(driver);
		addCartPage.checkProceedToBuyButtonNavigate();
		Assert.assertTrue(addCartPage.checkProceedToBuyButtonNavigate());

	}

}