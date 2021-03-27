package bootstapDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) {



		System.setProperty("webdriver.chrome.driver","D:\\Nishigandha\\New folder\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");


	
		 driver.findElement(By.xpath(".//*[@id='menu1']")).click();

	List<WebElement> list=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li/a"));
	
	for (WebElement ele : list) {
		
		
		System.out.println(ele.getText());
		if(ele.getText().equalsIgnoreCase("About us"))
		{
			ele.click();
			
		}
		
	}
	
	}
}