package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Searchproduct extends AbstractMethods {
	WebDriver driver;

	public Searchproduct(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;
	
	@FindBy(xpath = "//input[@type='text']")
	WebElement searchproduct;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement searchbtn;
	
	public void productsearchbox() {
		implicitlywaitmethod();
		products.click();
		System.out.println("Verify user is navigated to ALL PRODUCTS page successfully");
		searchproduct.sendKeys("Women");
		searchbtn.click();
		System.out.println("Verify 'SEARCHED PRODUCTS' is visible");
	}

}
