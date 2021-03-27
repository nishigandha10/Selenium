package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fluent {
	
	
	
	
	 @Test 
	 public void m() 
	  {
		  
		 WebDriverManager.chromedriver().setup();
		  
		 // System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
			 
		   WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize(); 
	  //driver.manage().deleteAllCookies(); 
	  driver.get("http://avinashpandeblogsonseleniumautomation.blogspot.com/2018/06/spinner-to-handle-in-selenium.html");
	  
	  driver.findElement(By.id("showspinner")).click();
	  
	  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
	  wait.withTimeout(Duration.ofSeconds(10));
	  wait.pollingEvery(Duration.ofSeconds(1));
	  wait.ignoring(org.openqa.selenium.NoSuchElementException.class);
	  
	  System.out.println(System.currentTimeMillis());
	 WebElement ele= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td/input")));
	 System.out.println(System.currentTimeMillis());
	  ele.click();
	  
	  }
	 
	

}
