package com.demo.framework.views.mobile;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class IOSHomeView extends BaseView {
    // Java client version > 8.x
    private static final By ADD_TASK = AppiumBy.accessibilityId("plus.circle");

    private IOSHomeView() {
    }

    public static IOSHomeView getInstance() {
        return new IOSHomeView();
    }

    public void addANewTask() {
        click(ADD_TASK, ADD_TASK);
    }
}
