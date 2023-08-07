package pageobjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage {

	WebDriver driver;

	public PaymentPage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement signInButton;

	public LoginPage clickOnSignInButton() {

		signInButton.click();
		return new LoginPage(driver);
	}
	
	
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement searchField;

	public void searchfieldInput(String searchText) {

		searchField.sendKeys(searchText);
		

	}

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement searchIconButton;

	public SearchPage clickOnSearchIconButton() {

		searchIconButton.click();
		return new SearchPage(driver);
	}

	
	@FindBy(xpath = "//img[@alt='American Tourister Spin 49 cms Teal Laptop Backpack']")
	private WebElement searchProduct;

	public PaymentPage clickOnSearchProduct() {

		searchProduct.click();
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> handles = driver.getWindowHandles();
		for (String actual : handles) {
			System.out.println(actual);
			if (!actual.equalsIgnoreCase(mainWindowHandle)) { // switching to the opened tab
				driver.switchTo().window(actual); // opening the URL saved.
				String childwindTitle = driver.getTitle();
				System.out.println("Child windows title:-" + childwindTitle);
			}
		}
		
		return new PaymentPage(driver);
	}
	
	
	@FindBy(xpath="(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")
	private WebElement searchProductName;
	public boolean verifyTheDisplayOfSearchProductInSearchResults() {
		
		return searchProductName.isDisplayed();
		
	}

	
	@FindBy(xpath = "//img[@alt='American Tourister Spin 49 cms Teal Laptop Backpack']")  //(//span[@id='productTitle'])[1]
	private WebElement expectedProduct;

	public boolean verifyTheDisplayOfExpectedProductInSearchResults() {

		return expectedProduct.isDisplayed();

	}

	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	private WebElement addToCartButton;

	public void addToCartButton() {

		addToCartButton.click();

	}
	
	
	@FindBy(xpath = "//a[@id='nav-cart']")
	private WebElement cartIcon;

	public PaymentPage clickCartIcon() {

		cartIcon.click();
		return new PaymentPage(driver);

	}
	

	@FindBy(xpath= "//input[@name='proceedToRetailCheckout']")
	private WebElement proceedToBuyButton;
	public PaymentPage clickOnProceedToBuyButton() {
		
		 proceedToBuyButton.click();;
		 return new PaymentPage(driver);
		
	}
	
	
	@FindBy(xpath = "//input[@id='ap_email']")
	private WebElement signInEmailTextBox;
	
    public void enterEmailAddress(String emailText) {
		
	signInEmailTextBox.sendKeys(emailText);
		
	}
    
  
    
    @FindBy(xpath = "//input[@id='continue']")
	private WebElement continueButton;
	
	public void clickOncontinueButton() {
		
		continueButton.click();
	}
    
    
    @FindBy(xpath = "//input[@id='ap_password']")
	private WebElement signInPasswordTextBox;
	
    public void enterPassword(String pwdText) {
		
    	signInPasswordTextBox.sendKeys(pwdText);
		
	}
    
    @FindBy(xpath = "//input[@id='signInSubmit']")
	private WebElement signInSubmitButton;
	
	public void clickOnSignInSubmitButton() {
		
		signInSubmitButton.click();
	}
	

	@FindBy(xpath = "(//input[@name='submissionURL'])[1]")
	private WebElement radioButtonOfAddress;
	
	public void clickOnRadioButtonToChooseAddress() {
		
		radioButtonOfAddress.click();
	}

	@FindBy(xpath = "//input[@data-testid='Address_selectShipToThisAddress']")
	private WebElement useThisAddressButton;

	public void clickOnuseThisAddressButton() {

		useThisAddressButton.click();

	}
	

	
	@FindBy(xpath = "//div[@class='a-box']//div[@class='a-box-inner']")
	private WebElement paymentOptionsBox;
	
	public boolean verifypaymentOptionsBoxDisplayed() {
		
		return paymentOptionsBox.isDisplayed();
	}
	
	@FindBy(xpath = "//input[@value='SelectableAddCreditCard']")
	private WebElement radioButtonOfCreditCard;
	
	public void clickOnRadioButtonToChooseCreditCard() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(radioButtonOfCreditCard)).click();
		
	}
	

}

