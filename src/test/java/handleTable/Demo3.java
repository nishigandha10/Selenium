package handleTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo3 {

	@Test
	public void test()
	{

		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();

		driver.get("https://www.moneycontrol.com/stocks/marketinfo/marketcap/nse/index.html");

		List<WebElement>list=driver.findElements(By.xpath("//tr[@class='bggry']"));
		for (WebElement ele : list) 
		{

			List<WebElement> data=ele.findElements(By.tagName("td"));
			
			System.out.println(data.size());


		}
	}

}
