import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Herokuapp_3 {
    public static void main(String[] args) {
        String baseUrl="http://the-internet.herokuapp.com/login";
        // Launch Chrome browser
        WebDriver driver= new ChromeDriver();

        // Open Url into browser
        driver.get(baseUrl);

        // Print the title of page
       String title= driver.getTitle();
        System.out.println(title);

        // print current Url
        System.out.println("Current Url :"+driver.getCurrentUrl());

        // Print page source
        System.out.println("Pge source :"+ driver.getPageSource());

        // Enter username into username field
         WebElement username =driver.findElement(By.id("username"));
         username.sendKeys("param123");

         //  Enter password into password field
         driver.findElement(By.id("password")).sendKeys("123@09");

         // close browser
        driver.close();
    }

}
