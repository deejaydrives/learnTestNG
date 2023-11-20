package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInstance {
	public static WebDriver driver;

	public static void initInstance(String driverName) {
		try {
			switch (driverName) {
			case "chrome":
				driver = new ChromeDriver();
				break;
				
			case "firefox":
				//WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
