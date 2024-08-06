package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import generic.BaseClass;
import generic.WebDriverUtils;
import pageObjects.GetStartedPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;

public class SignUp extends BaseClass{
	@Test
	public void signUpTC001(){
		HomePage h=new HomePage(driver);
		//        GetStartedPage gsp=new GetStartedPage(driver);
		driver.get("https://qa.pensionbox.in/");
		h.getGetStartedBtn().click();
		//        gsp.getGetStartedPhoneNumberTF().sendKeys("9844267177");
		//        gsp.getGetStartedSignUpBtn().click();
		//        gsp.getGetStartedOtpTF().sendKeys("3"+"9"+"9"+"1");
	}

	@Test
	public void signUpTC003() {
		driver.get("https://qa.pensionbox.in/getstarted");
		GetStartedPage gsp=new GetStartedPage(driver);
		gsp.getGetStartedTerms().click();
	}

	@Test
	public void signUpTC004() {
		driver.get("https://qa.pensionbox.in/getstarted");
		GetStartedPage gsp=new GetStartedPage(driver);
		gsp.getGetStartedPrivacy().click();
	}

	@Test
	public void signUpTC005(){
		driver.get("https://qa.pensionbox.in/getstarted");
		GetStartedPage gsp=new GetStartedPage(driver);
		gsp.getGetStartedPhoneNumberTF().sendKeys("");
		gsp.getGetStartedSignUpBtn().click();
		//gsp.getGetStartedOtpTF().sendKeys("3"+"9"+"9"+"1");
	}

	@Test
	public void signUpTC006(){
		driver.get("https://qa.pensionbox.in/getstarted");
		GetStartedPage gsp=new GetStartedPage(driver);
		gsp.getGetStartedPhoneNumberTF().sendKeys("50000000");
		gsp.getGetStartedSignUpBtn().click();
		//gsp.getGetStartedOtpTF().sendKeys("3"+"9"+"9"+"1");
	}

	@Test
	public void signUpTC007(){
		driver.get("https://qa.pensionbox.in/getstarted");
		GetStartedPage gsp=new GetStartedPage(driver);
		gsp.getGetStartedPhoneNumberTF().sendKeys("9844267177");
		gsp.getGetStartedSignUpBtn().click();
		gsp.getGetStartedOtpTF().sendKeys("3"+"9"+"9"+"1");
	}

	@Test
	public void signUpTC010() throws InterruptedException {
		GetStartedPage gsp=new GetStartedPage(driver);
		driver.get("https://qa.pensionbox.in/getstarted");
		gsp.getGetStartedIosStoreBtn().click();
		Thread.sleep(1000);
	}

	@Test
	public void signUpTC010B() throws InterruptedException {
		GetStartedPage gsp=new GetStartedPage(driver);
		driver.get("https://qa.pensionbox.in/getstarted");
		gsp.getLgetStartedPlayStoreBtn().click();
		Thread.sleep(1000);
	}

	
	
}

