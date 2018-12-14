package com.abhishek.Learn_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
	SoftAssert sa = new SoftAssert();
	
	@Test
	public void assertEquals() {
		
		Assert.assertEquals("Actual", "Actual");
	}
	
	@Test
	public void assertTrue() {
		
		Assert.assertTrue(true);
	}
	
	@Test
	public void softAssert() {
		
		sa.assertTrue(false);
		System.out.println("Method will still execute after failure @@@@&&^%$#$%^&*(*&^%$#$%^&*()(*&^%$#");
		sa.assertEquals("Actual", "Actual");
		sa.assertAll(); //make sure to put assert all in the end.
	}
	
}
