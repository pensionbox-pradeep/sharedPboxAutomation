package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CorporateGetStartedPage {
	

	public CorporateGetStartedPage(WebDriver driver){
		if(driver==null)
		System.out.println("Driver not initialized");
		PageFactory.initElements(driver,this);
	}
	
	/*
	 * Corporate Get Started Page > SignUp Page Elements
	 */
	
	@FindBy(xpath = "//div[contains(@class,'logoImg')]")
	public WebElement pbLogo;
	
	@FindBy(xpath = "//p[text()='Workplace']")
	public WebElement logoSubTxt;
	
	@FindBy(xpath = "//div[text()='Welcome']")
	public WebElement welcomeTxt;
	
	@FindBy(xpath = "//div[text()='Let’s create a new PensionBox’s Workplace Account ']")
	public WebElement welcomeSubHeaderTxt;
	
	@FindBy(xpath = "//input[@placeholder='Admin Full Name']")
	public WebElement adminFullNameTf;
	
	@FindBy(xpath = "//input[@placeholder='Mobile number']")
	public WebElement mobileNumberTf;
	
	@FindBy(xpath = "//input[@placeholder='Your Work Email']")
	public WebElement adminEmailTf;

	@FindBy(xpath = "//input[@placeholder='Your Brand Name ']")
	public WebElement adminBrandNameTf;
	
	@FindBy(xpath = "//a[text()='terms & conditions']")
	public WebElement termsAndConditionsLink;
	
	@FindBy(xpath = "//a[text()='privacy policy']")
	public WebElement privacyPolicyLink;
	
	@FindBy(xpath = "//span[text()='Sign Up']")
	public WebElement signUpBtn;
	
	@FindBy(xpath = "//span[text()='Log in']")
	public WebElement logInBtn;
	
	/*
	 * Corporate Get Started Page > Login Page Elements
	 */
	
	@FindBy(xpath = "//div[text()='Welcome Back!']")
	public WebElement welcomeBackTxt;
	
	@FindBy(xpath = "//div[text()='Log in to your PensionBox account']")
	public WebElement welcomeBackSubHeaderTxt;
	
	@FindBy(xpath = "//div[text()='Log in to your PensionBox account']")
	public WebElement loginSubHeaderTxt;
	
	@FindBy(xpath = "//input[@placeholder='Your Work Email']")
	public WebElement loginEmailTf;
	
	@FindBy(xpath = "//label[@id='standard-basic-label']")
	public WebElement loginEmailWarning;
	
	@FindBy(xpath = "//span[text()='Login']")
	public WebElement logInBtn2;
	
	@FindBy(xpath = "//span[text()='Sign Up']")
	public WebElement signUpBtn2;
	
	/*
	 * Common Elements
	 */
	
	@FindBy(xpath = "(//div[contains(@class,'betaBadgeWrapper')])[1]")
	public WebElement trustedByPbBadge;
	
	@FindBy(xpath = "(//div[contains(@class,'betaBadgeWrapper')])[2]")
	public WebElement secureAndEncryptedBadge;
	
	@FindBy(xpath = "//div[text()='TrustBox Explained']")
	public WebElement trustBoxExplainedTxt;
	
	@FindBy(xpath = "//div[contains(@class,'closeIcon')]")
	public WebElement closeTrustBoxModal;
	
	/*
	 * Warning Labels
	 */
	@FindBy(xpath = "(//label[@id='standard-basic-label'])[1]")
	public WebElement adminNameWarning;
	
	@FindBy(xpath = "(//label[@id='standard-basic-label'])[2]")
	public WebElement adminMobileWarning;
	
	@FindBy(xpath = "(//label[@id='standard-basic-label'])[3]")
	public WebElement adminEmailWarning;
	
	@FindBy(xpath = "(//label[@id='standard-basic-label'])[4]")
	public WebElement adminBrandNameWarning;
	
	/*
	 * OTP Page
	 */
	
	/**
	 * @return the closeTrustBoxModal
	 */
	public WebElement getCloseTrustBoxModal() {
		return closeTrustBoxModal;
	}

	@FindBy(xpath = "//div[text()='Enter OTP']")
	public WebElement otpHeaderTxt;
	
	@FindBy(xpath = "((//div[contains(@class,'subHeader')])[2]/span)[1]")
	public WebElement otpNumberTxt;
	
	@FindBy(xpath = "((//div[contains(@class,'subHeader')])[2]/span)[2]")
	public WebElement otpEmailTxt;
	
	@FindBy(xpath = "//input[@name='char1']")
    private WebElement OtpTF;
	
	@FindBy(xpath = "//input[@name='char4']")
	private WebElement Otp4TF;
	
	/**
	 * @return the otp4TF
	 */
	public WebElement getOtp4TF() {
		return Otp4TF;
	}

	@FindBy(xpath = "//span[contains(text(),'Verify')]/..")
    private WebElement LogInVerifyBtn;
	
	/**
	 * @return the otpErrorTxt
	 */
	public WebElement getOtpErrorTxt() {
		return otpErrorTxt;
	}

	@FindBy(xpath = "//div[contains(@class,'MuiAlert-message')]")
	private WebElement otpErrorTxt;
	
	@FindBy(xpath = "//button[text()='RESEND']")
	public WebElement resendBtn;
	
	/**
	 * @return the pbLogo
	 */
	public WebElement getPbLogo() {
		return pbLogo;
	}

	/**
	 * @return the logoSubTxt
	 */
	public WebElement getLogoSubTxt() {
		return logoSubTxt;
	}

	/**
	 * @return the welcomeTxt
	 */
	public WebElement getWelcomeTxt() {
		return welcomeTxt;
	}

	/**
	 * @return the welcomeSubHeaderTxt
	 */
	public WebElement getWelcomeSubHeaderTxt() {
		return welcomeSubHeaderTxt;
	}

	/**
	 * @return the adminFullNameTf
	 */
	public WebElement getAdminFullNameTf() {
		return adminFullNameTf;
	}

	/**
	 * @return the mobileNumberTf
	 */
	public WebElement getMobileNumberTf() {
		return mobileNumberTf;
	}

	/**
	 * @return the adminEmailTf
	 */
	public WebElement getAdminEmailTf() {
		return adminEmailTf;
	}

	/**
	 * @return the adminBrandNameTf
	 */
	public WebElement getAdminBrandNameTf() {
		return adminBrandNameTf;
	}

	/**
	 * @return the termsAndConditionsLink
	 */
	public WebElement getTermsAndConditionsLink() {
		return termsAndConditionsLink;
	}

	/**
	 * @return the privacyPolicyLink
	 */
	public WebElement getPrivacyPolicyLink() {
		return privacyPolicyLink;
	}

	/**
	 * @return the signUpBtn
	 */
	public WebElement getSignUpBtn() {
		return signUpBtn;
	}

	/**
	 * @return the logInBtn
	 */
	public WebElement getLogInBtn() {
		return logInBtn;
	}

	/**
	 * @return the welcomeBackTxt
	 */
	public WebElement getWelcomeBackTxt() {
		return welcomeBackTxt;
	}

	/**
	 * @return the welcomeBackSubHeaderTxt
	 */
	public WebElement getWelcomeBackSubHeaderTxt() {
		return welcomeBackSubHeaderTxt;
	}

	/**
	 * @return the loginSubHeaderTxt
	 */
	public WebElement getLoginSubHeaderTxt() {
		return loginSubHeaderTxt;
	}

	/**
	 * @return the loginEmailTf
	 */
	public WebElement getLoginEmailTf() {
		return loginEmailTf;
	}

	/**
	 * @return the loginEmailWarning
	 */
	public WebElement getLoginEmailWarning() {
		return loginEmailWarning;
	}

	/**
	 * @return the logInBtn2
	 */
	public WebElement getLogInBtn2() {
		return logInBtn2;
	}

	/**
	 * @return the signUpBtn2
	 */
	public WebElement getSignUpBtn2() {
		return signUpBtn2;
	}

	/**
	 * @return the trustedByPbBadge
	 */
	public WebElement getTrustedByPbBadge() {
		return trustedByPbBadge;
	}

	/**
	 * @return the secureAndEncryptedBadge
	 */
	public WebElement getSecureAndEncryptedBadge() {
		return secureAndEncryptedBadge;
	}
	
	/**
	 * @return the trustBoxExplainedTxt
	 */
	public WebElement getTrustBoxExplainedTxt() {
		return trustBoxExplainedTxt;
	}

	/**
	 * @return the adminNameWarning
	 */
	public WebElement getAdminNameWarning() {
		return adminNameWarning;
	}

	/**
	 * @return the adminMobileWarning
	 */
	public WebElement getAdminMobileWarning() {
		return adminMobileWarning;
	}

	/**
	 * @return the adminEmailWarning
	 */
	public WebElement getAdminEmailWarning() {
		return adminEmailWarning;
	}

	/**
	 * @return the adminBrandNameWarning
	 */
	public WebElement getAdminBrandNameWarning() {
		return adminBrandNameWarning;
	}

	/**
	 * @return the otpTF
	 */
	public WebElement getOtpTF() {
		return OtpTF;
	}

	/**
	 * @return the logInVerifyBtn
	 */
	public WebElement getLogInVerifyBtn() {
		return LogInVerifyBtn;
	}

	/**
	 * @return the resendBtn
	 */
	public WebElement getResendBtn() {
		return resendBtn;
	}

	/**
	 * @return the otpHeaderTxt
	 */
	public WebElement getOtpHeaderTxt() {
		return otpHeaderTxt;
	}

	/**
	 * @return the otpNumberTxt
	 */
	public WebElement getOtpNumberTxt() {
		return otpNumberTxt;
	}

	/**
	 * @return the otpEmailTxt
	 */
	public WebElement getOtpEmailTxt() {
		return otpEmailTxt;
	}

	
	
	
	
}
