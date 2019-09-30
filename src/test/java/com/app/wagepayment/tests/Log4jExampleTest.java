package com.app.wagepayment.tests;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Log4jExampleTest {

	public static final Logger LOG = Logger.getLogger(Log4jExampleTest.class);

	@BeforeMethod
	public void beforeMethod() {
		LOG.info("INF- beforeMethod");
		LOG.debug("DEBUG- beforeMethod");
		LOG.error("ERROR- beforeMethod");
		LOG.fatal("fatal- beforeMethod");
		LOG.trace("Trace- beforeMethod");
		LOG.warn("warn- beforeMethod");

	}

	@BeforeTest
	public void beforeTest() {
		LOG.info(" beforeTest() - start");

		LOG.info("Complete beforeTest setup");

		LOG.info(" beforeTest() - end");
	}

	@Test
	public void test() {
		LOG.info("test() - start");
		LOG.info("Executing test case with data setup for postive case..");

		try {
			throw new Exception("Exception came ..");
		} catch (Exception e) {
			LOG.error("Error :  " + e.getMessage());
			LOG.error("Error occured while executing test case ....", e);
		}

		LOG.info("test() - end");
	}

	@AfterTest
	public void afterTest() {

	}

	@AfterMethod
	public void afterMethod() {

	}

}
