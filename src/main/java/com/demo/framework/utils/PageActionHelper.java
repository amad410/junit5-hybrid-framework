package com.demo.framework.utils;

import com.demo.framework.driver.Driver;
import com.demo.framework.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.function.Consumer;

public class PageActionHelper {

    private PageActionHelper(){}

    public static void waitAndClick(By by){
        DriverManager.getDriver().findElement(by).click();

    }

    public static void waitAndSendKeys(By by, String value){
        DriverManager.getDriver().findElement(by).sendKeys(value);

    }

    public static void selectDropDown(By by, Consumer<Select> consumer){
        consumer.accept(new Select(DriverManager.getDriver().findElement(by)));
    }
}
