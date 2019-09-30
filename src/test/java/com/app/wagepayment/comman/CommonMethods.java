package com.app.wagepayment.comman;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class CommonMethods {

	GeneralMethod generalMethod;

	public CommonMethods(GeneralMethod generalMethod) {

		this.generalMethod = generalMethod;
	}

	File locFile = new File(
			"C:\\Users\\lenovo\\git\\wage-payment-automation\\src\\test\\resources\\application.properties");
	Properties properties = new Properties();

	public void loadPropFile() throws FileNotFoundException, IOException {
		properties.load(new FileInputStream(locFile));

	}

	public void userDetail(String clientName, String registrationNumber, String clientType, String contactNumber)
			throws IOException {

		String clientNameLoc = properties.getProperty("clientName");
		String registrationNumberLoc = properties.getProperty("registrationNumber");
		String clientTypeLoc = properties.getProperty("clientType");
		String contactNumberLoc = properties.getProperty("contactNumber");
		// verify user name

		generalMethod.sendkeys("name", clientNameLoc, clientName);
		generalMethod.sendkeys("name", registrationNumberLoc, registrationNumber);
		generalMethod.selectByVisibleText("name", clientTypeLoc, clientType);
		generalMethod.sendkeys("name", contactNumberLoc, contactNumber);

	}
}
