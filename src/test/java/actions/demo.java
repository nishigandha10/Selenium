package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.managers.SeleniumServerStandaloneManager;

public class demo
{

	@Test
	public void m()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");
		  ChromeOptions option=new ChromeOptions();
		  option.addArguments("--disable-infobars");
		  WebDriver driver = new ChromeDriver(option); 
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://toolsqa.com/iframe-practice-page/");

		  Actions a=new Actions(driver);
		  
		 
		  WebElement ele=driver.findElement(By.cssSelector("#the7-search"));
		  
		 a.moveToElement(ele).click().perform();
		 
		  
		 Action ac=a.moveToElement(ele).click().build();
		 
		 ac.perform();
		 
	}
}
