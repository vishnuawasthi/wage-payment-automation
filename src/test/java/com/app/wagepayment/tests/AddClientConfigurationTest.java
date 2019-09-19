package com.app.wagepayment.tests;

import static org.testng.Assert.assertEquals;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.wagepayment.config.CrossBrowserConfig;

public class AddClientConfigurationTest {

	WebDriver webDriver;

	CrossBrowserConfig browserConfig = new CrossBrowserConfig();

	private Properties props;
/*
	@BeforeSuite
	public void init() {
		webDriver = browserConfig.lunchChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		props = browserConfig.getConfigFileReader().getProperties();
		System.out.println("init called");
	}*/

	@BeforeTest(alwaysRun=true)
	public void testAddClientConfig() {
		
		/*String title = webDriver.getTitle();
		String expectedTitle = props.getProperty("clientconfig.page.title");
		assertEquals(title, expectedTitle);*/
	}
	@BeforeMethod
	public void commonDriverCall() {
		webDriver = browserConfig.lunchChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		props = browserConfig.getConfigFileReader().getProperties();
		String url = props.getProperty("wagepayment.add-config.url");
		webDriver.navigate().to(url);
	}
	
	@Test(priority = 1)
	public void testMandatoryFieldWithoutData() throws InterruptedException {
		
		String clientNameLocator = props.getProperty("clientconfig.clientName");
		WebElement clientName = webDriver.findElement(By.id(clientNameLocator));
		clientName.sendKeys("");
		String registrationNumberLocator = props.getProperty("clientconfig.locator.registrationNumber");
		WebElement registrationNumber = webDriver.findElement(By.id(registrationNumberLocator));
		registrationNumber.sendKeys("");
		
		String clientTypeLocator = props.getProperty("clientconfig.locator.clientType");
		WebElement clientType = webDriver.findElement(By.id(clientTypeLocator));
		Select select = new Select(clientType);
		String clientTypeValue = props.getProperty("clientconfig.clientType.value");
		select.selectByVisibleText(clientTypeValue);
		
		String contactNumberLocator=props.getProperty("clientconfig.locator.contactNumber");
		WebElement contactNumber=webDriver.findElement(By.id(contactNumberLocator));
		contactNumber.sendKeys("");
		
		String alternateNumberLocator=props.getProperty("clientconfig.locator.alternateNumber");
		WebElement alternateNumber=webDriver.findElement(By.id(alternateNumberLocator));
		alternateNumber.sendKeys("");
		
		String emailLocator=props.getProperty("clientconfig.locator.email");
		WebElement email=webDriver.findElement(By.id(emailLocator));
		email.sendKeys("");
		
		String clientCodelLocator=props.getProperty("clientconfig.locator.clientCode");
		WebElement clientCode=webDriver.findElement(By.id(clientCodelLocator));
		clientCode.sendKeys("");
		
		String onBoardingDateLocator=props.getProperty("clientconfig.locator.onboardDateTxt");
		WebElement onBoardingDate=webDriver.findElement(By.id(onBoardingDateLocator));
		onBoardingDate.sendKeys("");
		
		String liveDateLocator=props.getProperty("clientconfig.locator.liveDateTxt");
		WebElement liveDate=webDriver.findElement(By.id(liveDateLocator));
		liveDate.sendKeys("");
		
		String addressLine1Locator=props.getProperty("clientconfig.locator.addressLine1");
		WebElement addressLine1=webDriver.findElement(By.id(addressLine1Locator));
		addressLine1.sendKeys("");
		
		String addressLine2Locator=props.getProperty("clientconfig.locator.addressLine2");
		WebElement addressLine2=webDriver.findElement(By.id(addressLine2Locator));
		addressLine2.sendKeys("");
		
		String pincodeLocator=props.getProperty("clientconfig.locator.pincode");
		WebElement pincode=webDriver.findElement(By.id(pincodeLocator));
		pincode.sendKeys("");
		
		String stateCodeLocator = props.getProperty("clientconfig.locator.stateCode");
		WebElement stateCode = webDriver.findElement(By.id(stateCodeLocator));
		Select select1 = new Select(stateCode);
		String stateTypeValue = props.getProperty("clientconfig.clientType.stateValue");
		select1.selectByVisibleText(stateTypeValue);
		
		String coutryCodeLocator = props.getProperty("clientconfig.locator.coutryCode");
		WebElement coutryCode = webDriver.findElement(By.id(coutryCodeLocator));
		Select select2 = new Select(coutryCode);
		String countryTypeValue = props.getProperty("clientconfig.clientType.countryValue");
		select2.selectByVisibleText(countryTypeValue);
		
		String saveButtonLocator=props.getProperty("clientconfig.locator.saveButton");
		WebElement saveButton= webDriver.findElement(By.xpath(saveButtonLocator));
		saveButton.click();
		Thread.sleep(4000);
		webDriver.navigate().refresh();
		
	}

	@Test(priority = 2)
	public void testValidData() throws InterruptedException {
		
		Thread.sleep(2000);
		String clientNameLocator = props.getProperty("clientconfig.clientName");
		WebElement clientName = webDriver.findElement(By.id(clientNameLocator));
		clientName.sendKeys("ADP_123456");
		Thread.sleep(2000);
		String registrationNumberLocator = props.getProperty("clientconfig.locator.registrationNumber");
		WebElement registrationNumber = webDriver.findElement(By.id(registrationNumberLocator));
		registrationNumber.sendKeys("321586498754");
		Thread.sleep(2000);
		String clientTypeLocator = props.getProperty("clientconfig.locator.clientType");
		WebElement clientType = webDriver.findElement(By.id(clientTypeLocator));
		Select select = new Select(clientType);
		Thread.sleep(2000);
		String clientTypeValue = props.getProperty("clientconfig.clientType.value");
		select.selectByVisibleText(clientTypeValue);
		Thread.sleep(2000);
		String contactNumberLocator=props.getProperty("clientconfig.locator.contactNumber");
		WebElement contactNumber=webDriver.findElement(By.id(contactNumberLocator));
		contactNumber.sendKeys("1236545555");
		Thread.sleep(2000);
		String alternateNumberLocator=props.getProperty("clientconfig.locator.alternateNumber");
		WebElement alternateNumber=webDriver.findElement(By.id(alternateNumberLocator));
		alternateNumber.sendKeys("7569841236");
		Thread.sleep(2000);
		String emailLocator=props.getProperty("clientconfig.locator.email");
		WebElement email=webDriver.findElement(By.id(emailLocator));
		email.sendKeys("aarti.gudiya@gmail.com");
		Thread.sleep(2000);
		String clientCodelLocator=props.getProperty("clientconfig.locator.clientCode");
		WebElement clientCode=webDriver.findElement(By.id(clientCodelLocator));
		clientCode.sendKeys("258946");
		Thread.sleep(2000);
		String onBoardingDateLocator=props.getProperty("clientconfig.locator.onboardDateTxt");
		WebElement onBoardingDate=webDriver.findElement(By.id(onBoardingDateLocator));
		onBoardingDate.sendKeys("2019-09-19");
		Thread.sleep(2000);
		String liveDateLocator=props.getProperty("clientconfig.locator.liveDateTxt");
		WebElement liveDate=webDriver.findElement(By.id(liveDateLocator));
		liveDate.sendKeys("2019-09-19");
		Thread.sleep(2000);
		String addressLine1Locator=props.getProperty("clientconfig.locator.addressLine1");
		WebElement addressLine1=webDriver.findElement(By.id(addressLine1Locator));
		addressLine1.sendKeys("Chetgiri colony, fouladi kalam");
		Thread.sleep(2000);
		String addressLine2Locator=props.getProperty("clientconfig.locator.addressLine2");
		WebElement addressLine2=webDriver.findElement(By.id(addressLine2Locator));
		addressLine2.sendKeys("chhatarpur");
		Thread.sleep(2000);
		String pincodeLocator=props.getProperty("clientconfig.locator.pincode");
		WebElement pincode=webDriver.findElement(By.id(pincodeLocator));
		pincode.sendKeys("471001");
		Thread.sleep(2000);
		String stateCodeLocator = props.getProperty("clientconfig.locator.stateCode");
		WebElement stateCode = webDriver.findElement(By.id(stateCodeLocator));
		Select select1 = new Select(stateCode);
		Thread.sleep(2000);
		String stateTypeValue = props.getProperty("clientconfig.clientType.stateValue");
		select1.selectByVisibleText(stateTypeValue);
		Thread.sleep(2000);
		String coutryCodeLocator = props.getProperty("clientconfig.locator.coutryCode");
		WebElement coutryCode = webDriver.findElement(By.id(coutryCodeLocator));
		Select select2 = new Select(coutryCode);
		Thread.sleep(2000);
		String countryTypeValue = props.getProperty("clientconfig.clientType.countryValue");
		select2.selectByVisibleText(countryTypeValue);
		Thread.sleep(2000);
		String saveButtonLocator=props.getProperty("clientconfig.locator.saveButton");
		WebElement saveButton= webDriver.findElement(By.xpath(saveButtonLocator));
		saveButton.click();
		Thread.sleep(4000);
		webDriver.navigate().refresh();
	}
	
	@Test(priority = 3)
	public void testInValidData() {
		String clientNameLocator = props.getProperty("clientconfig.clientName");
		WebElement clientName = webDriver.findElement(By.id(clientNameLocator));
		clientName.sendKeys("ADP@123456%");
		String registrationNumberLocator = props.getProperty("clientconfig.locator.registrationNumber");
		WebElement registrationNumber = webDriver.findElement(By.id(registrationNumberLocator));
		registrationNumber.sendKeys("asdf!@#$%6576");
		
		String clientTypeLocator = props.getProperty("clientconfig.locator.clientType");
		WebElement clientType = webDriver.findElement(By.id(clientTypeLocator));
		Select select = new Select(clientType);
		String clientTypeValue = props.getProperty("clientconfig.clientType.value");
		select.selectByVisibleText(clientTypeValue);
		
		String contactNumberLocator=props.getProperty("clientconfig.locator.contactNumber");
		WebElement contactNumber=webDriver.findElement(By.id(contactNumberLocator));
		contactNumber.sendKeys("sdfsdfsd");
		
		String alternateNumberLocator=props.getProperty("clientconfig.locator.alternateNumber");
		WebElement alternateNumber=webDriver.findElement(By.id(alternateNumberLocator));
		alternateNumber.sendKeys("dfgdgfdgdfg");
		
		String emailLocator=props.getProperty("clientconfig.locator.email");
		WebElement email=webDriver.findElement(By.id(emailLocator));
		email.sendKeys("aarti.goswami@");
		
		String clientCodelLocator=props.getProperty("clientconfig.locator.clientCode");
		WebElement clientCode=webDriver.findElement(By.id(clientCodelLocator));
		clientCode.sendKeys("123as@");
		
		String onBoardingDateLocator=props.getProperty("clientconfig.locator.onboardDateTxt");
		WebElement onBoardingDate=webDriver.findElement(By.id(onBoardingDateLocator));
		onBoardingDate.sendKeys("2019-09-18");
		
		String liveDateLocator=props.getProperty("clientconfig.locator.liveDateTxt");
		WebElement liveDate=webDriver.findElement(By.id(liveDateLocator));
		liveDate.sendKeys("2019-09-18");
		
		String addressLine1Locator=props.getProperty("clientconfig.locator.addressLine1");
		WebElement addressLine1=webDriver.findElement(By.id(addressLine1Locator));
		addressLine1.sendKeys("sd@#$%xzvzv");
		
		String addressLine2Locator=props.getProperty("clientconfig.locator.addressLine2");
		WebElement addressLine2=webDriver.findElement(By.id(addressLine2Locator));
		addressLine2.sendKeys("@#$!%tryghfgh456");
		
		String pincodeLocator=props.getProperty("clientconfig.locator.pincode");
		WebElement pincode=webDriver.findElement(By.id(pincodeLocator));
		pincode.sendKeys("fghjkl");
		
		String stateCodeLocator = props.getProperty("clientconfig.locator.stateCode");
		WebElement stateCode = webDriver.findElement(By.id(stateCodeLocator));
		Select select1 = new Select(stateCode);
		String stateTypeValue = props.getProperty("clientconfig.clientType.stateValue");
		select1.selectByVisibleText(stateTypeValue);
		
		String coutryCodeLocator = props.getProperty("clientconfig.locator.coutryCode");
		WebElement coutryCode = webDriver.findElement(By.id(coutryCodeLocator));
		Select select2 = new Select(coutryCode);
		String countryTypeValue = props.getProperty("clientconfig.clientType.countryValue");
		select2.selectByVisibleText(countryTypeValue);
		
		String saveButtonLocator=props.getProperty("clientconfig.locator.saveButton");
		WebElement saveButton= webDriver.findElement(By.xpath(saveButtonLocator));
		saveButton.click();
		
	}


	
	
	@AfterMethod
	public void closeBrowser() {
		webDriver.close();
	}

}
