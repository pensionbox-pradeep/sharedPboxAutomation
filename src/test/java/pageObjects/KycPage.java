package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KycPage {
	@FindBy(xpath = "//input[@name='PAN']")
    private WebElement panNumberTF;

    @FindBy(xpath = "//div[contains(@class,'closeIcon')]")
    private WebElement kycCloseBtn;

    @FindBy(xpath = "//button[contains(text(),'Proceed with')]")
    private WebElement proceedWithDigiBtn;

    @FindBy(id = "aadhaar_1")
    private WebElement digiAadhaarNumberTF;

    @FindBy(xpath = "//button[contains(text(),'Next')]")
    private WebElement digiNextBtn;

    @FindBy(id = "a_otp_1")
    private WebElement digiOtpTF;

    @FindBy(id = "otp_button")
    private WebElement digiSubmitOtpBtn;

    @FindBy(id = "v_pin_1")
    private WebElement digiPinTF;

    @FindBy(id = "verify_pin_button")
    private WebElement digiPinDoneBtn;

    @FindBy(xpath = "//input[@value='Allow']")
    private WebElement digiAllowBtn;

    @FindBy(xpath = "//input[@value='Deny']")
    private WebElement digiDenyBtn;

    @FindBy(xpath = "//div[contains(text(),'KYC verification completed')]")
    private WebElement verificationCompletedTxt;

    @FindBy(xpath = "//span[contains(text(),'Back to Dashboard')]/..")
    private WebElement kycCompletedBackToDashboardBtn;

    /**
     * 
     * @param driver
     */

    public KycPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    /**
     * 
     * @return WebElemet
     */


    public WebElement getPanNumberTF() {
        return panNumberTF;
    }

    public WebElement getKycCloseBtn() {
        return kycCloseBtn;
    }
    
    public WebElement getProceedWithDigiBtn() {
        return proceedWithDigiBtn;
    }
    
    public WebElement getDigiAadhaarNumberTF() {
        return digiAadhaarNumberTF;
    }

    public WebElement getDigiNextBtn() {
        return digiNextBtn;
    }

    public WebElement getDigiOtpTF() {
        return digiOtpTF;
    }

    public WebElement getDigiSubmitOtpBtn() {
        return digiSubmitOtpBtn;
    }

    public WebElement getDigiPinTF() {
        return digiPinTF;
    }

    public WebElement getDigiPinDoneBtn() {
        return digiPinDoneBtn;
    }

    public WebElement getDigiAllowBtn() {
        return digiAllowBtn;
    }

    public WebElement getDigiDenyBtn() {
        return digiDenyBtn;
    }

    public WebElement getVerificationCompletedTxt() {
        return verificationCompletedTxt;
    }

    public WebElement getKycCompletedBackToDashboardBtn() {
        return kycCompletedBackToDashboardBtn;
    }
}
