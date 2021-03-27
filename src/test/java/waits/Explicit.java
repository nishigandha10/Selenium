package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Explicit {
	
	
	
	  @Test 
	  public void m() throws InterruptedException 
	  {
		  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver(); 
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  
	  driver.get("http://avinashpandeblogsonseleniumautomation.blogspot.com/2018/06/spinner-to-handle-in-selenium.html");
	  driver.findElement(By.id("showspinner")).click();
	 
	  WebDriverWait wait=new WebDriverWait(driver, 20); 
	  
	  System.out.println(System.currentTimeMillis());
	  
	  WebElement ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td/input"))); 
	  
	  //driver.findElement(By.xpath("//td/input")).click();
	  System.out.println(System.currentTimeMillis()); 
	  ele.click();
	  Thread.sleep(5000);
	  driver.close();
	  }

}
