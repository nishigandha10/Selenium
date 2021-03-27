package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo 
{
	
	
	@Test
	public void m()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  
		  driver.get("");
		  
		Alert alt=  driver.switchTo().alert();

			
		 
	}
	


}
