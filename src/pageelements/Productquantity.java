package pageelements;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Productquantity extends AbstractMethods {
	WebDriver driver;

	public Productquantity(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;
	
	@FindBy(xpath = "//a[@href='/product_details/1']")
	WebElement viewproduct;
	
	@FindBy(xpath = "//input[@type='number']")
	WebElement Increaseqnty;
	
	@FindBy(xpath = "//button[@type='button']")
	WebElement addtocart;

	@FindBy(xpath="(//a[@href='/view_cart'])[2]")
	WebElement viewcart;
	
	public void quantity() {
		implicitlywaitmethod();
		products.click();
		viewproduct.click();
		System.out.println("Verify product detail is opened");
		Increaseqnty.sendKeys(Keys.CONTROL + "a");
		Increaseqnty.sendKeys(Keys.DELETE);
		Increaseqnty.sendKeys("5");
		addtocart.click();
		viewcart.click();
		System.out.println("Verify that product is displayed in cart page with exact quantity");
		
		
	}
}
