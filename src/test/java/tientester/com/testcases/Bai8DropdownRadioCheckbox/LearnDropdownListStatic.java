package tientester.com.testcases.Bai8DropdownRadioCheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import tientester.com.testcases.common.Basetest;

public class LearnDropdownListStatic extends Basetest {

    public static void main(String[] args) throws InterruptedException {

        createDriver();
        driver.get("https://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        Select select = new Select(driver.findElement(By.id("select-demo")));

        Boolean check = select.isMultiple();
        System.out.println(check);

        select.selectByVisibleText("Thursday");
//        select.selectByValue("Monday");

        System.out.println(select.getOptions().size()); // số lượng Option có trong thẻ select


        System.out.println(select.getFirstSelectedOption().getText());


        Thread.sleep(2000);



        closeDriver();


    }
}
