package tientester.com.testcases.Bai9SetupTestNG;

import org.bouncycastle.asn1.eac.PublicKeyDataObject;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import tientester.com.testcases.common.Basetest;

public class RunTest extends Basetest {

    @Test
    public void  loginCRM(){
        createDriver();
        driver.get("https://app.hrsale.com/");

        driver.findElement(By.xpath("//input[@id='iusername']")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//input[@id='ipassword']")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        closeDriver();
    }
    @Test
    public void  openProjectPage() throws InterruptedException {
        createDriver();
        driver.get("https://app.hrsale.com/");

        driver.findElement(By.xpath("//input[@id='iusername']")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//input[@id='ipassword']")).sendKeys("frances.burns");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//span[normalize-space()='Projects']")).click();

        closeDriver();
    }


}
