package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	    @FindBy(xpath = "//input[@name='mobileno']")
	    private WebElement logInPhoneNumberTF;

	    @FindBy(xpath = "//span[contains(text(),'Login')]/..")
	    private WebElement logInLoginBtn;

	    @FindBy(xpath = "//span[contains(text(),'Sign Up')]")
	    private WebElement logInSignupBtn;

	    @FindBy(xpath = "//input[@name='char1']")
	    private WebElement LogInOtpTF;

	    @FindBy(xpath = "//span[contains(text(),'Verify')]/..")
	    private WebElement LogInVerifyBtn;
	    
	    @FindBy(xpath = "//div[contains(@class,'ios')]")
	    private WebElement logInIosStoreBtn;
	    
	    @FindBy(xpath = "//div[contains(@class,'android')]")
	    private WebElement logInPlayStoreBtn;

	    public LoginPage(WebDriver driver){
	        PageFactory.initElements(driver,this);
	    }
	    
	    /**
	     * Getter Setters of Elements
	     */
	    
	    public WebElement getLogInPhoneNumberTF(){
	        return logInPhoneNumberTF;
	    }

	    public WebElement getLogInLoginBtn(){
	        return logInLoginBtn;
	    }

	    public WebElement getLogInSignupBtn(){
	        return logInSignupBtn;
	    }

	    public WebElement getLogInOtpTF(){
	        return LogInOtpTF;
	    }

	    public WebElement getLogInVerifyBtn(){
	        return LogInVerifyBtn;
	    }

		public WebElement getLogInIosStoreBtn() {
			return logInIosStoreBtn;
		}

		public WebElement getLogInPlayStoreBtn() {
			return logInPlayStoreBtn;
		}
	    
	   
	    
}
