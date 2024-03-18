package pageelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Contactusform extends AbstractMethods {
	WebDriver driver;

	public Contactusform(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/contact_us']")
	WebElement Contactus;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement name;

	@FindBy(xpath = "(//input[@type='email'])[1]")
	WebElement enteremail;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement subject;

	@FindBy(xpath = "//textarea[@name='message']")
	WebElement message;

	@FindBy(name = "upload_file")
	WebElement uploadFileInput;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitbutton;

	@FindBy(css = ".status.alert.alert-success")
	WebElement alertSuccess;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	WebElement homePageButton;

	public void fillForm() {
		implicitlywaitmethod();
		Contactus.click();
		System.out.println("Verify 'GET IN TOUCH' is visible");
		enteremail.sendKeys("akshita15@gmail.com");
		name.sendKeys("Adhvik");
		subject.sendKeys("Maths");
		message.sendKeys("namastey");
		uploadFileInput.sendKeys(System.getProperty("user.dir") + "\\resources\\sample.txt");
		submitbutton.sendKeys(Keys.ENTER);
	}

	public void okButtonClick() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Your details have been submitted successfully.' is visible");
		homePageButton.click();
		System.out.println("verify that landed to home page successfully");
	}

}
