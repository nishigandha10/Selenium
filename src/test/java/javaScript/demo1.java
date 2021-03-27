package javaScript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo1 {
	
	
	
	@Test
	public void m()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  
		  driver.get("https://toolsqa.com/iframe-practice-page/");

		
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		 // js.executeScript("alert('hello world');");
		 
		  js.executeScript("history.go(0)");
		 String s= js.executeScript("return document.title;").toString();
	
	System.out.println("text="+s);
	}

}
