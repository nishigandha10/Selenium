package screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CropScreenShot {
	
	
	
	@Test
	public void m() throws IOException
	{
		//set the location of chrome browser
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
        // Initialize browser
        WebDriver driver = new ChromeDriver();
        
        //navigate to url
        driver.get("https://demoqa.com");
        
        // Locate the element on the web page
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/header/a/img"));
        
        // Get screenshot of the visible part of the web page
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        // Convert the screenshot into BufferedImage
        BufferedImage fullScreen = ImageIO.read(screenshot);
        
        //Find location of the webelement logo on the page
        Point location = logo.getLocation();
        
        //Find width and height of the located element logo
        int width = logo.getSize().getWidth();
        int height = logo.getSize().getHeight();
 
 //cropping the full image to get only the logo screenshot
        BufferedImage logoImage = fullScreen.getSubimage(location.getX(), location.getY(),
                width, height);
        ImageIO.write(logoImage, "png", screenshot);
        
        //Save cropped Image at destination location physically.
        FileUtils.copyFile(screenshot, new File("D:\\projectScreenshots\\particularElementScreenshot.PNG"));
 
        driver.quit();
    }
	}


