package windowHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Window {
	

	@Test
	public void m()
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://naukri.com/");
		
		String parent=driver.getWindowHandle();
		
	Set<String>	child=driver.getWindowHandles();
	

	Iterator<String> win=child.iterator();
	
	while(win.hasNext())
	{
		String chidwin=win.next();
		if(!chidwin.equals(parent))
		{
			driver.switchTo().window(chidwin);
			System.out.println(driver.getTitle());
			driver.close();
			
		}
	}
	driver.switchTo().window(parent);
	System.out.println(driver.getTitle());
	driver.quit();
	System.out.println(driver.getTitle());
		
	}

}
