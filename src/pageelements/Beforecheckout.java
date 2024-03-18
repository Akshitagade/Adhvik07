package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Beforecheckout extends AbstractMethods {
	WebDriver driver;
	public Register rg;
	

	public Beforecheckout(WebDriver driverhere) {
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
	
	@FindBy(xpath = "(//a[@href='/'])[3]")
	WebElement continu;
	
	public void beforecheckout() {
		implicitlywaitmethod();
		login.click();
		entername.sendKeys("Akshita");
		enteremail.sendKeys("akshita12@gmail.com");
		submitbutton.sendKeys(Keys.ENTER);
		rg = new Register(driver);
		rg.register();
		continu.click();
		System.out.println("Logged name is visible");
		Addproduct ap = new Addproduct(driver);
		ap.addcart();
		ap.addproductincart();
	}
		public void proceed() {
		Registerwhilecheckout rc = new Registerwhilecheckout(driver);
		rc.proceedbtn();
	}

}
