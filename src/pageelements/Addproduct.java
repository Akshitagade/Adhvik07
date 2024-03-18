package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Addproduct  extends AbstractMethods {
	WebDriver driver;

	public Addproduct(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='/products']")
	WebElement products;

	@FindBy(xpath = "/html/body/section[2]/div[1]/div/div[2]/div/div[2]/div/div[1]/div[1]/a")
	WebElement firstproduct;

	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[2]")
	WebElement addtocart1;

	@FindBy(xpath = "//button[text()='Continue Shopping']")
	WebElement continueshopping;

	@FindBy(xpath = "(//div[@class='productinfo text-center'])[3]")
	WebElement secondproduct;

	@FindBy(xpath = "(//a[@class='btn btn-default add-to-cart'])[6]")
	WebElement cartbtn2;

	@FindBy(xpath = "(//a[@href='/view_cart'])[2]")
	WebElement viewcart;

	public void addcart() {
		implicitlywaitmethod();
		products.click();
	}

	public void addproductincart() {
		
		 Actions actions = new Actions(driver);
		 actions.moveToElement(firstproduct).perform();
		 addtocart1.click();
		 continueshopping.click();
		 actions.moveToElement(secondproduct).perform();
		 cartbtn2.click();
		 viewcart.click();
		System.out.println("Verify their prices, quantity and total price");
	}

}



