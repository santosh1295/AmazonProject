package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends LoginPage {

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//i[@class='a-icon a-icon-logo']")
	private WebElement amazon;

	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	private WebElement amazonLogo;

	@FindBy(xpath = "//a[@id='nav-global-location-popover-link']")
	private WebElement yourAddress;

	@FindBy(xpath = "//div[@id='nav-search']")
	private WebElement searchBox;

	@FindBy(xpath = "//a[@id='icp-nav-flyout']")
	private WebElement languageDrop;

	@FindBy(xpath = "//a[@id='nav-hamburger-menu']")
	private WebElement burgermenu;

	@FindBy(xpath = "//a[text()='Movers and Shakers']")
	private WebElement moversAndShakers;

	@FindBy(xpath = "//div[@class='nav-sprite hmenu-close-icon']")
	private WebElement closemenu;

	@FindBy(xpath = "//a[text()='Help']")
	private WebElement help;

	@FindBy(xpath = "//a[text()='Amazon Web Services']")
	private WebElement amznwebservices;

	@FindBy(xpath = "//span[@class='navFooterBackToTopText']")
	private WebElement backtotop;

	@FindBy(xpath = "//a[text()='Sell']")
	private WebElement sell;

	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_2']")
	private WebElement bestsellers;

	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_3']")
	private WebElement todaysdeals;

	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_4']")
	private WebElement mobiles;

	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_5']")
	private WebElement newreleases;

	@FindBy(xpath = "//a[@data-csa-c-slot-id='nav_cs_6']")
	private WebElement cutomerservice;

	@FindBy(xpath = "//span[text()='Prime']")
	private WebElement prime;

	public void ClickOnAmazon() {
		amazon.click();

	}

	public boolean validateAmazonLogo() {

		return amazonLogo.isDisplayed();

	}

	public boolean validateSelectYourAddress() {

		return yourAddress.isDisplayed();
	}

	public boolean validateSearchBox() {

		return searchBox.isDisplayed();
	}

	public String validateHomepageTitle() {

		String homePageTitle = driver.getTitle();
		return homePageTitle;

	}

	public boolean languageDropdown() {
		return languageDrop.isDisplayed();
	}

	public boolean burgerIcon() {
		return burgermenu.isDisplayed();
	}

	public void clickOnBurgerIcon() {
		burgermenu.click();

	}

	public boolean burgermenuItemMoversAndShakers() {
		return moversAndShakers.isDisplayed();
	}

	public void closeburgermenu() {
		closemenu.click();

	}

	public String helpLink() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", help);

		Thread.sleep(3000);
		String actualhelpTitle = driver.getTitle();
		System.out.println(actualhelpTitle);
		return actualhelpTitle;

	}

	public boolean amazonWebServices() {

		return amznwebservices.isDisplayed();

	}

	public boolean backToTop() {
		return backtotop.isDisplayed();
	}

	public boolean homepageSell() {
		return sell.isDisplayed();
	}

	public boolean homepageBestSellers() {
		return bestsellers.isDisplayed();
	}

	public boolean todaysdealsOnHomepage() {
		return todaysdeals.isDisplayed();
	}

	public boolean mobilesOnHomepage() {
		return mobiles.isDisplayed();
	}

	public String mobile1() {
		mobiles.click();
		String actualmobilesTitle = driver.getTitle();
		return actualmobilesTitle;
	}

	public boolean newreleasesOnHomepage() {
		return newreleases.isDisplayed();
	}

	public String newreleases1() {
		newreleases.click();
		String actualnewreleasesTitle = driver.getTitle();
		return actualnewreleasesTitle;
	}

	public boolean cutomerserviceonHomepage() {
		return cutomerservice.isDisplayed();
	}

	public boolean amazonprime() {
		return prime.isDisplayed();
	}

	public String amazonprimeonHomepage() {
		prime.click();
		String actualprimeTitle = driver.getTitle();
		return actualprimeTitle;
	}

	public String clickonSell() throws InterruptedException {
		sell.click();
		Thread.sleep(3000);
		String actualSellTitle = driver.getTitle();
		return actualSellTitle;
	}

	public String clickonBestSellers() {
		bestsellers.click();
		String actualBestSellerTitle = driver.getTitle();
		return actualBestSellerTitle;
	}
}