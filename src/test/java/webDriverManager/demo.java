package webDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo {
	
	
	
	@Test
	public void m()
	{
		// ChromeOptions chromeOptions = new ChromeOptions();
		// WebDriverManager.chromedriver().driverVersion("87.0.4280.141").setup();
		 
		 WebDriverManager.chromedriver().browserVersion("87.0.4280.141").setup();
		 
		 WebDriver driver = new ChromeDriver();
		 
		 // Navigate to the demoqa website
		 driver.get("https://www.demoqa.com");
		 
		 driver.quit();
	}

}
