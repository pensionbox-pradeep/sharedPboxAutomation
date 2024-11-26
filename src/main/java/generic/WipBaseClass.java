package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import utilities.UtilsClass;

public class WipBaseClass {
	public static WebDriver driver;
	public static WebDriverUtils wdu;
	public static UtilsClass ut;

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
	}
}