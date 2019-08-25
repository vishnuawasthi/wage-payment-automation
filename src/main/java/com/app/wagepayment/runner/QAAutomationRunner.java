package com.app.wagepayment.runner;

import org.openqa.selenium.WebDriver;

import com.app.wagepayment.config.CrossBrowserConfig;

public class QAAutomationRunner {

	public static void main(String[] args) throws InterruptedException {
		CrossBrowserConfig crossBrowserConfig = new CrossBrowserConfig();
		WebDriver driver = crossBrowserConfig.lunchChromeDriver();
		String url = (String) crossBrowserConfig.getConfigFileReader().getProperties().get("appliction.base.url");

		System.out.println("url : " + url);
		driver.get(url);
		String title = driver.getTitle();
		driver.close();
	}

}
