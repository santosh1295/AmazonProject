package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.SearchPage;

public class SearchTest extends HomepageTest {

	@Test(priority = 20)
	public void searchWithInvalidProductName() {
		SearchPage srcPage = new SearchPage(driver);
		srcPage.enterTextInSearchFieldAndClickOnSearch(prop.getProperty("nonexistingproduct"));
		Assert.assertEquals(srcPage.retrieveNoProductSearchMessage(), prop.getProperty("noproductinsearchmessage1"));

	}

	@Test(priority = 21)
	public void searchByNotProvidingAnyProductName() {

		SearchPage srcPage = new SearchPage(driver);
		srcPage.enterTextInSearchFieldAndClickOnSearch1("");
		String currentUrl = driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, prop.getProperty("baseUrl"),
				"Search functionality with an empty search field failed.");

	}

	@Test(priority = 22)
	public void testSearchAutoSuggestion() {
	
		SearchPage srcPage = new SearchPage(driver);
		srcPage.enterSearchTextIntoSearchField(prop.getProperty("product1"));
		try {
			Thread.sleep(5000); // Adjust the wait time if needed
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Assert.assertTrue(srcPage.getSuggestionsList(), "Auto-suggestions not displayed.");
		String suggestionText = srcPage.getFirstSuggestion();
		Assert.assertTrue(suggestionText.contains(prop.getProperty("product1").toLowerCase()),
				"First suggestion does not contain the search query.");
	}

	@Test(priority = 23)
	public void searchWithValidProductName() {

		SearchPage srcPage = new SearchPage(driver);
		srcPage.enterTextInSearchFieldAndClickOnSearch(prop.getProperty("validproduct"));
		Assert.assertTrue(srcPage.verifyTheDisplayOfProductInSearchResults());

	}

}
