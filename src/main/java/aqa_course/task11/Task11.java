package aqa_course.task11;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Task11 {
    public static void main(String[] args) {
        File chromeDriverFile = new File("src/chromedriver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsoluteFile().getAbsolutePath());

        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("");

    }
}
