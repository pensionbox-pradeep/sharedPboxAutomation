package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	 * Method to select elements using string 
	 * @param liWe
	 * @param text
	 */
	public void selectElementWithText(List<WebElement> liWe, String text)
	{
		for(WebElement wE : liWe) {
			if(wE.getText().equalsIgnoreCase(text)) 
			{
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
	public boolean isItVisible(WebElement we) {
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
	
	
}

