package screenshot;

import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElementScreenShot {
	
	@Test
	public void m()
	
	{
		//set the location of chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		 
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        
        //navigate to url
        driver.get("https://demoqa.com");
        
        
        // Locate the web element
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        
      
        // capture screenshot with getScreenshotAs() of the WebElement class
        File f = logo.getScreenshotAs(OutputType.FILE);
        
        try {
			FileUtils.copyFile(f, new File("D:\\projectScreenshots\\logoScreeshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.close();
	}
}
