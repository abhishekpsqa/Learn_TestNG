package com.abhishek.Learn_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@BeforeSuite
	public void test1() {

		System.out.println("Runs before anything hence - @BeforeSuite");
	}

	@BeforeTest
	public void test2() {
		System.out.println("Runs before starting of any test hence - @Beforetest");
	}

	@BeforeClass
	public void test3() {
		System.out.println("Runs before any class hence - @BeforeClass");
	}

	@BeforeMethod
	public void test4() {
		System.out.println("Runs before any method hence - @BeforeMethod");
	}

	@Test
	public void test5() {
		System.out.println("A method which has test");
	}

	@AfterMethod
	public void test6() {
		System.out.println("Runs after any method hence - @AfterMethod");
	}

	@AfterTest
	public void test7() {
		System.out.println("Runs after all the tests are run hence - @AfterTest");
	}

	@AfterClass
	public void test8() {
		System.out.println("Runs after all classes hence - @AfterClass");
	}

	@AfterSuite
	public void test9() {
		System.out.println("Runs after whole suite hence - @AfterSuite");
	}

	@Test
	public void test10() {
		System.out.println("Test method.");
	}
}
