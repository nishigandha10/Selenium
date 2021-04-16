package handleTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	
		@Test
		public void m() throws Exception
		{
			 WebDriverManager.chromedriver().browserVersion("89.0.4389.90").setup();
			
			System.out.println("hiiiiiiiiiiii");
				 
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.demoqa.com/webtables");
			
			List<WebElement> ele=driver.findElements(By.xpath("//div[@role='columnheader']"));
			
			for (WebElement e : ele) {
				
				System.out.print(e.getText()+"  ");
				
			}
			//System.out.println();
			
List<WebElement> ele1=driver.findElements(By.xpath("//div[@role='rowgroup']"));
			
			for (WebElement e : ele1) {
				
				System.out.print(e.getText()+"  ");
				
			}
			Thread.sleep(5000);
			driver.close();
		}
	}


