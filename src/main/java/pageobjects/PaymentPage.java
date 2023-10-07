package pageobjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage extends AddCartPage {

	public PaymentPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement signInButton;

	public LoginPage clickOnSignInButton() {

		signInButton.click();
		return new LoginPage(driver);
		
	}

	@FindBy(xpath = "//input[@name='proceedToRetailCheckout']")
	private WebElement proceedToBuyButton;

	public PaymentPage clickOnProceedToBuyButton() {

		proceedToBuyButton.click();
		;
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
