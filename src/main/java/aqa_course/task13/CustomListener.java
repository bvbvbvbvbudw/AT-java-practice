package aqa_course.task13;

import org.testng.*;

public class CustomListener implements ITestListener, ISuiteListener, IExecutionListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getMethod().getMethodName());
    }

//    @Override
//    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
//        if (method.isTestMethod()) {
//            System.out.println("Before invocation: " + method.getTestMethod().getMethodName());
//        }
//    }
//
//    @Override
//    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
//        if (method.isTestMethod()) {
//            System.out.println("After invocation: " + method.getTestMethod().getMethodName());
//        }
//    }

    @Override public void onStart(ISuite suite) {}
    @Override public void onFinish(ISuite suite) {}
    @Override public void onExecutionStart() {}
    @Override public void onExecutionFinish() {}
    @Override public void onTestFailure(ITestResult result) {}
    @Override public void onTestSkipped(ITestResult result) {}
    @Override public void onTestFailedButWithinSuccessPercentage(ITestResult result) {}
    @Override public void onTestFailedWithTimeout(ITestResult result) {}
    @Override public void onStart(ITestContext context) {}
    @Override public void onFinish(ITestContext context) {}
}