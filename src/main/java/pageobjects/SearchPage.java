package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends HomePage {

	public SearchPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	private WebElement searchBoxField;

	@FindBy(xpath = "//input[@id='nav-search-submit-button']")
	private WebElement searchButton;

	@FindBy(xpath = "(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]")
	private WebElement amazonProduct;

	@FindBy(xpath = "//span[contains(text(),'Try checking your spelling or use more general terms')]")
	private WebElement noResultsOnSearchMessage;

	@FindBy(css = ".left-pane-results-container")
	private WebElement suggestionsList;

	@FindBy(xpath = "//div[@aria-label='mobiles']")
	private WebElement firstSuggestion;
	

	public void enterTextInSearchFieldAndClickOnSearch(String searchText) {
		searchBoxField.clear();
		searchBoxField.sendKeys(searchText);
		searchButton.click();
	}

	public void enterTextInSearchFieldAndClickOnSearch1(String searchText) {
		searchBoxField.clear();
		searchBoxField.sendKeys(searchText);
		searchButton.click();
	}

	public void enterSearchTextIntoSearchField(String searchText) {
		searchBoxField.clear();
		searchBoxField.sendKeys(searchText);
	}

	public boolean verifyTheDisplayOfProductInSearchResults() {
		return amazonProduct.isDisplayed();
	}

	public String retrieveNoProductSearchMessage() {
		return noResultsOnSearchMessage.getText();
	}

	public boolean getSuggestionsList() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(suggestionsList));
		return suggestionsList.isDisplayed();
	}

	public String getFirstSuggestion() {
		return firstSuggestion.getText().toLowerCase();
	}
}
