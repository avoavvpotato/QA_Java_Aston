import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager; // Импорт WebDriverManager
import java.time.Duration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MtsOnlinePayTest {
    private static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testPaySectionHeader() {
        System.out.println("Starting the test: testPaySectionHeader");

        try {
            driver.get("https://www.mts.by/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement headerElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/h2")));

            String headerText = headerElement.getText();
            String expectedText = "Онлайн пополнение\nбез комиссии";

            assertEquals(expectedText, headerText.replace("\u200B", ""), "The header does not match the expected text");

            boolean hasBrTag = !headerElement.findElements(By.tagName("br")).isEmpty();
            assertTrue(hasBrTag, "The header should contain a <br> tag");
            System.out.println("Test completed successfully: testPaySectionHeader");
        } catch (Exception e) {
            System.err.println("An error occurred during the test: " + e.getMessage());
            fail("Test failed due to an exception: " + e.getMessage());
        }
    }

    @Test
    public void testPaymentLogos() {
        System.out.println("Starting the test: testPaymentLogos");

        try {
            driver.get("https://www.mts.by/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul")));

            String[] xpaths = {
                    "//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[1]/img",  // Visa
                    "//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[2]/img",  // Verified By Visa
                    "//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[3]/img",  // MasterCard
                    "//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[4]/img",  // MasterCard Secure Code
                    "//*[@id='pay-section']/div/div/div[2]/section/div/div[2]/ul/li[5]/img"   // Белкарт
            };

            for (String xpath : xpaths) {
                WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
                assertNotNull(logoElement, "Logo not found at: " + xpath);
                System.out.println("Logo found at: " + xpath);
            }

            System.out.println("Test completed successfully: testPaymentLogos");
        } catch (Exception e) {
            System.err.println("An error occurred during the test: " + e.getMessage());
            fail("Test failed due to an exception: " + e.getMessage());
        }
    }

    @Test
    public void testServiceLink() {
        System.out.println("Starting the test: testServiceLink");

        try {
            driver.get("https://www.mts.by/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement serviceLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='pay-section']/div/div/div[2]/section/div/a")));

            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", serviceLink);

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", serviceLink);

            wait.until(ExpectedConditions.urlContains("/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"));

            String currentUrl = driver.getCurrentUrl();
            assertTrue(currentUrl.contains("/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/"), "The URL does not match expected.");

            System.out.println("Navigated to: " + currentUrl);
            System.out.println("Test completed successfully: testServiceLink");
        } catch (Exception e) {
            System.err.println("An error occurred during the test: " + e.getMessage());
            fail("Test failed due to an exception: " + e.getMessage());
        }
    }

    @Test
    public void testFillPaymentForm() {
        System.out.println("Starting the test: testFillPaymentForm");

        try {
            driver.get("https://www.mts.by/");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            WebElement phoneField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='connection-phone']")));
            phoneField.sendKeys("297777777");

            WebElement amountField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='connection-sum']")));
            amountField.sendKeys("5");

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='connection-email']")));
            emailField.sendKeys("ivanov@gmail.com");

            WebElement payButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='pay-connection']/button")));

            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", payButton);

            System.out.println("Test completed successfully: testFillPaymentForm");
        } catch (Exception e) {
            System.err.println("An error occurred during the test: " + e.getMessage());
            fail("Test failed due to an exception: " + e.getMessage());
        }
    }
    @AfterAll
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}