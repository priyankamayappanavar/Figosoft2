package generic_methods;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiscreenshot {

	public static void getPhoto(WebDriver driver) throws IOException 
	{
		String photo="./photos/";
		Date d=new Date();
		String d2=d.toString();
		String date = d2.replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(photo+date+".jpeg");
		FileUtils.copyFile(src, dst);
	}
	
	public static void main (String[] args) throws IOException
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		getPhoto(driver);
		driver.get("https://www.gmail.com/");
		getPhoto(driver);
	}

}
