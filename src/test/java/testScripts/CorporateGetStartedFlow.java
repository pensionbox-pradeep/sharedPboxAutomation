package testScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.WipBaseClass;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import pageObjects.CorporateGetStartedPage;

@Epic("Corporate Module")
@Story("Corporate Getstarted")
@Link(name="CPGS001", 
url = "https://docs.google.com/spreadsheets/d/1HXGTVnQx-9klpgaXfndrWUg-KL9rJvCdGUbPmd0zM0A/edit?gid=854600042#gid=854600042")
@Owner("Pradeep Pai")

public class CorporateGetStartedFlow extends WipBaseClass {
	
	CorporateGetStartedPage cgp;	
	SoftAssert sa;
	
	static String url = "https://qa.pensionbox.in/corporate/corporate-getstarted";
	//static String loginUrl = "https://qa.pensionbox.in/corporate/corporate-getstarted?";
	String name="PradeepAuto";
	String email="pradeep100@pbauto.in";
	String domain="pbauto";
	String number="9876543210";
	String brandName="AutoTest";
	String newEmail="thisemail@doesnt.exist";
	
	@Test (
			priority = 0		)
	@Description("Verify Terms and Conditions")
	public void CPLP_TC017() throws InterruptedException {
		sa=new SoftAssert();
		driver.get(url);
		cgp=new CorporateGetStartedPage(driver);
		sa.assertEquals(cgp.getTermsAndConditionsLink().isDisplayed(), true, "Terms and Conditions Checkbox is found");
		Allure.step("Click on Terms and Conditions link");
		cgp.getTermsAndConditionsLink().click();
		Thread.sleep(1000);
		wdu.switchToNewTab(driver);
		wdu.waitForTitle(driver, 5, "PensionBox- Terms & Conditions");
		sa.assertEquals(driver.getTitle(), "PensionBox- Terms & Conditions","Terms and Conditions Page is opened");
		wdu.closeTab(driver);
		sa.assertAll();
		Allure.step("Terms and Conditions Page is opened, CPLP_TC017 is Passed");
	}
	
	@Test (
			priority = 1		)
	@Description("Verify Privacy Policy")
	public void CPLP_TC018() throws InterruptedException {
		cgp=new CorporateGetStartedPage(driver);
		sa.assertEquals(cgp.getPrivacyPolicyLink().isDisplayed(), true, "Privacy Policy Checkbox is found");
		Allure.step("Click on Privacy Policy link");
		cgp.getPrivacyPolicyLink().click();
		Thread.sleep(1000);
		wdu.switchToNewTab(driver);
		wdu.waitForTitle(driver, 5, "PensionBox- Privacy Policy");
		sa.assertEquals(driver.getTitle(), "PensionBox- Privacy Policy","Privacy Policy Checkbox is selected");
		wdu.closeTab(driver);
		sa.assertAll();
		Allure.step("Privacy Policy Checkbox is selected, CPLP_TC018 is Passed");
	}
	
	@Test (priority = 3 , groups = {"smoke"})
	@Description("Verify Page load > Corporate Getstarted")
	public void CPLP_TC001() {
		System.out.println("Here");
		Allure.step("Navigate to Corporate Getstarted URL");
		driver.get(url);
		cgp = new CorporateGetStartedPage(driver);
		//Make Generic
		//cgp.getAdminFullNameTf().sendKeys("Pradeep Auto");
		wdu.waitForTitle(driver, 5, "Get Started with PensionBox | Secure Your Retirement");
		Assert.assertEquals(driver.getTitle(), "Get Started with PensionBox | Secure Your Retirement", "Title Verified");
		Assert.assertEquals(cgp.logoSubTxt.getText(), "Workplace", "Workplace is present");
		Allure.step("Get Started page is opened, CPLP_TC010 is Passed");
	}
	
    @Test (priority = 4, groups = {"smoke"})
    @Description("Verify Corporate Header Text")
    public void CPLP_TC002() {
    	cgp=new CorporateGetStartedPage(driver);
    	Allure.step("Verify Welcome Text");
		Assert.assertEquals(cgp.getWelcomeTxt().getText(), "Welcome", "Welcome text found");
		Allure.step("Welcome text found, CPLP_TC002 is Passed");
	}
    
    @Test (priority = 5, groups = {"smoke"})
    @Description("Verify Corporate Logo")
	public void CPLP_TC003() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Verify Welcome SubText");
		Assert.assertEquals(cgp.getWelcomeSubHeaderTxt().getText(), "Let’s create a new PensionBox’s Workplace Account", "Welcome SubText is present");
		Allure.step("Welcome SubText is present, CPLP_TC003 is Passed");
	}
    
    @Test (priority = 6)
    @Description("Verify Admin Full Name Text field for Blank Input")
    public void CPLP_TC004() {
	    cgp=new CorporateGetStartedPage(driver);
	    Assert.assertEquals(cgp.getAdminFullNameTf().isDisplayed(), true, "Admin Name field is found");
	    //cgp.getAdminFullNameTf().clear();
	    cgp.getAdminFullNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
	    cgp.getSignUpBtn().click();
	    Assert.assertEquals(cgp.getAdminNameWarning().getText(), "Full Name is required.", "Name warning is present");
	    Allure.step("Admin Name warning is Present, CPLP_TC004 is Passed");
    }
    
    @Test (priority = 10 )
    @Description("Verify Admin Full Name Text field for Invalid input")
	public void CPLP_TC005() {
    	//driver.get(url);
    	cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminFullNameTf().isDisplayed(), true, "Admin Name field is found");
		cgp.getAdminFullNameTf().sendKeys("!!@#$%^&*()0123");
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminNameWarning().getText(), "Please enter a valid name", "Invalid Name warning is present");
		Allure.step("Admin Name invalid warning is Present, CPLP_TC005 is Passed");
    }
    
	@Test (priority = 14, groups = {"smoke"})
	@Description("Verify Admin Full Name Text field for Valid input")
	public void CPLP_TC006() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminFullNameTf().isDisplayed(), true, "Admin Name field is found");
		cgp.getAdminFullNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getAdminFullNameTf().sendKeys(name);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminFullNameTf().getAttribute("aria-invalid"), "false", "Admin Name warning is not present");
		Allure.step("Admin Name valid warning is not Present, CPLP_TC006 is Passed");
	}
    
	@Test (priority = 7)
	@Description("Verify Mobile Number Text field for Blank Input")
	public void CPLP_TC007() {

		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getMobileNumberTf().isDisplayed(), true, "Mobile Number field is found");
		cgp.getMobileNumberTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminMobileWarning().getText(), "Mobile Number is required.", "Mobile Number warning is present");
		Allure.step("Mobile Number warning is Present, CPLP_TC007 is Passed");
	}
	
	@Test (priority = 11 )
	@Description("Verify Mobile Number Text field for Invalid input")
	public void CPLP_TC008() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getMobileNumberTf().isDisplayed(), true, "Mobile Number field is found");
		cgp.getMobileNumberTf().sendKeys("1234567890");
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminMobileWarning().getText(), "Please enter a valid mobile no.", "Invalid Mobile Number warning is present");
		Allure.step("Mobile Number invalid warning is Present, CPLP_TC008 is Passed");
	}
	
	@Test (priority = 15, groups = {"smoke"})
	@Description("Verify Mobile Number Text field for Valid input")
	public void CPLP_TC009() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getMobileNumberTf().isDisplayed(), true, "Mobile Number field is found");
		cgp.getMobileNumberTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getMobileNumberTf().sendKeys(number);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getMobileNumberTf().getAttribute("aria-invalid"), "", "Mobile Number warning is not present");
		Allure.step("Mobile Number valid warning is not Present, CPLP_TC009 is Passed");
	}
	
	@Test (priority = 8)
	@Description("Verify Work Email Text field for Blank Input")
	public void CPLP_TC010() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminEmailTf().isDisplayed(), true, "Work Email field is found");
		cgp.getAdminEmailTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminEmailWarning().getText(), "Work Email is required.", "Work Email warning is present");
		Allure.step("Work Email warning is Present, CPLP_TC010 is Passed");
	}
	
	@Test (priority = 12 )
	@Description("Verify Work Email Text field for Invalid input")
	public void CPLP_TC011() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminEmailTf().isDisplayed(), true, "Work Email field is found");
		cgp.getAdminEmailTf().sendKeys("pradeep");
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminEmailWarning().getText(), "Please enter a valid email address", "Invalid Work Email warning is present");
		Allure.step("Work Email invalid warning is Present, CPLP_TC011 is Passed");
	}
	
	@Test (priority = 16, groups = {"smoke"})
	@Description("Verify Work Email Text field for Valid input")
	public void CPLP_TC012() {
		
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminEmailTf().isDisplayed(), true, "Work Email field is found");
		cgp.getAdminEmailTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getAdminEmailTf().sendKeys(email);
		//cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminEmailTf().getAttribute("aria-invalid"), "false", "Work Email warning is not present");
		Allure.step("Work Email valid warning is not Present, CPLP_TC012 is Passed");
		//CPLP_TC013();
	}
	
	/*
	 * Brand Name Autofill
	 */
	@Test (
	priority = 15,dependsOnMethods = "CPLP_TC012")
	@Description("Verify Brand Name Autofill")
	public void CPLP_TC013() {
		
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminBrandNameTf().isDisplayed(), true, "Brand Name field is found");
		Assert.assertEquals(cgp.getAdminBrandNameTf().getAttribute("value").toLowerCase(), domain.toLowerCase(), "Brand Name is autofilled");
		Allure.step("Brand Name is autofilled, CPLP_TC013 is Passed");
	}
	
	@Test (priority = 9)
	@Description("Verify Brand Name Text field for Blank Input")
	public void CPLP_TC014() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminBrandNameTf().isDisplayed(), true, "Brand Name field is found");
		cgp.getAdminBrandNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminBrandNameWarning().getText(), "Company Name is required.", "Brand Name warning is present");
		Allure.step("Brand Name warning is Present, CPLP_TC014 is Passed");
	}
	/*
	@Test (priority = 13)
	@Description("Verify Brand Name Text field for Invalid input")
	public void CPLP_TC015() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminBrandNameTf().isDisplayed(), true, "Brand Name field is found");
		cgp.getAdminBrandNameTf().sendKeys("!!@#$%^&*()0123");
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminBrandNameWarning().getText(), "Please enter a valid company name", "Invalid Brand Name warning is present");
		Allure.step("Brand Name invalid warning is Present, CPLP_TC015 is Passed");
	}
	*/
	
	@Test (priority = 17, groups = {"smoke"})
	@Description("Verify Brand Name Text field for Valid input")
	public void CPLP_TC016() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminBrandNameTf().isDisplayed(), true, "Brand Name field is found");
		cgp.getAdminBrandNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getAdminBrandNameTf().sendKeys(brandName);
		Assert.assertEquals(cgp.getAdminBrandNameTf().getAttribute("aria-invalid"), "false", "Brand Name warning is not present");
		Allure.step("Brand Name valid warning is not Present, CPLP_TC016 is Passed");
	}
	
	@Test (priority = 2)
	@Description("Verify SignUp Button with Invalid/Blank inputs")
	public void CPLP_TC019() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getSignUpBtn().isDisplayed(), true, "Sign Up button is found");
		cgp.getAdminBrandNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminBrandNameWarning().getText(), "Company Name is required.", "Brand Name warning is present");
		Allure.step("Sign Up button is Disabled, CPLP_TC019 is Passed");
	}
	
	@Test (priority = 18, groups = {"smoke"})
	@Description("Verify SignUp Button with valid inputs")
	public void CPLP_TC020() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getSignUpBtn().isDisplayed(), true, "Sign Up button is found");
		cgp.getSignUpBtn().click();
		Allure.step("Sign Up button is clicked, CPLP_TC020 is Passed");
	}
	
	@Test (priority = 19, groups = {"smoke"})
	@Description("Verify OTP Screen load")
	public void CPLP_TC021() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getOtpHeaderTxt().isDisplayed(), true, "OTP Header is found");
		Allure.step("OTP Header is found");
	}
	
	@Test (dependsOnMethods = "CPLP_TC021" ,priority = 21, groups = {"smoke"})
	@Description("Verify OTP Phone and Email")
	public void CPLP_TC022() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Check if email is matching");
		Assert.assertEquals(cgp.getOtpEmailTxt().getText(), email, "Email is matching");
		Allure.step("Check if phone number is matching");
		Assert.assertEquals(cgp.getOtpNumberTxt().getText(), number, "Mobile Number is matching");
		Allure.step("OTP Email and Number is matching");
	}
	
	@Test (dependsOnMethods = "CPLP_TC021", priority = 22)
	@Description("Verify OTP Resend")
	public void CPLP_TC023() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Check if Resend Button is present");
		Assert.assertEquals(cgp.getResendBtn().isDisplayed(), true, "Resend Button is found");
		//cgp.getResendBtn().click();
		
		Allure.step("OTP Resend Button is present");
	}
	
	@Test (dependsOnMethods = "CPLP_TC021",priority = 24)
	@Description("Verify Blank OTP")
	public void CPLP_TC024() throws InterruptedException, AWTException {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Enter Blank OTP");
		cgp.getOtp4TF().click();
		Robot robot = new Robot();
        for (int i = 0; i < 4; i++) { // Simulate 4 backspaces
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
            Thread.sleep(500); // Small delay to mimic real typing behavior
        }
		
		Assert.assertEquals(cgp.getOtpErrorTxt().getText(),"OTP is required.", "OTP required warning is present");
		Allure.step("OTP warning is Present");
	}
	
	@Test (dependsOnMethods = "CPLP_TC021",priority = 23)
	@Description("Verify Invalid OTP")
	public void CPLP_TC025() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Enter Invalid OTP");
		cgp.getOtpTF().sendKeys("3"+"9"+"3"+"9");
		Assert.assertEquals(cgp.getOtpErrorTxt().getText(),"Incorrect OTP. Please enter again.", "Invalid OTP warning is present");
		Allure.step("OTP invalid warning is Present");
	}
	
	@Test (dependsOnMethods = "CPLP_TC021",priority = 25, groups = {"smoke"})
	@Description("Verify Valid OTP")
	public void CPLP_TC026() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Enter Valid OTP");
		cgp.getOtpTF().sendKeys("3"+"9"+"9"+"1");
		wdu.waitForTitle(driver, 10, "Dashboard");
		Assert.assertEquals(driver.getTitle(), "Dashboard", "Dashboard Title Verified");
		Allure.step("User entered Corporate Dashboard");
	}
	
	@Test (priority = 2,
			dependsOnMethods = "CPLP_TC019")
	@Description("Verify Trust Buttons")
	public void CPLP_TC027() throws InterruptedException {
		cgp=new CorporateGetStartedPage(driver);
		sa = new SoftAssert();
		Allure.step("Click on Trust Buttons");
		cgp.getTrustedByPbBadge().click();
		Thread.sleep(500);
		sa.assertEquals(cgp.getTrustBoxExplainedTxt().getText(), "TrustBox Explained", "Trust Box Explained is found");
		Thread.sleep(500);
		cgp.closeTrustBoxModal.click();
		cgp.getSecureAndEncryptedBadge().click();
		Thread.sleep(500);
		sa.assertEquals(cgp.getTrustBoxExplainedTxt().getText(), "TrustBox Explained", "Trust Box Explained is found");
		Thread.sleep(500);
		cgp.closeTrustBoxModal.click();
		sa.assertAll();
		Allure.step("Trust box modals are verified, CPLP_TC027 is Passed");
	}
	
	/*
	 * Login
	 */
	
	@Test (priority = 26, groups = {"smoke"})
	@Description("Verify Page load of login page")
	public void CPLP_TC028() {
		cgp=new CorporateGetStartedPage(driver);
		//logout by clearing cookies
		driver.manage().deleteAllCookies();
		Allure.step("Navigate to Getstarted page");
		driver.get(url);
		Allure.step("Click on Login");
		cgp.getLogInBtn().click();
		Assert.assertEquals(cgp.getWelcomeBackTxt().getText(), "Welcome Back!", "Welcome Back! text is found");
		Assert.assertEquals(cgp.getWelcomeBackSubHeaderTxt().getText(), "Log in to your PensionBox account", "Welcome back subtext is matching");
		Allure.step("Login Page is Loaded, CPLP_TC028 is Passed");
	}
	
	@Test (priority = 27)
	@Description("Verify Login with Blank email")
	public void CPLP_TC029() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Enter Blank Email");
		cgp.getLoginEmailTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getLogInBtn2().click();
		Assert.assertEquals(cgp.getLoginEmailWarning().getText(), "Work Email is required.", "Email warning is present");
		Allure.step("Email warning is Present, CPLP_TC029 is Passed");
	}
	
	@Test (priority = 28)
	@Description("Verify Login with Invalid email")
	public void CPLP_TC030() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Enter Blank Email");
		cgp.getLoginEmailTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getLoginEmailTf().sendKeys("invalidEmail 123");
		cgp.getLogInBtn2().click();
		Assert.assertEquals(cgp.getLoginEmailWarning().getText(), "Please enter a valid email address address", "Email warning is present");
		Allure.step("Email warning is Present, CPLP_TC029 is Passed");
	}
	
	@Test (priority = 29)
	@Description("Verify Login with valid non existing email")
	public void CPLP_TC031() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Enter valid but non existing Email");
		cgp.getLoginEmailTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		Allure.step("Enter a valid email that does not exist in db");
		cgp.getLoginEmailTf().sendKeys(newEmail);
		Allure.step("Click on Login");
		cgp.getLogInBtn2().click();
		Allure.step("Verify if Signup page is opened");
		Assert.assertEquals(cgp.getWelcomeTxt().getText(), "Welcome", "Welcome text is found");
		Allure.step("Verify if email prefill is matching");
		Assert.assertEquals(cgp.getAdminEmailTf().getAttribute("value"), newEmail, "Email from text field is matching");
		Allure.step("Email from text field is matching with input, CPLP_TC029 is Passed");
		
		cgp.getLogInBtn().click();
	}
	
	@Test (priority = 30, groups = {"smoke"})
	@Description("Verify Login with Valid email")
	public void CPLP_TC032() {
		/*
		 * Slowing down the test as sometimes the login button is not clickable
		 */
		try {
			Allure.step("Try to click on login button");
			cgp.getLogInBtn().click();
		} catch (NoSuchElementException e) {
			Allure.step("Could not find login button / already on login page");
		}
		
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Enter Valid Email");
		cgp.getLoginEmailTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getLoginEmailTf().sendKeys(email);
		cgp.getLogInBtn2().click();
		Allure.step("SignUp button is Clicked, CPLP_TC032 is Passed");
	}
	
	@Test (priority = 31, groups = {"smoke"})
	@Description("Verify OTP page load")
	public void CPLP_TC033() {
		CPLP_TC021();
	}
	
	@Test (dependsOnMethods = "CPLP_TC033",priority = 32, groups = {"smoke"})
	@Description("Verify OTP email and phone number")
	public void CPLP_TC034() {
		CPLP_TC022();
	}
	
	@Test (dependsOnMethods = "CPLP_TC033",priority = 33)
	@Description("Verify OTP Resend button")
	public void CPLP_TC035() {
		CPLP_TC023();
	}
	
	@Test (dependsOnMethods = "CPLP_TC033",priority = 35)
	@Description("Verify with blank OTP")
	public void CPLP_TC036() throws InterruptedException, AWTException {
		CPLP_TC024();
	}
	
	@Test (dependsOnMethods = "CPLP_TC033",priority = 34)
	@Description("Verify Invalid OTP")
	public void CPLP_TC037() {
		CPLP_TC025();
	}
	
	@Test (dependsOnMethods = "CPLP_TC033",priority = 36, groups = {"smoke"})
	@Description("Verify Valid OTP")
	public void CPLP_TC038() {
		CPLP_TC026();
	}
	
}
