package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import generic.BaseClass;
import generic.WipBaseClass;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;
import popUpModals.PushNotificationModal;
import utilities.WebDriverUtils;

public class Login extends WipBaseClass {

	@Test
	public void loginTC001(){
		HomePage h1=new HomePage(driver);
		driver.get("https://qa.pensionbox.in");
		h1.getLoginBtn().click();
		//        l1.getLogInPhoneNumberTF().sendKeys("9844267177");
		//        l1.getLogInLoginBtn().click();
		//        l1.getLogInOtpTF().sendKeys("3"+"9"+"9"+"1");
		//	
		//        
		//  	WelcomePage w1=new WelcomePage(driver);      
		//		if(wu.isItVisible(w1.getSkipForNowBtn())) {
		//        	w1.getSkipForNowBtn().click();        	
		//        }
		//        
		//        if(wu.isItVisible(w1.getNotNowBtn())) {
		//        	w1.getNotNowBtn().click();
		//        }
	} 

	@Test
	public void loginTC003(){
		LoginPage l1=new LoginPage(driver);
		driver.get("https://qa.pensionbox.in/getstarted?getStartedType=login");
		l1.getLogInPhoneNumberTF().sendKeys("");
		l1.getLogInLoginBtn().click();
		//        l1.getLogInOtpTF().sendKeys("3"+"9"+"9"+"0");
	}

	@Test
	public void loginTC004(){
		LoginPage l1=new LoginPage(driver);
		driver.get("https://qa.pensionbox.in/getstarted?getStartedType=login");
		l1.getLogInPhoneNumberTF().sendKeys("5000000000");
		l1.getLogInLoginBtn().click();
		//        l1.getLogInOtpTF().sendKeys("3"+"9"+"9"+"1");
	}

	@Test
	public void loginTC006() {
		LoginPage l1=new LoginPage(driver);
		driver.get("https://qa.pensionbox.in/getstarted?getStartedType=login");
		l1.getLogInSignupBtn().click();
	}

	@Test
	public void loginTC008() {
		LoginPage l1=new LoginPage(driver);
		driver.get("https://qa.pensionbox.in/getstarted?getStartedType=login");
		l1.getLogInIosStoreBtn().click();
	}

	@Test
	public void loginTC008B() {
		LoginPage l1=new LoginPage(driver);
		driver.get("https://qa.pensionbox.in/getstarted?getStartedType=login");
		l1.getLogInPlayStoreBtn().click();
	}
	
	@Test
	public void loginTC005() {
		Allure.step("Login Flow Started");
		LoginPage l1=new LoginPage(driver);
		PushNotificationModal p1=new PushNotificationModal(driver);
		Allure.step("Open Login Page");
		driver.get("https://qa.pensionbox.in/getstarted?getStartedType=login");
		Allure.step("Enter Phone Number");
		l1.getLogInPhoneNumberTF().sendKeys("9844267177");
		Allure.step("Click on Login Button");
		l1.getLogInLoginBtn().click();
		Allure.step("Enter OTP");
		l1.getLogInOtpTF().sendKeys("3"+"9"+"9"+"1");

//		if(p1.isNotificationPanelVisible()){
//			Allure.step("Turn off Notification");
//			p1.turnOffNotification();
//			Allure.step("Notification Turned off");
//		}
		Allure.step("Login Successful");
	}
}
