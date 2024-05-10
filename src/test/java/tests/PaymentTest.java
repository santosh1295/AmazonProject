package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import pageobjects.PaymentPage;

public class PaymentTest extends AddCartTest {

	@AfterSuite
	public void tearDown() {

		if (driver != null) {
			driver.quit();
		}

	}

	@Test(priority = 48)
	public void ClickOnsignInMethod() {

		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.clickOnSignInButton();

	}

	@Test(priority = 49)
	public void signInEmailAddressMethod() {

		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.enterEmailAddress(prop.getProperty("validemail"));
	}

	@Test(priority = 50)
	public void clickOnContinueButtonMethod() {

		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.clickOncontinueButton();
	}

	@Test(priority = 51)
	public void signInPasswordMethod() {

		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.enterPassword(prop.getProperty("validpassword"));
	}

	@Test(priority = 52)
	public void clickOnSignInButtonMethod() {

		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.clickOnSignInSubmitButton();
	}


	@Test(priority = 53)
	public void clickOnProceedToBuyButton() {

		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.clickOnProceedToBuyButton();

	}

	@Test(priority = 54)
	public void clickOnRadioButtonOfAddressMethod() {

		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.clickOnRadioButtonToChooseAddress();
	}

	@Test(priority = 55)
	public void clickOnUseThisAddressButtMethod() {

		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.clickOnuseThisAddressButton();

	}

	@Test(priority = 56)
	public void paymentOptionsBoxDisplayedMethod() {

		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.verifypaymentOptionsBoxDisplayed();

	}

	@Test(priority = 57)
	public void clickOnRadioButtonToChooseCreditCardMethod() {

		PaymentPage paymentpage = new PaymentPage(driver);
		paymentpage.clickOnRadioButtonToChooseCreditCard();

	}

}
