package com.app.wagepayment.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CrossBrowserConfig {

	public ConfigFileReader configFileReader;

	public CrossBrowserConfig() {
		configFileReader = new ConfigFileReader();
	}

	public WebDriver initFirefoxDriver() {
		return null;
	}

	public WebDriver initChromeDriver() {
		String chromeExePath = (String) configFileReader.getProperties().get("chrome.exe.path");
		System.setProperty("webdriver.chrome.driver", chromeExePath);
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addArguments("--user-data-dir=D:\\AutomationSoftwares\\Data",
				"--disable-dev-shm-usage",
				/*"--no-sandbox",*/
				"--remote-debugging-port=9222",
				"--disable-extensions");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		return driver;
	}

	public ConfigFileReader getConfigFileReader() {
		return configFileReader;
	}

}
