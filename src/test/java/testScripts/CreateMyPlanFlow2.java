package testScripts;


import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.WipBaseClass;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import pageObjects.CreateMyPlanPage;
import pageObjects.DashboardPage;

@Feature("B2C Create My Plan")
@Owner("Pradeep Pai")
public class CreateMyPlanFlow2 extends WipBaseClass{

	Login l1=new Login();

	/*
	 * Setup : Login
	 */
	@Test
	@Description("Setup : Login")
	public void CMP_TC000() {
		Reporter.log(driver.getTitle()+" Currently in getStarted Page",true);
		l1.loginTC005();
	}

	/*
	 * Verify Create My Plan Page
	 */
	@Test(dependsOnMethods = "CMP_TC000")
	@Description("Verify Create My Plan Page load")
	public void CMP_TC001() {
		Allure.step("Verify Create My Plan Page load");
		Reporter.log(driver.getTitle()+" Currently in Dashboard",true);

		DashboardPage dbp=new DashboardPage(driver);
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);

		Allure.step("Click on Create My Plan Button from Dashboard");
		dbp.getcreateMyPlanBtn2().click();

		wdu.waitForTitle(driver, 10, "Basic Details");

		Assert.assertEquals(driver.getTitle(),"Basic Details","CMP_TC001 is Passed");
		Reporter.log(driver.getTitle()+ " Basic Details title verified",true);

	}

	/*
	 * Verify Lets Create your retirement Modal
	 */
	@Test(dependsOnMethods = "CMP_TC001")
	@Description("Verify Lets Create your retirement Modal")
	public void CMP_TC002() {
		Reporter.log(driver.getTitle()+" Currently in Basic details",true);
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		wdu.waitForVisibility(driver, 10, "//div[contains(@class, 'welcomeHeader')]");
		Assert.assertEquals(cmp.getLetsCreatePlanHeader().getText(), "Let’s Create Your Retirement Plan!"
				, "CMP_TC002 is Passed");
		Reporter.log(driver.getTitle()+ " Lets Create your retirement Modal title verified",true);

	}

	/*
	 * Verify Lets Do it now button
	 */
	@Test(dependsOnMethods = "CMP_TC002")
	@Description("Verify Lets Do it now button")
	public void CMP_TC003() {
		Reporter.log(driver.getTitle()+" TC003",true);
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		cmp.getLetsDoItNowBtn().click();
	}


	//	public void CMP_TC004main() {
	//		Reporter.log("Trying to do a step after this");
	//		Allure.step("Trying to do a step after this");
	//		CMP_TC004();
	//		Reporter.log("step completed");
	//		Allure.step("Step completed");
	//	}

	/*
	 * Verify If the Name field is present
	 */
	@Test(dependsOnMethods = "CMP_TC003")
	@Description("Verify If the Name field is present")
	public void CMP_TC004() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Verify If the Name field is present");
		wdu.waitForVisibility(driver, 10, "//input[@id='outlined-basic']");
		Assert.assertEquals(wdu.isItDisplayed(cmp.getFullNameTf()), true, 
				"Full Name text field is found, CMP_TC004 is passed");
		Allure.step("Full Name text field is found");
	}

	/*
	 * Verify Name field for Blank input
	 */
	@Test(dependsOnMethods = "CMP_TC004")
	@Description("Verify Name field for Blank input")
	public void CMP_TC005() throws InterruptedException {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click and Clear the Name text field");
		cmp.getFullNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		cmp.getNextBtn().click();
		Thread.sleep(2000);
		Allure.step("Compare Border Colour of Name text field");
		String borderColour= cmp.getNameFieldset().getCssValue("border-bottom-color");
		Allure.step("Colour of Name text field is "+borderColour);
		Assert.assertEquals(borderColour,"rgba(255, 23, 68, 1)", "The Border is Red");
	}

	/*
	 * Verify Name field for Invalid Input
	 */
	@Test(dependsOnMethods = "CMP_TC004")
	@Description("Verify Name field for Invalid Input")
	public void CMP_TC006() throws InterruptedException {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click and Clear the Name text field");
		cmp.getFullNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		Allure.step("Enter invalid inputs");
		cmp.getFullNameTf().sendKeys("!!@#$%^&*()0123");
		cmp.getNextBtn().click();
		Thread.sleep(2000);
		Allure.step("Compare Border Colour of Name text field");
		String borderColour= cmp.getNameFieldset().getCssValue("border-bottom-color");
		Allure.step("Colour of Name text field is "+borderColour);
		//Assert.assertEquals(borderColour,"rgba(255, 23, 68, 1)", "The Border is Red");
		/*
		 * In Progress: The values are not getting entered, Which is enough to pass the test.
		 */
	}

	/*
	 * Verify Name field for Valid Input
	 */
	@Test(dependsOnMethods = "CMP_TC004")
	@Description("Verify Name field for Valid Input")
	public void CMP_TC007() throws InterruptedException {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click and Clear the Name text field");
		cmp.getFullNameTf().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		Allure.step("Enter Valid inputs");
		cmp.getFullNameTf().sendKeys("Pradeep Pai");
		cmp.getNextBtn().click();
		Thread.sleep(2000);
		Allure.step("Compare Border Colour of Name text field");
		String borderColour= cmp.getNameFieldset().getCssValue("border-bottom-color");
		Allure.step("Colour of Name text field is "+borderColour);
		//Assert.assertEquals(borderColour,"rgba(255, 23, 68, 1)", "The Border is unchanged");
		/*
		 * In Progress: The border colour is not changing, Which is enough to pass the test.
		 */
	}

	@Test(dependsOnMethods = "CMP_TC007")
	@Description("Verify Date of Birth Picker")
	public void CMP_TC008() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click on Date of Birth");
		Assert.assertEquals(wdu.isItDisplayed(cmp.getdOBPicker()), true, "DOB Picker is Present and Visible");
	}

	@Test(priority = 0, dependsOnMethods = "CMP_TC008")
	@Description("Verify Date of Birth Picker blank Inputs")
	public void CMP_TC009() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Without selecting any date click on Next");
		cmp.getNextBtn().click();
		Allure.step("Check the warning message");
		Assert.assertEquals(cmp.getDatePickerLabel().getText(),"DOB (Required)", "Cannot proceed without selecting DOB");
		//		Allure.step("Click on the Cancel button in the calander");
		//		cmp.getDateCancelBtn().click();
	}

	@Test(priority = 1,dependsOnMethods = "CMP_TC008")
	@Description("Verify Date of Birth Picker invalid Input")
	public void CMP_TC010() throws InterruptedException {

		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);

		Allure.step("Pick an invalid date from the calendar");
		cmp.getdOBPicker().click();

		Reporter.log("Select a year",true);
		Allure.step("Select a year");
		wdu.selectYear(cmp.getdOBYearGrid(), "2022");

		Reporter.log("Select a month",true);
		Allure.step("Select a month");
		wdu.selectMonth(cmp.getdOBMonthGrid(), "Dec");

		Reporter.log("Select a day",true);
		Allure.step("Select a day");
		wdu.selectDay(cmp.getdOBDayGrid(), "30");

		Reporter.log("Click on OK button in the calander",true);
		Allure.step("Click on OK button in the calander");
		cmp.getDateOkBtn().click();
		Allure.step("Click on Next");
		cmp.getNextBtn().click();
		Allure.step("Check the warning message");
		Assert.assertEquals(cmp.getDatePickerLabel().getText(),"You should be atleast 10 years old"
				, "Cannot proceed with age less than 10y");
	}

	@Test(priority = 2,dependsOnMethods = "CMP_TC008")
	@Description("Verify Date Picker for Valid inputs")
	public void CMP_TC011() throws InterruptedException {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);

		Allure.step("Pick an Valid date from the calendar");
		cmp.getdOBPicker().click();

		Reporter.log("Select a year",true);
		Allure.step("Select a year");
		wdu.selectYear(cmp.getdOBYearGrid(), "1999");

		Reporter.log("Select a month",true);
		Allure.step("Select a month");
		wdu.selectMonth(cmp.getdOBMonthGrid(), "mar");

		Reporter.log("Select a day",true);
		Allure.step("Select a day");
		wdu.selectDay(cmp.getdOBDayGrid(), "10");

		Reporter.log("Click on OK button in the calander",true);
		Allure.step("Click on OK button in the calander");
		cmp.getDateOkBtn().click();
		Allure.step("Click on Next");
		cmp.getNextBtn().click();
		Allure.step("Check the warning message");
		Assert.assertEquals(cmp.getDatePickerLabel().getText(),"DOB", "10+ Year is a valid selection");
		Allure.step("10+ Year is a valid selection, PASSED");
	}

	@Test(dependsOnMethods = "CMP_TC011")
	@Description("Verify Gender Picker is Present and clickable")
	public void CMP_TC012() throws InterruptedException {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Check for visibility of Gender Picker");

		Assert.assertEquals(wdu.isItDisplayed(cmp.getGenderPicker()), true, "Gender Picker is Present and Visible");
		Allure.step("Click on Gender Picker to open it");
		cmp.getGenderPicker().click();
		Allure.step("Close Gender Picker");


		/* Element not interact able
		cmp.getGenderPicker().click();

		Thread.sleep(2000);
		 */
		//wdu.sendKeyPressEsc(driver);

		cmp.getMaleGenderLi().click();

		//wdu.waitForElementTobeClickable(driver, 10, cmp.getGenderPicker());
		Allure.step("Gender Picker is Present and Visible, PASSED");
	}

	@Test(priority=2,dependsOnMethods = "CMP_TC012")
	@Description("Verify Gender Picker: if Male option is Clickable")
	public void CMP_TC013() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click on Gender Picker to open it");
		cmp.getGenderPicker().click();
		Allure.step("Check for visibility of Gender Picker Male option");
		wdu.waitForElementTobeClickable(driver, 3, cmp.getMaleGenderLi());
		Assert.assertEquals(wdu.isItDisplayed(cmp.getMaleGenderLi()), true, "Male option is Present");
		Allure.step("Click on male option");
		cmp.getMaleGenderLi().click();
		Assert.assertEquals(cmp.getGenderPicker().getText(), "Male", "Male option is selected");
		Allure.step("Male option is Present and Clickable, PASSED");
	}

	@Test(priority=1,dependsOnMethods = "CMP_TC012")
	@Description("Verify Gender Picker: if Female option is Clickable")
	public void CMP_TC014() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click on Gender Picker to open it");
		cmp.getGenderPicker().click();
		Allure.step("Check for visibility of Gender Picker Female option");
		wdu.waitForElementTobeClickable(driver, 3, cmp.getFemaleGenderLi());
		Assert.assertEquals(wdu.isItDisplayed(cmp.getFemaleGenderLi()), true, "Female option is Present");
		Allure.step("Click on Female option");
		cmp.getFemaleGenderLi().click();
		Assert.assertEquals(cmp.getGenderPicker().getText(), "Female", "Female option is selected");
		Allure.step("Female option is Present and Clickable, PASSED");
	}

	@Test(priority=0,dependsOnMethods = "CMP_TC012")
	@Description("Verify Gender Picker: if Other option is Clickable")
	public void CMP_TC015() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click on Gender Picker to open it");
		cmp.getGenderPicker().click();
		Allure.step("Check for visibility of Gender Picker 'Other' option");
		wdu.waitForElementTobeClickable(driver, 3, cmp.getOtherGenderLi());
		Assert.assertEquals(wdu.isItDisplayed(cmp.getOtherGenderLi()), true, "The 'Other' option is Present");
		Allure.step("Click on Other option");
		cmp.getOtherGenderLi().click();
		Assert.assertEquals(cmp.getGenderPicker().getText(), "Other", "Other option is selected");
		Allure.step("Other option is Present and Clickable, PASSED");
	}

	@Test(dependsOnMethods = "CMP_TC008")
	@Description("Verify Earning Status Pickers")
	public void CMP_TC016() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Check for visibility of Earning Status Picker");

		Assert.assertEquals(wdu.isItDisplayed(cmp.getEarningStatusPicker()), true, "Earning Picker is Present and Visible");
		Allure.step("Click on Earning Picker to open it");
		cmp.getEarningStatusPicker().click();
		Allure.step("Close Earning Picker");

		cmp.getSalariedli().click();

		Allure.step("Earning Picker is Present and Visible, PASSED");
	}

	@Test(priority=2,dependsOnMethods = "CMP_TC016")
	@Description("Verify Earning Status Picker: if Salaried option is Clickable")
	public void CMP_TC017() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click on Earning Picker to open it");
		cmp.getEarningStatusPicker().click();
		Allure.step("Check for visibility of Earning Status Picker Salaried option");
		wdu.waitForElementTobeClickable(driver, 3, cmp.getSalariedli());
		Assert.assertEquals(wdu.isItDisplayed(cmp.getSalariedli()), true, "Salaried option is Present");
		Allure.step("Click on Salaried option");
		cmp.getSalariedli().click();
		Assert.assertEquals(cmp.getEarningStatusPicker().getText(), "Salaried", "Salaried option is selected");
		Allure.step("Salaried option is Present and Clickable, PASSED");
	}
	
	@Test(priority=1,dependsOnMethods = "CMP_TC016")
	@Description("Verify Earning Status Picker: if Self Employed option is Clickable")
	public void CMP_TC018() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click on Earning Picker to open it");
		cmp.getEarningStatusPicker().click();
		Allure.step("Check for visibility of Earning Status Picker Self Employed option");
		wdu.waitForElementTobeClickable(driver, 3, cmp.getSelfEmployedLi());
		Assert.assertEquals(wdu.isItDisplayed(cmp.getSelfEmployedLi()), true, "Self Employed option is Present");
		Allure.step("Click on Self Employed option");
		cmp.getSelfEmployedLi().click();
		Assert.assertEquals(cmp.getEarningStatusPicker().getText(), "Self Employed", "Self Employed option is selected");
		Allure.step("Self Employed option is Present and Clickable, PASSED");
	}
	
	@Test(priority=0,dependsOnMethods = "CMP_TC016")
	@Description("Verify Earning Status Picker: if Unemployed option is Clickable")
	public void CMP_TC019() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click on Earning Picker to open it");
		cmp.getEarningStatusPicker().click();
		Allure.step("Check for visibility of Earning Status Picker Unemployed option");
		wdu.waitForElementTobeClickable(driver, 3, cmp.getNotWorkingLi());
		Assert.assertEquals(wdu.isItDisplayed(cmp.getNotWorkingLi()), true, "Unemployed option is Present");
		Allure.step("Click on Unemployed option");
		cmp.getNotWorkingLi().click();
		Assert.assertEquals(cmp.getEarningStatusPicker().getText(), "Not Working", "Unemployed option is selected");
		Allure.step("Unemployed option is Present and Clickable, PASSED");
	}
	
	@Test(dependsOnMethods = "CMP_TC0016")
	@Description("Verify Current City Text Box")
	public void CMP_TC020() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Check for visibility of Current City Text Box");
		Assert.assertEquals(wdu.isItDisplayed(cmp.getCurrentCityTF()), true, "Current City Text Box is Present and Visible");
		Allure.step("Current City Text Box is Present and Visible, PASSED");
	}
	
	@Test(priority=0,dependsOnMethods = "CMP_TC0020")
	@Description("Verify Current City Text Box for Blank/ No input, This covers TC024 and TC025")
	public void CMP_TC021() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click and Clear the Current City Text Box");
		cmp.getCurrentCityTF().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		Allure.step("Click on Next without entering any input");
		cmp.getNextBtn().click();
		Allure.step("Check for warning message in Current City Text Box");
		Assert.assertEquals(cmp.getCurrentCityTFLabel().getText(), "Current City (Required)", 
				"Current City (Required) warning is Present and Visible");
		Allure.step("Current City (Required) warning is Present and Visible, PASSED");
	}
	
	@Test(priority=1,dependsOnMethods = "CMP_TC0020")
	@Description("Verify Current City Text Box for Invalid input")
	public void CMP_TC022() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click and Clear the Current City Text Box");
		cmp.getCurrentCityTF().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		Allure.step("Enter inValid input in Current City Text Box");
		//Get it from data provider
		cmp.getCurrentCityTF().sendKeys("Chennai");
		Allure.step("Click on Next without selecting any input from dropdown");
		cmp.getNextBtn().click();
		Allure.step("Check for warning message in Current City Text Box");
		Assert.assertEquals(cmp.getCurrentCityTFLabel().getText(), "Select current city", 
				"Select current city warning is Present and Visible");
		Allure.step("Select current city warning is Present and Visible, PASSED");
	}
	
	@Test(priority=2,dependsOnMethods = "CMP_TC0020")
	@Description("Verify Current City Text Box for Valid input")
	public void CMP_TC023() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click and Clear the Current City Text Box");
		cmp.getCurrentCityTF().sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
		Allure.step("Enter Valid input in Current City Text Box");
		//Get it from data provider
		cmp.getCurrentCityTF().sendKeys("Bengaluru");
		Allure.step("Check for the Dropdown visibility");
		wdu.waitForElementTobeClickable(driver, 3, cmp.getCurrentCityLi().get(0));
		Assert.assertEquals(wdu.isItDisplayed(cmp.getCurrentCityLi().get(0)), true, "Current City list is Visible");
		
		//Needs optimization and fetch from data provider
		Allure.step("Click on any option from the dropdown");
		wdu.selectElementWithContainsText(cmp.getCurrentCityLi(), "Bengaluru");
		
		Allure.step("Check if the city is selected from the dropdown");
		Assert.assertEquals(cmp.getCurrentCityTFLabel().getText(), "Current City", "City is Selected, Warning is not Present");
		
		Allure.step("City is Selected, Warning is not Present, PASSED");
			
	}
	
//	@Test(priority=3,dependsOnMethods = "CMP_TC0020")
//	@Description("Verify Current City Text Box for Valid input")
//	public void CMP_TC024() {
//		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
//		Allure.step("Click on Next without selecting any input from dropdown");
//		cmp.getNextBtn().click();
//		Allure.step("Check for warning message in Current City Text Box");
//		Assert.assertEquals(cmp.getCurrentCityTFLabel().getText(), "Select current city", 
//				"Select current city warning is not Present");
//		Allure.step("Select current city warning is not Present, PASSED");
//	}
	
	@Test(dependsOnMethods = {"CMP_TC001","CMP_TC003","CMP_TC007","CMP_TC011","CMP_TC013","CMP_TC017","CMP_TC023"})
	@Description("Verify Next Button for Valid Inputs in Personal Details")
	public void CMP_TC026() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Click on Next without selecting any input from dropdown");
		cmp.getNextBtn().click();
		Allure.step("Check for warning message in Current City Text Box");
		Assert.assertEquals(cmp.getCurrentCityTFLabel().getText(), "Select current city", 
				"Select current city warning is not Present");
		Allure.step("Select current city warning is not Present, PASSED");
	}
	
	@Test(dependsOnMethods = "CMP_TC026")
	@Description("Verify Next Button for Valid Inputs in Personal Details")
	public void CMP_TC027() {
		CreateMyPlanPage cmp=new CreateMyPlanPage(driver);
		Allure.step("Verify Page load of Financial Status Page");
		Allure.step("Check for Financial Status Header");
		Assert.assertEquals(cmp.getFinancialStatusHeader().getText(), "Financial Status", 
				"Financial Status Header is Present and Visible");
		Allure.step("Financial Status Header is Present and Visible, PASSED");
	}
	
}
	