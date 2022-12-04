package tientester.com.testcases.Bai8DropdownRadioCheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tientester.com.testcases.common.Basetest;

import java.util.List;

public class LearnCheckbox extends Basetest {
    public static void main(String[] args) throws InterruptedException {

        //đoạn setup browser => class riêng
        //Kế thừa lại class setup
        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        driver.findElement(By.id("isAgeSelected")).click();

        Thread.sleep(2000);

        //Kiểm tra xem checkbox đã được chọn hay chưa
        System.out.println(driver.findElement(By.id("isAgeSelected")).isSelected());

        //multi checkbox
        driver.findElement(By.xpath("//label[normalize-space()='Option 1']")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Option 1']/child::input")).isSelected());

        Thread.sleep(1000);

        List<WebElement> listChecbox = driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//div//input"));
        System.out.println(listChecbox.size());

        for (int i = 0; i < listChecbox.size(); i++){
            listChecbox.get(i).click();

            Thread.sleep(1000);
        }

        Thread.sleep(1000);

        for (int i = 0; i < listChecbox.size(); i++){
            System.out.println(listChecbox.get(i).isSelected());

            Thread.sleep(1000);
        }

        closeDriver();


    }
}
