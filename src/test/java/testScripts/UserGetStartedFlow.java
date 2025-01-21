package testScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
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
import pageObjects.GetStartedPage;
import pageObjects.LoginPage;

@Epic("B2C Module")
@Story("User Getstarted")
@Link(name="B2C Test Case CPGS001", 
url = "https://docs.google.com/spreadsheets/d/1HXGTVnQx-9klpgaXfndrWUg-KL9rJvCdGUbPmd0zM0A/edit?gid=1461380570#gid=1461380570")
@Owner("Pradeep Pai")
public class UserGetStartedFlow extends WipBaseClass{
	SoftAssert sa;
	GetStartedPage gsp;
	
	String lpUrl= "https://qa.pensionbox.in/";
	String gsUrl = "https://qa.pensionbox.in/getstarted";
	String loginUrl = "https://qa.pensionbox.in/getstarted?getStartedType=login";
	
	String invalidNumber = "!@#456789";
	String phoneNumber = "9844267177";
	char[] otp = {'3','9','9','1'}; 
	
	@Test(priority = -1, groups = {"smoke"})
	@Description("Verify Page Load")
	public void TC_001() {
		gsp = new GetStartedPage(driver);
		Allure.step("Navigate to get B2C started url");
		driver.get(gsUrl);
		wdu.waitForTitle(driver, 5, "Get Started with PensionBox | Secure Your Retirement");
		Assert.assertEquals(gsp.getGetStartedHeader().getText(), "Create Account", "Create Account text is found");
		Assert.assertEquals(gsp.getGetStartedSubHeader().getText(), "Let’s create a new PensionBox account", "Subheader text is found");
		Allure.step("Header and Subheader Text are verified, TC_001 is passed");
	}

	@Test(priority = 0)
	@Description("Verify Terms and Conditions link")
	public void TC_003() throws InterruptedException {
		sa=new SoftAssert();
		gsp= new GetStartedPage(driver);
		//driver.get(gsUrl);
		Allure.step("Check if Terms and Conditions link is present");
		sa.assertEquals(gsp.getGetStartedTerms().isDisplayed(), true, "Terms and Conditions link is present");
		gsp.getGetStartedTerms().click();
		wdu.switchToNewTab(driver);
		wdu.waitForTitle(driver, 5, "PensionBox- Terms & Conditions");
		sa.assertEquals(driver.getTitle(), "PensionBox- Terms & Conditions","Terms and Conditions Page is opened");
		wdu.closeTab(driver);
		sa.assertAll();
		Allure.step("Terms and Conditions link is Present, TC003 is passed");
	}
	
	@Test(priority = 1)
	@Description("Verify Privacy Policy link")
	public void TC_004() throws InterruptedException {
		sa=new SoftAssert();
		gsp= new GetStartedPage(driver);
		//driver.get(gsUrl);
		Allure.step("Check if Privacy Policy link is present");
		sa.assertEquals(gsp.getGetStartedPrivacy().isDisplayed(), true, "Privacy Policy link is present");
		gsp.getGetStartedPrivacy().click();
		wdu.switchToNewTab(driver);
		wdu.waitForTitle(driver, 5, "PensionBox- Privacy Policy");
		sa.assertEquals(driver.getTitle(), "PensionBox- Privacy Policy","Privacy Policy Page is opened");
		wdu.closeTab(driver);
		sa.assertAll();
		Allure.step("Privacy Policy link is present, TC004 is passed");
	}
	
	@Test(priority = 2)
	@Description("Verify Existing user Login link")
	public void TC_008() {
		sa=new SoftAssert();
		gsp= new GetStartedPage(driver);
		Allure.step("Check if Existing user Login link is present");
		sa.assertEquals(gsp.getGetStartedLoginBtn().isDisplayed(), true, "Existing user Login link is present");
		Allure.step("Click on Existing user Login link");
		gsp.getGetStartedLoginBtn().click();
		Allure.step("Check if Login Page is opened");
		wdu.waitForElementText(driver, 10, "(//div[contains(@class, 'header')])[2]", "Welcome Back!");
		sa.assertEquals(gsp.getGetStartedHeader().getText(), "Welcome Back!","Login Page is opened");
		Allure.step("Go back to signup page");
		driver.get(gsUrl);
		sa.assertAll();
		Allure.step("Existing user Login link is present and functional, TC008 is passed");
	}
	
	/* Test to check QR code functionality
	 * 
	@Test(priority = 3)
	@Description("Verify QR code functionality")
	public void TC_009() {
		gsp= new GetStartedPage(driver);
		Allure.step("Check if QR code is present");
		Assert.assertEquals(gsp.getGetStartedQrCode().isDisplayed(), true, "QR code is present");
		Allure.step("QR code is present, TC009 is passed");
	}
	*/
	
	@Test(priority = 4)
	@Description("Verify app store links")
	public void TC_010() throws InterruptedException {
		sa=new SoftAssert();
		driver.get(gsUrl);
		gsp= new GetStartedPage(driver);
		Allure.step("Check if app store link is present");
		sa.assertEquals(gsp.getGetStartedIosStoreBtn().isDisplayed(), true, "App store links are present");
		Allure.step("Click on app store link");
		gsp.getGetStartedIosStoreBtn().click();
		wdu.switchToNewTab(driver);
		//wdu.waitForTitle(driver, 5, "NPS by PensionBox on the App Store");
		//System.out.println(driver.getTitle()+ " : Apple");
		sa.assertEquals(driver.getCurrentUrl().contains("nps-by-pensionbox"), true, "App store page is opened");
		Allure.step("App store links are present");
		wdu.closeTab(driver);
		
		//check play store
		Allure.step("Check if Google play store link is present");
		sa.assertEquals(gsp.getGetStartedPlayStoreBtn().isDisplayed(), true, "Play store links are present");
		Allure.step("Click on Google play store link");
		gsp.getGetStartedPlayStoreBtn().click();
		wdu.switchToNewTab(driver);
		//wdu.waitForTitle(driver, 5, "NPS by PensionBox on Google Play");
		//System.out.println(driver.getTitle()+ " : Google");
		sa.assertEquals(driver.getCurrentUrl().contains("in.pensionbox"), true, "Play store page is opened");
		Allure.step("Play store links are present");
		wdu.closeTab(driver);
		sa.assertAll();
		
		Allure.step("App store and Play store links are present and functional, TC010 is passed");
	}
	
	@Test(priority = 5, groups = {"smoke"})
	@Description("Verify mobile number field")
	public void TC_002() {
		gsp= new GetStartedPage(driver);
		Allure.step("Check if mobile number field is present");
		Assert.assertEquals(gsp.getGetStartedPhoneNumberTF().isDisplayed(), true, "Phone number field is present");
		Allure.step("Phone number field is Present, TC002 is passed");
	}
	
	@Test(priority = 6, groups = {"smoke"})
	@Description("Verify sign-up button without input")
	public void TC_005() {
		sa=new SoftAssert();
		gsp= new GetStartedPage(driver);
		Allure.step("Check if Sign-up button is present");
		sa.assertEquals(gsp.getGetStartedSignUpBtn().isDisplayed(), true, "Sign-up button is present");
		Allure.step("Clear the mobile number field");
		gsp.getGetStartedPhoneNumberTF().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		Allure.step("Click on Sign-up button");
		gsp.getGetStartedSignUpBtn().click();
		Allure.step("Check if the warning is displayed");
		sa.assertEquals(gsp.getGetStartedPhoneNumberLabel().getText(), "This field is required.", "Mobile number warning is present");
		sa.assertAll();
		Allure.step("Sign-up button is present, It does not accept blank input in mobile number field ,TC005 is passed");
	}
	
	@Test(priority = 7, groups = {"smoke"})
	@Description("Verify sign-up button with invalid input")
	public void TC_006() {
		sa=new SoftAssert();
		gsp= new GetStartedPage(driver);
		Allure.step("Check if Sign-up button is present");
		sa.assertEquals(gsp.getGetStartedSignUpBtn().isDisplayed(), true, "Sign-up button is present");
		Allure.step("Enter invalid mobile number");
		gsp.getGetStartedPhoneNumberTF().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		gsp.getGetStartedPhoneNumberTF().sendKeys(invalidNumber);
		Allure.step("Click on Sign-up button");
		gsp.getGetStartedSignUpBtn().click();
		Allure.step("Check if the warning is displayed");
		sa.assertEquals(gsp.getGetStartedPhoneNumberLabel().getText(), "Please enter a valid mobile no.", "Mobile number warning is present");
		sa.assertAll();
		Allure.step("Sign-up button is present, It does not accept invalid input in mobile number field ,TC006 is passed");
	}
	
	@Test(priority = 8, groups = {"smoke"})
	@Description("Verify sign-up button with valid input")
	public void TC_007() {
		sa=new SoftAssert();
		gsp= new GetStartedPage(driver);
		//driver.get(gsUrl);
		Allure.step("Check if Sign-up button is present");
		sa.assertEquals(gsp.getGetStartedSignUpBtn().isDisplayed(), true, "Sign-up button is present");
		Allure.step("Enter valid mobile number");
		gsp.getGetStartedPhoneNumberTF().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		gsp.getGetStartedPhoneNumberTF().sendKeys(phoneNumber);
		Allure.step("Click on Sign-up button");
		gsp.getGetStartedSignUpBtn().click();
		wdu.waitForElementText(driver, 10, "(//div[contains(@class, 'header')])[2]", "Enter OTP");
		sa.assertEquals(gsp.getGetStartedHeader().getText(), "Enter OTP", "OTP Page is opened");
		sa.assertAll();
		Allure.step("OTP Page is opened ,TC007 is passed");
	}
	
	@Test(priority = 9, dependsOnMethods = {"TC_007"}, groups = {"smoke"})
	@Description("Verify OTP page load")
	public void TC_011() {
		wdu.waitForElementText(driver, 10, "(//div[contains(@class, 'header')])[2]", "Enter OTP");
		Assert.assertEquals(gsp.getGetStartedHeader().getText(), "Enter OTP", "OTP Page is opened");
		Allure.step("OTP Page is opened ,TC011 is passed");
	}
	
	@Test(priority = 10, dependsOnMethods = {"TC_007"}, groups = {"smoke"})
	@Description("Verify OTP page phone number")
	public void TC_012() {
		wdu.waitForElementText(driver, 10, "(//div[contains(@class, 'subHeader')])[2]/span","+91 "+phoneNumber);
		Assert.assertEquals(gsp.getGetStartedOtpNumber().getText().contains(phoneNumber), true, gsp.getGetStartedOtpNumber().getText()+ " :Mobile Number is matching");
		Allure.step("Mobile Number is matching, TC012 is passed");
	}
	
	@Test(priority = 11, dependsOnMethods = {"TC_007"})
	@Description("Verify OTP Resend link")
	public void TC_013() {
		Assert.assertEquals(gsp.getGetStartedOTPResendBtn().isDisplayed(), true, "Resend Button is found");
		Allure.step("Resend button is found, TC013 is passed");
	}
	
	@Test (priority = 13, dependsOnMethods = {"TC_007"}, groups = {"smoke"})
	@Description("Verify Blank OTP")
	public void TC_014() throws InterruptedException, AWTException {
		gsp=new GetStartedPage(driver);
		Allure.step("Enter Blank OTP");
		gsp.getGetStartedOtp4TF().click();
		Robot robot = new Robot();
        for (int i = 0; i < 4; i++) { // Simulate 4 backspaces
            robot.keyPress(KeyEvent.VK_BACK_SPACE);
            robot.keyRelease(KeyEvent.VK_BACK_SPACE);
            Thread.sleep(500); // Small delay to mimic real typing behavior
        }
		
		Assert.assertEquals(gsp.getGetStartedOtpErrorTxt().getText(),"OTP is required.", "OTP required warning is present");
		Allure.step("OTP warning is Present");
	}
	
	@Test (priority = 12, dependsOnMethods = {"TC_007"}, groups = {"smoke"})
	@Description("Verify Invalid OTP")
	public void TC_015() {
		gsp=new GetStartedPage(driver);
		Allure.step("Enter Invalid OTP");
		gsp.getGetStartedOtpTF().sendKeys("3"+"9"+"3"+"9");
		Assert.assertEquals(gsp.getGetStartedOtpErrorTxt().getText(),"Incorrect OTP. Please enter again.", "Invalid OTP warning is present");
		Allure.step("OTP invalid warning is Present");
	}
	
	@Test (priority = 14, dependsOnMethods = {"TC_007"}, groups = {"smoke"})
	@Description("Verify Valid OTP")
	public void TC_016() {
		gsp=new GetStartedPage(driver);
		Allure.step("Enter Valid OTP");
		gsp.getGetStartedOtpTF().sendKeys("3"+"9"+"9"+"1");
		wdu.waitForTitle(driver, 10, "Dashboard");
		Assert.assertEquals(driver.getTitle(), "Dashboard", "Dashboard Title Verified");
		Allure.step("User entered B2C Dashboard");
	}
	
	/*
	 * Write Tests for Trust Boxes, Its there in Corporate getstarted
	 */
	
	/*
	 * Login Page Tests
	 */
	
	@Test(priority = 15, groups = {"smoke"})
	@Description("Verify Login Page Load")
	public void TC_018() {
		gsp = new GetStartedPage(driver);
		driver.manage().deleteAllCookies();
		Allure.step("Navigate to B2C login url");
		driver.get(loginUrl);
		wdu.waitForTitle(driver, 5, "Get Started with PensionBox | Secure Your Retirement");
		Assert.assertEquals(gsp.getGetStartedHeader().getText(), "Welcome Back!", "Welcome Back! text is found");
		Assert.assertEquals(gsp.getGetStartedSubHeader().getText(), "Log in to your PensionBox account", "Login Subheader text is found");
		Allure.step("Login Header and Subheader Text are verified, TC_018 is passed");
	}
	
	@Test(priority = 17, groups = {"smoke"})
	@Description("Verify mobile number field")
	public void TC_019() {
		gsp= new GetStartedPage(driver);
		Allure.step("Check if mobile number field is present");
		Assert.assertEquals(gsp.getLogInPhoneNumberTF().isDisplayed(), true, "Phone number field is present");
		Allure.step("Phone number field is Present, TC019 is passed");
	}
	
	@Test(priority = 18, groups = {"smoke"})
	@Description("Verify Login button without input")
	public void TC_020() {
		//driver.get(loginUrl);
		sa=new SoftAssert();
		gsp= new GetStartedPage(driver);
		Allure.step("Check if Login button is present");
		sa.assertEquals(gsp.getLogInLoginBtn().isDisplayed(), true, "Login button is present");
		Allure.step("Clear the mobile number field");
		gsp.getLogInPhoneNumberTF().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		Allure.step("Click on Sign-up button");
		gsp.getLogInLoginBtn().click();
		Allure.step("Check if the warning is displayed");
		sa.assertEquals(gsp.getLoginPhoneNumberLabel().getText(), "This field is required.", "Mobile number warning is present");
		sa.assertAll();
		Allure.step("Login button is present, It does not accept blank input in mobile number field ,TC020 is passed");
	}
	
	@Test(priority = 19, groups = {"smoke"})
	@Description("Verify Login button with invalid input")
	public void TC_021() {
		sa=new SoftAssert();
		gsp= new GetStartedPage(driver);
		Allure.step("Check if Login button is present");
		sa.assertEquals(gsp.getLogInLoginBtn().isDisplayed(), true, "Login button is present");
		Allure.step("Enter invalid mobile number");
		gsp.getLogInPhoneNumberTF().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		gsp.getLogInPhoneNumberTF().sendKeys(invalidNumber);
		Allure.step("Click on Login button");
		gsp.getLogInLoginBtn().click();
		Allure.step("Check if the warning is displayed");
		sa.assertEquals(gsp.getLoginPhoneNumberLabel().getText(), "Please enter a valid mobile no.", "Mobile number warning is present");
		sa.assertAll();
		Allure.step("Login button is present, It does not accept invalid input in mobile number field ,TC021 is passed");
	}
	
	@Test(priority = 20, groups = {"smoke"})
	@Description("Verify Login button with valid input")
	public void TC_022() {
		sa=new SoftAssert();
		gsp= new GetStartedPage(driver);
		//driver.get(gsUrl);
		Allure.step("Check if Login button is present");
		sa.assertEquals(gsp.getLogInLoginBtn().isDisplayed(), true, "Login button is present");
		Allure.step("Enter valid mobile number");
		gsp.getGetStartedPhoneNumberTF().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		gsp.getGetStartedPhoneNumberTF().sendKeys(phoneNumber);
		Allure.step("Click on Login button");
		gsp.getLogInLoginBtn().click();
		wdu.waitForElementText(driver, 10, "(//div[contains(@class, 'header')])[2]", "Enter OTP");
		sa.assertEquals(gsp.getGetStartedHeader().getText(), "Enter OTP", "OTP Page is opened");
		sa.assertAll();
		Allure.step("OTP Page is opened ,TC022 is passed");
	}
	
	@Test(priority = 16)
	@Description("Verify New user? SignUp link")
	public void TC_023() {
		sa=new SoftAssert();
		gsp= new GetStartedPage(driver);
		Allure.step("Check if New user? SignUp link is present");
		sa.assertEquals(gsp.getLogInSignupBtn().isDisplayed(), true, "New user? SignUp link is present");
		Allure.step("Click on New user? SignUp link");
		gsp.getLogInSignupBtn().click();
		Allure.step("Check if SignUp Page is opened");
		wdu.waitForElementText(driver, 10, "(//div[contains(@class, 'header')])[2]", "Create Account");
		sa.assertEquals(gsp.getGetStartedHeader().getText(), "Create Account","SignUp Page is opened");
		Allure.step("Go back to Login page");
		driver.get(loginUrl);
		sa.assertAll();
		Allure.step("New user? SignUp link is present and functional, TC023 is passed");
	}
	
	@Test(priority = 21, dependsOnMethods = {"TC_022"} ,groups = {"smoke"})
	@Description("Verify otp page load")
	public void TC_024() {
		TC_011();
	}
	
	@Test(priority = 22, dependsOnMethods = {"TC_022"}, groups = {"smoke"})
	@Description("Verify OTP page phone number")
	public void TC_025() {
		TC_012();
	}
	
	@Test(priority = 23, dependsOnMethods = {"TC_022"})
	@Description("Verify OTP Resend link")
	public void TC_026() {
		TC_013();
	}
	
	@Test(priority = 26, dependsOnMethods = {"TC_022"}, groups = {"smoke"})
	@Description("Verify Blank OTP")
	public void TC_028() throws InterruptedException, AWTException {
		TC_014();
	}
	
	@Test(priority = 25, dependsOnMethods = {"TC_022"}, groups = {"smoke"})
	@Description("Verify invalid OTP")
	public void TC_029() {
		TC_015();
	}
	
	@Test(priority = 27, dependsOnMethods = {"TC_022"}, groups = {"smoke"})
	@Description("Verify Valid OTP")
	public void TC_030() {
		TC_016();
	}
	
}
