package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	@FindBy(xpath = "//span[contains(text(),'Create My Plan')]")
    private WebElement createMyPlanBtn;

    @FindBy(xpath = "//div[contains(text(),'Add Money')]")
    private WebElement addMoneyBtn;

    @FindBy(xpath = "//div[contains(text(),'Transactions')]")
    private WebElement transactionsBtn;

    @FindBy(xpath = "//div[contains(text(),'Edit Goal')]")
    private WebElement editGoalBtn;

    @FindBy(xpath = "//span[text()='Open Now']")
    private WebElement npsOpenNowBtn;

    @FindBy(xpath = "//span[contains(text(),'Track Now')]")
    private WebElement trackNowBtn;

    @FindBy(xpath = "(//div[contains(text(),'Track Existing Savings')]/../..//button)[2]")
    private WebElement trackSavingsAddBtn;

    @FindBy(xpath = "(//div[contains(text(),'Create My Plan')]/../..//button)[2]")
    private WebElement createMyPlanBtn2;

    @FindBy(xpath = "(//div[contains(text(),'Complete Your KYC')]/../..//button)[2]")
    private WebElement completeKycBtn;

    @FindBy(xpath = "(//div[contains(text(),'Open My NPS Account')]/../..//button)[2]")
    private WebElement openNpsAccountbtn;

    @FindBy(xpath = "(//div[contains(text(),'Connect to HR')]/../..//button)[2]")
    private WebElement connectToHrBtn;

    @FindBy(xpath = "(//div[contains(text(),'Share With A Friend ')]/../..//button)[2]")
    private WebElement shareWithAFriendBtn;

    @FindBy(xpath = "(//div[contains(text(),'Feedback')]/../..//button)[2]")
    private WebElement feedbackBtn;

    /**
     * 
     * @param driver
     */
    public DashboardPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getcreateMyPlanBtn(){
        return createMyPlanBtn;
    }

    public WebElement getaddMoneyBtn(){
        return addMoneyBtn;
    }

    public WebElement gettransactionsBtn(){
        return transactionsBtn;
    }
    
    public WebElement geteditGoalBtn(){
        return editGoalBtn;
    } 

    public WebElement getnpsOpenNowBtn(){
        return npsOpenNowBtn;
    }

    public WebElement gettrackNowBtn(){
        return trackNowBtn;
    }

    public WebElement gettrackSavingsAddBtn(){
        return trackNowBtn;
    }

    public WebElement getcreateMyPlanBtn2(){
        return createMyPlanBtn2;
    }

    public WebElement getcompleteKycBtn(){
        return completeKycBtn;
    }

    public WebElement getopenNpsAccountbtn(){
        return openNpsAccountbtn;
    }

    public WebElement getconnectToHrBtn(){
        return connectToHrBtn;
    }

    public WebElement getshareWithAFriendBtn(){
        return shareWithAFriendBtn;
    }

    public WebElement getfeedbackBtn(){
        return feedbackBtn;
    }
}
