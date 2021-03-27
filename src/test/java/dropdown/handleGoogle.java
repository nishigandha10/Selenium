package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleGoogle {
	
	@Test
	public void m() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("IBM");
		Thread.sleep(5000);
		
//	List<WebElement> list=driver.findElements(By.xpath("//div[@class='sbl1']/span"));
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='erkvQe']/li"));
	System.out.println(list.size());
	
	for (WebElement ele : list) {
		System.out.println(ele.getText());
		
	}
		driver.close();		
	}

}
