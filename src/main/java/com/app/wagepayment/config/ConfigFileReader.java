package com.app.wagepayment.config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

	private Properties properties;

	private final String pathname = "config//configuration.properties";

	public ConfigFileReader() {
		loadProperties();
	}

	private void loadProperties() {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(new File(pathname)));
			properties = new Properties();
			try {
				properties.load(reader);
				System.out.println("app.welcome.message : " + properties.getProperty("app.welcome.message"));
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("configuration.properties not found at " + pathname);
		}
	}

	public Properties getProperties() {
		if (properties == null) {
			return new Properties();
		}
		return properties;
	}

}
