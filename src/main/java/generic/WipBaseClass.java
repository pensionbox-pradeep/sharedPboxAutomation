package generic;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import utilities.UtilsClass;
import utilities.WebDriverUtils;

@Listeners(generic.AllureListener.class)
public class WipBaseClass {
	public static WebDriver driver;
	public static WebDriverUtils wdu;
	public static UtilsClass ut;
	//public static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	
	
	public static WebDriver getDriver() {
		if(driver== null){
	        throw new IllegalStateException("WebDriver is not initialized. Please call openBrowser() first.");
	    }
		return driver;
		/*
        tdriver.set(driver);
		//System.out.println("getDriver method is called");
		return tdriver.get();
		*/
	}
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() {
		// driver=new ChromeDriver();
		
		char key='o';
		switch (key) {
		case 'c': driver= new ChromeDriver();
			break;
		case 'e': driver= new EdgeDriver();
			break;
		case 'f': driver= new FirefoxDriver();
			break;
		default: 
			// Create ChromeOptions instance
	        ChromeOptions options = new ChromeOptions();
	        
	        // Disable notifications
	        Map<String, Object> prefs = new HashMap<>();
	        //1-Allow, 2-Block
	        prefs.put("profile.default_content_setting_values.notifications", 2); // Block notifications
	        prefs.put("profile.default_content_setting_values.geolocation", 2);   // Block location access
	        prefs.put("profile.default_content_setting_values.media_stream", 2); // Block camera/mic access
	        options.setExperimentalOption("prefs", prefs);
	        
	        
	        // Disable popups
	        options.addArguments("--start-maximized");
	        options.addArguments("--disable-popup-blocking");
	        options.addArguments("--disable-notifications");
	        
	        //  options.addArguments("--headless");
	        driver= new ChromeDriver(options);
	        
	        // Override window.open using JavaScript
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.open = function() { console.log('window.open prevented'); };");

	        break;
		}
		
		//driver.manage().window().maximize();
        wdu=new WebDriverUtils();
        wdu.waitImplicitTime(driver, 10);
        
	}
	
	@AfterSuite(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
	
}