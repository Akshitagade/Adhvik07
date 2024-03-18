package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Signuppage extends AbstractMethods{

	WebDriver driver;
	
public Signuppage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/login']")
	WebElement login;
	
	@FindBy(xpath = "//input[@name='name']")
	WebElement entername;

	@FindBy(xpath = "(//input[@name='email'])[2]")
	WebElement enteremail;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement submitbutton;
	
public void enterSignupdetails(String Name, String EmailAddress) throws InterruptedException {
		implicitlywaitmethod();	
		login.click();
		System.out.println("'New User Signup!' is visible");
		entername.sendKeys(Name);
		enteremail.sendKeys(EmailAddress);
		submitbutton.sendKeys(Keys.ENTER);
		
	}
}
