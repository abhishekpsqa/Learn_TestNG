package com.abhishek.Learn_TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {

	@Test
	@Parameters({"browser"})
	public void openBrowser(@Optional("firefox") String browser) {
		
		System.out.println("Opening browser: "+browser);
	}
	
	
	
}
