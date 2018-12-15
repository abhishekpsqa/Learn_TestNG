package com.abhishek.TestUtils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int counter = 0;
	int timesRetry = 3;

	public boolean retry(ITestResult result) {

		if (counter < timesRetry) {
			counter++;
			return true;
		}
		return false;
	}

}
