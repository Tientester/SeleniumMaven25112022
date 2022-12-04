package tientester.com.testcases.Bai8DropdownRadioCheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import tientester.com.testcases.common.Basetest;

public class LearnDropDownDynamic extends Basetest {

    public static void main(String[] args) throws InterruptedException {

        createDriver();
        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[normalize-space()='Select a Category']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[normalize-space()='Select a Category']//following-sibling::div//input")).sendKeys("Ho");
        Thread.sleep(2000);
//        driver.findElement(By.xpath("//em[normalize-space()='Ho']")).click();
        //Enter (dành cho 1 giá trị cần nawmf đầu tiên)
        driver.findElement(By.xpath("//a[normalize-space()='Select a Category']//following-sibling::div//input")).sendKeys(Keys.ENTER);

        WebElement textForDropDown = driver.findElement(By.xpath("//body[1]/section[1]/div[3]/div[1]/div[1]/div[2]/div[3]/div[1]"));

        //Kiểm tra lại text đã chọn bằng if

        if (textForDropDown.getText().equals("Hotels")){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        closeDriver();

    }
}
