package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import utilities.UtilsClass;
import utilities.WebDriverUtils;

@Listeners(generic.AllureListener.class)
public class WipBaseClass {
	public static WebDriver driver;
	public static WebDriverUtils wdu;
	public static UtilsClass ut;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	@BeforeClass
	public void openBrowser() {
		// driver=new ChromeDriver();
		
		char key='c';
		switch (key) {
		case 'c': driver= new ChromeDriver();
			break;
		case 'e': driver= new EdgeDriver();
			break;
		case 'f': driver= new FirefoxDriver();
			break;
		default: driver= new ChromeDriver();
			break;
		}
		driver.manage().window().maximize();
        wdu=new WebDriverUtils();
        wdu.waitImplicitTime(driver, 10);
        tdriver.set(driver);
	}
	
	public static WebDriver getDriver() {
		System.out.println("getDriver method is called");
		return tdriver.get();
	}
}