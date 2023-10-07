package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class HomepageTest extends LoginTest {

	@Test(priority = 4)
	public void validateHomepageTitle() {

		HomePage homePage = new HomePage(driver);
		homePage.ClickOnAmazon();
		homePage.validateHomepageTitle();
		Assert.assertTrue(homePage.validateHomepageTitle().contains(prop.getProperty("pageTitle")));
	}

	@Test(priority = 5)
	public void validateAmazonLogo() {

		HomePage homePage = new HomePage(driver);
		homePage.validateAmazonLogo();

		Assert.assertTrue(homePage.validateAmazonLogo());

	}

	@Test(priority = 6)
	public void validateSelectYourAddressAsLocation() {

		HomePage homePage = new HomePage(driver);
		homePage.validateSelectYourAddress();

		Assert.assertTrue(homePage.validateSelectYourAddress());
	}

	@Test(priority = 7)
	public void verifySearchBoxForSearching() {

		HomePage homePage = new HomePage(driver);
		homePage.validateSearchBox();

		Assert.assertTrue(homePage.validateSearchBox());

	}

	@Test(priority = 8)
	public void validateLanguageDropdown() {

		HomePage homePage = new HomePage(driver);
		homePage.languageDropdown();
		Assert.assertTrue(homePage.languageDropdown());

	}

	@Test(priority = 9)

	public void validateVisibilityOfBurgerMenu() {

		HomePage homePage = new HomePage(driver);
		homePage.burgerIcon();
		Assert.assertTrue(homePage.burgerIcon());
		homePage.clickOnBurgerIcon();
		homePage.burgermenuItemMoversAndShakers();
		Assert.assertTrue(homePage.burgermenuItemMoversAndShakers());
		homePage.closeburgermenu();

	}

	@Test(priority = 10)
	public void verifySell() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		homePage.homepageSell();
		Assert.assertTrue(homePage.homepageSell());

		homePage.clickonSell();
		Assert.assertEquals(homePage.clickonSell(), prop.getProperty("expectedSellTitle"));
	}

	@Test(priority = 11)
	public void verifyBestSellers() {

		HomePage homePage = new HomePage(driver);
		driver.navigate().back();
		homePage.homepageBestSellers();
		Assert.assertTrue(homePage.homepageBestSellers());
		homePage.clickonBestSellers();
		Assert.assertEquals(homePage.clickonBestSellers(), prop.getProperty("expectedBestSellersTitle"));
	}

	@Test(priority = 12)
	public void verifyTodaysDeals() {

		HomePage homePage = new HomePage(driver);
		driver.navigate().back();
		homePage.todaysdealsOnHomepage();
		Assert.assertTrue(homePage.todaysdealsOnHomepage());

	}

	@Test(priority = 13)
	public void verifyMobilesonHomepage() {

		HomePage homePage = new HomePage(driver);
		homePage.mobilesOnHomepage();
		Assert.assertTrue(homePage.mobilesOnHomepage());
		homePage.mobile1();
		Assert.assertEquals(homePage.mobile1(), prop.getProperty("expectedmobilesTitle"));

	}

	@Test(priority = 14)
	public void verifyNewReleasesHomepage() {

		HomePage homePage = new HomePage(driver);
		driver.navigate().back();
		homePage.newreleasesOnHomepage();
		Assert.assertTrue(homePage.newreleasesOnHomepage());
		homePage.newreleases1();
		Assert.assertEquals(homePage.newreleases1(), prop.getProperty("expectednewreleasesTitle"));

	}

	@Test(priority = 15)
	public void verifyCutomerServiceHomepage() {

		HomePage homePage = new HomePage(driver);
		driver.navigate().back();
		homePage.cutomerserviceonHomepage();

	}

	@Test(priority = 16)
	public void verifyAmazonPrimeOnHomepage() {

		HomePage homePage = new HomePage(driver);
		homePage.amazonprime();
		Assert.assertTrue(homePage.amazonprime());
		homePage.amazonprimeonHomepage();
		Assert.assertEquals(homePage.amazonprimeonHomepage(), prop.getProperty("expectedprimeTitle"));

	}

	@Test(priority = 17)
	public void validateHelpOnHomepage() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		driver.navigate().back();
		homePage.helpLink();

		Assert.assertEquals(homePage.helpLink(), prop.getProperty("helpTitle"));

	}

	@Test(priority = 18)
	public void validateAmazonWebServises() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		driver.navigate().back();
		homePage.amazonWebServices();
		Assert.assertTrue(homePage.amazonWebServices());

	}

	@Test(priority = 19)
	public void verifyBackToTop() {

		HomePage homePage = new HomePage(driver);
		homePage.backToTop();
		Assert.assertTrue(homePage.backToTop());
	}

}