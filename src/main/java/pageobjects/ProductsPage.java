package pageobjects;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductsPage {
	WebDriver driver;

	public ProductsPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBoxField;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchIcon;

	@FindBy(xpath = "//*[@id='a-autoid-0-announce']/span[2]")
	private WebElement sortBy;

	@FindBy(xpath = "//*[@id='s-result-sort-select_1']")
	private WebElement lowToHighPrice;

	@FindBy(xpath = "//span[contains(text(),'Price: Low to High')]")
	private WebElement sortBy1;

	@FindBy(xpath = "(//ul[@class='a-nostyle a-list-link']/li[3]/a)[2]")
	private WebElement highToLowPrice;

	@FindBy(xpath = "//span[contains(text(),'Price: High to Low')]")
	private WebElement sortBy2;

	@FindBy(xpath = "(//ul[@class='a-nostyle a-list-link']/li[4]/a)[3]")
	private WebElement AvgCustomerReview;

	@FindBy(xpath = "//span[normalize-space()='Avg. Customer Review']")
	private WebElement sortBy3;

	@FindBy(xpath = "(//ul[@class='a-nostyle a-list-link']/li[5]/a)[4]")
	private WebElement newestArrivals;

	@FindBy(xpath = "//span[contains(text(),'₹1,000 - ₹5,000')]")
	private WebElement ₹1000_₹5000;

	@FindBy(xpath = "(//span[@class='a-size-base a-color-base a-text-bold'])[2]")
	private WebElement ₹1000_₹5000Apply;

	@FindBy(xpath = "//input[@id='low-price']")
	private WebElement minPriceFilterBox;

	@FindBy(xpath = "//input[@id='high-price']")
	private WebElement maxPriceFilterBox;

	@FindBy(xpath = "//span[@class='a-button a-spacing-top-mini a-button-base s-small-margin-left']//input[@type='submit']")
	private WebElement priceFilterGo;

	@FindBy(xpath = "//img[@alt='American Tourister Spin 49 cms Teal Laptop Backpack']") 
	private WebElement americanTouristerBag;

	@FindBy(xpath = "//*[@id='productTitle']")
	private WebElement productName;

	@FindBy(xpath = "//*[@id='corePriceDisplay_desktop_feature_div']/div[1]/span[2]/span[2]/span[2]")
	private WebElement productPrice;

	@FindBy(xpath = "//*[@id='availability']/span")
	private WebElement productAvilable;

	@FindBy(xpath = "//*[@id='add-to-cart-button']")
	private WebElement addToCart;

	@FindBy(xpath = "//*[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']/span")
	private WebElement productAddedCart;
	
	
	

	public void searchProductOnSearchBox(String searchProduct) {

		searchBoxField.sendKeys(searchProduct);

	}

	public void clickOnSearchIcon() {

		searchIcon.click();

	}

	public String getProductsPageTitle() {

		String actualProductsPageTitle = driver.getTitle();
		System.out.println(actualProductsPageTitle);
		return actualProductsPageTitle;
	}

	public boolean SortByFeatureNavigate() {

		return sortBy.isDisplayed();

	}

	public void clickonSortByFeatureDropDownMenu() {

		sortBy.click();

	}

	public void clickOnLowToHighPriceOption() {

		lowToHighPrice.click();

	}

	public void clickonSortByFeatureDropDownMenu1() throws InterruptedException {
		Thread.sleep(5000);
		sortBy1.click();
		Thread.sleep(5000);

	}

	public void clickOnHighToLowPriceOption() {

		highToLowPrice.click();

	}

	public void clickonSortByFeatureDropDownMenu2() throws InterruptedException {
		Thread.sleep(5000);
		sortBy2.click();
		Thread.sleep(5000);

	}

	public void clickOnAvgCustomerReviewOption() {

		AvgCustomerReview.click();

	}

	public void clickonSortByFeatureDropDownMenu3() throws InterruptedException {
		Thread.sleep(5000);
		sortBy3.click();
		Thread.sleep(5000);

	}

	public void clickOnNewestArrivalsOption() {

		newestArrivals.click();

	}

	public void clickOn₹1000_₹5000PriceRange() {

		₹1000_₹5000.click();

	}

	public boolean navigate₹1000_₹5000PriceRangeApply() {

		return ₹1000_₹5000Apply.isDisplayed();

	}

	public void clickOnMinPriceFilterBox(String MinPrice) {

		minPriceFilterBox.sendKeys(MinPrice);

	}

	public void clickOnMaxPriceFilterBox(String MaxPrice) {

		maxPriceFilterBox.sendKeys(MaxPrice);

	}

	public void clickOnPriceFilterGoButton() {

		priceFilterGo.click();

	}

	public void clickOnProduct() throws InterruptedException {

		americanTouristerBag.click();
		Thread.sleep(4000);

		String mainWindowHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String actual : handles) {
			System.out.println(actual);
			if (!actual.equalsIgnoreCase(mainWindowHandle)) { // switching to the opened tab
				driver.switchTo().window(actual); // opening the URL saved.

			}
		}

	}

	public String getProductPageTitle() {

		String actualProductPageTitle = driver.getTitle();
		return actualProductPageTitle;
	}

	public void navigateProductName() {

		productName.isDisplayed();

	}

	public String getProductName() {

		return productName.getText();

	}

	public boolean navigateProductPrice() {

		return productPrice.isDisplayed();

	}

	public String checkProductAvilableInStockText() {

		return productAvilable.getText();

	}

	public boolean AddToCartButtonNavigate() {

		return addToCart.isDisplayed();

	}

	public void clickOnAddToCartButton() {

		addToCart.click();

	}

	public String getMassageProductAddedToCart() {

		return productAddedCart.getText();

	}
}
