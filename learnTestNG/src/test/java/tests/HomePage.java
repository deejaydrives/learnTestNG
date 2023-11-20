package tests;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.DriverInstance;

public class HomePage {
	@Test
	public void HomePageTitleVerification() {
		DriverInstance.driver.get("https://www.google.com");
		//System.out.println("Hellossssssssss");
		Assert.assertTrue(true);
	}

	@BeforeSuite
	@Parameters({ "browserName" })
	public void beforeTest(String browserName) {
		DriverInstance.initInstance(browserName);
	}

	@AfterSuite
	public void afterTest() {
		DriverInstance.driver.quit();
	}

}
