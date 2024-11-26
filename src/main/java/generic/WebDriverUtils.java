package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.qameta.allure.Allure;


public class WebDriverUtils {
	/**
	 * This method will wait for the page to load implicitly
	 * @param driver
	 * @param dur
	 */
	public void waitImplicitTime(WebDriver driver, int dur)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(dur));
	}
	
	/**
	 * This method will wait for the page to load the title explicitly
	 * @param driver
	 * @param title
	 */
	public void waitForTitle(WebDriver driver,int time, String title) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time)); 
		wait.until(ExpectedConditions.titleContains(title));
	}
	
	/**
	 * This method will wait for the element to be visible
	 * @param driver
	 * @param time
	 * @param elementXPath
	 */
	public void waitForVisibility(WebDriver driver,int time, String elementXPath) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXPath)));
	}
	
	/**
	 * This method will wait for the element to be clickable using xpath
	 * @param driver
	 * @param time
	 * @param elementXPath
	 */
	public void waitForXpathClickable(WebDriver driver, int time, String elementXPath) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXPath)));
	}
	
	/**
	 * This method will wait for the element to be clickable using element
	 * @param driver
	 * @param time
	 * @param element
	 */
	public void waitForElementTobeClickable(WebDriver driver, int time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**
	 * This method will wait for the element to be invisible
	 * @param driver
	 * @param time
	 * @param element
	 */
	public void waitforElementToDisappear(WebDriver driver, int time, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(element)));
	}
	
	/**
	 * Method to select elements using string 
	 * @param liWe
	 * @param text
	 * @throws InterruptedException 
	 */
	public void selectElementWithText(List<WebElement> liWe, String text) throws InterruptedException
	{
		for(WebElement wE : liWe) {
			if(wE.getText().equalsIgnoreCase(text)) 
			{	
				Allure.step("Clicked on "+ wE.getText());
				System.out.println("Clicked on "+ wE.getText());
				Thread.sleep(1000);
				wE.click();
				break;
			}
			
		}
	}
	
	/**
	 * Method to select element using part of the original string
	 * @param liWe
	 * @param partialText
	 */
	public void selectElementWithContainsText(List<WebElement> liWe, String partialText)
	{
		for(WebElement wE : liWe) {
			if((wE.getText().toLowerCase()).contains(partialText.toLowerCase())) 
			{
				wE.click();
				break;
			}
		}
	}
	
	/**
	 * Method to upload file using file path string
	 * @param absolutefilePath
	 * @param cbo (null in most cases)
	 * @throws AWTException
	 *
	 */
	public void uploadFile(String absolutefilePath, ClipboardOwner cbo) throws AWTException 
	{
		Robot r = new Robot();
		StringSelection transferString = new StringSelection(absolutefilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(transferString, cbo);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_ENTER);
	}
	
	/**
	 * 
	 * @param we
	 * @return
	 */
	public boolean isItDisplayed(WebElement we) {
		return we.isDisplayed();
	}
	
	/**
	 * 
	 * @param we
	 * @return
	 */
	public boolean isItEnabled(WebElement we) {
		return we.isEnabled();
	}
	
	/**
	 * 
	 * @param we
	 * @return
	 */
	public boolean isItSelected(WebElement we) {
		return we.isSelected();
	}
	
	public void sendKeyPressEsc(WebDriver driver) {
		Actions a = new Actions(driver);
		a.sendKeys(Keys.ESCAPE).perform();
		
	}
	/**
	 * Generic method to select any given date from the calendar
	 * @param year
	 * @param month
	 * @param day
	 * @param selectDate : Should be in format DD-MON-YYYY eg: 10-Mar-1999
	 * @throws InterruptedException 
	 */
	public void selectDate(List<WebElement> year, List<WebElement> month, List<WebElement> day , String selectDate) throws InterruptedException {
		String[] splitDate = selectDate.split("-");
		
		selectElementWithText(year, splitDate[2]);
		selectElementWithText(month, splitDate[1]);
		selectElementWithText(day, splitDate[0]);
	}
	
	/**
	 * 
	 * @param liWe
	 * @param selectYear
	 * @throws InterruptedException 
	 */
	public void selectYear(List<WebElement> liWe, String selectYear) throws InterruptedException {
		Allure.step("Selecting year " + selectYear);
		selectElementWithText(liWe, selectYear);
	}
	
	/**
	 * 
	 * @param liWe
	 * @param selectMonth
	 * @throws InterruptedException 
	 */
	public void selectMonth(List<WebElement> liWe, String selectMonth) throws InterruptedException {
		selectElementWithText(liWe, selectMonth);
	}
	
	/**
	 * 
	 * @param liWe
	 * @param selectDay
	 * @throws InterruptedException 
	 */
	public void selectDay(List<WebElement> liWe, String selectDay) throws InterruptedException {
		selectElementWithText(liWe, selectDay);
	}
}

