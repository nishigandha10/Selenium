 package browserStack;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.CommandExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class demo1 {

	
	public static final String USERNAME = "nishigandhasawan1";
	public static final String AUTOMATE_KEY = "ErzyiJrHpHutnitgJ8eR";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	public static void main(String[] args) throws Exception {
		DesiredCapabilities caps = new DesiredCapabilities();
        
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "10");
		caps.setCapability("browser", "Chrome");
		caps.setCapability("browser_version", "80");
		caps.setCapability("name", "nishigandhasawan1's First Test");

		WebDriver driver = new RemoteWebDriver( new  java.net.URL(URL), caps);
	driver.get("http://www.google.com");
	WebElement element = driver.findElement(By.name("q"));
	 
	element.sendKeys("BrowserStack");
	element.submit();
	 
	System.out.println(driver.getTitle());
	driver.quit();
	
}
}
