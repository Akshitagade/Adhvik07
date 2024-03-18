package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.AbstractMethods;

public class Verifycartafterlogin extends AbstractMethods {
	WebDriver driver;
	public Logindetailspage lp;

	public Verifycartafterlogin(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@href='/view_cart']")
    WebElement cartbtn;
	
	public void cartafterlogin() throws InterruptedException {
		implicitlywaitmethod();
		
		Searchproduct spr = new Searchproduct(driver);
		spr.productsearchbox();
		Addproduct ap = new Addproduct(driver);
		ap.addproductincart();
		Logindetailspage lp = new Logindetailspage(driver);
		lp.logindetailspage();
		cartbtn.click();
		System.out.println("products are visible in cart after login as well");
	}
}
