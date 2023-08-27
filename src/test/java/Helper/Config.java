package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {
	public static WebDriver driver;
	
	public static void confChrome() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver.exe");
		
	}
	
	public static void attend(long s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
	public static void maximalwind() {
		driver.manage().window().maximize();
	}
	

}
