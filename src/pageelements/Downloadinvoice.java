package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Downloadinvoice extends AbstractMethods {
	WebDriver driver;

	public Downloadinvoice(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class='btn btn-default check_out']")
	WebElement download;
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")
	WebElement ctnbtn;

	public void download() {
		Registerwhilecheckout rc = new Registerwhilecheckout(driver);
		rc.whilecheckout();
		rc.proceedbtn();
		download.click();
		ctnbtn.click();
		rc.deletebtn();
	}
}
