package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class Rating 
{
              @FindBy(xpath="//span[@id='bubble_rating']")
              private WebElement rate;
              
              @FindBy(xpath="//div[.='Hotel Ratings']")
              private WebElement rating;
              
              @FindBy(xpath="//span[@data-name='Service']")
              private WebElement service;
              
              @FindBy(name="noFraud")
              private WebElement serve;
              
              @FindBy(id="SUBMIT")
              private WebElement close;
              
              public Rating(WebDriver driver)
              {
              	PageFactory.initElements(driver, this);
              }
              
              
			public void rates(WebDriver driver)
              {
            	 Actions action=new Actions(driver);
            	 action.moveToElement(rate, 50, 0).perform();
            	 rate.click();
            	 String expected = rating.getText();
   //         	 Assert.assertEquals(expected, "Hotel Ratings");
            	 serve.click();
            	
              }
              
              public void servises(WebDriver driver)
              {
            	 Actions action=new Actions(driver);
            	 action.moveToElement(service, 50, 0);
              }
              
              
}
