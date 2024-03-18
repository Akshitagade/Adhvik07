package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Subscriptioninhomepage extends AbstractMethods {
	WebDriver driver;

	public Subscriptioninhomepage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//footer[@id = 'footer']")
    WebElement scrolldown;
	
	@FindBy(xpath="//input[@type = 'email']")
    WebElement enteremail;
	
	@FindBy(xpath="//button[@type = 'submit']")
    WebElement arrowbtn;
	
	public void subscription() {
		implicitlywaitmethod();
		scrolldown.click();
		System.out.println("Verify text 'SUBSCRIPTION'");
		enteremail.sendKeys("akshita@gmail.com");
		arrowbtn.click();
		System.out.println("'You have been successfully subscribed!' is visible");
	}

}
