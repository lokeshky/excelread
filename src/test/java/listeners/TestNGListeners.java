package listeners;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListeners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("**** In on test start *** "+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("**** In on test success *** "+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("**** In on test fail *** "+result.getName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("**** In on test skip *** "+result.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	}

	public void onStart(ITestContext context) {
	}

	public void onFinish(ITestContext context) {
		System.out.println("**** In on test finish *** "+context.getName());
	}
	
	

}
