package com.app.wagepayment.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UpdateClientConfigTest {

	@BeforeTest
	public void init() {

	}

	@Test
	public void testDemo() {
		Assert.assertEquals(true, true);
	}
	@Test
	public void testDemo2() {
		String name= "Arti";
		Assert.assertEquals(name, "Arti");
	}
}
