package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 
{
	
	@Test
	public void m()
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver(); 
	
		  driver.manage().window().maximize();
		  driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		 // Navigate to the demoqa website
		//navigate to url
	        driver.get("https://demoqa.com");
	        
	        // Locate the element on the web page
	        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
	        
	        // Get screenshot of the visible part of the web page
	        
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	           
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            FileUtils.copyFile(screenshot, new File("D:\\projectScreenshots\\homePageScreenshot1.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        //closing the webdriver
	        driver.close();
		
	}
	@Test
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  
		 // Navigate to the demoqa website
		 driver.get("https://www.google.com");
		 
		//Take the screenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            FileHandler.copy(screenshot, new File("D:\\projectScreenshots\\homePageScreenshot1.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        //closing the webdriver
	        driver.close();
		
	}
	
	
	@Test
	public void m2()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  
		 // Navigate to the demoqa website
		 driver.get("https://www.google.com");
		 
		//Take the screenshot
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            FileHandler.copy(screenshot, new File(".projectScreenshots\\homePageScreenshot1.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	        
	        //closing the webdriver
	        driver.close();
		
	}
	
	
	

}
