package com.app.wagepayment.comman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GeneralMethod {

	WebDriver driver;

	public void startBrowser(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	public int locatorType(String identifier) {
		int id = 1;
		if (identifier == "id") {
			id = 1;
		} else if (identifier == "className") {
			id = 2;
		} else if (identifier == "tagName") {
			id = 3;
		} else if (identifier == "name") {
			id = 4;
		} else if (identifier == "linkText") {
			id = 5;
		} else if (identifier == "partialLinkText") {
			id = 6;
		} else if (identifier == "cssSelector") {
			id = 7;
		} else if (identifier == "xpath") {
			id = 8;
		} else {
			id = 0;
			System.out.println("Locator type invalid");
		}
		return id;
	}

	public WebElement webElementId(String identifier, String locator) {
		int id = locatorType(identifier);
		WebElement e = null;
		switch (id) {

		case 1:
			e.findElement(By.id(locator));
			break;
		case 2:
			e.findElement(By.className(locator));
			break;
		case 3:
			e.findElement(By.tagName(locator));
			break;
		case 4:
			e.findElement(By.name(locator));
			break;
		case 5:
			e.findElement(By.linkText(locator));
			break;
		case 6:
			e.findElement(By.partialLinkText(locator));
			break;
		case 7:
			e.findElement(By.cssSelector(locator));
			break;
		case 8:
			e.findElement(By.xpath(locator));
			break;
		default:
			System.out.println("Locator not found");
			break;
		}
		return e;
	}

	public void sendkeys(String identifier, String locator, String content) {
		WebElement e = webElementId(identifier, locator);
		e.sendKeys(content);
	}

	public void click(String identifier, String locator) {
		WebElement e = webElementId(identifier, locator);
		e.click();
	}

	public void selectByVisibleText(String identifier, String locator, String vText) {
		WebElement e = webElementId(identifier, locator);
		Select select = new Select(e);
		select.selectByVisibleText(vText);

	}

	public void closeBrowser() {
		driver.close();
	}

	public void quitBrowser() {
		driver.quit();
	}
}
