package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage {
	@FindBy(xpath = "//input[@name='mobileno']")
    private WebElement getStartedPhoneNumberTF;

    @FindBy(xpath = "//span[contains(text(),'Sign Up')]/..")
    private WebElement getStartedSignUpBtn;

    @FindBy(xpath = "//span[contains(text(),'Log in')]")
    private WebElement getStartedLoginBtn;

    @FindBy(xpath = "//input[@name='char1']")
    private WebElement getStartedOtpTF;
    
    @FindBy(xpath = "//a[text()='terms & conditions']")
    private WebElement getStartedTerms;
    
    @FindBy(xpath = "//a[text()='privacy policy']")
    private WebElement getStartedPrivacy;
    
    @FindBy(xpath = "//div[contains(@class,'ios')]")
    private WebElement getStartedIosStoreBtn;
    
    @FindBy(xpath = "//div[contains(@class,'android')]")
    private WebElement getStartedPlayStoreBtn;

    /**
     * Below are the getter and setter methods to access webelements
     * @return webelement
     */

    public GetStartedPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getGetStartedPhoneNumberTF(){
        return getStartedPhoneNumberTF;
    }

    public WebElement getGetStartedSignUpBtn(){
        return getStartedSignUpBtn;
    }

    public WebElement getGetStartedLoginButton(){
        return getStartedLoginBtn;
    }

    public WebElement getGetStartedOtpTF(){
        return getStartedOtpTF;
    }

	public WebElement getGetStartedLoginBtn() {
		return getStartedLoginBtn;
	}

	public WebElement getGetStartedTerms() {
		return getStartedTerms;
	}

	public WebElement getGetStartedPrivacy() {
		return getStartedPrivacy;
	}

	public WebElement getGetStartedIosStoreBtn() {
		return getStartedIosStoreBtn;
	}

	public WebElement getLgetStartedPlayStoreBtn() {
		return getStartedPlayStoreBtn;
	}
    
	
    
}
