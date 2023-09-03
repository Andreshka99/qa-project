import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class ExampleTest {
    @Test
    public void invalidAuthorization() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://sql-academy.org/ru/trainer?sort=byId");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement firstButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='Войти'])[1]")));
        firstButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid=\"sign-in-form-email-input\"]"))).sendKeys("testerxuester@mail.ru");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-testid=\"sign-in-form-password-input\"]"))).sendKeys("abobaboy99");
        WebElement secondButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[text()='Войти'])[2]")));
        secondButton.click();
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-testid=\"sign-in-form-error-container\"]")));
        String error = errorMessage.getText();
        assertTrue("Проверка соответствии ошибки требованиям", error.equals("Пользователь не найден"));
        driver.quit();
    }
}
