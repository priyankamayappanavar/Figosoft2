package generic_methods;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_generic
{
//	1
	public void SelectIndex(WebElement ele,int i)
	{
          Select s=new Select(ele);
          s.selectByIndex(i);
	}
//	2
	public void SelectByvalue(WebElement ele,String value)
	{
          Select s=new Select(ele);
          s.selectByValue(value);
	}
//	3
	public void SelectByvisibletext(WebElement ele,String text)
	{
          Select s=new Select(ele);
          s.selectByVisibleText(text);
	}
//	4
	public void deselectAll(WebElement ele)
	{
          Select s=new Select(ele);
          s.deselectAll();
	}
//	5
	public void deselectByIndex(WebElement ele,int i)
	{
          Select s=new Select(ele);
          s.deselectByIndex(i);
	}
//	6
	public void deselectByvalue(WebElement ele,String value)
	{
          Select s=new Select(ele);
          s.deselectByValue(value);
	}
//	7
	public void deselctByvisibletext(WebElement ele,String text)
	{
          Select s=new Select(ele);
          s.deselectByVisibleText(text);
	}
//	8
	public void isMultiple(WebElement ele)
	{
          Select s=new Select(ele);
          boolean bool = s.isMultiple();
	}
//	9
	public int Options_size(WebElement ele)
	{
          Select s=new Select(ele);
          List<WebElement> options = s.getOptions();
          int count = options.size();
          System.out.println(count);
          return count;
	}
//	10
	public void Options_text(WebElement ele)
	{
          Select s=new Select(ele);
          List<WebElement> options = s.getOptions();
          for(WebElement we:options)
          {
        	  String text = we.getText();
        	  System.out.println(text);
          }
	}
//	11
	public void alloptions(WebElement ele)
	{
          Select s=new Select(ele);
         List<WebElement> allopt = s.getAllSelectedOptions();
         int count1 = allopt.size();
         System.out.println(count1);
         
          for(WebElement wh:allopt)
          {
        	 String te = wh.getText();
        	 System.out.println(te);
          }
	}
//	12
	public void firstoptions(WebElement ele)
	{
          Select s=new Select(ele);
  WebElement fisopt = s.getFirstSelectedOption();
         String text = fisopt.getText();
         System.out.println(text);
	}
	
	
}
