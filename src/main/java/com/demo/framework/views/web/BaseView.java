package com.demo.framework.views.web;

import com.demo.framework.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.function.Function;
import java.util.function.Predicate;
import static com.demo.framework.utils.PageActionHelper.waitAndClick;
import static com.demo.framework.utils.PageActionHelper.waitAndSendKeys;

public class BaseView {

    public BaseView enterText(By by, String value){
        waitAndSendKeys(by,value);
        return this;
    }

    public BaseView click(By by){
        waitAndClick(by);
        return this;
    }

    public static String getAttribute(By by, Function<WebElement, String> attributeFunction) {
        return attributeFunction.apply(DriverManager.getDriver().findElement(by));
    }

    public static boolean isPresent(By by, Predicate<WebElement> elementPredicate) {
        return elementPredicate.test(DriverManager.getDriver().findElement(by));
    }
}
