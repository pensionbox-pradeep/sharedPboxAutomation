package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		char key='g';
		switch (key) {
		case 'c': 
			ChromeOptions cOptions = new ChromeOptions();
			cOptions.addArguments("--disable-dev-shm-using");
			cOptions.addArguments("--no-sandbox");
			driver= new ChromeDriver(cOptions);
				
			break;
		
		
		case 'e': 
			EdgeOptions eOptions = new EdgeOptions();
			eOptions.setBinary("/home/pensionbox-pradeep/ashtcapital/pensionbox-automation/pensionboxtestautomation/WebDrivers/edgedriver_linux64/msedgedriver");
			eOptions.addArguments("--disable-dev-shm-using");
			eOptions.addArguments("--no-sandbox");
			driver= new EdgeDriver(eOptions);
			break;
		
		
		case 'f': driver= new FirefoxDriver();
			break;
			
		
		case 'g':
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
		
			
		case 'h':
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			break;
		
			
			
		default: driver= new ChromeDriver();
			break;
		}
		driver.get("https://qa.pensionbox.in/");
	}

}
