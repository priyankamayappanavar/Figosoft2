package scripts;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import generic_methods.Auto_constant;
import pom.Mahi;
import pom.Mahi2;
import pom.Rating;

public class Mahindra implements Auto_constant
{
	public WebDriver driver;
	@BeforeMethod
	public void open() throws InterruptedException
	{
		Thread.sleep(3000);
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tripadvisor.in/");
	}
	
	@Test
	public void test() throws InterruptedException
         {
		Thread.sleep(3000);
       	Mahi mahe = new Mahi(driver);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='Search']")));
         Thread.sleep(3000);
		mahe.box("Club Mahindra");
		
		Set<String> allwh = driver.getWindowHandles();
		Iterator<String> allitr = allwh.iterator();
		String parent = allitr.next();
		String child = allitr.next();
		driver.switchTo().window(child);
		
         Mahi2 mahen = new Mahi2(driver);
         mahen.spaa();
         Set<String> handle = driver.getWindowHandles();
         Iterator<String> iterate= handle.iterator();
         String parent2 = iterate.next();
       String ch = iterate.next();  
        String child2 = iterate.next();
      driver.switchTo().window(child2);
      
         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//input[@type='text']")).sendKeys("super");
         
         Thread.sleep(3000);
         Rating ra=new Rating(driver);
         ra.rates(driver);
         ra.servises(driver);
		}      
	}


