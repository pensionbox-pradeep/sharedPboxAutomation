package forTroubleShooting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WDMTest {
	
	static WebDriver driver;
	static String link= "https://qa.pensionbox.in";
	static char browserKey = 'c';
	
	public static void main(String[] args) {
		
		switch (browserKey) {
		
		case 'c':
			openChrome(); 
			break;
		case 'e':
			openEdge();
			break;
		case 'f':
			openFireFox();
			break;
		default:
			System.out.println("Browser Key Not Defined/invalid");
			break;
		}
		
		driver.quit();
	}
	
	public static void openChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(link);
	}
	
	public static void openEdge() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.get(link);
	}
	
	public static void openFireFox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(link);
	}
	
}
