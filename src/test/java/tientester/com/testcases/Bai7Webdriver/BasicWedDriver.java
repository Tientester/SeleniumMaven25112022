package tientester.com.testcases.Bai7Webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicWedDriver {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


// Ví dụ thiết lập 10 giây cho tất cả
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        driver.get("https://anhtester.com");
        driver.manage().window().maximize();
        // Đặt thời gian chời ngầm định cho tất cả các element (đơn vị Giây)



        Thread.sleep(1000);
        driver.findElement(By.id("btn-login")).click();
        Thread.sleep(2000);
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);
//        driver.navigate().refresh();
//        Thread.sleep(2000);
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//
//        String html = driver.getPageSource();
//        System.out.println(driver.getPageSource());
//        System.out.println(html.contains("placeholder=\"Email\""));

        Cookie newCookie = new Cookie("number", "123456");
        driver.manage().addCookie(newCookie);

        System.out.println(newCookie.getValue());
        System.out.println(driver.manage().getCookieNamed("_gid"));
        Thread.sleep(2000);
        driver.quit();
    }
}
