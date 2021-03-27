package iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NumberOfIframes



{
	
	@Test
	public void m()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  
		 
		  
		  driver.get("https://toolsqa.com/iframe-practice-page/");

		List<WebElement> list=  driver.findElements(By.xpath("//iframe"));
		
		  System.out.println(list.size());
			//By executing a java script
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
			System.out.println("Number of iframes on the page are " + numberOfFrames);

		 
	}
	
	
	
	
	
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  
		  driver.get("https://toolsqa.com/iframe-practice-page/");

		  List<WebElement> iframeElements = driver.findElements(By.tagName("iframe"));
			System.out.println("The total number of iframes are " + iframeElements.size());	
			
			}


}
