package generic_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Webdr {
//	1
	public void cls(WebDriver driver)
	{
		driver.close();
	}
//	2
	public void cls(WebDriver driver,String value)
	{
	           driver.get("value");
	}
//	3
	public void url(WebDriver driver)
	{
	           String url = driver.getCurrentUrl();
	           System.out.println(url);
	}
//	4
	public void srcs(WebDriver driver)
	{
	           String src = driver.getPageSource();
	           System.out.println(src);
	}
//	5
	public void tit(WebDriver driver)
	{
	           String title = driver.getTitle();
	           System.out.println(title);
	}
//	6
	public void qt(WebDriver driver)
	{
	           driver.quit();
	}
//	7
	public void swt(WebDriver driver,String value)
	{
	           driver.switchTo().window(value);
	}
//	8
	public void ng(WebDriver driver)
	{
	           driver.navigate().back();
	}
//	9
	public void mng(WebDriver driver,String value)
	{
	           driver.manage().deleteAllCookies();
	}
//	10
	public void getw(WebDriver driver)
	{
	           String p_id = driver.getWindowHandle();
	        System.out.println(p_id);
	}
//	11
	public void getwis(WebDriver driver)
	{
	           Set<String> allwh = driver.getWindowHandles();
	        System.out.println(allwh);
	}
}