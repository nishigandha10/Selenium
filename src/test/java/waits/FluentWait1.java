package waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.common.base.Predicate;

public class FluentWait1 {

	
	
	/* @Test public void m() 
	  {
		  
		 // WebDriverManager.chromedriver().setup();
		  
		  System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
			 
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
	  
	  }*/
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 @Test public void m1() 
	  {
		  
		 // WebDriverManager.chromedriver().setup();
		  
		  System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
			 
		   WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize(); 
	  //driver.manage().deleteAllCookies(); 
	  driver.get("http://avinashpandeblogsonseleniumautomation.blogspot.com/2018/06/spinner-to-handle-in-selenium.html");
	  
	  driver.findElement(By.id("showspinner")).click();
	  
	  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
	  wait.withTimeout(Duration.ofSeconds(10));
	  wait.pollingEvery(Duration.ofMillis(250));
	  wait.ignoring(org.openqa.selenium.NoSuchElementException.class);
	  
	 Function<WebDriver, Boolean> fun=new Function<WebDriver, Boolean>() {
		
		@Override
		public Boolean apply(WebDriver d) {
			System.out.println(System.currentTimeMillis()); 
			  WebElement element = d.findElement(By.tagName("table"));
			  String str = element.getAttribute("style"); 
			  System.out.println(str);
		  
		  if(element!=null && str.contains("visibility: visible"))
		  {
			  return true; 
			  }
		  return false; 
		  } 
	};
	
	
	 Boolean flag=wait.until(fun);
	  
	  
	  if(flag==true)
	  {
		  driver.findElement(By.xpath("//td/input")).click();
		  }
	  }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	/* @Test public void m2() 
	  {
		  
		 // WebDriverManager.chromedriver().setup();
		  
		  System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
			 
		   WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize(); 
	  //driver.manage().deleteAllCookies(); 
	  driver.get("http://avinashpandeblogsonseleniumautomation.blogspot.com/2018/06/spinner-to-handle-in-selenium.html");
	  
	  driver.findElement(By.id("showspinner")).click();
	  
	  FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
	  wait.withTimeout(Duration.ofSeconds(10));
	  wait.pollingEvery(Duration.ofMillis(250));
	  wait.ignoring(org.openqa.selenium.NoSuchElementException.class);
	  
	  
	  
	  
	  Predicate<WebDriver> pre=new Predicate<WebDriver>() {
		
		@Override
		public boolean apply(WebDriver d) {
			System.out.println(System.currentTimeMillis()); 
			  WebElement element = d.findElement(By.tagName("table"));
			  String str = element.getAttribute("style"); 
			  System.out.println(str);
		  
		  if(element!=null && str.contains("visibility: visible"))
		  {
			  return true; 
			  }
		  return false; 
		  } 
	};
	 
	
	 Boolean flag=wait.until(pre);
	  
	  
	  if(flag==true)
	  {
		  driver.findElement(By.xpath("//td/input")).click();
		  }
	  }*/

	 
	 
	 
	 
	 
	}
