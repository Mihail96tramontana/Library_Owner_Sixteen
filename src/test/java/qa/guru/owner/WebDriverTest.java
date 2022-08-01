package qa.guru.owner;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    @Test
        public void testYandex() {
            WebDriver driver = new ChromeDriver();
            driver.get("https://market.yandex.ru/");
            String title = driver.getTitle();
            assertEquals(title, "");
        }
    }
