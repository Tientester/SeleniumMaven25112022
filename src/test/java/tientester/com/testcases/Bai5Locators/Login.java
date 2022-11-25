package tientester.com.testcases.Bai5Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.hrsale.com");
        Thread.sleep(1000);

        //Tìm element bằng thuộc tính
        driver.findElement(By.id("iusername")).sendKeys("frances.burns");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("frances.burns");
        Thread.sleep(1000);
        //Tìm element bằng xpath;
        driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/form/div[3]/div[1]/button")).click();
        Thread.sleep(5000);

        driver.findElement(By.xpath("/html/body/nav/div/div/ul/li[9]/a/span[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[4]/div/nav/div/a[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("task_name")).sendKeys("task name 01");
        Thread.sleep(2000);


//        driver.findElement(By.name("task_name")).click();
//        driver.findElement(By.name("task_name")).click();
        driver.close();
        driver.quit();


    }

}
