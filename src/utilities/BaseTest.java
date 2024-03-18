package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	WebDriver driver;
	 @BeforeTest
	public void Launch()
	{
		driver = new ChromeDriver();
		
	}
@AfterTest
public void Close() {
	driver.quit();}

}
