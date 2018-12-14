package com.abhishek.Learn_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodTest {
	@Test
	public void test1() {
		Assert.assertTrue(true);
		
	}
	@Test
	public void test2() {
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"test1"})
	public void test3() {

	}
	@Test(dependsOnMethods = {"test1","test2"})
	public void test4() {
		//method will be skipped.
	}

	@Test(dependsOnMethods = {"test1"})
	public void test5() {

	}

}
