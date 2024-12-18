package testScripts;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.WipBaseClass;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import pageObjects.CorporateGetStartedPage;

@Feature("Corporate Getstarted")
@Owner("Pradeep Pai")

public class CorporateSignUpFlow extends WipBaseClass {
	
	static String url = "https://qa.pensionbox.in/corporate/corporate-getstarted";
	CorporateGetStartedPage cgp;
	
	/*
	 * SS attach Logic
	 */
	@Test
	@Attachment(value = "Screenshot", type = "image/png")
	public void captureScreenshot(WebDriver driver) {
		byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    Allure.addAttachment("Manual Screenshot", new ByteArrayInputStream(screenshot));
	    //byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    System.out.println("Screenshot length: " + (screenshot != null ? screenshot.length : 0));
	    //return screenshotBytes;
	}
	
	
	@Test
	@Description("Verify Page load > Corporate Getstarted")
	public void LP_TC010() {
		Allure.step("Navigate to Corporate Getstarted URL");
		driver.get(url);
		cgp = new CorporateGetStartedPage(driver);
		cgp.getAdminFullNameTf().sendKeys("TEST SS2");
		//captureScreenshot(driver);
		System.out.println("SS Taken 2");
		Assert.assertEquals(false, true);
		
		
	}
}
//		Assert.assertEquals(true, false, "Testing SS");
//		wdu.waitForTitle(driver, 5, "Get Started with PensionBox | Secure Your Retirement");
//		Assert.assertEquals(cgp.logoSubTxt.getText(), "Workplace", "Workplace is present");
//		Assert.assertEquals(driver.getTitle(), "Get Started with PensionBox | Secure Your Retirement", "Title Verified");
