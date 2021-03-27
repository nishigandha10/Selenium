package StaleElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver(); 
		  driver.manage().window().maximize();
		  
	
		  //driver.get("https://www.facebook.com/");
		  driver.navigate().to("https://www.facebook.com/");
		WebElement ele=  driver.findElement(By.name("email"));
	
		ele.sendKeys("hjsdghjg");
		  driver.navigate().refresh();
			  ele.sendKeys("lllllll");
	}

}
