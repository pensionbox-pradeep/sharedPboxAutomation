package testScripts;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseClass;
import pageObjects.CreateMyPlanPage;
import pageObjects.DashboardPage;
import pageObjects.GetStartedPage;
import pageObjects.InsightsPage;
import pageObjects.LoginPage;

public class CreateMyPlanFlow extends BaseClass{
	@Test
	public void createMyPlan() throws InterruptedException {
		
		LoginPage l1=new LoginPage(driver);
		driver.get("https://qa.pensionbox.in/getstarted?getStartedType=login");
        l1.getLogInPhoneNumberTF().sendKeys("9844267177");
        l1.getLogInLoginBtn().click();
        l1.getLogInOtpTF().sendKeys("3"+"9"+"9"+"1");
        Thread.sleep(10000);
		
		DashboardPage dbp=new DashboardPage(driver);
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		//Navigate to basic details
		driver.get("https://qa.pensionbox.in/basicdetails");
		//dbp.getcreateMyPlanBtn2().click();
		cmp.getLetsDoItNowBtn().click();
		
		cmp.fillPersonalDetails("Pradeep AutoTest", 'm', 's', "Bangalore");	//m= Male, s=Salaried
		cmp.getNextBtn().click();
		
		cmp.fillFinancialStatus("50000", 'm', "30000", 'm');	//m= monthly ,d= daily, y=yearly
		cmp.getNextBtn().click();
		
		cmp.fillRiskProfile(2);	//set risk from 0 to 4
		cmp.getNextBtn().click();;
		
		cmp.fillWhenRetirement('s');	//e=early, s=standard, l=late
		cmp.getdRSelectBtn().click();
		
		cmp.fillPersonalizeDreams("Bangalore", "Cafe", 'm');	
		cmp.getDreamRetirementfinishBtn().click();
		cmp.getModalSubmitBtn().click();
		//Assert true if main tile is Insights are here! 
	}
	
	@Test
	public void insights() throws InterruptedException {
		InsightsPage ins=new InsightsPage(driver);
		//Navigate to Insights Page
		driver.get("https://qa.pensionbox.in/insights");

		int n=0;
		while(n++<5) {
			ins.getSwipeRightBtn().click();
			Thread.sleep(2000);
		}
		//ins.getRetSlider1st().click();
		ins.getUpdateMyPlanBtn().click();
		//Assert true if user lands in My Plan page
	}
	

}
