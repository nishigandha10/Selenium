package simple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo11 {
	
	@Test
	public void m()
	{

		
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  
		  driver.get("https://toolsqa.com/iframe-practice-page/");
		  
		  //driver.close();
		  driver.quit();

		  System.out.println(driver.getTitle());
	}

}
