package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mahi 
{
          @FindBy(xpath="//div[@title='Search']")
            private WebElement sear;
          
          @FindBy(id="mainSearch")
          private WebElement butt;
          
          @FindBy(xpath="//div[.='Search']")
          private WebElement button;
          
          
          @FindBy(xpath="//span[.='Club Mahindra Madikeri, Coorg']")
          private WebElement result;
          
          public Mahi(WebDriver driver)
          {
        	 PageFactory.initElements(driver, this); 
          }
          
          public void box(String text)
     	 {
        	  sear.click(); 
        	  butt.sendKeys(text);
        	  button.click();
        	  result.click();
     	 }
          
         
}
