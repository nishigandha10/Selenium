package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explicitWait {
	
	
	
	/*
	 * @Test public void m() throws InterruptedException {
	 * System.setProperty("webdriver.chrome.driver",
	 * "D:\\Nishigandha\\New folder\\chromedriver.exe"); WebDriver driver = new
	 * ChromeDriver(); driver.manage().window().maximize();
	 * driver.manage().deleteAllCookies();
	 * 
	 * driver.get(
	 * "http://avinashpandeblogsonseleniumautomation.blogspot.com/2018/06/spinner-to-handle-in-selenium.html"
	 * ); driver.findElement(By.id("showspinner")).click(); WebDriverWait wait=new
	 * WebDriverWait(driver, 10); System.out.println(System.currentTimeMillis());
	 * WebElement
	 * ele=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
	 * "//td/input"))); //driver.findElement(By.xpath("//td/input")).click();
	 * System.out.println(System.currentTimeMillis()); ele.click();
	 * Thread.sleep(5000); driver.close(); }
	 * 
	 */
	
	
	
	
	  @Test public void m() {
	  
	  // WebDriverManager.chromedriver().setup();
	  
	  System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
	  
	  WebDriver driver = new ChromeDriver(); driver.manage().window().maximize();
	  //driver.manage().deleteAllCookies();
	  driver.get("http://avinashpandeblogsonseleniumautomation.blogspot.com/2018/06/spinner-to-handle-in-selenium.html"
	  );
	  
	  driver.findElement(By.id("showspinner")).click();
	  
	  
	  
	  WebDriverWait wait=new WebDriverWait(driver, 10);
	  
	  Function<WebDriver, Boolean> fun=new Function<WebDriver, Boolean>() {
	  
	  @Override public Boolean apply(WebDriver d) {
	 
		  
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
	  
	 

}
