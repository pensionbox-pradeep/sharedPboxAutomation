package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage {
	
	/*
	 * Sign Up Page
	 */
	
	@FindBy(xpath = "(//div[contains(@class, 'header')])[2]")
	private WebElement getStartedHeader;
	
	@FindBy(xpath = "(//div[contains(@class, 'subHeader')])[2]")
	private WebElement getStartedSubHeader;
	
	@FindBy(xpath = "//input[@name='mobileno']")
    private WebElement getStartedPhoneNumberTF;
	
	@FindBy(xpath = "//label[@id='standard-basic-label']")
	private WebElement getStartedPhoneNumberLabel;

    @FindBy(xpath = "//span[contains(text(),'Sign Up')]/..")
    private WebElement getStartedSignUpBtn;

    @FindBy(xpath = "//span[contains(text(),'Log in')]")
    private WebElement getStartedLoginBtn;
    
    
    @FindBy(xpath = "//a[text()='terms & conditions']")
    private WebElement getStartedTerms;
    
    @FindBy(xpath = "//a[text()='privacy policy']")
    private WebElement getStartedPrivacy;
    
    @FindBy(xpath = "//div[contains(@class,'ios')]")
    private WebElement getStartedIosStoreBtn;
    
    @FindBy(xpath = "//div[contains(@class,'android')]")
    private WebElement getStartedPlayStoreBtn;
    
    @FindBy(xpath = "//input[@name='char1']")
    private WebElement getStartedOtpTF;
	
	@FindBy(xpath = "//input[@name='char4']")
	private WebElement getStartedOtp4TF;

	@FindBy(xpath = "//div[contains(@class,'MuiAlert-message')]")
	private WebElement getStartedOtpErrorTxt;
	
	@FindBy(xpath = "(//div[contains(@class, 'subHeader')])[2]/span")
	private WebElement getStartedOtpNumber;
	
	@FindBy(xpath = "//button[text()='RESEND']")
	private WebElement getStartedOTPResendBtn;
	
	/*
	 * Login Page
	 */
	
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
	
	/**
	 * @return the loginPhoneNumberLabel
	 */
	public WebElement getLoginPhoneNumberLabel() {
		return loginPhoneNumberLabel;
	}

	@FindBy(xpath = "//label[@id='standard-basic-label']")
	private WebElement loginPhoneNumberLabel;

    /**
     * Below are the getter and setter methods to access webelements
     * @return webelement
     */

    public GetStartedPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    /**
	 * @return the getStartedOTPResendBtn
	 */
	public WebElement getGetStartedOTPResendBtn() {
		return getStartedOTPResendBtn;
	}

	/**
	 * @return the getStartedOtpNumber
	 */
	public WebElement getGetStartedOtpNumber() {
		return getStartedOtpNumber;
	}

	/**
	 * @return the getStartedOtpErrorTxt
	 */
	public WebElement getGetStartedOtpErrorTxt() {
		return getStartedOtpErrorTxt;
	}

	/**
	 * @return the getStartedHeader
	 */
	public WebElement getGetStartedHeader() {
		return getStartedHeader;
	}

	/**
	 * @return the getStartedSubHeader
	 */
	public WebElement getGetStartedSubHeader() {
		return getStartedSubHeader;
	}

	/**
	 * @return the getStartedPlayStoreBtn
	 */
	public WebElement getGetStartedPlayStoreBtn() {
		return getStartedPlayStoreBtn;
	}

	public WebElement getGetStartedPhoneNumberTF(){
        return getStartedPhoneNumberTF;
    }

    /**
	 * @return the getStartedPhoneNumberLabel
	 */
	public WebElement getGetStartedPhoneNumberLabel() {
		return getStartedPhoneNumberLabel;
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

	/**
	 * @return the getStartedOtp4TF
	 */
	public WebElement getGetStartedOtp4TF() {
		return getStartedOtp4TF;
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

	/**
	 * @return the logInPhoneNumberTF
	 */
	public WebElement getLogInPhoneNumberTF() {
		return logInPhoneNumberTF;
	}

	/**
	 * @return the logInLoginBtn
	 */
	public WebElement getLogInLoginBtn() {
		return logInLoginBtn;
	}

	/**
	 * @return the logInSignupBtn
	 */
	public WebElement getLogInSignupBtn() {
		return logInSignupBtn;
	}

	/**
	 * @return the logInOtpTF
	 */
	public WebElement getLogInOtpTF() {
		return LogInOtpTF;
	}

	/**
	 * @return the logInVerifyBtn
	 */
	public WebElement getLogInVerifyBtn() {
		return LogInVerifyBtn;
	}
    
	
    
}
