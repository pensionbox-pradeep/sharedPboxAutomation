package generic;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v128.page.model.Screenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import utilities.ScreenshotUtil;

public class AllureListener implements ITestListener {
	
	public static WebDriver driver;
	
	// Method to get the name of the test method from ITestResult
    public static String getTestName(ITestResult result) {
        return result.getName();
        // Retrieves the name of the test method
    }
	
	/*
	 * SS attach Logic
	 */
	public void captureScreenshot(WebDriver driver, ITestResult result) {
		//System.out.println("Inside captureScreenshot");
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment(getTestName(result)+" Screenshot", new ByteArrayInputStream(screenshot));
	    //byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    System.out.println(getTestName(result)+" :Screenshot length: " + (screenshot != null ? screenshot.length : 0));
	    //return screenshotBytes;
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Inside On Test Failure");
		System.out.println(getTestName(result));
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
            // Only proceed if WebDriver is already initialized
            if (WipBaseClass.getDriver() == null) {
                System.out.println("WebDriver is not initialized yet. Skipping screenshot capture.");
                return;  // Exit if driver isn't initialized
            }
		}catch (Exception e) {
	            
            }
		driver=WipBaseClass.getDriver();
		//System.out.println("Inside onTestFailure");
		captureScreenshot(driver, result);
		


//	@Override
//	public void onTestSuccess(ITestResult result) {
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		driver=WipBaseClass.getDriver();
//		System.out.println("Inside onTestSuccess");
//		captureScreenshot(driver, result);
//	}
	
	}
}

