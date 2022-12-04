package tientester.com.testcases.Bai8DropdownRadioCheckbox;

import org.openqa.selenium.By;
import tientester.com.testcases.common.Basetest;

public class LearnRadioButton extends Basetest {
    public static void main(String[] args) throws InterruptedException {

        createDriver();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        Thread.sleep(2000);
        Boolean radioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']/child::input")).isSelected();
        System.out.println(radioMale);
        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']/child::input")).click();
        Thread.sleep(1000);

        Boolean radioMale1 = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']/child::input")).isSelected();
        System.out.println(radioMale1);


        //Kiểm tra dạng Radio
        //Click chọn giá trị thứ 2
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Female']/child::input")).click();
        //Kiểm tra giá trị thứ 2 là true
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Female']/child::input")).isSelected());
        //Kiểm tra giá trị  1 là false
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//label[normalize-space()='Male']/child::input")).isSelected());

        closeDriver();

    }
}
