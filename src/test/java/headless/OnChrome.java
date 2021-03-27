package headless;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OnChrome 


{
	
	@Test
	public void m()
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		ChromeOptions options =new ChromeOptions();
		options.addArguments("headless");
		
		  WebDriver driver = new ChromeDriver(options); 
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://toolsqa.com/iframe-practice-page/");
		  
		  
		  
		  // Get screenshot of the visible part of the web page
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	           
	        //Copy the file to a location and use try catch block to handle exception
	        try {
	            FileUtils.copyFile(screenshot, new File("D:\\projectScreenshots\\headless.png"));
	        } catch (IOException e) {
	            System.out.println(e.getMessage());
	        }
	       

			//By executing a java script
			JavascriptExecutor exe = (JavascriptExecutor) driver;
			Integer numberOfFrames = Integer.parseInt(exe.executeScript("return window.length").toString());
			System.out.println("Number of iframes on the page are " + numberOfFrames);
			System.out.println("Hiiii");
		
	}

}
