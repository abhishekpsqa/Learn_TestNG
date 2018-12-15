package com.abhishek.Learn_TestNG;

import org.testng.annotations.Test;

public class GroupingInTestNG {

	@Test(groups= {"sanity"})
	public void test1() {
		
		System.out.println("This is test1 method.");
	}
	@Test(groups= {"sanity","regression"})
	public void test2() {
			
		System.out.println("This is test2 method.");
	}
	@Test(groups = {"regression"})
	public void test3() {
		System.out.println("This is test3 method.");
	}
	@Test(groups = {"sanity", "regression"})
	public void test4() {
		
		System.out.println("This is test4 method.");
	}
}
