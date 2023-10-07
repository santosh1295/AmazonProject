package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import base.Base;
import pageobjects.LoginPage;

public class LoginTest extends Base {

	public WebDriver driver;

	@BeforeSuite
	public void setup() throws IOException {

		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));
	}

	@Test(priority = 1)
	public void verifyLoginWithValidCrendetials() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.signInButton();
		loginPage.set_username(prop.getProperty("validemail"));
		loginPage.clickOncontinueButton();
		loginPage.set_password(prop.getProperty("validpassword"));
		loginPage.click_button();
		Assert.assertFalse(loginPage.retrievevalidCredentails());

	}

	@Test(priority = 2)
	public void VerifyLogout() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.clickOnSignout();

	}

	@Test(priority = 3)
	public void verifyLoginWithInvalidCredentials() {

		LoginPage loginPage = new LoginPage(driver);
		loginPage.set_username(prop.getProperty("validemail"));
		loginPage.clickOncontinueButton();
		loginPage.set_password(prop.getProperty("invalidpassword"));
		loginPage.click_button();

		Assert.assertEquals(loginPage.retrieveInvalidCredentailsWarningMessage(),
				prop.getProperty("invalidcredentailswarning"));

	}

}
