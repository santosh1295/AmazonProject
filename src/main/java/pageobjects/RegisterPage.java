package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id = "createAccountSubmit")
    private WebElement createAccountSubmitBtn;
	
	@FindBy(css = "a[href='/ref=ap_frn_logo']")
    private WebElement logoLink;
    
    @FindBy(id = "ap_customer_name")
    private WebElement yourNameTextBox;
    
    @FindBy(id = "ap_phone_number")
    private WebElement phoneNumberTextBox;
    
    
    @FindBy(id = "ap_email")
    private WebElement emailTextBox;
    
    @FindBy(id = "ap_password")
    private WebElement passwordTextBox;
    
    @FindBy(id = "ap_password_check")
    private WebElement passwordAgainTextBox;
    
    @FindBy(id = "continue")
    private WebElement createAccountBtn;

	private WebElement fullNameTestBox;

	private WebElement CreateYourAmazonAcoountButton;

	private WebElement continueButton;


    public void set_fullname(String fname) {
		fullNameTestBox.clear();
		fullNameTestBox.sendKeys(fname);
	}
	
    public void set_phonenumber(String fname) {
    	phoneNumberTextBox.clear();
    	phoneNumberTextBox.sendKeys(fname);
	}
    public void set_email(String usern) {
    	emailTextBox.clear();
    	emailTextBox.sendKeys(usern);
	}

	public void set_password(String userp) {
		passwordTextBox.clear();
		passwordTextBox.sendKeys(userp);
	}
	
	public void set_passwordcheck(String userp) {
		passwordAgainTextBox.clear();
		passwordAgainTextBox.sendKeys(userp);
	}
	
	

	public void selectAgree() {
		// TODO Auto-generated method stub
		
	}

	public AccountSuccessPage clickOnContinueButton() {
		// TODO Auto-generated method stub
		return null;
	}

	public void selectYesNewsletterOption() {
		// TODO Auto-generated method stub
		
	}

	public static String retrieveAccountSuccessMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	


	public void clickOnCreateYourAmazonAccountButton() {
		CreateYourAmazonAcoountButton.submit();
		// TODO Auto-generated method stub
	}	
		public void clickOncontinueButton() {
			continueButton.submit();
		
	

	
		
	}

		
			
		}

	
	
	