package generic_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic1 {
	public WebDriver driver;
	public String pid;
	public Actions act;
	@BeforeMethod
	public void disp()
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
//		driver.getWindowHandle();
		
	}

	@AfterMethod
	public void sample() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
	}

}
