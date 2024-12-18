package testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.GetStartedPage;
import utilities.WebDriverUtils;

public class NotificationNoLogin{
	
	public static void runStuff(String a) throws InterruptedException {
		WebDriverUtils wdu= new WebDriverUtils();
		WebDriver driver=new FirefoxDriver();
		wdu.waitImplicitTime(driver, 5);
		driver.get(a);
		GetStartedPage gsp=new GetStartedPage(driver);
		gsp.getGetStartedPhoneNumberTF().sendKeys("9844267177");
		gsp.getGetStartedSignUpBtn().click();
		Thread.sleep(2000);
		gsp.getGetStartedOtpTF().sendKeys("3"+"9"+"9"+"1");
        Thread.sleep(5000);
        System.out.println(a+" Done");
        driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		runStuff("https://qa.pensionbox.in/dashboard");
		runStuff("https://qa.pensionbox.in/profile");
		runStuff("https://qa.pensionbox.in/dashboard/mysavings");
		runStuff("https://qa.pensionbox.in/dashboard/ppf/ppfsavingsbreakup");
		runStuff("https://qa.pensionbox.in/dashboard/fd/fdsavingsbreakup");
		runStuff("https://qa.pensionbox.in/nps/npsAccountDetails");
		runStuff("https://qa.pensionbox.in/dashboard/nps/npssavingsbreakup?accountType=tier1");
		runStuff("https://qa.pensionbox.in/dashboard/nps/npssavingsbreakup?accountType=tier2");
		runStuff("https://qa.pensionbox.in/contribute?option=invest");
		runStuff("https://qa.pensionbox.in/contribute?option=withdraw");
		runStuff("https://qa.pensionbox.in/transaction");
		runStuff("https://qa.pensionbox.in/contribute/existing-sip");
		runStuff("https://qa.pensionbox.in/rewards");
		runStuff("https://qa.pensionbox.in/support");
		runStuff("https://qa.pensionbox.in/insights?type=myplan");
		runStuff("https://qa.pensionbox.in/dashboard/product/national-pension-scheme/tier-1");
		runStuff("https://qa.pensionbox.in/dashboard/product/national-pension-scheme/tier-2");
		runStuff("https://qa.pensionbox.in/dashboard/product/digital-gold");
		runStuff("https://qa.pensionbox.in/dashboard/product/pf");
		runStuff("https://qa.pensionbox.in/dashboard/product/ppf");
		runStuff("https://qa.pensionbox.in/dashboard/product/fd");
		runStuff("https://qa.pensionbox.in/dashboard/notifications");
		runStuff("https://qa.pensionbox.in/basicdetails");
		
	}
	
	

}
