package com.app.wagepayment.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SearchClientConfigTest {

	@BeforeTest
	public void init() {
		
	}
	
	@Test
	public void searchDemo(){
		int a=10;
		int b=20;
		int c= a+b;
		Assert.assertEquals(c, 30);
	}
}
