package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class TC_3 extends AbstractMethods{


	WebDriver driver;
	public TC_3(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='/login']")
	public WebElement login;

	@FindBy(xpath = "(//input[@name='email'])[1]")
	public WebElement enteremail;
	
	@FindBy(xpath = "//input[@type='password']")
	public WebElement Password;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	public WebElement submitbutton;
	
	public void incorrectmailid() {
		implicitlywaitmethod();	
		login.click();
		System.out.println(" Verify 'Login to your account' is visible");
		enteremail.sendKeys("akshita70gmail.com");
		Password.sendKeys("adhu@12");
		submitbutton.sendKeys(Keys.ENTER);
		System.out.println("Verify error 'Your email or password is incorrect!' is visible");
	}
	
}
