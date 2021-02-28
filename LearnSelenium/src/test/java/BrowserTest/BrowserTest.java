package BrowserTest;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BrowserTest {
	@Test
	public void BrowserTest(){
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.out.println(" ");
		
		System.setProperty("webdriver.chrome.driver", "/Users/nlibu/OneDrive/Documents/Selenium/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
	}

}
