package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath = "(//span[contains(text(),'Get Started')])[1]")
    private WebElement getStartedBtn;

    @FindBy(xpath = "//span[contains(text(),'Login')]/..")
    private WebElement LoginBtn;
    
    public HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public WebElement getGetStartedBtn(){
        return getStartedBtn;
    }

    public WebElement getLoginBtn(){
        return LoginBtn;
    }
}
