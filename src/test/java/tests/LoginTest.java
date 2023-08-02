package tests;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.AccountPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class LoginTest extends Base{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() throws IOException {
	    
		driver = initializeBrowser();
		driver.get(	prop.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
	
	@Test(priority=1)
	public void loginWithValidCrendetials() {
	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.signInButton();
		
		loginPage.set_username(prop.getProperty("validemail"));
		loginPage.clickOncontinueButton();
		loginPage.set_password(prop.getProperty("validpassword"));
		loginPage.click_button();
		Assert.assertFalse(loginPage.retrievevalidCredentails());

	}
	
	


	
	

	@Test(priority=2)
	public void loginWithInvalidCredentials() {
	
		LoginPage loginPage = new LoginPage(driver);
		loginPage.signInButton();
		loginPage.set_username(prop.getProperty("validemail"));
		loginPage.clickOncontinueButton();
		loginPage.set_password(prop.getProperty("invalidpassword"));
		loginPage.click_button();
		
		Assert.assertEquals(loginPage.retrieveInvalidCredentailsWarningMessage(),prop.getProperty("invalidcredentailswarning"));
	
	}
	
	
}
