package com.abhishek.Learn_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

//Run test cases for certain number of times upon failure...

public class RetryFailedTestCases {
	@Test
	public void test1() {

		Assert.assertTrue(false);

	}

	@Test
	public void test2() {

		Assert.assertTrue(true);
	}
}
