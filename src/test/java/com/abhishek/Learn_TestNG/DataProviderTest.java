package com.abhishek.Learn_TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@DataProvider
	public Object[][] applicationTestData() {

		Object[][] data = new Object[2][3];

		data[0][0] = "Username1";
		data[0][1] = "password1";
		data[0][2] = "Adviser";
		
		data[1][0]= "Username2";
		data[1][1]="Password2";
		data[1][2]="Staff";

		return data;
	}
	
	@Test(dataProvider = "applicationTestData")
	public void Authentication_Authorization(String Username, String Password, String role) {
		
		System.out.println("username is "+Username+" password is "+Password+" role is "+role);
		
	}

}
