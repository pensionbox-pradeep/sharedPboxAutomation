package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PranCardPage {
	/**
	 * PRAN Preferences
	 */
	@FindBy(xpath = "//div[text()='PRAN Preferences']")
	private WebElement pranPreferenceCollapseBtn;
	
	@FindBy(xpath = "//span[text()='Father']/..//input")
	private WebElement fatherRadioBtn;
	
	@FindBy(xpath = "//span[text()='Mother']/..//input")
	private WebElement motherRadioBtn;
	
	@FindBy(xpath = "//span[text()='PRAN Print Hindi']/..//input")
	private WebElement pranPrinthindiSwitch;
	
	@FindBy(xpath = "//span[text()='Physical PRAN']/..//input")
	private WebElement pranPhysicalSwitch;
	
	/**
	 * Nominee Details
	 */
	@FindBy(xpath = "//div[text()='Nominee Details']")
	private WebElement nomineeDetailsCollapseBtn;
	
	@FindBy(name = "name")
	private WebElement firstNameTF;
	
	@FindBy(name = "middleName")
	private WebElement middleNameTF;
	
	@FindBy(name = "lastName")
	private WebElement lastNameTF;
	
	@FindBy(xpath = "//span[text()='Above 18']/../span[1]")
	private WebElement above18Switch;
	
	@FindBy(xpath = "//label[text()='Relation']/..//div/div")
	private WebElement relationListBtn;
	
	
	
	@FindBy(name = "nomineeAge")
	private WebElement nomineeAgeTF;
	
	
}
