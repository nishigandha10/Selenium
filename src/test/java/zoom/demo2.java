package zoom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo2 {
	
	
	@Test
	public void m() throws AWTException
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  
		 // Navigate to the demoqa website
		//navigate to url
	        driver.get("https://demoqa.com");
	  
	        Robot robot = new Robot();
	        
	        
	        for(int i=0;i<10;i++)
	        {
	        	robot.keyPress(KeyEvent.VK_CONTROL);
	        	robot.keyPress(KeyEvent.VK_EQUALS);
	        	robot.keyRelease(KeyEvent.VK_CONTROL);
	        	robot.keyRelease(KeyEvent.VK_EQUALS);
	        }
	        
		/*
		 * for(int i=0;i<10;i++) { robot.keyPress(KeyEvent.VK_CONTROL);
		 * robot.keyPress(KeyEvent.VK_MINUS); robot.keyRelease(KeyEvent.VK_CONTROL);
		 * robot.keyRelease(KeyEvent.VK_MINUS); }
		 */	}

}
