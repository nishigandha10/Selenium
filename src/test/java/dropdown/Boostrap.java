package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Boostrap {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().driverVersion("87.0.4280.141").setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.findElement(By.cssSelector("#menu1")).click();
		List<WebElement> ele=driver.findElements(By.className("dropdown-menu"));
		
		System.out.println(ele.size());
		for (WebElement webElement : ele) {
			
			System.out.println(webElement.getText());
			
		}
		
		
	}

}
