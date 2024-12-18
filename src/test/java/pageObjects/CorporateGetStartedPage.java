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
	
	@FindBy(xpath = "//input[@placeholder='Your Work Email']']")
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
	public WebElement loginSubHeaderTxt;
	
	@FindBy(xpath = "//input[@placeholder='Your Work Email']")
	public WebElement loginEmailTf;
	
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
	
}
