package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {

	
	
	@Test
	public void m()
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.worldometers.info/");
		
		
		
		System.out.print(driver.findElement(By.className("counter-item")).getText());
		System.out.println("  "+driver.findElement(By.className("counter-number")).getText());
		
	//	System.out.println(driver.findElement(By.xpath("//div[@data-parent='#c3']")).getText());
		
		System.out.print(driver.findElement(By.xpath("//div[@data-parent='#c3']/child::span[2]")).getText());
	
    	System.out.println(" "+driver.findElement(By.xpath("//div[@data-parent='#c3']/child::span[1]")).getText());

	
	
	
			while(true)
			{
				System.out.print(driver.findElement(By.className("counter-item")).getText());
				System.out.println("  "+driver.findElement(By.className("counter-number")).getText());
				
			//	System.out.println(driver.findElement(By.xpath("//div[@data-parent='#c3']")).getText());
				
				System.out.print(driver.findElement(By.xpath("//div[@data-parent='#c3']/child::span[2]")).getText());
			
		    	System.out.println(" "+driver.findElement(By.xpath("//div[@data-parent='#c3']/child::span[1]")).getText());
}
			
	}
}
