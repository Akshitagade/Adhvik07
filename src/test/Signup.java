package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageelements.Addproduct;
import pageelements.Addressdetails;
import pageelements.Addreview;
import pageelements.Beforecheckout;
import pageelements.Cartbrand;
import pageelements.Cartpage;
import pageelements.Contactusform;
import pageelements.Downloadinvoice;
import pageelements.Existingmail;
import pageelements.Loginbeforecheckout;
import pageelements.Logindetailspage;
import pageelements.Logoutuser;
import pageelements.Productdetailspage;
import pageelements.Productquantity;
import pageelements.Recommendeditems;
import pageelements.Register;
import pageelements.Registerwhilecheckout;
import pageelements.Removefromcart;
import pageelements.Scrollupusingarrow;
import pageelements.Scrollupwithoutarrow;
import pageelements.Searchproduct;
import pageelements.Signuppage;
import pageelements.Subscriptioninhomepage;
import pageelements.TC_3;
import pageelements.Testcasespage;
import pageelements.Verifycartafterlogin;
import pageelements.Viewcategory;
import utilities.ExcelUtility;

public class Signup {
	WebDriver driver;
	public Signuppage sp;
	public Register rg;
	public Logindetailspage lp;
	public TC_3 tc3;
	public Logoutuser lu;
	public Existingmail em;
	public Contactusform cu;
	public Testcasespage tp;
	public Productdetailspage pd;
	public Searchproduct spr;
	public Subscriptioninhomepage sh;
	public Cartpage cp;
	public Addproduct ap;
	public Productquantity pq;
	public Registerwhilecheckout rc;
	public Beforecheckout bc;
	public Loginbeforecheckout lc;
	public Removefromcart rfc;
	public Viewcategory vc;
	public Cartbrand cb;
	public Verifycartafterlogin vcl;
	public Addreview ar;
	public Recommendeditems ri;
	public Addressdetails ad;
	public Downloadinvoice d;
	public Scrollupwithoutarrow su;
	public Scrollupusingarrow sa;

	@BeforeTest
	public WebDriver intialisebrowser() {

		driver = new ChromeDriver();
		return driver;
	}
	@Test(priority = 1)
	public void signuppage() throws IOException, InterruptedException {
		driver = intialisebrowser();
		Thread.sleep(2000);
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		System.out.println("Home page is successfully visibled");
		ExcelUtility xs = new ExcelUtility();
		String Name = xs.Get_Username(1, 0).toString();
		String EmailAddress = xs.Get_Password(1, 1).toString();
		sp = new Signuppage(driver);
		sp.enterSignupdetails(Name, EmailAddress);
	}
	@Test(priority = 2)
	public void Registerwhilecheckout() throws IOException, InterruptedException {
		Registerwhilecheckout rc = new Registerwhilecheckout(driver);
		rc.whilecheckout();
		rc.proceedbtn();
		rc.deletebtn();
	}

	@Test(priority = 3)
	public void Beforecheckout() throws IOException, InterruptedException {
		Beforecheckout bc = new Beforecheckout(driver);
		bc.beforecheckout();
		bc.proceed();
	}

	@Test(priority = 4)
	public void Loginbeforecheckout() throws IOException, InterruptedException {
		Loginbeforecheckout lc = new Loginbeforecheckout(driver);
		lc.logincheckout();
	}
	@AfterClass
	public void closebrowser() {
		driver.quit();
	}
}