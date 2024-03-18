package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Loginbeforecheckout extends AbstractMethods {
	WebDriver driver;

	public Loginbeforecheckout(WebDriver driverhere) {
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

	public void logincheckout() {
		implicitlywaitmethod();
		login.click();
		enteremail.sendKeys("akshita11@gmail.com");
		Password.sendKeys("Welcome@123");
		submitbutton.sendKeys(Keys.ENTER);
		System.out.println("'Logged in as username' is visible");
		Addproduct ap = new Addproduct(driver);
		ap.addcart();
		ap.addproductincart();
		Registerwhilecheckout rc = new Registerwhilecheckout(driver);
		rc.proceedbtn();
		rc.deletebtn();
	}

}
