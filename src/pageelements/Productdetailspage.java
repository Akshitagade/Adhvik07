package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Productdetailspage extends AbstractMethods {
	WebDriver driver;

	public Productdetailspage(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;
	
	@FindBy(xpath = "//a[@href='/product_details/1']")
	WebElement product_details;
	
	public void productdetails() {
		implicitlywaitmethod();
		products.click();
		System.out.println("Verify user is navigated to ALL PRODUCTS page successfully");
		WebElement E1 = driver.findElement(By.xpath("/html/body/section[2]/div[1]/div/div[1]/div[1]/div[3]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", E1);
		product_details.click();
		System.out.println("All productdetails are successfully visible");
	}
}


