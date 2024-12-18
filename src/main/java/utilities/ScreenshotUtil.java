package utilities;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {
	public static byte[] captureScreenshot(WebDriver driver, String screenshotName) {
//        try {
//            // Capture screenshot
//            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//            
//            // Define the destination file path
//            String filePath = "/pensionboxtestautomation/screenshots/" + screenshotName + ".png";
//            File destinationFile = new File(filePath);
//
//            // Save the screenshot to the file
//            FileUtils.copyFile(screenshot, destinationFile);
//
//            // Return screenshot as byte array for Allure
//            return FileUtils.readFileToByteArray(destinationFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//            return new byte[0];  // Return empty byte array if an exception occurs
//        }
		try {
			// Capture screenshot
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			// Define the destination file path
			File destinationFile = new File("/pensionboxtestautomation/screenshots");
			// Save screenshot to the specified file
			FileUtils.copyFile(screenshot, destinationFile);

			// Return the screenshot as a byte array for Allure
			return FileUtils.readFileToByteArray(destinationFile);
		} catch (IOException e) {
			e.printStackTrace();
			return new byte[0]; // Return empty byte array in case of error
		}		
	}
}
