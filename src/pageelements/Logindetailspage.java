package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Logindetailspage extends AbstractMethods {

	WebDriver driver;

	public Logindetailspage(WebDriver driverhere) {
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

	/*
	 * @FindBy(xpath = "//a[@href='/delete_account']") WebElement deleteaccount;
	 */
	@FindBy(xpath = "//a[@href='/logout']")
	WebElement logout;

	public void logindetailspage() throws InterruptedException {
		implicitlywaitmethod();
		login.click();
		enteremail.sendKeys("akshita20@gmail.com");
		Password.sendKeys("Welcome$12");
		submitbutton.sendKeys(Keys.ENTER);
		System.out.println("'Logged in as username' is visible");
	}

	public void delaccount() {
		implicitlywaitmethod();
		logout.click();
		/*
		 * deleteaccount.click(); System.out.println("'ACCOUNT DELETED!' is visible ");
		 */

	}
}