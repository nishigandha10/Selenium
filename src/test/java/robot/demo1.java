package robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demo1 {
	
	
	
	
public static void main(String[] args) throws InterruptedException, AWTException, IOException 
{
	System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver(); 
	  driver.manage().window().maximize();
	  
	  driver.get("https://toolsqa.com/iframe-practice-page/");
driver.findElement(By.id("the7-search")).click();
Robot r=new Robot();

r.keyPress(KeyEvent.VK_SHIFT);
r.keyPress(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_A);
r.keyRelease(KeyEvent.VK_SHIFT);

r.mousePress(InputEvent.BUTTON3_DOWN_MASK);
r.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
Thread.sleep(3000);
r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);


}

}


