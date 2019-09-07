package com.app.wagepayment.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.wagepayment.config.CrossBrowserConfig;

@Test(groups = "searchTestCases", suiteName = "QA")
public class ClientSearchTest {

	WebDriver webDriver;

	CrossBrowserConfig browserConfig = new CrossBrowserConfig();

	@BeforeTest
	public void init() {
		webDriver = browserConfig.lunchChromeDriver();
	}

	@Test
	public void testLogin() {

	}

	@AfterTest

	public void closeBrowser() {
		webDriver.close();

	}
}
