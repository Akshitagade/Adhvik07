package pageelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.AbstractMethods;

public class Register extends AbstractMethods {
	WebDriver driver;

	public Register(WebDriver driverhere) {
		super(driverhere);
		this.driver = driverhere;
		PageFactory.initElements(driver, this);

	}
	public void LaunchBrowser(){
		driver.get("https://automationexercise.com/login");
		driver.manage().window().maximize();
	}
@FindBy(partialLinkText = "Signup/Login")
WebElement Sign;
@FindBy(xpath="//input[@name='name']")
WebElement names;
@FindBy(xpath="//input[@data-qa='signup-email']")
WebElement mail;
@FindBy(xpath="//button[@data-qa='signup-button']")
WebElement signup;
@FindBy(xpath="//input[@value='Mrs']")
WebElement Mrs;
@FindBy(xpath="//input[@id='password']")
WebElement key;
@FindBy(xpath="//select[@name='days']")
WebElement day;
@FindBy(xpath="//select[@name='months']")
WebElement months;
@FindBy(xpath="//select[@name='years']")
WebElement years;
@FindBy(xpath="//input[@id='newsletter']")
WebElement Signupforournewsletter;
@FindBy(xpath="//input[@id='optin']")
WebElement Receivespecialoffersfromourpartners;
@FindBy(xpath="//input[@name='first_name']")
WebElement firstname;
@FindBy(xpath="//input[@name='last_name']")
WebElement lastname;
@FindBy(xpath="//input[@name='company']")
WebElement company;
@FindBy(xpath="/input[@id='address1']")
WebElement address;

@FindBy(xpath="//input[@id='state']")
WebElement state;
@FindBy(xpath="//input[@id='city']")
WebElement city;
@FindBy(xpath="//input[@id='zipcode']")
WebElement zipcode;
@FindBy(xpath="//input[@id='mobile_number']")
WebElement mobilenumber;
@FindBy(xpath="//button[@data-qa='create-account']")
WebElement createaccount;
@FindBy(xpath="//a[contains(text(),'Continue')]")
WebElement go;
@FindBy(partialLinkText="Delete Accou")
WebElement deleteaccount;
@FindBy(partialLinkText="Contin")
WebElement move;

public void entersigindetails(String name, String email, String pass) throws InterruptedException {
	
implicitywaitmethod();
Sign.click();
names.sendKeys(name);
mail.sendKeys(email);
signup.click();
Thread.sleep(1000);
Mrs.click();
key.sendKeys(pass);
Signupforournewsletter.click();
Receivespecialoffersfromourpartners.click();
firstname.sendKeys("Adhvik");
lastname.sendKeys("Krishnapuram");
company.sendKeys("Virtusa");
address.sendKeys("Mehdipatnam");
Select s1 = new Select(day);
s1.selectByValue("6");
Select s2  = new Select(months);
s2.selectByIndex(11);
Select s3 = new Select(years);
s3.selectByVisibleText("2020");
state.sendKeys("Telangana");
city.sendKeys("Hyderabad");
zipcode.sendKeys("500008");
mobilenumber.sendKeys("7842675366");
createaccount.click();
deleteaccount.click();

}
private void implicitywaitmethod() {
	// TODO Auto-generated method stub
	
}
public void register() {
	// TODO Auto-generated method stub
	
}
public void logout() {
	// TODO Auto-generated method stub
	
}
}

