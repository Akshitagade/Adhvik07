package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Logoutuser extends AbstractMethods {

	WebDriver driver;

	public Logoutuser(WebDriver driverhere) {
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

	@FindBy(xpath = "//a[@href='/logout']")
	WebElement logout;

	public void logdetails() {
		implicitlywaitmethod();
		login.click();
		System.out.println(" Verify 'Login to your account' is visible");
		enteremail.sendKeys("akshita11@gmail.com");
		Password.sendKeys("Welcome@124");
		submitbutton.sendKeys(Keys.ENTER);
		System.out.println("Verify that 'Logged in as username' is visible");
		logout.click();
		driver.navigate().to("https://automationexercise.com/login");
		System.out.println("Verify that user is navigated to login page");
	}
}
