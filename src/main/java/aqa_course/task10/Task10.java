package aqa_course.task10;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        File chromeDriverFile = new File("src/chromedriver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsoluteFile().getAbsolutePath());

        ChromeDriverManager.getInstance().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");

        WebElement logo = driver.findElement(By.id("nava"));
        WebElement phoneCategory = driver.findElement(By.linkText("Phones"));
        WebElement signUpButton = driver.findElement(By.id("signin2"));

        phoneCategory.click();
        Thread.sleep(1000);

        signUpButton.click();
        Thread.sleep(1000);

        driver.quit();
    }
}
