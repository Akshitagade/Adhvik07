package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Scrollupwithoutarrow extends AbstractMethods {
	WebDriver driver;

	public Scrollupwithoutarrow(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//footer[@id = 'footer']")
    WebElement scrolldown;
	
	public void withoutarrow() {
		implicitlywaitmethod();
		scrolldown.click();
		System.out.println("Verify text 'SUBSCRIPTION'");
		WebElement E1 = driver.findElement(By.xpath("//div[@class='header-middle']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", E1);
		System.out.println("Automation Engineers' text is visible on screen");
		
	}
}
