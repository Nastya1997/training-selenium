import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RunLitecart {
    private static WebDriver webDriver;
    private static WebDriverWait wait;

    @BeforeAll
    public static void start() {
        System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
        webDriver = new ChromeDriver();
        wait = new WebDriverWait(webDriver, 10);
    }

    @Test
    public void login() {
        webDriver.get("http://localhost/litecart/admin/");
        WebElement inputLogin = webDriver.findElement(By.name("username"));
        inputLogin.sendKeys("admin");
        WebElement inputPass = webDriver.findElement(By.name("password"));
        inputPass.sendKeys("admin");
        WebElement buttonLogin = webDriver.findElement(By.name("login"));
        buttonLogin.click();
    }

    @AfterAll
    public static void stop() {
        webDriver.quit();
    }
}
