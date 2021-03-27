package scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demo2 {

	@Test
	public void m()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.id("pageFooter"));

		JavascriptExecutor js=(JavascriptExecutor) driver;

		// js.executeScript("document.getElementById('pageFooter').scrollIntoView(true);");
		
		//js.executeScript("arguments[0].scrollIntoView();",ele);
		
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

	}

}
