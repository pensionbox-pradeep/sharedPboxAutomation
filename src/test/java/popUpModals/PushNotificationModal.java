package popUpModals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PushNotificationModal {
	@FindBy(xpath = "//div[contains(@class,'thankYouWrapper')]")
	private WebElement notificationModal;

	@FindBy(xpath = "//div[contains(@class,'thankYouHeader')]")
	private WebElement notificationHeader;

	@FindBy(xpath = "//span[text()='Turn On']")
	private WebElement notificationTurnOnBtn;

	@FindBy(xpath = "//span[text()='Not Now']")
	private WebElement notificationNotNowBtn;

	@FindBy(xpath = "//div[contains(@class,'closeIcon')]")
	private WebElement notificationCloseIconBtn;

	//Getters	

	/**
	 * @return the notificationModal
	 */
	public WebElement getNotificationModal() {
		return notificationModal;
	}

	/**
	 * @return the notificationHeader
	 */
	public WebElement getNotificationHeader() {
		return notificationHeader;
	}

	/**
	 * @return the notificationTurnOnBtn
	 */
	public WebElement getNotificationTurnOnBtn() {
		return notificationTurnOnBtn;
	}

	/**
	 * @return the notificationNotNowBtn
	 */
	public WebElement getNotificationNotNowBtn() {
		return notificationNotNowBtn;
	}

	/**
	 * @return the notificationCloseIconBtn
	 */
	public WebElement getNotificationCloseIconBtn() {
		return notificationCloseIconBtn;
	}

	/**
	 * Initialize the PushNotifModal
	 * @param driver
	 */
	public PushNotificationModal(WebDriver driver){
		PageFactory.initElements(driver,this);
	}

	/**
	 * GENERIC METHODS
	 */

	/**
	 * Method to detect the Notification Modal 
	 */
	public boolean isNotificationPanelVisible(){
		return notificationModal.isDisplayed();
	}

	/**
	 * This method turns on the notifications
	 */
	public void turnOnNotification() {
		notificationTurnOnBtn.click();
	}

	/**
	 * Method to click on Not Now in notifications
	 */
	public void turnOffNotification() {
		notificationNotNowBtn.click();
	}

	/**
	 * Method to click on close button on the notification modal
	 */
	public void notificationModalClose() {
		notificationCloseIconBtn.click();
	}
}


