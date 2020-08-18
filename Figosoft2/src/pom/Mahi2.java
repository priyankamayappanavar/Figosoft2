package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mahi2
{
	 @FindBy(xpath="//a[.='Write a review']")
     private WebElement review;
	 
	 
	 public Mahi2(WebDriver driver)
     {
   	 PageFactory.initElements(driver, this); 
     }
	 
	 public void spaa()
 	 {
		 review.click();
 	 }
	 
}
