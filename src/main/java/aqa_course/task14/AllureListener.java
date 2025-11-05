package aqa_course.task14;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.ByteArrayInputStream;

public class AllureListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Object testInstance = result.getInstance();
        WebDriver driver = null;

        try {
            driver = (WebDriver) testInstance.getClass().getDeclaredField("driver").get(testInstance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (driver != null) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Screenshot", new ByteArrayInputStream(screenshot));

            String html = driver.getPageSource();
            Allure.addAttachment("Page DOM", "text/html", html, ".html");
        }
    }
}