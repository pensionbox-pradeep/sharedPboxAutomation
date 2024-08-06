package testScripts;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import generic.BaseClass;
import generic.WebDriverUtils;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.WelcomePage;

public class Login extends BaseClass{
	
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
        LoginPage l1=new LoginPage(driver);
		driver.get("https://qa.pensionbox.in/getstarted?getStartedType=login");
        l1.getLogInPhoneNumberTF().sendKeys("9844267177");
        l1.getLogInLoginBtn().click();
        l1.getLogInOtpTF().sendKeys("3"+"9"+"9"+"1");
    }
}
