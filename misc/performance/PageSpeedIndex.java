package performance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSpeedIndex {
	String lcpValue;
	String inpValue; 
	String clsValue;
	String fcpValue; 
	String fidValue; 
	String ttfbValue; 
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		String url="https://pensionbox.in/nps/npsregistration";

		driver.get("https://pagespeed.web.dev/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement urlTextBox = driver.findElement(By.xpath("//input[@name='url']"));
		WebElement analyzeButton = driver.findElement(By.xpath("//span[text()='Analyze']"));

		urlTextBox.clear();
		urlTextBox.sendKeys(url);
		analyzeButton.click();

		PageSpeedIndex psi=new PageSpeedIndex();

		psi.setDeviceType(driver, "Mobile");
		System.out.println("================Recording Mobile Values================");
		psi.recordValues(driver,"Mobile");

		psi.setDeviceType(driver, "DeskTop");
		System.out.println("================Recording Desktop Values================");
		psi.recordValues(driver,"Desktop");

	}
	public void setDeviceType(WebDriver driver, String deviceType) {
		switch(deviceType.toLowerCase()) {
		case "mobile":
			WebElement mobileRadio = driver.findElement(By.id("mobile_tab"));
			//System.out.println("Found mobile radio button");
			mobileRadio.click();
			//System.out.println("Clicked mobile radio button");
			break;
		case "desktop":
			WebElement desktopRadio = driver.findElement(By.id("desktop_tab"));
			//System.out.println("Found desktop radio button");
			desktopRadio.click();
			//System.out.println("Clicked desktop radio button");
			break;
		}
	}

	public void recordValues(WebDriver driver, String deviceType ) throws InterruptedException {
		Thread.sleep(2000);
		
		int modifier=0;
		
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			WebElement originalUrl= driver.findElement(By.xpath("//span[contains(text(),'Run with original URL')]"));
			if(originalUrl.isDisplayed()) {
				originalUrl.click();
				Thread.sleep(2000);
			}
		}
		catch (NoSuchElementException e) {
			System.out.println("OG url");
			// idk for what reason but when I try to click on original url it offsets the xpath by 6 index, thus modifier tadaaa
			modifier=6;
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}	

			String grid= "(//a[text()='Largest Contentful Paint (LCP)']/../../../div/div[2]/div/span/span/span)";

			int baseIndex=1;

			if (deviceType.toLowerCase().equals("desktop")) {
				baseIndex=12-modifier;
			}

			lcpValue = driver.findElement(By.xpath(grid+"["+(baseIndex++)+"]")).getText();
			inpValue = driver.findElement(By.xpath(grid+"["+(baseIndex++)+"]")).getText();
			clsValue = driver.findElement(By.xpath(grid+"["+(baseIndex++)+"]")).getText();
			fcpValue = driver.findElement(By.xpath(grid+"["+(baseIndex++)+"]")).getText();
			//fidValue = driver.findElement(By.xpath(grid+"["+(baseIndex++)+"]")).getText();
			ttfbValue = driver.findElement(By.xpath(grid+"["+(baseIndex)+"]")).getText();

			System.out.println("LCP: "+lcpValue);
			System.out.println("INP: "+inpValue);
			System.out.println("CLS: "+clsValue);
			System.out.println("FCP: "+fcpValue);
			//System.out.println("FID: "+fidValue);
			System.out.println("TTFB: "+ttfbValue);
		}

	}
