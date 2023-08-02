package testngSamplePkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is before method called.");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is after method called.");
  }

}
