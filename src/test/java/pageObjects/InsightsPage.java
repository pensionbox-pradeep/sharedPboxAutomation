package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsightsPage {
	@FindBy(id = "dropdown")
	private WebElement inflationRateDD;

	@FindBy(xpath = "//li[text()='4%']")
	private WebElement iR4li;

	@FindBy(xpath = "//li[text()='5%']")
	private WebElement iR5Li;

	@FindBy(xpath = "//li[text()='6%']")
	private WebElement iR6Li;

	@FindBy(xpath = "//li[text()='7%']")
	private WebElement iR7Li;

	@FindBy(xpath = "//li[text()='8%']")
	private WebElement iR8Li;

	@FindBy(xpath = "(//div[contains(@class,'rupee')])[1]")
	private WebElement todaysExpenseAmt;

	@FindBy(xpath = "(//div[contains(@class,'rupee')])[2]")
	private WebElement toBecomeAmt;

	@FindBy(xpath = "//div[text()='Swipe Right']")
	private WebElement swipeRightBtn;

	@FindBy(xpath = "(//div[contains(@class,'rupee')])[1]")
	private WebElement retirementGoalAmt;

	@FindBy(xpath = "(//div[contains(@class,'rupee')])[1]")
	private WebElement thisYearGoalAmt;

	@FindBy(xpath = "(//div[contains(@class,'rupee')])[1]")
	private WebElement saveMonthlyAmt;

	@FindBy(xpath = "(//div[contains(@class,'rupee')])[2]")
	private WebElement lumpsumYearAmt;

	@FindBy(xpath = "//div[text()='Swipe Left']")
	private WebElement swipeLeftBtn;

	@FindBy(xpath = "//div[contains(@class,'mainTitle')]")
	private WebElement mainTitle;

	/**
	 * Lets Finalize
	 */
	@FindBy(xpath = "(//div[contains(@class,'rupee')])[1]")
	private WebElement finalizeExpenseTodayAmt;

	@FindBy(xpath = "(//div[contains(@class,'rupee')])[2]")
	private WebElement finalizeExpenseAt60;

	@FindBy(xpath = "(//div[contains(@class,'rupee')])[3]")
	private WebElement finalizeRetirementCorpusAmt;

	@FindBy(xpath = "(//div[contains(@class,'rupee')])[4]")
	private WebElement finalizeYearlyGoalAmt;

	@FindBy(xpath = "//input[contains(@aria-labelledby,'discrete-slider')]")
	private WebElement preferredRetirementAgeSlider;
	
	@FindBy(xpath = "//span[@data-index='1']")
	private WebElement RetSlider1st;

	@FindBy(xpath = "//button[text()='Update My Plan']")
	private WebElement updateMyPlanBtn;

	/**
     * PageFactory
     * @param driver
     */

    public InsightsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

	/**
	 * @return the inflationRateDD
	 */
	public WebElement getInflationRateDD() {
		return inflationRateDD;
	}

	/**
	 * @return the iR4li
	 */
	public WebElement getiR4li() {
		return iR4li;
	}

	/**
	 * @return the iR5Li
	 */
	public WebElement getiR5Li() {
		return iR5Li;
	}

	/**
	 * @return the iR6Li
	 */
	public WebElement getiR6Li() {
		return iR6Li;
	}

	/**
	 * @return the iR7Li
	 */
	public WebElement getiR7Li() {
		return iR7Li;
	}

	/**
	 * @return the iR8Li
	 */
	public WebElement getiR8Li() {
		return iR8Li;
	}

	/**
	 * @return the todaysExpenseAmt
	 */
	public WebElement getTodaysExpenseAmt() {
		return todaysExpenseAmt;
	}

	/**
	 * @return the toBecomeAmt
	 */
	public WebElement getToBecomeAmt() {
		return toBecomeAmt;
	}

	/**
	 * @return the swipeRightBtn
	 */
	public WebElement getSwipeRightBtn() {
		return swipeRightBtn;
	}

	/**
	 * @return the retirementGoalAmt
	 */
	public WebElement getRetirementGoalAmt() {
		return retirementGoalAmt;
	}

	/**
	 * @return the thisYearGoalAmt
	 */
	public WebElement getThisYearGoalAmt() {
		return thisYearGoalAmt;
	}

	/**
	 * @return the saveMonthlyAmt
	 */
	public WebElement getSaveMonthlyAmt() {
		return saveMonthlyAmt;
	}

	/**
	 * @return the lumpsumYearAmt
	 */
	public WebElement getLumpsumYearAmt() {
		return lumpsumYearAmt;
	}

	/**
	 * @return the swipeLeftBtn
	 */
	public WebElement getSwipeLeftBtn() {
		return swipeLeftBtn;
	}

	/**
	 * @return the mainTitle
	 */
	public WebElement getMainTitle() {
		return mainTitle;
	}

	/**
	 * @return the finalizeExpenseTodayAmt
	 */
	public WebElement getFinalizeExpenseTodayAmt() {
		return finalizeExpenseTodayAmt;
	}

	/**
	 * @return the finalizeExpenseAt60
	 */
	public WebElement getFinalizeExpenseAt60() {
		return finalizeExpenseAt60;
	}

	/**
	 * @return the finalizeRetirementCorpusAmt
	 */
	public WebElement getFinalizeRetirementCorpusAmt() {
		return finalizeRetirementCorpusAmt;
	}

	/**
	 * @return the finalizeYearlyGoalAmt
	 */
	public WebElement getFinalizeYearlyGoalAmt() {
		return finalizeYearlyGoalAmt;
	}

	/**
	 * @return the preferredRetirementAgeSlider
	 */
	public WebElement getPreferredRetirementAgeSlider() {
		return preferredRetirementAgeSlider;
	}

	/**
	 * @return the updateMyPlanBtn
	 */
	public WebElement getUpdateMyPlanBtn() {
		return updateMyPlanBtn;
	}
    
    /**
	 * @return the retSlider1st
	 */
	public WebElement getRetSlider1st() {
		return RetSlider1st;
	}

	/**
     * Generic methods
     */
	
	public void slideTheRetirementAge() {
		
	}

}
