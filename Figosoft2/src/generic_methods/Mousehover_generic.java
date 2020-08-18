package generic_methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mousehover_generic 
{
//	1
	public void mouse_hover(WebDriver driver,WebElement we)
	{
	Actions act=new Actions(driver);
	act.moveToElement(we).perform();
	}
//	2
	public void rightclick(WebDriver driver,WebElement we)
	{
	Actions act=new Actions(driver);
	act.contextClick(we).perform();
	}
//	3
	public void doubleclick(WebDriver driver,WebElement we)
	{
	Actions act=new Actions(driver);
	act.contextClick(we).perform();
	}
//	4
	public void dragdrop(WebDriver driver,WebElement we,WebElement wh)
	{
	Actions act=new Actions(driver);
	act.dragAndDrop(we, wh).perform();
	}
//	5
	public void righttab(WebDriver driver,WebElement we) throws AWTException
	{
	Actions act=new Actions(driver);
	act.contextClick(we).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
	r.keyRelease(KeyEvent.VK_T);
	}
//	6
	public void rightwin(WebDriver driver,WebElement we) throws AWTException
	{
	Actions act=new Actions(driver);
	act.contextClick(we).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_W);
	r.keyRelease(KeyEvent.VK_W);
	}
//	7
	public void rightpwin(WebDriver driver,WebElement we) throws AWTException
	{
	Actions act=new Actions(driver);
	act.contextClick(we).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_P);
	r.keyRelease(KeyEvent.VK_P);
	}

}
