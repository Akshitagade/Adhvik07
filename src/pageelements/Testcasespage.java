package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Testcasespage extends AbstractMethods {
	WebDriver driver;

	public Testcasespage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='/test_cases']")
	WebElement testcases;
	public void testcase() {
		implicitlywaitmethod();
		testcases.click();
		System.out.println("user is navigated to test cases page successfully");
	}
}
