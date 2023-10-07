package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCartPage extends ProductsPage {

	public AddCartPage(WebDriver driver) {
		super(driver);

	}
	

	@FindBy(xpath = "//div[@class=' nav-progressive-attribute']/span[2]")
	private WebElement cart;

	@FindBy(xpath = "//span[@class='a-truncate-cut']")
	private WebElement bagName;

	@FindBy(xpath = "//p[@class='a-spacing-mini']/span")
	private WebElement bagPrice;

	@FindBy(xpath = "(//span[@class='a-size-small a-color-success sc-product-availability'][normalize-space()='In stock'])[1]")
	private WebElement productInStock;

	@FindBy(xpath = "//div[@class='a-spacing-mini sc-item-content-group']/a/img")
	private WebElement bagImage;

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement checkBoxChecked;

	@FindBy(xpath = "//input[@name='isToBeGiftWrapped']")
	private WebElement checkBoxUnchecked;

	@FindBy(xpath = "//span[@class='a-button a-button-dropdown quantity']/span/span/span[1]")
	private WebElement quantityDropDown;

	@FindBy(xpath = "//li[@aria-labelledby='quantity_4']/a")
	private WebElement quantity;

	@FindBy(xpath = "(//div[@data-name='Subtotals'])[2]/span[2]")
	private WebElement applyQuantityPrice;

	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement delete;

	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	private WebElement proceedToBuy;

	

	public void clickOnCart() {

		cart.click();

	}

	public String getCartPageTitle() {

		String actualCartPageTitle = driver.getTitle();
		System.out.println(actualCartPageTitle);
		return actualCartPageTitle;

	}

	public String getProductName() {

		return bagName.getText();

	}

	public boolean getProductPrice() {

		return bagPrice.isDisplayed();

	}

	public boolean checkProductAvailableInStock() {

		return productInStock.isDisplayed();

	}

	public boolean checkProductImageNavigate() {

		return bagImage.isDisplayed();

	}

	public void clickOnUnCheckCheckBox() throws InterruptedException {

		checkBoxChecked.click();
		Thread.sleep(3000);

	}

	public void clickOnCheckCheckBox() {

		checkBoxChecked.click();

	}

	public boolean checkQuantityDropDownNavigate() {

		return quantityDropDown.isDisplayed();

	}

	public void clickOnQuantityDropDown() throws InterruptedException {
		Thread.sleep(3000);
		quantityDropDown.click();
		Thread.sleep(3000);

	}

	public void clickOnQuantity4() throws InterruptedException {

		quantity.click();
		Thread.sleep(3000);
	}

	public boolean checkApplyQuantityPrice() {

		return applyQuantityPrice.isDisplayed();

	}

	public boolean checkDeleteOptionNavigate() {

		return delete.isDisplayed();

	}

	public boolean checkProceedToBuyButtonNavigate() {

		return proceedToBuy.isDisplayed();

	}

}
