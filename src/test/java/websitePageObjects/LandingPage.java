package websitePageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	@FindBy(xpath = "(//div[contains(@class,'logoImg')])[1]")
	private WebElement pBlogoBtn;
	
	@FindBy(xpath = "(//span[text()='Corporate NPS'])[1]")
	private WebElement corporateNPSHeaderBtn;
	
	@FindBy(xpath = "(//span[text()='Personal NPS'])[1]")
	private WebElement personalNPSHeaderBtn;
	
	@FindBy(xpath = "//div[text()='Pension For']")
	private WebElement pensionForNavBtn;
	
	@FindBy(xpath = "//li[text()='Personal']")
	private WebElement personalBtn;
	
	@FindBy(xpath = "//li[text()='Partner']")
	private WebElement partnerBtn;
	
	@FindBy(xpath = "//li[text()='NRIs']")
	private WebElement nRIsBtn;
	
	@FindBy(xpath = "//li[text()='Kids']")
	private WebElement kidsBtn;
	
	@FindBy(xpath = "//div[text()='Our Journey']")
	private WebElement ourJourneyNavBtn;
	
	@FindBy(xpath = "//li[text()='Our Story']")
	private WebElement ourStoryBtn;
	
	@FindBy(xpath = "//li[text()='Our Team']")
	private WebElement ourTeamBtn;
	
	@FindBy(xpath = "//li[text()='Our Vision']")
	private WebElement ourVisionBtn;
	
	@FindBy(xpath = "//li[text()='Mission Start Ab']")
	private WebElement missionStartAbBtn;
	
	@FindBy(xpath = "//li[text()='PensionBox | Zerodha']")
	private WebElement pensionBoxZerodhaBtn;
	
	@FindBy(xpath = "(//div[text()='Resources'])[1]")
	private WebElement resourcesNavBtn;
	
	@FindBy(xpath = "(//div[text()='Products'])[1]")
	private WebElement productsNavBtn;
	
	//Corporate NPS, NPS Tier I, NPS Tier II, EPF, PPF, FD
	
	@FindBy(xpath = "//li[text()='Corporate NPS']")
	private WebElement productsCorporateNPSBtn;
	
	@FindBy(xpath = "//li[text()='NPS Tier I']")
	private WebElement nPSTierIBtn;
	
	@FindBy(xpath = "//li[text()='NPS Tier II']")
	private WebElement nPSTierIIBtn;
	
	@FindBy(xpath = "//li[text()='EPF']")
	private WebElement ePFBtn;
	
	@FindBy(xpath = "//li[text()='PPF']")
	private WebElement pPFBtn;
	
	@FindBy(xpath = "//li[text()='FD']")
	private WebElement fDBtn;
	
	@FindBy(xpath = "//div[text()='Calculators']")
	private WebElement calculatorsNavBtn;
	
	//PBCalulator, APY Calculator, NPS Calculator
	
	@FindBy(xpath = "//li[text()='PensionBox Calculator']")
	private WebElement pBCalcBtn;
	
	@FindBy(xpath = "//li[text()='Atal Pension Yojana']")
	private WebElement aPYCalcBtn;
	
	@FindBy(xpath = "//li[text()='National Pension Scheme']")
	private WebElement nPSCalcBtn;
	
	@FindBy(xpath = "//div[text()='Pension Movement']")
	private WebElement pensionMovementNavBtn;
	
	@FindBy(xpath = "//li[text()='Pension Movement']")
	private WebElement pensionMovementBtn;
	
	@FindBy(xpath = "//li[text()='Support']")
	private WebElement supportBtn;
	
	@FindBy(xpath = "//li[text()='Blogs']")
	private WebElement blogsBtn;
	
	@FindBy(xpath = "//span[text()='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "(//span[text()='Get Started'])[1]")
	private WebElement getStartedBtn;
	
	@FindBy(xpath = "(//span[text()='Get Started'])[2]")
	private WebElement getStartedBtn2;
	
	@FindBy(xpath = "//span[contains(text(),'Click Here')]")
	private WebElement sendAppLinkClickHereBtn;
	
	@FindBy(xpath = "//div[contains(@class,'iosDownloadbtn')]")
	private WebElement iosDownloadBtn;
	
	@FindBy(xpath = "//div[contains(@class,'androidDownloadbtn')]")
	private WebElement androidDownloadBtn;
	
	
	public LandingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	/**
	 * @return the nRIsBtn
	 */
	public WebElement getnRIsBtn() {
		return nRIsBtn;
	}

	/**
	 * @return the ourJourneyNavBtn
	 */
	public WebElement getOurJourneyNavBtn() {
		return ourJourneyNavBtn;
	}


	/**
	 * @return the pBlogoBtn
	 */
	public WebElement getpBlogoBtn() {
		return pBlogoBtn;
	}


	/**
	 * @return the corporateNPSHeaderBtn
	 */
	public WebElement getCorporateNPSHeaderBtn() {
		return corporateNPSHeaderBtn;
	}


	/**
	 * @return the personalNPSHeaderBtn
	 */
	public WebElement getPersonalNPSHeaderBtn() {
		return personalNPSHeaderBtn;
	}


	/**
	 * @return the pensionForNavBtn
	 */
	public WebElement getPensionForNavBtn() {
		return pensionForNavBtn;
	}


	/**
	 * @return the personalBtn
	 */
	public WebElement getPersonalBtn() {
		return personalBtn;
	}


	/**
	 * @return the partnerBtn
	 */
	public WebElement getPartnerBtn() {
		return partnerBtn;
	}

	/**
	 * @return the kidsBtn
	 */
	public WebElement getKidsBtn() {
		return kidsBtn;
	}


	/**
	 * @return the ourStoryBtn
	 */
	public WebElement getOurStoryBtn() {
		return ourStoryBtn;
	}


	/**
	 * @return the ourTeamBtn
	 */
	public WebElement getOurTeamBtn() {
		return ourTeamBtn;
	}


	/**
	 * @return the ourVisionBtn
	 */
	public WebElement getOurVisionBtn() {
		return ourVisionBtn;
	}


	/**
	 * @return the missionStartAbBtn
	 */
	public WebElement getMissionStartAbBtn() {
		return missionStartAbBtn;
	}


	/**
	 * @return the pensionBoxZerodhaBtn
	 */
	public WebElement getPensionBoxZerodhaBtn() {
		return pensionBoxZerodhaBtn;
	}


	/**
	 * @return the resourcesNavBtn
	 */
	public WebElement getResourcesNavBtn() {
		return resourcesNavBtn;
	}


	/**
	 * @return the productsNavBtn
	 */
	public WebElement getProductsNavBtn() {
		return productsNavBtn;
	}


	/**
	 * @return the calculatorsNavBtn
	 */
	public WebElement getCalculatorsNavBtn() {
		return calculatorsNavBtn;
	}


	/**
	 * @return the corporateNPSBtn
	 */
	public WebElement getProductsCorporateNPSBtn() {
		return productsCorporateNPSBtn;
	}

	/**
	 * @return the nPSTierIBtn
	 */
	public WebElement getnPSTierIBtn() {
		return nPSTierIBtn;
	}

	/**
	 * @return the nPSTierIIBtn
	 */
	public WebElement getnPSTierIIBtn() {
		return nPSTierIIBtn;
	}

	/**
	 * @return the ePFBtn
	 */
	public WebElement getePFBtn() {
		return ePFBtn;
	}

	/**
	 * @return the pPFBtn
	 */
	public WebElement getpPFBtn() {
		return pPFBtn;
	}

	/**
	 * @return the fDBtn
	 */
	public WebElement getfDBtn() {
		return fDBtn;
	}

	/**
	 * @return the pBCalcBtn
	 */
	public WebElement getpBCalcBtn() {
		return pBCalcBtn;
	}

	/**
	 * @return the aPYCalcBtn
	 */
	public WebElement getaPYCalcBtn() {
		return aPYCalcBtn;
	}

	/**
	 * @return the nPSCalcBtn
	 */
	public WebElement getnPSCalcBtn() {
		return nPSCalcBtn;
	}

	/**
	 * @return the pensionMovementNavBtn
	 */
	public WebElement getPensionMovementNavBtn() {
		return pensionMovementNavBtn;
	}

	/**
	 * @return the pensionMovementBtn
	 */
	public WebElement getPensionMovementBtn() {
		return pensionMovementBtn;
	}


	/**
	 * @return the supportBtn
	 */
	public WebElement getSupportBtn() {
		return supportBtn;
	}


	/**
	 * @return the blogsBtn
	 */
	public WebElement getBlogsBtn() {
		return blogsBtn;
	}


	/**
	 * @return the loginBtn
	 */
	public WebElement getLoginBtn() {
		return loginBtn;
	}


	/**
	 * @return the getStartedBtn
	 */
	public WebElement getGetStartedBtn() {
		return getStartedBtn;
	}


	/**
	 * @return the getStartedBtn2
	 */
	public WebElement getGetStartedBtn2() {
		return getStartedBtn2;
	}


	/**
	 * @return the sendAppLinkClickHereBtn
	 */
	public WebElement getSendAppLinkClickHereBtn() {
		return sendAppLinkClickHereBtn;
	}


	/**
	 * @return the iosDownloadBtn
	 */
	public WebElement getIosDownloadBtn() {
		return iosDownloadBtn;
	}


	/**
	 * @return the androidDownloadBtn
	 */
	public WebElement getAndroidDownloadBtn() {
		return androidDownloadBtn;
	}
	
	
}
