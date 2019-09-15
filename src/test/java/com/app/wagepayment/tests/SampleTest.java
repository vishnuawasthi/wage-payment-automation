package com.app.wagepayment.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTest {

	@Test
	public void swap() {

		int a = 10;
		int b = 20;
		int c = a;
		a = b;
		b = c;

		Assert.assertEquals(a, 20);
		Assert.assertEquals(b, 10);

	}
}
