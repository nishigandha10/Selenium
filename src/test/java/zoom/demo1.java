package zoom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo1 {
	
	
	@Test
	public void m()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  
		 // Navigate to the demoqa website
		//navigate to url
	        driver.get("https://demoqa.com");
	  
	        JavascriptExecutor executor = (JavascriptExecutor)driver;
	        executor.executeScript("document.body.style.zoom = '1.5'");
	        
	       
	}

}
