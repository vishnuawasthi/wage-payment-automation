package com.app.wagepayment.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.app.wagepayment.config.CrossBrowserConfig;

public class AddClientConfigurationTest {

	WebDriver webDriver;

	CrossBrowserConfig browserConfig = new CrossBrowserConfig();

	private Properties props;

	@BeforeMethod
	public void init() {
		webDriver = browserConfig.lunchChromeDriver();
		props = browserConfig.getConfigFileReader().getProperties();
		System.out.println("init called");
	}

	@Test
	public void testAddClientConfig() {
		String url = props.getProperty("wagepayment.add-config.url");
		webDriver.get(url);
		String title = webDriver.getTitle();
	}

	@AfterTest
	public void closeBrowser() {
		webDriver.close();
	}

}
