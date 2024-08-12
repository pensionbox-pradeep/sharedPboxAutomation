package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Listener: Test Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Listener: Test Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Listener: Test Failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Listener: Test Skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Listener: Test Failed because % ");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Listener: Test Failed because T");
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Listener: Started, Initialised reports");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Listener: Finished, Flushed reports");
	}

}
