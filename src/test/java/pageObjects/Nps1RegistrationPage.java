package pageObjects;

import java.awt.AWTException;
import java.util.List;

import org.checkerframework.checker.interning.qual.FindDistinct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.WebDriverUtils;

public class Nps1RegistrationPage {
	@FindBy(xpath = "//button[text()='Let’s do it now']")
	private WebElement LetsDoItNowBtn;

	/**
	 * @return the letsDoItNowBtn
	 */
	public WebElement getLetsDoItNowBtn() {
		return LetsDoItNowBtn;
	}

	@FindBy(xpath = "//span[text()='Save & Next']")
	private WebElement saveNextBtn;
	/**
	 * PRAN Card Preference Page
	 */

	@FindBy(xpath = "//div[text()='PRAN Card']")
	private WebElement pRANCardHeader;

	@FindBy(xpath = "//div[text()='PRAN Preferences']")
	private WebElement pRANPreferenceCollapsible;

	@FindBy(xpath = "//input[@value='F']")
	private WebElement fatherNameRadioBtn;

	@FindBy(xpath = "//input[@value='M']")
	private WebElement motherNameRadioBtn;

	@FindBy(xpath = "(//span[text()='PRAN Print Hindi']/..//span[2])[1]")
	private WebElement printHindiSwitch;

	@FindBy(xpath = "((//span[text()='Physical PRAN']/..//span[2])[1]")
	private WebElement physicalPranSwitch;

	@FindBy(xpath = "//div[text()='Nominee Details']")
	private WebElement nomineeDetailsCollapsible;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement nomineeFirstName;

	@FindBy(xpath = "//input[@name='middleName']")
	private WebElement nomineeMidName;

	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement nomineeLastName;

	@FindBy(xpath = "//input[@name='relation']/..")
	private WebElement relationPicker;

	@FindBy(xpath = "//li[@role='option']")
	private List<WebElement> relationOptionsLi;

	@FindBy(xpath = "//input[@name='relationOthers']")
	private WebElement otherRelationTF;

	@FindBy(xpath = "//input[@name='nomineeAge']")
	private WebElement nomineeAgeTF;

	@FindBy(xpath = "//input[@name='percentageShare']")
	private WebElement nomineePercentageShare;

	@FindBy(xpath = "//span[text()='Save']/..")
	private WebElement nomineeSaveBtn;

	@FindBy(xpath = "//div[contains(@class,'addIcon')]//button")
	private WebElement addNomineeIcon;

	@FindBy(xpath = "//span[text()='Save & Next']/..")
	private WebElement pRRANSaveNextBtn;

	@FindBy(xpath = "//button[text()='Back']")
	private WebElement pRANBackBtn;

	/*
	 * If Below 18
	 */
	@FindBy(xpath = "//input[@name='majorMinor']")
	private WebElement majorMinorSwitch;

	@FindBy(id = ":r1m:")
	private WebElement nomineeDoBPicker;

	@FindBy(xpath = "//button[contains(@class,'yearButton')]")
	private List<WebElement> yearLi;

	@FindBy(xpath = "//button[contains(@class,'monthButton')]")
	private List<WebElement> monthLi;

	@FindBy(xpath = "//button[contains(@class,'PickersDay')]")
	private List<WebElement> dayLi;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement dateOKBtn;

	@FindBy(xpath = "//button[text()='Cancel']")
	private WebElement dateCancelBtn;

	@FindBy(xpath = "//input[@name='guardianName']")
	private WebElement guardianFirstNameTF;

	/**
	 * Bank Details Page of NPS Registration
	 */

	@FindBy(xpath = "(//div[text()='Bank Details'])[1]")
	private WebElement bankDetailsHeader;

	@FindBy(xpath = "//div[text()='Occupation Details']")
	private WebElement occupationDetailsCollapsible;

	@FindBy(xpath = "(//div[@id='demo-simple-select'])[1]")
	private WebElement occupationPicker;

	@FindBy(xpath = "//li[@role='option']")
	private List <WebElement> occupationLi;

	@FindBy(xpath = "//input[@name='occupationOthers']")
	private WebElement otherOccupationTF;

	@FindBy(xpath = "//span[text()='Save Occupation']/..")
	private WebElement saveOccupation;

	@FindBy(xpath = "(//div[text()='Bank Details'])[2]")
	private WebElement bankDetailsCollapsible;

	@FindBy(xpath = "//input[@name='bankIFSCCode']")
	private WebElement bankIfscTF;

	@FindBy(xpath = "//input[@name='bankAccountType']/../div")
	private WebElement accountTypePicker;

	@FindBy(xpath = "//li[text()='Savings']")
	private WebElement savingsLi;

	@FindBy(xpath = "//li[text()='Current']")
	private WebElement currentLi;

	@FindBy(xpath = "//input[@name='bankAccountNo']")
	private WebElement bankAccountNumberTF;

	@FindBy(xpath = "//input[@name='bankAccountNoRepeat']")
	private WebElement reEnterBankAccountNumberTF;

	@FindBy(xpath = "//span[text()='Save']/..")
	private WebElement saveBankDetailsBtn;

	@FindBy(xpath = "//div[text()='Modify']")
	private WebElement modifyBankDetails;

	@FindBy(xpath = "//div[text()='Delete']")
	private WebElement deleteBankDetails;

	/**
	 * Documents Upload Page in NPS Registration
	 */
	@FindBy(xpath = "//div[text()='Documents Upload']")
	private WebElement documentsUploadHeader;

	@FindBy(id = "contained-button-file")
	private WebElement documentUploadBtn;

	@FindBy(xpath = "//span[text()='Save & Next']/..")
	private WebElement documentUploadSaveNextBtn;

	/**
	 * Scheme preference page in NPS Registration
	 */

	@FindBy(xpath = "//div[text()='Scheme Preference']")
	private WebElement schemePreferenceHeader;

	@FindBy(xpath = "//div[text()='6 mon.']")
	private WebElement mon6ReturnsBtn;

	@FindBy(xpath = "//div[text()='1 yr']")
	private WebElement yr1ReturnsBtn;

	@FindBy(xpath = "//div[text()='2 yr']")
	private WebElement yr2ReturnsBtn;

	@FindBy(xpath = "//div[text()='3 yr']")
	private WebElement yr3ReturnsBtn;

	@FindBy(xpath = "//div[text()='5 yr']")
	private WebElement yr5ReturnsBtn;

	@FindBy(xpath = "//div[contains(@class,'planCardRightSide')]/../div[1]/div")
	private List<WebElement> pensionFundManagersLis;

	@FindBy(xpath = "//span[text()='Select']")
	private WebElement pfmSelectBtn;

	@FindBy(xpath = "//div[contains(@class,'planCardWrapper')]")
	private WebElement reSelectPFMBtn;

	@FindBy(xpath = "//div[text()='Active']")
	private WebElement selectActiveChoiceBtn;

	@FindBy(xpath = "//div[text()='Auto']")
	private WebElement selectAutoChoiceBtn;

	@FindBy(xpath = "//div[text()='Need help?']")
	private WebElement schemePreferenceNeedHelpBtn;

	@FindBy(xpath = "//div[text()='Conservative']")
	private WebElement conservativeBtn;

	@FindBy(xpath = "//div[text()='Moderate']")
	private WebElement moderateBtn;

	@FindBy(xpath = "//div[text()='Aggressive']")
	private WebElement aggressiveBtn;

	@FindBy(xpath = "//input[@name='equity']")
	private WebElement equityPercentTF;

	@FindBy(xpath = "//input[@name='corporateDept']")
	private WebElement corporateDeptPercentTF;

	@FindBy(xpath = "//input[@name='govSecurities']")
	private WebElement govSecuritiesPercentTF;

	@FindBy(xpath = "//input[@name='alternativeBonds']")
	private WebElement alternativeBondsPercentTF;

	@FindBy(xpath = "//span[text()='Finish']")
	private WebElement finishBtn;

	/**
	 * NPS overview modal
	 */

	@FindBy(xpath = "//span[text()='Back']")
	private WebElement npsOverViewModalBackBtn;

	@FindBy(xpath = "//span[text()='Proceed']")
	private WebElement npsOverViewModalProceedBtn;

	@FindBy(xpath = "//div[contains(@class,'closeIcon')]")
	private WebElement npsOverViewModalCloseBtn;

	/**
	 * NPS Initial Contributiom Payment Screen
	 */

	@FindBy(xpath = "//div[contains(@class,'closeIcon')]")
	private WebElement initNPSContriModalCloseBtn;

	@FindBy(xpath = "//span[text()=' Contribute & Finish']")
	private WebElement initNPScontributeFinishBtn;

	/**
	 * If contribution amount needs to be changed
	 */
	@FindBy(xpath = "//input[@name='amount']")
	private WebElement initialInvestmentAmtTF;

	@FindBy(xpath = "//span[text()='Proceed']")
	private WebElement proceedToPaymentBtn;

	/**
	 * Razorpay Payment Modal
	 */

	@FindBy(xpath = "//p[text()='NPS Contribution']")
	private WebElement rzrPNPSContributionTitle;

	@FindBy(xpath = "//span[contains(@class,'back')]")
	private WebElement rzrBackBtn;

	@FindBy(xpath = "//button[contains(@class,'close')]")
	private WebElement rzrCloseBtn;

	@FindBy(xpath = "//div[text()='Pay using UPI']")
	private WebElement rzrPayUsingUPIBtn;

	@FindBy(xpath = "//div[text()='Pay using Card']")
	private WebElement rzrPayUsingCardBtn;

	@FindBy(xpath = "//div[text()='Pay using Netbanking']")
	private WebElement rzrPayUsingNetBankingBtn;

	@FindBy(xpath = "//div[text()='UPI ID/ Mobile Number']")
	private WebElement rzrUpiIdorMobileBtn;

	@FindBy(xpath = "//input[@name='vpa-upi']")
	private WebElement rzrUPIMobileNoTF;

	@FindBy(xpath = "//button[contains(@id,'view-details')]")
	private WebElement rzrViewDetailsBtn;

	@FindBy(xpath = "//button[text()='Pay Now']")
	private WebElement rzrPayNowBtn;

	@FindBy(xpath = "//span[contains(@class,'CircularProgress')]")
	private WebElement circleLoader;
	private Object a;

	public Nps1RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	/**
	 * @return the pRANCardHeader
	 */
	public WebElement getpRANCardHeader() {
		return pRANCardHeader;
	}

	/**
	 * @return the pRANPreferenceCollapsible
	 */
	public WebElement getpRANPreferenceCollapsible() {
		return pRANPreferenceCollapsible;
	}

	/**
	 * @return the fatherNameRadioBtn
	 */
	public WebElement getFatherNameRadioBtn() {
		return fatherNameRadioBtn;
	}

	/**
	 * @return the motherNameRadioBtn
	 */
	public WebElement getMotherNameRadioBtn() {
		return motherNameRadioBtn;
	}

	/**
	 * @return the printHindiSwitch
	 */
	public WebElement getPrintHindiSwitch() {
		return printHindiSwitch;
	}

	/**
	 * @return the physicalPranSwitch
	 */
	public WebElement getPhysicalPranSwitch() {
		return physicalPranSwitch;
	}

	/**
	 * @return the nomineeDetailsCollapsible
	 */
	public WebElement getNomineeDetailsCollapsible() {
		return nomineeDetailsCollapsible;
	}

	/**
	 * @return the nomineeFirstName
	 */
	public WebElement getNomineeFirstName() {
		return nomineeFirstName;
	}

	/**
	 * @return the nomineeMidName
	 */
	public WebElement getNomineeMidName() {
		return nomineeMidName;
	}

	/**
	 * @return the nomineeLastName
	 */
	public WebElement getNomineeLastName() {
		return nomineeLastName;
	}

	/**
	 * @return the relationPicker
	 */
	public WebElement getRelationPicker() {
		return relationPicker;
	}

	/**
	 * @return the relationOptionsLi
	 */
	public List<WebElement> getRelationOptionsLi() {
		return relationOptionsLi;
	}

	/**
	 * @return the otherRelationTF
	 */
	public WebElement getOtherRelationTF() {
		return otherRelationTF;
	}

	/**
	 * @return the nomineeAgeTF
	 */
	public WebElement getNomineeAgeTF() {
		return nomineeAgeTF;
	}

	/**
	 * @return the nomineePercentageShare
	 */
	public WebElement getNomineePercentageShare() {
		return nomineePercentageShare;
	}

	/**
	 * @return the nomineeSaveBtn
	 */
	public WebElement getNomineeSaveBtn() {
		return nomineeSaveBtn;
	}

	/**
	 * @return the saveNextBtn
	 */
	public WebElement getSaveNextBtn() {
		return saveNextBtn;
	}
	/**
	 * @return the addNomineeIcon
	 */
	public WebElement getAddNomineeIcon() {
		return addNomineeIcon;
	}

	/**
	 * @return the pRRANSaveNextBtn
	 */
	public WebElement getpRRANSaveNextBtn() {
		return pRRANSaveNextBtn;
	}

	/**
	 * @return the pRANBackBtn
	 */
	public WebElement getpRANBackBtn() {
		return pRANBackBtn;
	}

	/**
	 * @return the majorMinorSwitch
	 */
	public WebElement getMajorMinorSwitch() {
		return majorMinorSwitch;
	}

	/**
	 * @return the nomineeDoBPicker
	 */
	public WebElement getNomineeDoBPicker() {
		return nomineeDoBPicker;
	}

	/**
	 * @return the yearLi
	 */
	public List<WebElement> getYearLi() {
		return yearLi;
	}

	/**
	 * @return the monthLi
	 */
	public List<WebElement> getMonthLi() {
		return monthLi;
	}

	/**
	 * @return the dayLi
	 */
	public List<WebElement> getDayLi() {
		return dayLi;
	}

	/**
	 * @return the dateOKBtn
	 */
	public WebElement getDateOKBtn() {
		return dateOKBtn;
	}

	/**
	 * @return the dateCancelBtn
	 */
	public WebElement getDateCancelBtn() {
		return dateCancelBtn;
	}

	/**
	 * @return the guardianFirstNameTF
	 */
	public WebElement getGuardianFirstNameTF() {
		return guardianFirstNameTF;
	}

	/**
	 * @return the bankDetailsHeader
	 */
	public WebElement getBankDetailsHeader() {
		return bankDetailsHeader;
	}

	/**
	 * @return the occupationDetailsCollapsible
	 */
	public WebElement getOccupationDetailsCollapsible() {
		return occupationDetailsCollapsible;
	}

	/**
	 * @return the occupationPicker
	 */
	public WebElement getOccupationPicker() {
		return occupationPicker;
	}




	/**
	 * @return the occupationLi
	 */
	public List<WebElement> getOccupationLi() {
		return occupationLi;
	}
	/**
	 * @return the otherOccupationTF
	 */
	public WebElement getOtherOccupationTF() {
		return otherOccupationTF;
	}

	/**
	 * @return the saveOccupation
	 */
	public WebElement getSaveOccupation() {
		return saveOccupation;
	}

	/**
	 * @return the bankDetailsCollapsible
	 */
	public WebElement getBankDetailsCollapsible() {
		return bankDetailsCollapsible;
	}

	/**
	 * @return the bankIfscTF
	 */
	public WebElement getBankIfscTF() {
		return bankIfscTF;
	}

	/**
	 * @return the accountTypePicker
	 */
	public WebElement getAccountTypePicker() {
		return accountTypePicker;
	}

	/**
	 * @return the savingsLi
	 */
	public WebElement getSavingsLi() {
		return savingsLi;
	}

	/**
	 * @return the currentLi
	 */
	public WebElement getCurrentLi() {
		return currentLi;
	}

	/**
	 * @return the bankAccountNumberTF
	 */
	public WebElement getBankAccountNumberTF() {
		return bankAccountNumberTF;
	}

	/**
	 * @return the reEnterBankAccountNumberTF
	 */
	public WebElement getReEnterBankAccountNumberTF() {
		return reEnterBankAccountNumberTF;
	}

	/**
	 * @return the saveBankDetailsBtn
	 */
	public WebElement getSaveBankDetailsBtn() {
		return saveBankDetailsBtn;
	}

	/**
	 * @return the modifyBankDetails
	 */
	public WebElement getModifyBankDetails() {
		return modifyBankDetails;
	}

	/**
	 * @return the deleteBankDetails
	 */
	public WebElement getDeleteBankDetails() {
		return deleteBankDetails;
	}

	/**
	 * @return the documentsUploadHeader
	 */
	public WebElement getDocumentsUploadHeader() {
		return documentsUploadHeader;
	}

	/**
	 * @return the documentUploadBtn
	 */
	public WebElement getDocumentUploadBtn() {
		return documentUploadBtn;
	}

	/**
	 * @return the documentUploadSaveNextBtn
	 */
	public WebElement getDocumentUploadSaveNextBtn() {
		return documentUploadSaveNextBtn;
	}

	/**
	 * @return the schemePreferenceHeader
	 */
	public WebElement getSchemePreferenceHeader() {
		return schemePreferenceHeader;
	}

	/**
	 * @return the mon6ReturnsBtn
	 */
	public WebElement getMon6ReturnsBtn() {
		return mon6ReturnsBtn;
	}

	/**
	 * @return the yr1ReturnsBtn
	 */
	public WebElement getYr1ReturnsBtn() {
		return yr1ReturnsBtn;
	}

	/**
	 * @return the yr2ReturnsBtn
	 */
	public WebElement getYr2ReturnsBtn() {
		return yr2ReturnsBtn;
	}

	/**
	 * @return the yr3ReturnsBtn
	 */
	public WebElement getYr3ReturnsBtn() {
		return yr3ReturnsBtn;
	}

	/**
	 * @return the yr5ReturnsBtn
	 */
	public WebElement getYr5ReturnsBtn() {
		return yr5ReturnsBtn;
	}

	/**
	 * @return the pensionFundManagersLis
	 */
	public List<WebElement> getPensionFundManagersLis() {
		return pensionFundManagersLis;
	}

	/**
	 * @return the pfmSelectBtn
	 */
	public WebElement getPfmSelectBtn() {
		return pfmSelectBtn;
	}

	/**
	 * @return the reSelectPFMBtn
	 */
	public WebElement getReSelectPFMBtn() {
		return reSelectPFMBtn;
	}

	/**
	 * @return the selectActiveChoiceBtn
	 */
	public WebElement getSelectActiveChoiceBtn() {
		return selectActiveChoiceBtn;
	}

	/**
	 * @return the selectAutoChoiceBtn
	 */
	public WebElement getSelectAutoChoiceBtn() {
		return selectAutoChoiceBtn;
	}

	/**
	 * @return the schemePreferenceNeedHelpBtn
	 */
	public WebElement getSchemePreferenceNeedHelpBtn() {
		return schemePreferenceNeedHelpBtn;
	}

	/**
	 * @return the conservativeBtn
	 */
	public WebElement getConservativeBtn() {
		return conservativeBtn;
	}

	/**
	 * @return the moderateBtn
	 */
	public WebElement getModerateBtn() {
		return moderateBtn;
	}

	/**
	 * @return the aggressiveBtn
	 */
	public WebElement getAggressiveBtn() {
		return aggressiveBtn;
	}

	/**
	 * @return the equityPercentTF
	 */
	public WebElement getEquityPercentTF() {
		return equityPercentTF;
	}

	/**
	 * @return the corporateDeptPercentTF
	 */
	public WebElement getCorporateDeptPercentTF() {
		return corporateDeptPercentTF;
	}

	/**
	 * @return the govSecuritiesPercentTF
	 */
	public WebElement getGovSecuritiesPercentTF() {
		return govSecuritiesPercentTF;
	}

	/**
	 * @return the alternativeBondsPercentTF
	 */
	public WebElement getAlternativeBondsPercentTF() {
		return alternativeBondsPercentTF;
	}

	/**
	 * @return the finishBtn
	 */
	public WebElement getFinishBtn() {
		return finishBtn;
	}

	/**
	 * @return the npsOverViewModalBackBtn
	 */
	public WebElement getNpsOverViewModalBackBtn() {
		return npsOverViewModalBackBtn;
	}

	/**
	 * @return the npsOverViewModalProceedBtn
	 */
	public WebElement getNpsOverViewModalProceedBtn() {
		return npsOverViewModalProceedBtn;
	}

	/**
	 * @return the npsOverViewModalCloseBtn
	 */
	public WebElement getNpsOverViewModalCloseBtn() {
		return npsOverViewModalCloseBtn;
	}

	/**
	 * @return the initNPSContriModalCloseBtn
	 */
	public WebElement getInitNPSContriModalCloseBtn() {
		return initNPSContriModalCloseBtn;
	}

	/**
	 * @return the initNPScontributeFinishBtn
	 */
	public WebElement getInitNPScontributeFinishBtn() {
		return initNPScontributeFinishBtn;
	}

	/**
	 * @return the initialInvestmentAmtTF
	 */
	public WebElement getInitialInvestmentAmtTF() {
		return initialInvestmentAmtTF;
	}

	/**
	 * @return the proceedToPaymentBtn
	 */
	public WebElement getProceedToPaymentBtn() {
		return proceedToPaymentBtn;
	}

	/**
	 * @return the rzrPNPSContributionTitle
	 */
	public WebElement getRzrPNPSContributionTitle() {
		return rzrPNPSContributionTitle;
	}

	/**
	 * @return the rzrBackBtn
	 */
	public WebElement getRzrBackBtn() {
		return rzrBackBtn;
	}

	/**
	 * @return the rzrCloseBtn
	 */
	public WebElement getRzrCloseBtn() {
		return rzrCloseBtn;
	}

	/**
	 * @return the rzrPayUsingUPIBtn
	 */
	public WebElement getRzrPayUsingUPIBtn() {
		return rzrPayUsingUPIBtn;
	}

	/**
	 * @return the rzrPayUsingCardBtn
	 */
	public WebElement getRzrPayUsingCardBtn() {
		return rzrPayUsingCardBtn;
	}

	/**
	 * @return the rzrPayUsingNetBankingBtn
	 */
	public WebElement getRzrPayUsingNetBankingBtn() {
		return rzrPayUsingNetBankingBtn;
	}

	/**
	 * @return the rzrUpiIdorMobileBtn
	 */
	public WebElement getRzrUpiIdorMobileBtn() {
		return rzrUpiIdorMobileBtn;
	}

	/**
	 * @return the rzrUPIMobileNoTF
	 */
	public WebElement getRzrUPIMobileNoTF() {
		return rzrUPIMobileNoTF;
	}

	/**
	 * @return the rzrViewDetailsBtn
	 */
	public WebElement getRzrViewDetailsBtn() {
		return rzrViewDetailsBtn;
	}

	/**
	 * @return the rzrPayNowBtn
	 */
	public WebElement getRzrPayNowBtn() {
		return rzrPayNowBtn;
	}

	/***
	 * Generic methods
	 */

	public void fillPranCardDetails(char name, boolean hindi, boolean physical  ) {
		if(name=='f') {
			getFatherNameRadioBtn().click();
		}
		else {
			getMotherNameRadioBtn().click();
		}

		if(hindi) {
			getPrintHindiSwitch().click();
		}

		if(physical) {
			getPhysicalPranSwitch().click();
		}
	}

	public void fillNomineeDetails(String nomineeFN, String nomineeMN, String nomineeLN 
			,boolean major, String relation, String age, String percentage1) {

		getNomineeDetailsCollapsible().click();

		getNomineeFirstName().clear();
		getNomineeFirstName().sendKeys(nomineeFN);

		getNomineeMidName().clear();
		getNomineeMidName().sendKeys(nomineeMN);

		getNomineeLastName().clear();
		getNomineeLastName().sendKeys(nomineeLN);

		if(major) {

		}
		else {
			getMajorMinorSwitch().click();
		}

		getRelationPicker().click();
		WebDriverUtils wdu=new WebDriverUtils();
		wdu.selectElementWithText(getRelationOptionsLi(),relation);

		getNomineeAgeTF().sendKeys(age);

		getNomineePercentageShare().clear();
		getNomineePercentageShare().sendKeys(percentage1);

		getNomineeSaveBtn().click();

		getSaveNextBtn().click();

	}

	public void fillBankDetails(String occ, String ifsc, char accType, String accNo) {
		getOccupationPicker().click();
		WebDriverUtils wdu=new WebDriverUtils();

		wdu.selectElementWithContainsText(getOccupationLi(), occ);

		getBankIfscTF().clear();
		getBankIfscTF().sendKeys(ifsc);

		getAccountTypePicker().click();
		if(accType=='s') {
			getSavingsLi().click();
		}
		else if(accType=='c') {
			getCurrentLi().click();
		}

		getBankAccountNumberTF().sendKeys(accNo);
		getReEnterBankAccountNumberTF().sendKeys(accNo);

		getSaveBankDetailsBtn().click();

		getSaveNextBtn().click();
	}

	public void fillDocumentUpload(String filePath) throws AWTException, InterruptedException {
		WebDriverUtils wdu=new WebDriverUtils();
		getDocumentUploadBtn().click();
		wdu.uploadFile(filePath, null);
		Thread.sleep(3000);
		getSaveNextBtn().click();
	}

	public void fillSchemePreferencePt1(int retKey, String fundMgr) {
		switch (retKey) {
		case 6:
			getMon6ReturnsBtn().click();
			break;
		case 1:
			getYr1ReturnsBtn().click();
			break;
		case 2:
			getYr2ReturnsBtn().click();
			break;
		case 3:
			getYr3ReturnsBtn().click();
			break;
		case 5:
			getYr5ReturnsBtn().click();
			break;
		default:
			break;
		}

		WebDriverUtils wdu=new WebDriverUtils();
		wdu.selectElementWithContainsText(getPensionFundManagersLis(), fundMgr);

		getPfmSelectBtn().click();
	}

	public void fillSchemePreferencePt2(char choice, char assetKey ) {
		if(choice=='m') {
			getSelectActiveChoiceBtn().click();
		}
		else {
			getSelectAutoChoiceBtn().click();
		}

		switch (assetKey) {
		case 'a':
			getAggressiveBtn().click();
			break;
		case 'm':
			getModerateBtn().click();
		default:
		case 'c':
			getConservativeBtn().click();
			break;
		}
		
		getFinishBtn().click();

	}
	
	

}
