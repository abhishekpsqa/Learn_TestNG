package com.abhishek.Learn_TestNG;

import org.testng.annotations.Test;

public class BuildTestNGXmlTst {
	
	@Test
	public void test1() {
		
		System.out.println("Method 1");
	}
	@Test
	public void test2() {
		System.out.println("Method 2");
	}
}
//To run this class from testng.xml file, you need to create testng.xml file, right click on this class from package explorer window navigate to testng and click on convert to testng. You should see testng.xml file, if not refresh project.