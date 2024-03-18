package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Registerwhilecheckout extends AbstractMethods {
	WebDriver driver;
	public Signuppage sp;
	public Register rg;

	public Registerwhilecheckout(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/view_cart']")
	WebElement cartbtn1;

	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	WebElement checkout1;

	@FindBy(xpath = "(//a[@href='/login'])[2]")
	WebElement login;

	@FindBy(xpath = "//input[@name='name']")
	WebElement entername;

	@FindBy(xpath = "(//input[@name='email'])[2]")
	WebElement enteremail;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	WebElement submitbutton;

	@FindBy(xpath = "//a[@href='/view_cart']")
	WebElement cartbtn2;

	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	WebElement checkout2;

	@FindBy(xpath = "//textarea[@name='message']")
	WebElement message;

	@FindBy(xpath = "//a[@href='/payment']")
	WebElement placeorder;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement Cardname;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement CardNumber;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement CVC;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement Expiration;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement year;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement confirmorder;

	@FindBy(xpath = "//a[@href='/delete_account']")
	WebElement deleteaccount;

	@FindBy(xpath = "(//a[@href='/'])[3]")
	WebElement continuebtn;

	public void whilecheckout() {
		implicitlywaitmethod();
		Addproduct ap = new Addproduct(driver);
		ap.addcart();
		ap.addproductincart();
		cartbtn1.click();
		System.out.println("Verify that cart page is displayed");
		checkout1.click();
		login.click();
		entername.sendKeys("Akshita");
		enteremail.sendKeys("akshita20@gmail.com");
		submitbutton.sendKeys(Keys.ENTER);
		rg = new Register(driver);
		rg.register();
	}

	public void proceedbtn() {
		cartbtn2.click();
		checkout2.click();
		message.sendKeys("Good");
		placeorder.click();
		Cardname.sendKeys("Akshita");
		CardNumber.sendKeys("521428963214");
		CVC.sendKeys("350");
		Expiration.sendKeys("08");
		year.sendKeys("2028");
		confirmorder.click();
		System.out.println("'Your order has been placed successfully!'");
	}
	public void deletebtn() {
	
		deleteaccount.click();
		System.out.println("Verify 'ACCOUNT DELETED!' and click 'Continue' button");
		continuebtn.click();

	}
}
