package owner.config;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private WebDriver driver;

    @BeforeEach
    public void startDriver() {
        driver = new owner.config.WebDriverProvider().get();
    }

    @Tag("tests_config")
    @Test
    public void testGitHub() {
        String title = driver.getTitle();
        assertEquals("GitHub: Where the world builds software · GitHub", title);
        driver.quit();
    }
}