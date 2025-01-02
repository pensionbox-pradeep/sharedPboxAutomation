package testScripts;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.WipBaseClass;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import pageObjects.CorporateGetStartedPage;

@Feature("Corporate Getstarted")
@Owner("Pradeep Pai")

public class CorporateSignUpFlow extends WipBaseClass {
	
	static String url = "https://qa.pensionbox.in/corporate/corporate-getstarted";
	String email="pradeep100@pensionbox.in";
	String number="9876543210";
	CorporateGetStartedPage cgp;	
	
	@Test (
			priority = 1		)
	@Description("Verify Terms and Conditions")
	public void LP_TC017() throws InterruptedException {
		driver.get(url);
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getTermsAndConditionsLink().isDisplayed(), true, "Terms and Conditions Checkbox is found");
		Allure.step("Click on Terms and Conditions link");
		cgp.getTermsAndConditionsLink().click();
		Thread.sleep(2000);
		
		String mainWindowHandle = driver.getWindowHandle();

		// Get all window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the newly opened tab
		for (String handle : windowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle); // Switch to new tab
		        break;
		    }
		}
		
		wdu.waitForTitle(driver, 5, "PensionBox- Terms & Conditions");
		//Assert.assertEquals(driver.getTitle(), "PensionBox- Terms & Conditions","Terms and Conditions Checkbox is selected");
		Allure.step("Terms and Conditions Checkbox is selected, LP_TC017 is Passed");
		driver.close();
		driver.switchTo().window(mainWindowHandle);
	}
	
	@Test (
			priority = 2		)
	@Description("Verify Privacy Policy")
	public void LP_TC018() throws InterruptedException {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getPrivacyPolicyLink().isDisplayed(), true, "Privacy Policy Checkbox is found");
		Allure.step("Click on Privacy Policy link");
		cgp.getPrivacyPolicyLink().click();
		Thread.sleep(2000);
		
		String mainWindowHandle = driver.getWindowHandle();

		// Get all window handles
		Set<String> windowHandles = driver.getWindowHandles();

		// Switch to the newly opened tab
		for (String handle : windowHandles) {
		    if (!handle.equals(mainWindowHandle)) {
		        driver.switchTo().window(handle); // Switch to new tab
		        break;
		    }
		}
		
		wdu.waitForTitle(driver, 5, "PensionBox- Privacy Policy");
		Assert.assertEquals(driver.getTitle(), "PensionBox- Privacy Policy","Privacy Policy Checkbox is selected");
		Allure.step("Privacy Policy Checkbox is selected, LP_TC018 is Passed");
		driver.close();
		driver.switchTo().window(mainWindowHandle);
	}
	
	@Test (priority = 3)
	@Description("Verify Page load > Corporate Getstarted")
	public void LP_TC001() {
		Allure.step("Navigate to Corporate Getstarted URL");
		driver.get(url);
		cgp = new CorporateGetStartedPage(driver);
		//Make Generic
		//cgp.getAdminFullNameTf().sendKeys("Pradeep Auto");
		wdu.waitForTitle(driver, 5, "Get Started with PensionBox | Secure Your Retirement");
		Assert.assertEquals(driver.getTitle(), "Get Started with PensionBox | Secure Your Retirement", "Title Verified");
		Assert.assertEquals(cgp.logoSubTxt.getText(), "Workplace", "Workplace is present");
		Allure.step("Get Started page is opened, LP_TC010 is Passed");
	}
	
    @Test (priority = 4)
    @Description("Verify Corporate Header Text")
    public void LP_TC002() {
    	cgp=new CorporateGetStartedPage(driver);
    	Allure.step("Verify Welcome Text");
		Assert.assertEquals(cgp.getWelcomeTxt().getText(), "Welcome", "Welcome text found");
		Allure.step("Welcome text found, LP_TC002 is Passed");
	}
    
    @Test (priority = 5)
    @Description("Verify Corporate Logo")
	public void LP_TC003() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Verify Welcome SubText");
		Assert.assertEquals(cgp.getWelcomeSubHeaderTxt().getText(), "Let’s create a new PensionBox’s Workplace Account", "Welcome SubText is present");
		Allure.step("Welcome SubText is present, LP_TC003 is Passed");
	}
    
    @Test (priority = 6)
    @Description("Verify Admin Full Name Text field for Blank Input")
    public void LP_TC004() {
	    cgp=new CorporateGetStartedPage(driver);
	    Assert.assertEquals(cgp.getAdminFullNameTf().isDisplayed(), true, "Admin Name field is found");
	    //cgp.getAdminFullNameTf().clear();
	    cgp.getAdminFullNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
	    cgp.getSignUpBtn().click();
	    Assert.assertEquals(cgp.getAdminNameWarning().getText(), "Full Name is required.", "Name warning is present");
	    Allure.step("Admin Name warning is Present, LP_TC004 is Passed");
    }
    
    @Test (priority = 10 )
    @Description("Verify Admin Full Name Text field for Invalid input")
	public void LP_TC005() {
    	//driver.get(url);
    	cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminFullNameTf().isDisplayed(), true, "Admin Name field is found");
		cgp.getAdminFullNameTf().sendKeys("!!@#$%^&*()0123");
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminNameWarning().getText(), "Please enter a valid name", "Invalid Name warning is present");
		Allure.step("Admin Name invalid warning is Present, LP_TC005 is Passed");
    }
    
	@Test (priority = 14)
	@Description("Verify Admin Full Name Text field for Valid input")
	public void LP_TC006() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminFullNameTf().isDisplayed(), true, "Admin Name field is found");
		cgp.getAdminFullNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getAdminFullNameTf().sendKeys("Pradeep Pai");
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminFullNameTf().getAttribute("aria-invalid"), "false", "Admin Name warning is not present");
		Allure.step("Admin Name valid warning is not Present, LP_TC006 is Passed");
	}
    
	@Test (priority = 7)
	@Description("Verify Mobile Number Text field for Blank Input")
	public void LP_TC007() {

		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getMobileNumberTf().isDisplayed(), true, "Mobile Number field is found");
		cgp.getMobileNumberTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminMobileWarning().getText(), "Mobile Number is required.", "Mobile Number warning is present");
		Allure.step("Mobile Number warning is Present, LP_TC007 is Passed");
	}
	
	@Test (priority = 11 )
	@Description("Verify Mobile Number Text field for Invalid input")
	public void LP_TC008() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getMobileNumberTf().isDisplayed(), true, "Mobile Number field is found");
		cgp.getMobileNumberTf().sendKeys("1234567890");
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminMobileWarning().getText(), "Please enter a valid mobile no.", "Invalid Mobile Number warning is present");
		Allure.step("Mobile Number invalid warning is Present, LP_TC008 is Passed");
	}
	
	@Test (priority = 15)
	@Description("Verify Mobile Number Text field for Valid input")
	public void LP_TC009() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getMobileNumberTf().isDisplayed(), true, "Mobile Number field is found");
		cgp.getMobileNumberTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getMobileNumberTf().sendKeys(number);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getMobileNumberTf().getAttribute("aria-invalid"), "", "Mobile Number warning is not present");
		Allure.step("Mobile Number valid warning is not Present, LP_TC009 is Passed");
	}
	
	@Test (priority = 8)
	@Description("Verify Work Email Text field for Blank Input")
	public void LP_TC010() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminEmailTf().isDisplayed(), true, "Work Email field is found");
		cgp.getAdminEmailTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminEmailWarning().getText(), "Work Email is required.", "Work Email warning is present");
		Allure.step("Work Email warning is Present, LP_TC010 is Passed");
	}
	
	@Test (priority = 12 )
	@Description("Verify Work Email Text field for Invalid input")
	public void LP_TC011() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminEmailTf().isDisplayed(), true, "Work Email field is found");
		cgp.getAdminEmailTf().sendKeys("pradeep");
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminEmailWarning().getText(), "Please enter a valid email address", "Invalid Work Email warning is present");
		Allure.step("Work Email invalid warning is Present, LP_TC011 is Passed");
	}
	
	@Test (priority = 16)
	@Description("Verify Work Email Text field for Valid input")
	public void LP_TC012() {
		
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminEmailTf().isDisplayed(), true, "Work Email field is found");
		cgp.getAdminEmailTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getAdminEmailTf().sendKeys(email);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminEmailTf().getAttribute("aria-invalid"), "false", "Work Email warning is not present");
		Allure.step("Work Email valid warning is not Present, LP_TC012 is Passed");
		//LP_TC013();
	}
	
	/*
	 * Brand Name Autofill
	 */
	@Test (
	priority = 15,dependsOnMethods = "LP_TC012")
	@Description("Verify Brand Name Autofill")
	public void LP_TC013() {
		String domain="pensionbox";
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminBrandNameTf().isDisplayed(), true, "Brand Name field is found");
		Assert.assertEquals(cgp.getAdminBrandNameTf().getAttribute("value").toLowerCase(), domain.toLowerCase(), "Brand Name is autofilled");
		Allure.step("Brand Name is autofilled, LP_TC013 is Passed");
	}
	
	@Test (priority = 9)
	@Description("Verify Brand Name Text field for Blank Input")
	public void LP_TC014() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminBrandNameTf().isDisplayed(), true, "Brand Name field is found");
		cgp.getAdminBrandNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminBrandNameWarning().getText(), "Company Name is required.", "Brand Name warning is present");
		Allure.step("Brand Name warning is Present, LP_TC014 is Passed");
	}
	/*
	@Test (priority = 13)
	@Description("Verify Brand Name Text field for Invalid input")
	public void LP_TC015() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminBrandNameTf().isDisplayed(), true, "Brand Name field is found");
		cgp.getAdminBrandNameTf().sendKeys("!!@#$%^&*()0123");
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminBrandNameWarning().getText(), "Please enter a valid company name", "Invalid Brand Name warning is present");
		Allure.step("Brand Name invalid warning is Present, LP_TC015 is Passed");
	}
	*/
	
	@Test (priority = 16)
	@Description("Verify Brand Name Text field for Valid input")
	public void LP_TC016() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getAdminBrandNameTf().isDisplayed(), true, "Brand Name field is found");
		cgp.getAdminBrandNameTf().sendKeys("PradeepAutoTest");
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminBrandNameTf().getAttribute("aria-invalid"), "false", "Brand Name warning is not present");
		Allure.step("Brand Name valid warning is not Present, LP_TC016 is Passed");
	}
	
	@Test (priority = 2)
	@Description("Verify SignUp Button with Invalid/Blank inputs")
	public void LP_TC019() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getSignUpBtn().isDisplayed(), true, "Sign Up button is found");
		cgp.getAdminBrandNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cgp.getSignUpBtn().click();
		Assert.assertEquals(cgp.getAdminBrandNameWarning().getText(), "Company Name is required.", "Brand Name warning is present");
		Allure.step("Sign Up button is Disabled, LP_TC019 is Passed");
	}
	
	@Test (priority = 20)
	@Description("Verify SignUp Button with valid inputs")
	public void LP_TC020() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getSignUpBtn().isDisplayed(), true, "Sign Up button is found");
		cgp.getSignUpBtn().click();
		
		Allure.step("Sign Up button is clicked, LP_TC020 is Passed");
	}
	
	@Test (priority = 21)
	@Description("Verify OTP Screen load")
	public void LP_TC021() {
		cgp=new CorporateGetStartedPage(driver);
		Assert.assertEquals(cgp.getOtpHeaderTxt().isDisplayed(), true, "OTP Header is found");
		Allure.step("OTP Header is found, LP_TC021 is Passed");
	}
	
	@Test (priority = 22)
	@Description("Verify OTP Phone and Email")
	public void LP_TC022() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Check if email is matching");
		Assert.assertEquals(cgp.getOtpEmailTxt().getText(), email, "Email is matching");
		Allure.step("Check if phone number is matching");
		Assert.assertEquals(cgp.getOtpNumberTxt().getText(), number, "Mobile Number is matching");
		Allure.step("OTP Email and Number is matching, LP_TC022 is Passed");
	}
	
	@Test (priority = 23)
	@Description("Verify OTP Resend")
	public void LP_TC023() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Click on Resend Button");
		Assert.assertEquals(cgp.getResendBtn().isDisplayed(), true, "Resend Button is found");
		cgp.getResendBtn().click();
		
		Allure.step("OTP Resend Button is clicked, LP_TC023 is Passed");
	}
	
	@Test (priority = 24)
	@Description("Verify Blank OTP")
	public void LP_TC024() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Enter Blank OTP");
		cgp.getOtpTF().sendKeys(" "+" "+" "+" "+" ");
		Assert.assertEquals(cgp.getOtpErrorTxt().getText(),"OTP is required.", "OTP required warning is present");
		Allure.step("OTP warning is Present, LP_TC024 is Passed");
	}
	
	@Test (priority = 25)
	@Description("Verify Invalid OTP")
	public void LP_TC025() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Enter Invalid OTP");
		cgp.getOtpTF().sendKeys("3"+"9"+"3"+"9");
		Assert.assertEquals(cgp.getOtpErrorTxt().getText(),"Incorrect OTP. Please enter again.", "Invalid OTP warning is present");
		Allure.step("OTP invalid warning is Present, LP_TC025 is Passed");
	}
	
	@Test (priority = 27)
	@Description("Verify Valid OTP")
	public void LP_TC026() {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Enter Valid OTP");
		cgp.getOtpTF().sendKeys("3"+"9"+"9"+"1");
		Assert.assertEquals(driver.getTitle(), "Dashboard", "Dashboard Title Verified");
		Allure.step("User entered Corporate Dashboard, LP_TC026 is Passed");
	}
	
	@Test (priority = 26)
	@Description("Verify Trust Buttons")
	public void LP_TC027() throws InterruptedException {
		cgp=new CorporateGetStartedPage(driver);
		Allure.step("Click on Trust Buttons");
		cgp.getTrustedByPbBadge().click();
		Assert.assertEquals(cgp.getTrustBoxExplainedTxt().getText(), "Trust Box Explained", "Trust Box Explained is found");
		Thread.sleep(2000);
		cgp.closeTrustBoxModal.click();
		cgp.getSecureAndEncryptedBadge().click();
		Assert.assertEquals(cgp.getTrustBoxExplainedTxt().getText(), "Trust Box Explained", "Trust Box Explained is found");
		Thread.sleep(2000);
		cgp.closeTrustBoxModal.click();
		Allure.step("Trust box modals are verified, LP_TC027 is Passed");
	}
}
