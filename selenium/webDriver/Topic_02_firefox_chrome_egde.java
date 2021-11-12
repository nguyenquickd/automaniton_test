package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic_02_firefox_chrome_egde {

	WebDriver driver;

	@Test
	public void TC_01_Run_On_FireFox() {
		driver = new FirefoxDriver();

		driver.get("https://wwww.facebook.com/");

//		driver.quit();
		driver.close();
	}

	@Test
	public void TC_01_Run_On_Chrome() {
		// Using relative path
		System.setProperty("webdriver.chrome.driver", ".\\browserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://wwww.facebook.com/");
//		driver.quit();
		driver.close();
	}

	@Test
	public void TC_01_Run_On_Egde() {
//		String projectFolder = System.getProperty("user.dir");

		System.setProperty("webdriver.edge.driver", ".\browserDrivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://wwww.facebook.com/");
//		driver.quit();
		driver.close();
	}
}
