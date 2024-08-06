package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage {
	/**
	 * Auto-fill Details
	 */
	@FindBy(xpath = "//input[@name='mobileNumber']")
	private WebElement pDM_MobileNumberTF;

	@FindBy(xpath = "//input[@name='emailAddress']")
	private WebElement pDM_EmailAddressTF;

	@FindBy(xpath = "//label[text()='DOB']/..//input")
	private WebElement pDM_DateOfBirthTF;

	@FindBy(xpath = "//input[@name='gender']")
	private WebElement pDM_GenderDropDown;

	@FindBy(xpath = "//input[@name='countryOfBirthLabel']")
	private WebElement pDM_CountryOfBirthTF;

	@FindBy(xpath = "//input[@name='nationality']")
	private WebElement pDM_NationalityTF;

	@FindBy(xpath = "//div[text()='Resident Indian']")
	private WebElement pDM_ResidentFlagTF;

	@FindBy(xpath = "(//span[contains(text(),'Save')])[2]")
	private WebElement pDM_SaveBtn;

	@FindBy(xpath = "//button[contains(text(),'Let’s do it now')]")
	private WebElement pdM_letsDoItNowBtn;

	@FindBy(xpath = "//div[contains(text(),' Autofilled Details')]")
	private WebElement reviewAutoFillBtn;

	/**
	 * Personal Details Fields
	 */
	@FindBy(xpath = "(//div[contains(@class,'accodianTitle')])[1]")
	private WebElement personalDetailsCollapseableBtn;

	@FindBy(xpath = "//div[contains(text(),'Communication')]")
	private WebElement communicationCollapseableBtn;

	@FindBy(xpath = "//label[contains(text(),'Title')]/../div/div")
	private WebElement titleSelection;

	@FindBy(xpath = "//li[contains(text(),'Shri')]")
	private WebElement shriSelectLi;

	@FindBy(xpath = "//li[contains(text(),'Smt')]")
	private WebElement smtSelectLi;

	@FindBy(xpath = "//li[contains(text(),'Kumari')]")
	private WebElement kumariSelectLi;

	@FindBy(name = "firstName")
	private WebElement firstNameTF;

	@FindBy(name = "middleName")
	private WebElement midNameTF;

	@FindBy(name = "lastName")
	private WebElement lastNameTF;

	@FindBy(name = "cityOfBirth")
	private WebElement cityOfBirthTF;

	@FindBy(xpath = "//label[contains(text(),'Select Marital Status')]")
	private WebElement maritalStatusSelection;

	@FindBy(xpath = "//li[contains(text(),'Married')]")
	private WebElement marriedSelectLi;

	@FindBy(xpath = "//li[contains(text(),'Unmarried')]")
	private WebElement unmarriedSelectLi;

	@FindBy(xpath = "//li[contains(text(),'Widow')]")
	private WebElement widowSelectLi;

	@FindBy(xpath = "//li[contains(text(),'Divorcee')]")
	private WebElement divorceeSelectLi;

	/**
	 * Family Details
	 * Father's Details
	 */

	@FindBy(xpath = "//div[contains(text(),'Family')]")
	private WebElement familyDetailsCollapseableBtn;

	@FindBy(name = "fatherFirstName")
	private WebElement fatherFirstNameTF;

	@FindBy(name = "fatherMiddleName")
	private WebElement fatherMidNameTF;

	@FindBy(name = "fatherLastName")
	private WebElement fatherLastNameTF;

	/**
	 * Mother's Details
	 */

	@FindBy(name = "motherFirstName")
	private WebElement motherFirstNameTF;

	@FindBy(name = "motherMiddleName")
	private WebElement motherMidNameTF;

	@FindBy(name = "motherLastName")
	private WebElement motherLastNameTF;

	/**
	 * Communications Details
	 */

	@FindBy(name = "addressLine1")
	private WebElement addrLine1TF;

	@FindBy(name = "addressLine2")
	private WebElement addrLine2TF;

	@FindBy(name = "street")
	private WebElement streetTF;

	@FindBy(name = "area")
	private WebElement areaTF;

	@FindBy(name = "landmark")
	private WebElement landmarkTF;

	@FindBy(name = "pincode")
	private WebElement pincodeTF;

	@FindBy(name = "district")
	private WebElement districtTF;

	@FindBy(name = "stateOfIndia")
	private WebElement stateOfIndiaTF;

	@FindBy(name = "country")
	private WebElement countryTF;

	@FindBy(xpath = "//span[contains(text(),'Save & Next')]")
	private WebElement pDSaveNextBtn;

	@FindBy(xpath = "//button[contains(text(),'Back')]")
	private WebElement pDBackBtn;

	/**
	 * Initialize elements
	 * @param driver
	 */
	public PersonalDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * Getter Setters of Elements
	 */


	/**
	 * @return the pDM_MobileNumberTF
	 */
	public WebElement getpDM_MobileNumberTF() {
		return pDM_MobileNumberTF;
	}

	/**
	 * @return the pDM_EmailAddressTF
	 */
	public WebElement getpDM_EmailAddressTF() {
		return pDM_EmailAddressTF;
	}

	/**
	 * @return the pDM_DateOfBirthTF
	 */
	public WebElement getpDM_DateOfBirthTF() {
		return pDM_DateOfBirthTF;
	}

	/**
	 * @return the pDM_GenderDropDown
	 */
	public WebElement getpDM_GenderDropDown() {
		return pDM_GenderDropDown;
	}

	/**
	 * @return the pDM_CountryOfBirthTF
	 */
	public WebElement getpDM_CountryOfBirthTF() {
		return pDM_CountryOfBirthTF;
	}

	/**
	 * @return the pDM_NationalityTF
	 */
	public WebElement getpDM_NationalityTF() {
		return pDM_NationalityTF;
	}

	/**
	 * @return the pDM_ResidentFlagTF
	 */
	public WebElement getpDM_ResidentFlagTF() {
		return pDM_ResidentFlagTF;
	}

	/**
	 * @return the pDM_SaveBtn
	 */
	public WebElement getpDM_SaveBtn() {
		return pDM_SaveBtn;
	}

	/**
	 * @return the pdM_letsDoItNowBtn
	 */
	public WebElement getPdM_letsDoItNowBtn() {
		return pdM_letsDoItNowBtn;
	}

	/**
	 * @return the reviewAutoFillBtn
	 */
	public WebElement getReviewAutoFillBtn() {
		return reviewAutoFillBtn;
	}

	/**
	 * @return the personalDetailsCollapseableBtn
	 */
	public WebElement getPersonalDetailsCollapseableBtn() {
		return personalDetailsCollapseableBtn;
	}

	/**
	 * @return the communicationCollapseableBtn
	 */
	public WebElement getCommunicationCollapseableBtn() {
		return communicationCollapseableBtn;
	}

	/**
	 * @return the titleSelection
	 */
	public WebElement getTitleSelection() {
		return titleSelection;
	}

	/**
	 * @return the shriSelectLi
	 */
	public WebElement getShriSelectLi() {
		return shriSelectLi;
	}

	/**
	 * @return the smtSelectLi
	 */
	public WebElement getSmtSelectLi() {
		return smtSelectLi;
	}

	/**
	 * @return the kumariSelectLi
	 */
	public WebElement getKumariSelectLi() {
		return kumariSelectLi;
	}

	/**
	 * @return the firstNameTF
	 */
	public WebElement getFirstNameTF() {
		return firstNameTF;
	}

	/**
	 * @return the midNameTF
	 */
	public WebElement getMidNameTF() {
		return midNameTF;
	}

	/**
	 * @return the lastNameTF
	 */
	public WebElement getLastNameTF() {
		return lastNameTF;
	}

	/**
	 * @return the cityOfBirthTF
	 */
	public WebElement getCityOfBirthTF() {
		return cityOfBirthTF;
	}

	/**
	 * @return the maritalStatusSelection
	 */
	public WebElement getMaritalStatusSelection() {
		return maritalStatusSelection;
	}

	/**
	 * @return the marriedSelectLi
	 */
	public WebElement getMarriedSelectLi() {
		return marriedSelectLi;
	}

	/**
	 * @return the unmarriedSelectLi
	 */
	public WebElement getUnmarriedSelectLi() {
		return unmarriedSelectLi;
	}

	/**
	 * @return the widowSelectLi
	 */
	public WebElement getWidowSelectLi() {
		return widowSelectLi;
	}

	/**
	 * @return the divorceeSelectLi
	 */
	public WebElement getDivorceeSelectLi() {
		return divorceeSelectLi;
	}

	/**
	 * @return the familyDetailsCollapseableBtn
	 */
	public WebElement getFamilyDetailsCollapseableBtn() {
		return familyDetailsCollapseableBtn;
	}

	/**
	 * @return the fatherFirstNameTF
	 */
	public WebElement getFatherFirstNameTF() {
		return fatherFirstNameTF;
	}

	/**
	 * @return the fatherMidNameTF
	 */
	public WebElement getFatherMidNameTF() {
		return fatherMidNameTF;
	}

	/**
	 * @return the fatherLastNameTF
	 */
	public WebElement getFatherLastNameTF() {
		return fatherLastNameTF;
	}

	/**
	 * @return the motherFirstNameTF
	 */
	public WebElement getMotherFirstNameTF() {
		return motherFirstNameTF;
	}

	/**
	 * @return the motherMidNameTF
	 */
	public WebElement getMotherMidNameTF() {
		return motherMidNameTF;
	}

	/**
	 * @return the motherLastNameTF
	 */
	public WebElement getMotherLastNameTF() {
		return motherLastNameTF;
	}

	/**
	 * @return the addrLine1TF
	 */
	public WebElement getAddrLine1TF() {
		return addrLine1TF;
	}

	/**
	 * @return the addrLine2TF
	 */
	public WebElement getAddrLine2TF() {
		return addrLine2TF;
	}

	/**
	 * @return the streetTF
	 */
	public WebElement getStreetTF() {
		return streetTF;
	}

	/**
	 * @return the areaTF
	 */
	public WebElement getAreaTF() {
		return areaTF;
	}

	/**
	 * @return the landmarkTF
	 */
	public WebElement getLandmarkTF() {
		return landmarkTF;
	}

	/**
	 * @return the pincodeTF
	 */
	public WebElement getPincodeTF() {
		return pincodeTF;
	}

	/**
	 * @return the districtTF
	 */
	public WebElement getDistrictTF() {
		return districtTF;
	}

	/**
	 * @return the stateOfIndiaTF
	 */
	public WebElement getStateOfIndiaTF() {
		return stateOfIndiaTF;
	}

	/**
	 * @return the countryTF
	 */
	public WebElement getCountryTF() {
		return countryTF;
	}

	/**
	 * @return the pDSaveNextBtn
	 */
	public WebElement getpDSaveNextBtn() {
		return pDSaveNextBtn;
	}

	/**
	 * @return the pDBackBtn
	 */
	public WebElement getpDBackBtn() {
		return pDBackBtn;
	}

	/**
	 * Generic methods
	 * 
	 */

	/**
	 * Method to fill Auto fill details modal
	 * @param email
	 */
	public void fillAutoPersonalDetails(String email) {
		getpDM_EmailAddressTF().sendKeys(email);
		getpDM_SaveBtn().click();
	}

	/**
	 * Method to fill Personal details in NPS registration
	 * @param titleKey
	 * @param firstName
	 * @param midName
	 * @param lastName
	 * @param cityOfBirth
	 * @param maritalKey
	 * @throws InterruptedException
	 */
	public void fillPersonalDetails(char titleKey, String firstName, String midName, String lastName, String cityOfBirth, char maritalKey) throws InterruptedException {
		getTitleSelection().click();

		switch (titleKey) {
		case 'h':
			getShriSelectLi().click();
			break;
		case 'm':
			getSmtSelectLi().click();
			break;
		case 'k':
			getKumariSelectLi().click();
			break;
		default:
			break;
		}

		getFirstNameTF().clear();
		getFirstNameTF().sendKeys(firstName);

		getMidNameTF().clear();
		getMidNameTF().sendKeys(midName);

		getLastNameTF().clear();
		getLastNameTF().sendKeys(lastName);

		getCityOfBirthTF().clear();
		getCityOfBirthTF().sendKeys(cityOfBirth);
		Thread.sleep(3000);
		getCityOfBirthTF().sendKeys(""+Keys.DOWN+Keys.ENTER);

		getMaritalStatusSelection().click();

		switch (maritalKey) {
		case 'm':
			getMarriedSelectLi().click();
			break;
		case 'u':
			getUnmarriedSelectLi().click();
			break;
		case 'w':
			getWidowSelectLi().click();
			break;
		case 'd':
			getDivorceeSelectLi().click();
			break;
		default:
			break;
		}

	}

	/**
	 * Method to fill Family Details of NPS Registration
	 * @param fFirstName
	 * @param fMidName
	 * @param fLastName
	 * 
	 * 
	 */
	public void fillFamilyDetailsFather(String fFirstName, String fMidName, String fLastName) {
		getFamilyDetailsCollapseableBtn().click();

		getFatherFirstNameTF().clear();
		getFatherFirstNameTF().sendKeys(fFirstName);

		getFatherMidNameTF().clear();
		getFatherMidNameTF().sendKeys(fMidName);

		getFatherLastNameTF().clear();
		getFatherLastNameTF().sendKeys(fLastName);
	}

	/**
	 * Method to fill Family Details of NPS Registration
	 * @param mFirstName
	 * @param mMidName
	 * @param mLastName
	 * 
	 * 
	 */
	public void fillFamilyDetailsMother(String mFirstName, String mMidName, String mLastName) {
		getFamilyDetailsCollapseableBtn().click();

		getMotherFirstNameTF().clear();
		getMotherFirstNameTF().sendKeys(mFirstName);

		getMotherMidNameTF().clear();
		getMotherMidNameTF().sendKeys(mMidName);

		getMotherLastNameTF().clear();
		getMotherLastNameTF().sendKeys(mLastName);
		
	}
	
	/**
	 * Method to fill communication details in NPS Registration
	 * @param aLine1
	 * @param aLine2
	 * @param street
	 * @param area
	 * @param landmark
	 * @param pincode
	 * @param district
	 * @param state
	 * @throws InterruptedException
	 */
	public void fillCommunicationsDetails(String aLine1, String aLine2, String street, String area, String landmark, String pincode, String district, String state) throws InterruptedException {
		getCommunicationCollapseableBtn().click();
		
		getAddrLine1TF().clear();
		getAddrLine1TF().sendKeys(aLine1);
		
		getAddrLine2TF().clear();
		getAddrLine2TF().sendKeys(aLine2);
		
		getStreetTF().clear();
		getStreetTF().sendKeys(street);
		
		getAreaTF().clear();
		getAreaTF().sendKeys(area);
		
		getLandmarkTF().clear();
		getLandmarkTF().sendKeys(landmark);
		
		getPincodeTF().clear();
		getPincodeTF().sendKeys(pincode);
		
		getDistrictTF().clear();
		getDistrictTF().sendKeys(district);
		
		getStateOfIndiaTF().clear();
		getStateOfIndiaTF().sendKeys(state);
		Thread.sleep(2000);
		getStateOfIndiaTF().sendKeys(""+Keys.DOWN+Keys.ENTER);
	}



}
