package testNGDemo;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

	public void onTestFailure(ITestResult result) {
		System.out.println("In Test Failure Listener "+"-"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("In Test Success Listener");
	}

}
