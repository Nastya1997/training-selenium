import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RunTest {
    private static WebDriver webDriver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void start() {
        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 10);
    }

    @Test
    public void myFirstTest() {
        webDriver.get("https://www.google.com");
    }

    @AfterAll
    public static void stop() {
        webDriver.quit();
    }
}
