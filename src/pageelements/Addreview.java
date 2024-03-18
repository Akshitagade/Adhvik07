package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Addreview extends AbstractMethods {
	WebDriver driver;

	public Addreview(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@id='name']")
	WebElement entername;

	@FindBy(xpath = "//input[@id='email']")
	WebElement enteremail;

	@FindBy(xpath = "(//button[@type='submit'])[1]")
	WebElement submitbutton;
	
	public void addreview() {
		Productdetailspage pd = new Productdetailspage(driver);
		pd.productdetails();
		entername.sendKeys("Akshita");
		enteremail.sendKeys("akshita@gmail.com");
		submitbutton.click();
		System.out.println("'Thank you for your review.'");
		
	}

}
