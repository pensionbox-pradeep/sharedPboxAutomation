package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	/*
	 * Welcome User! Modal
	 */
	@FindBy(xpath = "//div[contains(@class,'closeIcon')]")
	private WebElement closeBtn;
	
	@FindBy(xpath = "//span[text()='Skip for now']")
	private WebElement skipForNowBtn;
	
	@FindBy(xpath = "//div[text()='Choose your language:']/..//div[2]/div/div")
	private WebElement chooseLanguageBtn;
	
	@FindBy(xpath = "//span[text()='Take a Tour']")
	private WebElement takeATourBtn;
	
	/*
	 *  Enable Push Notification Modal
	 */
	@FindBy(xpath = "//div[contains(@class,'closeIcon')]")
	private WebElement notificationCloseBtn;
	
	@FindBy(xpath = "//span[text()='Not Now']")
	private WebElement notNowBtn;
	
	@FindBy(xpath = "//span[text()='Turn On']")
	private WebElement turnOnBtn;
	
	/**
	 * 
	 * @param driver
	 */
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	/**
	 * Getters and Setters
	 */
	
	/**
	 * @return the closeBtn
	 */
	public WebElement getCloseBtn() {
		return closeBtn;
	}

	/**
	 * @return the skipForNowBtn
	 */
	public WebElement getSkipForNowBtn() {
		return skipForNowBtn;
	}

	/**
	 * @return the chooseLanguageBtn
	 */
	public WebElement getChooseLanguageBtn() {
		return chooseLanguageBtn;
	}

	/**
	 * @return the takeATourBtn
	 */
	public WebElement getTakeATourBtn() {
		return takeATourBtn;
	}


	/**
	 * @return the notificationCloseBtn
	 */
	public WebElement getNotificationCloseBtn() {
		return notificationCloseBtn;
	}


	/**
	 * @return the notNowBtn
	 */
	public WebElement getNotNowBtn() {
		return notNowBtn;
	}


	/**
	 * @return the turnOnBtn
	 */
	public WebElement getTurnOnBtn() {
		return turnOnBtn;
	}
	
	
}
