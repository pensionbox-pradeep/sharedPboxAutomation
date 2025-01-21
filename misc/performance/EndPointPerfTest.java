package performance;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndPointPerfTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		ReadProp rp = new ReadProp();
		String count = rp.getValue("count","./misc/endpointurls.properties");
		int total = Integer.parseInt(count);
		
		//System.out.println("Debug: intTotal"+total+" &StringCount"+count);
		int i=1;
		//System.out.println("int i "+i);
		//System.out.println("url count: "+count);

		PageSpeedIndex psi= new PageSpeedIndex();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));


		while (total > i) {
			//String url=rp.getValue((i+""),"./misc/endpointurls.properties");
			String url=rp.getValue((i+""),"./misc/weburls.properties");
			System.out.println("The Page is: "+url);
			
			driver.get("https://pagespeed.web.dev/");
			WebElement urlTextBox = driver.findElement(By.xpath("//input[@name='url']"));
			WebElement analyzeButton = driver.findElement(By.xpath("//span[text()='Analyze']"));
			
			urlTextBox.clear();
			urlTextBox.sendKeys(url);
			analyzeButton.click();
			
			
			
			psi.setDeviceType(driver, "Mobile");
			System.out.println("================Recording Mobile Values================");
			psi.recordValues(driver,"Mobile");

			psi.setDeviceType(driver, "DeskTop");
			System.out.println("================Recording Desktop Values================");
			psi.recordValues(driver,"Desktop");

			i++;

		}









	}

}
