package qa.guru.owner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    WebDriver driver = getDriver();

    @BeforeEach
    public void startDriver() {
        driver = getDriver();
    }



    @Test
        public void testGithub1() {
        // Подготовка Driver
            WebDriver driver = getDriver();
            // Тело выполнение теста
            String title = driver.getTitle();
            assertEquals("GitHub: Where the world builds software · GitHub", title);
            driver.quit();
        }

        @Test
    public void testGithub2() {
        WebDriver driver = getDriver();
        String title = driver.getTitle();
        assertEquals("GitHub: Where the world builds software · GitHub", title);
        driver.quit();

    }

@AfterEach
    public void stopDriver() {
        driver.quit();
    }

    // Конфигурация
    private WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com");
        return driver;
    }
}