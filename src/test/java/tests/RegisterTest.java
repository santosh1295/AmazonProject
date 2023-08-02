package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.AccountSuccessPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.RegisterPage;

public class RegisterTest extends Base {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException {
		
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown() {
		
		if(driver!=null) {
			driver.quit();
		}
		
	}
	
	@Test(priority=1)
	public void registerWithMandatoryFields() {
		
		RegisterPage registerpage = new RegisterPage(driver);
		
		registerpage.clickOnCreateYourAmazonAccountButton();
		registerpage.set_fullname(prop.getProperty("fullname"));
		registerpage.set_phonenumber(prop.getProperty("phoneNumber"));
		registerpage.set_email(generateNewEmailTimeStamp());
		registerpage.set_password(prop.getProperty("password"));
		//registerpage.set_passwordcheck(prop.getProperty("validpassword"));
		//registerpage.selectAgree();
		registerpage.clickOncontinueButton();
		
		Assert.assertEquals(RegisterPage.retrieveAccountSuccessMessage(),prop.getProperty("accountsuccessmessage"));
		
	}
	
	private void lickOncontinueButton() {
		// TODO Auto-generated method stub
		
	}

	@Test(priority=2)
	public void registerWithAllFields() {
		
		RegisterPage registerpage = new RegisterPage(driver);
		
		registerpage.clickOnCreateYourAmazonAccountButton();
		registerpage.set_fullname(prop.getProperty("fullname"));
		registerpage.set_phonenumber(prop.getProperty("phoneNumber"));
		registerpage.set_email(generateNewEmailTimeStamp());
		registerpage.set_password(prop.getProperty("password"));
		//registerpage.set_passwordcheck(prop.getProperty("validpassword"));
		//registerpage.selectYesNewsletterOption();
		//registerpage.selectAgree();
		lickOncontinueButton();
		
		Assert.assertEquals(RegisterPage.retrieveAccountSuccessMessage(),prop.getProperty("accountsuccessmessage"));
		
	}

	

}
