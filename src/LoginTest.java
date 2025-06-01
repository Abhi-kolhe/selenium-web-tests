import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        // Set path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            // Open login page
            driver.get("https://example.com/login");

            // Enter username and password
            WebElement username = driver.findElement(By.id("username"));
            WebElement password = driver.findElement(By.id("password"));
            WebElement loginBtn = driver.findElement(By.id("loginBtn"));

            username.sendKeys("testuser");
            password.sendKeys("password123");
            loginBtn.click();

            // Validate login success
            String expectedUrl = "https://example.com/dashboard";
            String actualUrl = driver.getCurrentUrl();

            if (actualUrl.equals(expectedUrl)) {
                System.out.println("✅ Login Test Passed!");
            } else {
                System.out.println("❌ Login Test Failed!");
            }
        } catch (Exception e) {
            System.out.println("⚠️ Exception: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}

