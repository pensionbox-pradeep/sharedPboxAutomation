package pageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateMyPlanPage {
	
	/**
	 * Personal Details Page
	 */
	
	/**
	 * Let's create your retirement plan modal
	 */
	
	//Lets create a plan Modal Header
	@FindBy(xpath = "//div[contains(@class, 'welcomeHeader')]")
	private WebElement letsCreatePlanHeader;
	
	//Go back button on the modal
	@FindBy(xpath = "//span[text()='Go Back']")
	private WebElement goBackBtn;
	
	//Close icon on the modal		
	@FindBy(xpath = "//div[contains(@class,'closeIcon')]") 
	private WebElement closeIconBtn;
	
	//Lets Do It Now button on the modal
	@FindBy(xpath = "//span[text()='Let’s Do It Now']")
	private WebElement letsDoItNowBtn;

	
	//Full Name TF Personal Details
	@FindBy(xpath = "//input[@id='outlined-basic']")
	private WebElement fullNameTf;
	
	//Name Fieldset
	@FindBy(xpath = "//input[contains(@name,'name')]/../fieldset")
	private WebElement nameFieldset;

	//Date of Birth Picker Personal Details
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']")
	private WebElement dOBPicker;

	//
	@FindBy(xpath = "//div[contains(@class,'MuiPickersYear')]")
	private List<WebElement> dOBYearGrid;

	//
	@FindBy(xpath = "//div[contains(@class,'MuiPickersMonth')]")
	private List<WebElement> dOBMonthGrid;
	
	//
	@FindBy(xpath = "//button[contains(@class,'MuiPickersDay')]")
	private List<WebElement> dOBDayGrid;

	//
	@FindBy(xpath = "//input[@placeholder='DD/MM/YYYY']/../../label")
	private WebElement datePickerLabel;			
	
	//
	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement dateCancelBtn;

	//
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement dateOkBtn;

	//Gender Picker Personal Details
	@FindBy(id = "demo-simple-select")
	private WebElement genderPicker;

	//Female Gender
	@FindBy(xpath = "//li[text()='Female']")
	private WebElement femaleGenderLi;

	//Male Gender
	@FindBy(xpath = "//li[text()='Male']")
	private WebElement maleGenderLi;

	//Other Gender
	@FindBy(xpath = "//li[text()='Other']")
	private WebElement otherGenderLi;

	@FindBy(xpath="//div//span[contains(@class,'iconContainer Mui-completed')]/..//span[text()='Personal Details']")
	private WebElement personalDetailsTick;
	/**
	 * Financial Status Section
	 */
	
	//Earning Status Financial Status
	@FindBy(xpath="//div[@id='demo-simple-select-outlined']")
	private WebElement earningStatusPicker;

	
	@FindBy(xpath = "//li[text()='Salaried']")
	private WebElement salariedli;

	@FindBy(xpath = "//li[text()='Self Employed']")
	private WebElement selfEmployedLi;

	@FindBy(xpath = "//li[text()='Not Working']")
	private WebElement notWorkingLi;

	@FindBy(id = "free-solo-demo")
	private WebElement currentCityTF;

	@FindBy(id="free-solo-demo-label")
	private WebElement currentCityTFLabel;
	
	@FindBy(id="free-solo-demo-listbox")
	private WebElement currentCityTFListbox;
	
	@FindBy(xpath="//li[contains(@id,'free-solo-demo-option')]")
	private List<WebElement> currentCityLi;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement nextBtn;

	/**
	 * Financial Status
	 */
	
	@FindBy(xpath = "//div[contains(text(),'Financial Status')]")
	private WebElement financialStatusHeader;
	
	@FindBy(xpath = "(//input[@id='outlined-basic'])[1]")
	private WebElement incomeTF;

	@FindBy(xpath = "(//div[@id='demo-simple-select-outlined'])[1]")
	private WebElement incomeFreqPicker;

	@FindBy(xpath = "(//input[@id='outlined-basic'])[2]")
	private WebElement expenseTF;

	@FindBy(xpath = "(//div[@id='demo-simple-select-outlined'])[2]")
	private WebElement expenseFreqPicker;

	@FindBy(xpath = "//li[text()='Daily']")
	private WebElement dailyLi;

	@FindBy(xpath = "//li[text()='Monthly']")
	private WebElement monthlyLi;

	@FindBy(xpath = "//li[text()='Monthly']")
	private WebElement yearlyLi;

	@FindBy(xpath = "//button[text()='Back']")
	private WebElement backBtn;

	/**
	 * Risk Profile
	 */
	@FindBy(id = "01")
	private WebElement risk0Btn;

	@FindBy(id = "12")
	private WebElement risk1Btn;

	@FindBy(id = "23")
	private WebElement risk2Btn;

	@FindBy(id = "34")
	private WebElement risk3Btn;

	@FindBy(id = "40")
	private WebElement risk4Btn;

	@FindBy(xpath = "(//div[contains(@class,'riskArrow')])[1]")
	private WebElement leftArrowBtn;

	@FindBy(xpath = "(//div[contains(@class,'riskArrow')])[2]")
	private WebElement rightArrowBtn;

	/**
	 * Dream Retirement
	 */
	@FindBy(xpath = "//div[text()='Early']")
	private WebElement retEarlyBtn;

	@FindBy(xpath = "//div[text()='Standard']")
	private WebElement retStandardBtn;

	@FindBy(xpath = "//div[text()='Late']")
	private WebElement retLateBtn;

	@FindBy(xpath = "//span[text()='Select']")
	private WebElement dRSelectBtn;

	/*
	 * Dream Retirement Page 2
	 */
	@FindBy(id = "free-solo-demo")
	private WebElement retirementLocationTF;

	@FindBy(id = "outlined-basic")
	private WebElement retirementToDoTF;

	@FindBy(id = "demo-simple-select")
	private WebElement howMuchToSpendPicker;

	@FindBy(xpath = "//li[text()='Spend less']")
	private WebElement spendLessLi;

	@FindBy(xpath = "//li[text()='Spend more']")
	private WebElement spendMoreLi;

	@FindBy(xpath = "//li[text()='Spend same as today']")
	private WebElement spendSameLi;

	@FindBy(xpath = "//span[text()='Finish']")
	private WebElement DreamRetirementfinishBtn;

	/**
	 * Quick Overview Modal
	 */
	@FindBy(xpath = "//span[text()='Go Back']")
	private WebElement modalBackBtn;

	@FindBy(xpath = "//div[contains(@class,'closeIcon')]")
	private WebElement modalCloseBtn;

	@FindBy(xpath = "//span[text()='Submit']")
	private WebElement modalSubmitBtn;

	@FindBy(xpath = "//div[contains(@class,'MuiBackdrop')]")
	private WebElement backDrop;

	/**
	 * PageFactory
	 * @param driver
	 */

	public CreateMyPlanPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

	/**
	 * @return the letsCreatePlanHeader
	 */
	public WebElement getLetsCreatePlanHeader() {
		return letsCreatePlanHeader;
	}

	/**
	 * @return the goBackBtn
	 */
	public WebElement getGoBackBtn() {
		return goBackBtn;
	}

	/**
	 * @return the closeIconBtn
	 */
	public WebElement getCloseIconBtn() {
		return closeIconBtn;
	}

	/**
	 * @return the letsDoItNowBtn
	 */
	public WebElement getLetsDoItNowBtn() {
		return letsDoItNowBtn;
	}

	/**
	 * @return the fullNameTf
	 */
	public WebElement getFullNameTf() {
		return fullNameTf;
	}

	/**
	 * @return the nameFieldset
	 */
	public WebElement getNameFieldset() {
		return nameFieldset;
	}

	/**
	 * @return the dOBPicker
	 */
	public WebElement getdOBPicker() {
		return dOBPicker;
	}

	/**
	 * @return the dOBYearGrid
	 */
	public List<WebElement> getdOBYearGrid() {
		return dOBYearGrid;
	}

	/**
	 * @return the dOBMonthGrid
	 */
	public List<WebElement> getdOBMonthGrid() {
		return dOBMonthGrid;
	}

	/**
	 * @return the dOBDayGrid
	 */
	public List<WebElement> getdOBDayGrid() {
		return dOBDayGrid;
	}

	/**
	 * @return the datePickerLabel
	 */
	public WebElement getDatePickerLabel() {
		return datePickerLabel;
	}

	/**
	 * @return the dateCancelBtn
	 */
	public WebElement getDateCancelBtn() {
		return dateCancelBtn;
	}

	/**
	 * @return the dateOkBtn
	 */
	public WebElement getDateOkBtn() {
		return dateOkBtn;
	}

	/**
	 * @return the genderPicker
	 */
	public WebElement getGenderPicker() {
		return genderPicker;
	}

	/**
	 * @return the femaleGenderLi
	 */
	public WebElement getFemaleGenderLi() {
		return femaleGenderLi;
	}

	/**
	 * @return the maleGenderLi
	 */
	public WebElement getMaleGenderLi() {
		return maleGenderLi;
	}

	/**
	 * @return the otherGenderLi
	 */
	public WebElement getOtherGenderLi() {
		return otherGenderLi;
	}

	/**
	 * @return the financialStatusHeader
	 */
	public WebElement getFinancialStatusHeader() {
		return financialStatusHeader;
	}

	/**
	 * @return the earningStatusPicker
	 */
	public WebElement getEarningStatusPicker() {
		return earningStatusPicker;
	}

	/**
	 * @return the salariedli
	 */
	public WebElement getSalariedli() {
		return salariedli;
	}

	/**
	 * @return the selfEmployedLi
	 */
	public WebElement getSelfEmployedLi() {
		return selfEmployedLi;
	}

	/**
	 * @return the notWorkingLi
	 */
	public WebElement getNotWorkingLi() {
		return notWorkingLi;
	}

	/**
	 * @return the currentCityTF
	 */
	public WebElement getCurrentCityTF() {
		return currentCityTF;
	}

	/**
	 * @return the currentCityPickerLabel
	 */
	public WebElement getCurrentCityTFLabel() {
		return currentCityTFLabel;
	}

	/**
	 * @return the currentCityTFListbox
	 */
	public WebElement getCurrentCityTFListbox() {
		return currentCityTFListbox;
	}

	/**
	 * @return the currentCityLi
	 */
	public List<WebElement> getCurrentCityLi() {
		return currentCityLi;
	}

	/**
	 * @return the personalDetailsTick
	 */
	public WebElement getPersonalDetailsTick() {
		return personalDetailsTick;
	}

	/**
	 * @return the nextBtn
	 */
	public WebElement getNextBtn() {
		return nextBtn;
	}

	/**
	 * @return the incomeTF
	 */
	public WebElement getIncomeTF() {
		return incomeTF;
	}

	/**
	 * @return the incomeFreqPicker
	 */
	public WebElement getIncomeFreqPicker() {
		return incomeFreqPicker;
	}

	/**
	 * @return the expenseTF
	 */
	public WebElement getExpenseTF() {
		return expenseTF;
	}

	/**
	 * @return the expenseFreqPicker
	 */
	public WebElement getExpenseFreqPicker() {
		return expenseFreqPicker;
	}

	/**
	 * @return the dailyLi
	 */
	public WebElement getDailyLi() {
		return dailyLi;
	}

	/**
	 * @return the monthlyLi
	 */
	public WebElement getMonthlyLi() {
		return monthlyLi;
	}

	/**
	 * @return the yearlyLi
	 */
	public WebElement getYearlyLi() {
		return yearlyLi;
	}

	/**
	 * @return the backBtn
	 */
	public WebElement getBackBtn() {
		return backBtn;
	}

	/**
	 * @return the risk0Btn
	 */
	public WebElement getRisk0Btn() {
		return risk0Btn;
	}

	/**
	 * @return the risk1Btn
	 */
	public WebElement getRisk1Btn() {
		return risk1Btn;
	}

	/**
	 * @return the risk2Btn
	 */
	public WebElement getRisk2Btn() {
		return risk2Btn;
	}

	/**
	 * @return the risk3Btn
	 */
	public WebElement getRisk3Btn() {
		return risk3Btn;
	}

	/**
	 * @return the risk4Btn
	 */
	public WebElement getRisk4Btn() {
		return risk4Btn;
	}

	/**
	 * @return the leftArrowBtn
	 */
	public WebElement getLeftArrowBtn() {
		return leftArrowBtn;
	}

	/**
	 * @return the rightArrowBtn
	 */
	public WebElement getRightArrowBtn() {
		return rightArrowBtn;
	}

	/**
	 * @return the retEarlyBtn
	 */
	public WebElement getRetEarlyBtn() {
		return retEarlyBtn;
	}

	/**
	 * @return the retStandardBtn
	 */
	public WebElement getRetStandardBtn() {
		return retStandardBtn;
	}

	/**
	 * @return the retLateBtn
	 */
	public WebElement getRetLateBtn() {
		return retLateBtn;
	}

	/**
	 * @return the dRSelectBtn
	 */
	public WebElement getdRSelectBtn() {
		return dRSelectBtn;
	}

	/**
	 * @return the retirementLocationTF
	 */
	public WebElement getRetirementLocationTF() {
		return retirementLocationTF;
	}

	/**
	 * @return the retirementToDoTF
	 */
	public WebElement getRetirementToDoTF() {
		return retirementToDoTF;
	}

	/**
	 * @return the howMuchToSpendPicker
	 */
	public WebElement getHowMuchToSpendPicker() {
		return howMuchToSpendPicker;
	}

	/**
	 * @return the spendLessLi
	 */
	public WebElement getSpendLessLi() {
		return spendLessLi;
	}

	/**
	 * @return the spendMoreLi
	 */
	public WebElement getSpendMoreLi() {
		return spendMoreLi;
	}

	/**
	 * @return the spendSameLi
	 */
	public WebElement getSpendSameLi() {
		return spendSameLi;
	}

	/**
	 * @return the dreamRetirementfinishBtn
	 */
	public WebElement getDreamRetirementfinishBtn() {
		return DreamRetirementfinishBtn;
	}

	/**
	 * @return the modalBackBtn
	 */
	public WebElement getModalBackBtn() {
		return modalBackBtn;
	}

	/**
	 * @return the modalCloseBtn
	 */
	public WebElement getModalCloseBtn() {
		return modalCloseBtn;
	}

	/**
	 * @return the modalSubmitBtn
	 */
	public WebElement getModalSubmitBtn() {
		return modalSubmitBtn;
	}
	/**
	 * @return the backDrop
	 */
	public WebElement getBackDrop() {
		return backDrop;
	}

	/**
	 * @return the mMar
	 */
	public WebElement getmMar() {
		return mMar;
	}
	/**
	 * DOB 
	 * 
	 */
	@FindBy(xpath = "//button[text()='1999']")
	private WebElement y1999;

	@FindBy(xpath = "//button[text()='Mar']")
	private WebElement mMar;

	@FindBy(xpath = "//button[text()='10']")
	private WebElement d10;



	public WebElement getY1999() {
		return y1999;
	}

	public WebElement getMMar() {
		return mMar;
	}

	public WebElement getD10() {
		return d10;
	}

	/**
	 * PANDEY JI's CodeBlock
	 */
//	@FindBy(xpath = "//li[contains(@id,'free-solo-demo-option')]")
//	private List<WebElement> cityOptionZero;
//
//
//	/**
//	 * @return the cityOptionZero
//	 */
//	public List<WebElement> getCityOptionZero() {
//		return cityOptionZero;
//	}
//
//	public void selectOption(List<WebElement> elements, String optionText) {
//		for (WebElement element : elements) {
//			if (element.getText().trim().equalsIgnoreCase(optionText)) {
//				element.click();
//				break;
//			}
//		}
//	}
	/**
	 * Generic  Method to Fill Personal Details
	 * @throws InterruptedException 
	 */
	public void fillPersonalDetails(String fullname, char gender, char earning, String cityname ) throws InterruptedException {
		getFullNameTf().sendKeys(fullname);
		getdOBPicker().click();
		getY1999().click();
		getMMar().click();
		getD10().click();
		getDateOkBtn().click();
		getGenderPicker().click();

		if(gender=='m') {
			getMaleGenderLi().click();
		}
		else if (gender=='f') {
			getFemaleGenderLi().click();
		}
		else {
			getOtherGenderLi().click();
		}

		getEarningStatusPicker().click();

		if(earning=='s') {
			getSalariedli().click();
		}
		else if(earning=='e') {
			getSelfEmployedLi().click();
		}
		else {
			getNotWorkingLi().click();
		}

		getCurrentCityTF().sendKeys(cityname);
		Thread.sleep(3000);
		//selectOption(cityOptionZero,"Bangalore");
		getCurrentCityTF().sendKeys(""+Keys.ARROW_DOWN +""+ Keys.ENTER);

	}

	/**
	 * Generic Method to fill Financial Status
	 */
	public void fillFinancialStatus(String income, char ifr, String expense, char efr) {
		getIncomeTF().sendKeys(income);
		getIncomeFreqPicker().click();
		if(ifr=='m') {
			getMonthlyLi().click();
		}
		else if (ifr=='y') {
			getYearlyLi().click();
		}
		else {
			getDailyLi().click();
		}

		getExpenseTF().sendKeys(expense);
		getExpenseFreqPicker().click();
		if(efr=='m') {
			getMonthlyLi().click();
		}
		else if (efr=='y') {
			getYearlyLi().click();
		}
		else {
			getDailyLi().click();
		}
	}

	/**
	 * Generic method to set risk profile
	 * @throws InterruptedException 
	 */
	public void fillRiskProfile(int riskKey) throws InterruptedException {
		switch (riskKey) {
		case 0:
			getRisk0Btn().click();
			break;
		case 1:
			getRisk1Btn().click();
			break;
		case 2:
			getRisk2Btn().click();
			break;
		case 3:
			getRisk3Btn().click();
			break;
		case 4:
			getRisk4Btn().click();
			break;
		default:
			Reporter.log("Wrong Risk Key");
			break;
		}
		Thread.sleep(1000);
	}

	/**
	 * Generic method to select When to Retire
	 */
	public void fillWhenRetirement(char whenKey) {
		switch (whenKey) {
		case 'e':
			getRetEarlyBtn().click();
			break;
		case 's':
			getRetStandardBtn().click();
			break;
		case 'l':
			getRetLateBtn().click();
			break;
		default:
			Reporter.log("Wrong When key");
			break;
		}
	}

	/**
	 * Generic method to fill personalize your Dreams
	 * @throws InterruptedException 
	 */
	public void fillPersonalizeDreams(String location, String toDo, char howMuchToSpendKey) throws InterruptedException {
		getRetirementLocationTF().sendKeys(location);
		Thread.sleep(1000);
		getRetirementLocationTF().sendKeys(""+ Keys.DOWN+""+Keys.ENTER);
		getRetirementToDoTF().sendKeys(toDo);
		getHowMuchToSpendPicker().click();

		switch (howMuchToSpendKey) {
		case 's':
			getSpendSameLi().click();
			break;
		case 'l':
			getSpendLessLi().click();
			break;
		case 'm':
			getSpendMoreLi().click();
			break;
		default:
			Reporter.log("Wrong HowMuchToSpend key");
			break;
		}
	}

}
