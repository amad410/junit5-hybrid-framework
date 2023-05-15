package com.demo.framework.views.mobile;

import com.demo.framework.driver.DriverManager;
import com.demo.framework.views.mobile.enums.ViewsScreenMenuItemType;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainView extends BaseView {
    public MainView() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverManager.getDriver()), this);
    }

    @iOSXCUITFindBy(xpath = "")
    @AndroidFindBy(accessibility = "WebView")
    private WebElement textboxEmail;

    private static final String VIEW_SCREEN_ELEMENT = "%s";

    public void clickOnViewScreenElement(ViewsScreenMenuItemType element) {
        By accessibilityId = AppiumBy.accessibilityId(String.format(VIEW_SCREEN_ELEMENT, element.getName()));
        scrollForMobile(textboxEmail);
        click(accessibilityId);
    }
}
