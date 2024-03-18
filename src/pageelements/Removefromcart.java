package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Removefromcart extends AbstractMethods {
	WebDriver driver;
	public Register rg;

	public Removefromcart(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
//	@FindBy(xpath = "//a[@href='/view_cart']")
//	WebElement cartbtn;

	@FindBy(xpath = "(//td[@class='cart_delete'])[1]")
	WebElement btn;

	public void removecart() {
		Addproduct ap = new Addproduct(driver);
		ap.addcart();
		ap.addproductincart();
//		cartbtn.click();
		System.out.println("Verify that cart page is displayed");
		btn.click();
		System.out.println("Verify that product is removed from the cart");
	}

}
