package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Addressdetails extends AbstractMethods {
	WebDriver driver;

	public Addressdetails(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	WebElement checkout;
	
	@FindBy(xpath = "//a[@href='/delete_account']")
	WebElement deleteaccount;
	
	@FindBy(xpath = "(//a[@href='/'])[3]")
	WebElement continuebtn;

	public void addressdetails() {
		implicitlywaitmethod();
		Beforecheckout bc = new Beforecheckout(driver);
		bc.beforecheckout();
		checkout.click();
		System.out.println("Deliver and Billing Address are same in registration of account");
		deleteaccount.click();
		continuebtn.click();
	}
}
