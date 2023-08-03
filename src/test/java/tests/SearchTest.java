package tests;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pageobjects.HomePage;
import pageobjects.SearchPage;

public class SearchTest extends Base {
	
	public WebDriver driver;

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
	
	@Test(priority=1)
	public void searchWithValidProductName() {
		
		SearchPage srcPage = new SearchPage(driver);
		srcPage.enterTextInSearchFieldAndClickOnSearch(prop.getProperty("validproduct"));
		Assert.assertTrue(srcPage.verifyTheDisplayOfProductInSearchResults());

	}
	
	@Test(priority=2)
	public void searchWithInvalidProductName() {
		SearchPage srcPage = new SearchPage(driver);
		srcPage.enterTextInSearchFieldAndClickOnSearch(prop.getProperty("nonexistingproduct"));	
		Assert.assertEquals(srcPage.retrieveNoProductSearchMessage(),prop.getProperty("noproductinsearchmessage"));
	
	}
	
	@Test(priority=3)
	public void searchByNotProvidingAnyProductName() {
		
		SearchPage srcPage = new SearchPage(driver);
		srcPage.enterTextInSearchFieldAndClickOnSearch1("");	
		String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, prop.getProperty("baseUrl"), "Search functionality with an empty search field failed.");
		
	}
	
	@Test(priority=4)
    public void testSearchAutoSuggestion() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		SearchPage srcPage = new SearchPage(driver);
		srcPage.enterSearchTextIntoSearchField(prop.getProperty("product1"));
		try {
            Thread.sleep(5000); // Adjust the wait time if needed
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(srcPage.getSuggestionsList(),"Auto-suggestions not displayed.");
        String suggestionText = srcPage.getFirstSuggestion();
        Assert.assertTrue(suggestionText.contains(prop.getProperty("product1").toLowerCase()), "First suggestion does not contain the search query.");
	}

}
