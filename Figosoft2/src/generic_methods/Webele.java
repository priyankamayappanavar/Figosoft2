package generic_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

public class Webele 
{
//	1
public void text(WebElement ele)
{
	String tex = ele.getText();
	System.out.println(tex);
}
//2
public void att(WebElement ele,String value)
{
	String attr = ele.getAttribute(value);
	System.out.println(attr);
}
//3
public void css(WebElement ele,String val)
{
	String getcss = ele.getCssValue(val);
	System.out.println(getcss);
}
//4
public void tag(WebElement ele,String val)
{
	String gettag= ele.getTagName();
	System.out.println(gettag);
}
//5
public void loc(WebElement ele)
{
	Point getloc = ele.getLocation();
	System.out.println(getloc);
}
//6
public void clear(WebElement ele)
{
 ele.clear();
}
//7
public void click(WebElement ele)
{
 ele.click();
}
//8
public void sub(WebElement ele)
{
 ele.submit();
}
//9
public boolean dis(WebElement ele)
{
 boolean boo = ele.isDisplayed();
 return boo;
}
//10
public boolean ena(WebElement ele)
{
 boolean bool = ele.isEnabled();
 return bool;
}
//11
public boolean sel(WebElement ele)
{
 boolean b = ele.isSelected();
 return b;
}
//12
public void si(WebElement ele)
{
 ele.getSize();
}
public void si(WebElement ele,String hi)
{
 ele.sendKeys(hi);
}




}
