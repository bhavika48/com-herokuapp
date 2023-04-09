import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Herokuapp_3_multiBrowser {
    static String browser = "Edge";
    static String baseUrl = "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("FireFox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong Browser name");
        }

        // Open Url into browser
        driver.get(baseUrl);

        // print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Print current Url
        System.out.println("Current Url :" + driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source :" + driver.getPageSource());

        // Enter username into username field
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("param123");

        // Enter password into password field
        driver.findElement(By.id("password")).sendKeys("123@09");

        // close the browser
        driver.close();
    }
}
