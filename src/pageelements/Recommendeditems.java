package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Recommendeditems extends AbstractMethods {
	WebDriver driver;

	public Recommendeditems(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[@class='footer-widget']")
	WebElement scrolldown;
	
	@FindBy(xpath="(//a[@data-product-id='4'])[3]")
	WebElement addcart;
	
	@FindBy(xpath="(//a[@href='/view_cart'])[2]")
	WebElement viewcart;

	public void items() {
		
		implicitlywaitmethod();
		
		scrolldown.click();
		System.out.println("'RECOMMENDED ITEMS' are visible");
		addcart.click();
		viewcart.click();
		System.out.println("product is displayed in cart page");
	}
}
