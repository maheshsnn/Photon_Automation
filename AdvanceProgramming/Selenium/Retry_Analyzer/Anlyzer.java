	package Retry_Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Anlyzer implements IRetryAnalyzer{

	@Override
	public boolean retry(ITestResult result) {
		
		int count=0;
		
		int retry_limit=3;
		
		if(count<retry_limit)
		{
			count++;
			return true;
		}
		
		return false;
	}
	

}
