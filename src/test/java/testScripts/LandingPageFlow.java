package testScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import generic.WipBaseClass;
import io.qameta.allure.Allure;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import websitePageObjects.LandingPage;

@Feature("Landing Page Flow")
@Owner("Pradeep Pai")
public class LandingPageFlow extends WipBaseClass {
	String url="https://qa.pensionbox.in/";
	
	@Test
	(priority = 0
	//,enabled = false
	)
	@Description("Check Landing Page")
	public void LP_TC001() {
		//Reporter.log(driver.getTitle()+" Currently in Landing Page",true);
		Allure.step("Navigate to HomePage URL");
		driver.get("https://qa.pensionbox.in");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "India’s Smartest Pension Platform | PensionBox", "LP_TC001 is Passed");
		Allure.step("HomePage loaded successfully, LP_TC001 is Passed");
	}
	
	@Test
	(priority = 1
	//,enabled = false
	)
	//(enabled = false)
	@Description("Verify Corporate NPS button")
	public void LP_TC002() {
		//Reporter.log(driver.getTitle()+" Currently in Landing Page",true);
		LandingPage lp=new LandingPage(driver);
		Allure.step("Click on Corporate NPS Header Button");
		lp.getCorporateNPSHeaderBtn().click();
		wdu.waitForTitle(driver, 10, "Workplace Pension Plans | Corporate NPS by PensionBox");
		Assert.assertEquals(driver.getTitle(), "Workplace Pension Plans | Corporate NPS by PensionBox", "LP_TC002 is Passed");
		Allure.step("Corporate NPS page is opened, LP_TC002 is Passed");
	}
	
	@Test
	(priority = 2
	//,enabled = false
	)
	@Description("Verify Pension For Dropdown")
	public void LP_TC003() throws InterruptedException {
		driver.get(url);
		Thread.sleep(2000);
		LandingPage lp=new LandingPage(driver);
		Allure.step("Hover on the Pension For button");
		SoftAssert sass=new SoftAssert();
		//Actions act= new Actions(driver);
		//act.moveToElement(lp.getPensionForNavBtn()).perform();
		wdu.hoverOverElement(driver,lp.getPensionForNavBtn());
		sass.assertEquals(lp.getPersonalBtn().getText(), "Personal","Personal is Found");
		sass.assertEquals(lp.getPartnerBtn().getText(), "Partner","Partner is Found");
		sass.assertEquals(lp.getnRIsBtn().getText(), "NRIs","NRIs is Found");
		sass.assertEquals(lp.getKidsBtn().getText(), "Kids","Personal is Found");
		sass.assertAll("Found Personal, Partner, NRIs, Kids");
		Allure.step("Pension For Dropdown is verified ,LP_TC003 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC003"
	, priority = 3
	)
	
	@Description("Verify Pension for Personal button")
	public void LP_TC004() throws InterruptedException {
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getPensionForNavBtn());
		Allure.step("Click on Personal");
		lp.getPersonalBtn().click();
		wdu.waitForTitle(driver, 10, "India’s Smartest Pension Platform | PensionBox");
		Assert.assertEquals(driver.getTitle(), "India’s Smartest Pension Platform | PensionBox", "Personal page is opened");
		Allure.step("Personal page is opened, LP_TC004 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC003"
	, priority = 0
	)
	@Description("Verify Pension for Partner button")
	public void LP_TC005() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getPensionForNavBtn());
		Allure.step("Click on Partner");
		lp.getPartnerBtn().click();	
		wdu.waitForTitle(driver, 10, "Partner Pension - PensionBox");
		Assert.assertEquals(driver.getTitle(), "Partner Pension - PensionBox", "Partner page is opened");
		Allure.step("Partner page is opened, LP_TC005 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC003"
	, priority = 1
	)
	@Description("Verify Pension for NRIs button")
	public void LP_TC006() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getPensionForNavBtn());
		Allure.step("Click on NRIs");
		lp.getnRIsBtn().click();
		wdu.waitForTitle(driver, 10, "NRI Pension Solutions | Secure Retirement Abroad");
		Assert.assertEquals(driver.getTitle(), "NRI Pension Solutions | Secure Retirement Abroad", "NRI page is opened");
		Allure.step("NRI page is opened, LP_TC006 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC003"
	, priority = 2
	)
	@Description("Verify Pension for Kids button")
	public void LP_TC007() throws InterruptedException {
		driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getPensionForNavBtn());
		Allure.step("Click on Kids");
		lp.getKidsBtn().click();
		wdu.waitForTitle(driver, 10, "NPS Vatsalya");
		Assert.assertEquals(driver.getTitle(), "NPS Vatsalya", "NRI page is opened");
		Allure.step("Vatsalya page is opened, LP_TC007 is Passed");
	}
	
	@Test
	(priority = 3
	//,enabled = false
	)
	@Description("Verify Our Journey Dropdown")
	public void LP_TC008() throws InterruptedException {
		driver.get(url);
		Thread.sleep(2000);
		LandingPage lp=new LandingPage(driver);
		Allure.step("Hover on the Our Journey button");
		SoftAssert sass=new SoftAssert();
		//Actions act= new Actions(driver);
		//act.moveToElement(lp.getPensionForNavBtn()).perform();
		wdu.hoverOverElement(driver,lp.getOurJourneyNavBtn());
		sass.assertEquals(lp.getOurStoryBtn().getText(), "Our Story","Our Story is Found");
		sass.assertEquals(lp.getOurTeamBtn().getText(), "Our Team","Our Team is Found");
		sass.assertEquals(lp.getOurVisionBtn().getText(), "Our Vision","Our Vision is Found");
		sass.assertEquals(lp.getMissionStartAbBtn().getText(), "Mission Start Ab","Mission Start Ab is Found");
		sass.assertEquals(lp.getPensionBoxZerodhaBtn().getText(), "PensionBox | Zerodha","PB|Zerodha is Found");
		sass.assertAll("Found Our Story, Our Team, Our Vision, Mission Start Ab, PensionBox | Zerodha");
		Allure.step("Our Journey Dropdown is verified, LP_TC008 is Passed");
	}
		
	@Test
	(dependsOnMethods = "LP_TC008"
	, priority = 0
	)
	@Description("Verify Our Story button")
	public void LP_TC009() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getOurJourneyNavBtn());
		Allure.step("Click on Our Story");
		lp.getOurStoryBtn().click();
		wdu.waitForURL(driver, 10, "https://qa.pensionbox.in/about-us/our-story");
		Assert.assertEquals(driver.getCurrentUrl(), "https://qa.pensionbox.in/about-us/our-story", "Our Story page is opened");
		Allure.step("Our Story page is opened, LP_TC009 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC008"
	, priority = 1
	)
	@Description("Verify Our Team button")
	public void LP_TC010() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getOurJourneyNavBtn());
		Allure.step("Click on Our Team"); 
		lp.getOurTeamBtn().click();
		wdu.waitForTitle(driver, 10, "Meet the Team Behind PensionBox | Expert Pension Advisors");
		Assert.assertEquals(driver.getTitle(), "Meet the Team Behind PensionBox | Expert Pension Advisors", "Our Team page is opened");
		Allure.step("Our Team page is opened, LP_TC010 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC008"
	, priority = 2
	)
	@Description("Verify Our Vision button")
	public void LP_TC011() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getOurJourneyNavBtn());
		Allure.step("Click on Our Vision"); 
		lp.getOurVisionBtn().click();
		wdu.waitForTitle(driver, 10, "Our Vision | PensionBox’s Future of Retirement");
		Assert.assertEquals(driver.getTitle(), "Our Vision | PensionBox’s Future of Retirement", "Our Team page is opened");
		Allure.step("Our Vision page is opened, LP_TC011 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC008"
	, priority = 3
	)
	@Description("Verify Mission Start Ab button")
	public void LP_TC012() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getOurJourneyNavBtn());
		Allure.step("Click on Mission Start Ab Button");  
		lp.getMissionStartAbBtn().click();
		wdu.waitForTitle(driver, 10, "Mission Start Ab | PensionBox Featured on Amazon Prime");
		Assert.assertEquals(driver.getTitle(), "Mission Start Ab | PensionBox Featured on Amazon Prime", "Mission Start Ab page is opened");
		Allure.step("Mission Start Ab page is opened, LP_TC012 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC008"
	, priority = 4
	)
	@Description("Verify PensionBox | Zerodha button")
	public void LP_TC013() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getOurJourneyNavBtn());
		Allure.step("Click on PensionBox | Zerodha Button"); 
		lp.getPensionBoxZerodhaBtn().click();
		wdu.waitForTitle(driver, 10, "Zerodha Backed PensionBox | Trusted Pension Solutions");
		Assert.assertEquals(driver.getTitle(), "Zerodha Backed PensionBox | Trusted Pension Solutions", "PensionBox | Zerodha page is opened");
		Allure.step("PensionBox | Zerodha page is opened, LP_TC013 is Passed");
	}
	
	@Test
	(priority = 4
	//,enabled = false
	)
	@Description("Verify Resources Dropdown")
	public void LP_TC014() throws InterruptedException {
		driver.get(url);
		Thread.sleep(2000);
		LandingPage lp=new LandingPage(driver);
		Allure.step("Hover on the Resources button");
		SoftAssert sass=new SoftAssert();
		//Actions act= new Actions(driver);
		//act.moveToElement(lp.getPensionForNavBtn()).perform();
		wdu.hoverOverElement(driver,lp.getResourcesNavBtn());
		sass.assertEquals(lp.getProductsNavBtn().getText(), "Products");
		sass.assertEquals(lp.getCalculatorsNavBtn().getText(), "Calculators");
		sass.assertEquals(lp.getPensionMovementBtn().getText(), "Pension Movement");
		sass.assertEquals(lp.getSupportBtn().getText(), "Support");
		sass.assertEquals(lp.getBlogsBtn().getText(), "Blogs");
		sass.assertAll("Found Products, Calculators, Pension Movement, Support, Blogs");
		Allure.step("ResourcesDropdown is verified, LP_TC0014 is Passed");
	}
	
	//Products
	@Test
	(dependsOnMethods = "LP_TC014"
	, priority = 3
			)
	@Description("Verify Resources > Products button")
	public void LP_TC015() throws InterruptedException {
		driver.get(url);
		Thread.sleep(2000);
		LandingPage lp=new LandingPage(driver);
		Allure.step("Hover on the Resources button");
		SoftAssert sass=new SoftAssert();
		//Actions act= new Actions(driver);
		//act.moveToElement(lp.getPensionForNavBtn()).perform();
		wdu.hoverOverElement(driver,lp.getResourcesNavBtn());
		Allure.step("Click on Products");
		lp.getProductsNavBtn().click();
		sass.assertEquals(lp.getProductsCorporateNPSBtn().getText(), "Corporate NPS");
		sass.assertEquals(lp.getnPSTierIBtn().getText(), "NPS Tier I");
		sass.assertEquals(lp.getnPSTierIIBtn().getText(), "NPS Tier II");
		sass.assertEquals(lp.getePFBtn().getText(), "EPF");
		sass.assertEquals(lp.getpPFBtn().getText(), "PPF");
		sass.assertEquals(lp.getfDBtn().getText(), "FD");
		sass.assertAll("Found Corporate NPS, NPS Tier I, NPS Tier II, EPF, PPF, FD");
		Allure.step("Resources > Products list is verified, LP_TC0015 is Passed");
	}
	
	/*
	 * NEED TO WRITE TEST CASES 15 TILL 21
	 * 
	 */
	@Test
	(dependsOnMethods = "LP_TC015"
	, priority = 0
			)
	@Description("Verify Products > Corporate NPS button")
	public void LP_TC016() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Products Button"); 
		lp.getProductsNavBtn().click();
		Allure.step("Click on Corporate NPS Button");
		lp.getProductsCorporateNPSBtn().click();
		//Add CNPS Product Page POM Reference later
		wdu.waitForURL(driver, 10, "https://qa.pensionbox.in/product/corporate-nps?inZeroState=true");
		wdu.waitForElementText(driver, 10, "//span[contains(@class,'productLogoText')]", "Corporate National Pension Scheme");
		
		Assert.assertEquals(wdu.lazyWEXp(driver, "//span[contains(@class,'productLogoText')]").getText()
				, "Corporate National Pension Scheme", "Checked Product text Corporate NPS");
		Allure.step("Corporate NPS page is opened, LP_TC023 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC015"
	, priority = 1
			)
	@Description("Verify Products > NPS T1 button")
	public void LP_TC017() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Products Button"); 
		lp.getProductsNavBtn().click();
		Allure.step("Click on NPS T1 Button");
		lp.getnPSTierIBtn().click();
		//Add CNPS Product Page POM Reference later
		wdu.waitForURL(driver, 10, "https://qa.pensionbox.in/product/national-pension-scheme/tier-1?inZeroState=true");
		wdu.waitForElementText(driver, 10, "//span[contains(@class,'productLogoText')]", "National Pension Scheme");
		
		Assert.assertEquals(wdu.lazyWEXp(driver, "//span[contains(@class,'productLogoText')]").getText()
				, "National Pension Scheme", "Checked Product text NPS T1");
		Allure.step("NPS T1 page is opened, LP_TC017 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC015"
	, priority = 2
			)
	@Description("Verify Products > NPS T2 button")
	public void LP_TC018() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Products Button"); 
		lp.getProductsNavBtn().click();
		Allure.step("Click on NPS T2 Button");
		lp.getnPSTierIIBtn().click();
		//Add CNPS Product Page POM Reference later
		wdu.waitForURL(driver, 10, "https://qa.pensionbox.in/product/national-pension-scheme/tier-2?inZeroState=true");
		wdu.waitForElementText(driver, 10, "//span[contains(@class,'productLogoText')]", "National Pension Scheme");
		
		Assert.assertEquals(wdu.lazyWEXp(driver, "//span[contains(@class,'productLogoText')]").getText()
				, "National Pension Scheme", "Checked Product text NPS T2");
		Allure.step("NPS T2 page is opened, LP_TC018 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC015"
	, priority = 3
			)
	@Description("Verify Products > EPF button")
	public void LP_TC019() throws InterruptedException {
		driver.get(url);
		Thread.sleep(1000);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Products Button"); 
		lp.getProductsNavBtn().click();
		Allure.step("Click on EPF Button");
		lp.getePFBtn().click();
		//Add CNPS Product Page POM Reference later
		wdu.waitForURL(driver, 10, "https://qa.pensionbox.in/product/pf?inZeroState=true");
		wdu.waitForElementText(driver, 10, "//span[contains(@class,'productLogoText')]", "Employee Provident Fund");
		
		Assert.assertEquals(wdu.lazyWEXp(driver, "//span[contains(@class,'productLogoText')]").getText()
				, "Employee Provident Fund", "Checked Product text EPF");
		Allure.step("EPF page is opened, LP_TC020 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC015"
	, priority = 4
			)
	@Description("Verify Products > PPF button")
	public void LP_TC020() throws InterruptedException {
		driver.get(url);
		Thread.sleep(1000);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Products Button"); 
		lp.getProductsNavBtn().click();
		Allure.step("Click on PPF Button");
		lp.getpPFBtn().click();
		//Add CNPS Product Page POM Reference later
		wdu.waitForURL(driver, 10, "https://qa.pensionbox.in/product/ppf?inZeroState=true");
		wdu.waitForElementText(driver, 10, "//span[contains(@class,'productLogoText')]", "Public Provident Fund");
		
		Assert.assertEquals(wdu.lazyWEXp(driver, "//span[contains(@class,'productLogoText')]").getText()
				, "Public Provident Fund", "Checked Product text PPF");
		Allure.step("PPF page is opened, LP_TC020 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC015"
	, priority = 5
			)
	@Description("Verify Products > FD button")
	public void LP_TC021() throws InterruptedException {
		driver.get(url);
		Thread.sleep(1000);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Products Button"); 
		lp.getProductsNavBtn().click();
		Allure.step("Click on FD Button");
		lp.getfDBtn().click();
		//Add CNPS Product Page POM Reference later
		wdu.waitForURL(driver, 10, "https://qa.pensionbox.in/product/fd?inZeroState=true");
		wdu.waitForElementText(driver, 10, "//span[contains(@class,'productLogoText')]", "Fixed Deposit");
		
		Assert.assertEquals(wdu.lazyWEXp(driver, "//span[contains(@class,'productLogoText')]").getText()
				, "Fixed Deposit", "Checked Product text FD");
		Allure.step("FD page is opened, LP_TC020 is Passed");
	}
	 
	//Calculators
	@Test
	(dependsOnMethods = "LP_TC014"
	, priority = 4
			)
	@Description("Verify Resources > Calculators button")
	public void LP_TC022() throws InterruptedException {
		driver.get(url);
		Thread.sleep(2000);
		LandingPage lp=new LandingPage(driver);
		Allure.step("Hover on the Resources button");
		SoftAssert sass=new SoftAssert();
		//Actions act= new Actions(driver);
		//act.moveToElement(lp.getPensionForNavBtn()).perform();
		wdu.hoverOverElement(driver,lp.getResourcesNavBtn());
		Allure.step("Click on Calculators");
		lp.getCalculatorsNavBtn().click();
		sass.assertEquals(lp.getpBCalcBtn().getText(), "PensionBox Calculator");
		sass.assertEquals(lp.getaPYCalcBtn().getText(), "Atal Pension Yojana");
		sass.assertEquals(lp.getnPSCalcBtn().getText(), "National Pension Scheme");
		sass.assertAll("Found Pensionbox Calculator, APY Calculator, NPS Calculator");
		Allure.step("Resources > Calculators list is verified, LP_TC0022 is Passed");
	}
	
	/*
	 * NEED TO WRITE TEST CASES TILL 23 to 25
	 */
	
	@Test
	(dependsOnMethods = "LP_TC022"
	, priority = 0
			)
	@Description("Verify Calculator > PensionBox button")
	public void LP_TC023() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Calculator Button"); 
		lp.getCalculatorsNavBtn().click();
		Allure.step("Click on PensionBox Calculator Button");
		lp.getpBCalcBtn().click();
		wdu.waitForTitle(driver, 10, "Plan Your Retirement with PensionBox's Calculator");
		Assert.assertEquals(driver.getTitle(), "Plan Your Retirement with PensionBox's Calculator", "PensionBox calulator page is opened");
		Allure.step("PensionBox Calculator page is opened, LP_TC023 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC022"
	, priority = 1
			)
	@Description("Verify Calculator > Atal Pension Yojana button")
	public void LP_TC024() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Calculator Button"); 
		lp.getCalculatorsNavBtn().click();
		Allure.step("Click on Atal Pension Yojna Calculator Button");
		lp.getaPYCalcBtn().click();
		wdu.waitForTitle(driver, 10, "APY Calculator - Atal Pension Yojana Calculator Online");
		Assert.assertEquals(driver.getTitle(), "APY Calculator - Atal Pension Yojana Calculator Online", "APY calulator page is opened");
		Allure.step("APY Calculator page is opened, LP_TC024 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC022"
	, priority = 2
			)
	@Description("Verify Calculator > NPS Calculator button")
	public void LP_TC025() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Calculator Button"); 
		lp.getCalculatorsNavBtn().click();
		Allure.step("Click on Atal Pension Yojna Calculator Button");
		lp.getnPSCalcBtn().click();
		wdu.waitForTitle(driver, 10, "NPS Calculator | Plan Your Pension with PensionBox");
		Assert.assertEquals(driver.getTitle(), "NPS Calculator | Plan Your Pension with PensionBox", "NPS calulator page is opened");
		Allure.step("NPS Calculator page is opened, LP_TC025 is Passed");
	}

	@Test
	(dependsOnMethods = "LP_TC014"
	, priority = 1
			)
	@Description("Verify Resourcses > Support button")
	public void LP_TC027() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Support"); 
		lp.getSupportBtn().click();
		wdu.waitForTitle(driver, 10, "Contact PensionBox | Get Support for Your Pension Needs");
		Assert.assertEquals(driver.getTitle(), "Contact PensionBox | Get Support for Your Pension Needs", "Support page is opened");
		Allure.step("Support page is opened, LP_TC027 is Passed");
	}
	
	@Test
	(dependsOnMethods = "LP_TC014"
	, priority = 2
			)
	@Description("Verify Blogs button")
	public void LP_TC028() throws InterruptedException {
		//driver.get(url);
		LandingPage lp=new LandingPage(driver);
		wdu.hoverOverElement(driver, lp.getResourcesNavBtn());
		Allure.step("Click on Blogs Button"); 
		lp.getBlogsBtn().click();
		wdu.waitForTitle(driver, 10, "PensionBox Blog | Expert Retirement Insights");
		Assert.assertEquals(driver.getTitle(), "PensionBox Blog | Expert Retirement Insights", "Blogs page is opened");
		Allure.step("Blogs page is opened, LP_TC028 is Passed");
	}
	
	@Test
	(priority = 5)
	@Description("Verify Login Button")
	public void LP_TC029() {
		driver.get(url);
		LandingPage lp=new LandingPage(driver);
		Allure.step("Click on Login Button");
		lp.getLoginBtn().click();
		wdu.waitForTitle(driver, 10, "Get Started with PensionBox | Secure Your Retirement");
		wdu.waitForElementText(driver, 10, "//div[text()=\"Log in to your PensionBox account\"]", "Log in to your PensionBox account");
		Assert.assertEquals(driver.getTitle(), "Get Started with PensionBox | Secure Your Retirement", "Login page is opened");
		Allure.step("Login page is opened, LP_TC029 is Passed");
	}
	
	@Test
	(priority = 6)
	@Description("Verify Get Started Button")
	public void LP_TC030() {
		driver.get(url);
		LandingPage lp=new LandingPage(driver);
		Allure.step("Click on Sign Up Button");
		lp.getGetStartedBtn().click();
		wdu.waitForTitle(driver, 10, "Get Started with PensionBox | Secure Your Retirement");
		wdu.waitForElementText(driver, 10, "//div[text()=\"Let’s create a new PensionBox account\"]", "Let’s create a new PensionBox account");
		Assert.assertEquals(driver.getTitle(), "Get Started with PensionBox | Secure Your Retirement", "Sign Up page is opened");
		Allure.step("Sign Up page is opened, LP_TC030 is Passed");
	}
}
