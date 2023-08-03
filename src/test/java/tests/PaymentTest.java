package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.PaymentPage;


public class PaymentTest extends Base{
	
    public WebDriver driver;
    PaymentPage paymentpage= new PaymentPage(driver);
	
	@BeforeClass
	public void setup() throws IOException {
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterClass
	public void tearDown() {
		
		if(driver!=null) {
			driver.quit();
		}
		
	}
	

	@Test(priority = 1)
	public void ClickOnsignInMethod() {
	
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.clickOnSignInButton();
	    
	}
	
	
	
	@Test(priority = 2)
	public void signInEmailAddressMethod() {
	
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.enterEmailAddress(prop.getProperty("validemail"));
	}
	

	@Test(priority = 3)
	public void clickOnContinueButtonMethod() {
	
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.clickOncontinueButton();
	}
	
	
	@Test(priority = 4)
	public void signInPasswordMethod() {
	
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.enterPassword(prop.getProperty("validpassword"));
	}
	
	@Test(priority = 5)
	public void clickOnSignInButtonMethod() {
	
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.clickOnSignInSubmitButton();
	}
	
	
	
	@Test(priority = 6)
	public void inputOfSearchField() {
	 
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.searchfieldInput(prop.getProperty("validproduct"));
	
	}
	
	
	@Test(priority = 7)
	public void clickOnSearchFieldIcon() {
	
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.clickOnSearchIconButton();
	
	}
	
	
	@Test(priority = 8)
	public void searchProductDisplayed() {
	
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.verifyTheDisplayOfSearchProductInSearchResults();
	
	}
	
	@Test(priority = 9)
	public void clickOnSearchProduct() {
	
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.clickOnSearchProduct();
		
	}
	
	
	
	@Test(priority = 10)
	public void expectedProductDisplayed() {
		
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.verifyTheDisplayOfExpectedProductInSearchResults();
		
	}
	
	
	@Test(priority = 11)
	public void clickOnaddToCartButton() {
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.addToCartButton();
		
	}
	
	@Test(priority = 12)
	public void clickOnCartIcon() {
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.clickCartIcon();
		
	}
	
	
	@Test(priority = 13)
	public void clickOnProceedToBuyButton() {
		
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.clickOnProceedToBuyButton();
	
	}
	
	
	@Test(priority = 14)
	public void clickOnRadioButtonOfAddressMethod() {
	
		PaymentPage paymentpage= new PaymentPage(driver);	
	    paymentpage.clickOnRadioButtonToChooseAddress();
	}
	
	@Test(priority = 15)
	public void clickOnUseThisAddressButtMethod() {
	 
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.clickOnuseThisAddressButton();
	
	}

	
	@Test(priority = 16)
	public void paymentOptionsBoxDisplayedMethod() {
	 
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.verifypaymentOptionsBoxDisplayed();
	
	}
	
	@Test(priority = 17)
	public void clickOnRadioButtonToChooseCreditCardMethod() {
	 
		PaymentPage paymentpage= new PaymentPage(driver);
		paymentpage.clickOnRadioButtonToChooseCreditCard();
	
	}

}

