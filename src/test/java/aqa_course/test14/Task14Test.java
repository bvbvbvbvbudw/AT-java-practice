package aqa_course.test14;

import aqa_course.task12.SignUpBusinessObject;
import aqa_course.task14.AllureListener;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(AllureListener.class)
public class Task14Test {
    WebDriver driver;

    @BeforeTest
    void setup() {
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();
    }

    @Test
    void task13() {
        SignUpBusinessObject signUpBusinessObject = new SignUpBusinessObject();
        signUpBusinessObject.signup("admin", "admin", driver);
    }

    @AfterTest
    void teardown() {
        driver.quit();
    }
}
