package com.demo.framework.views.mobile;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;

public class HomeView extends BaseView{
    private static final By VIEWS_ANDROID = AppiumBy.accessibilityId("Views");
    private static final By VIEWS_IOS = By.xpath("//*[@name='Views']");

    private HomeView() {
    }

    public static HomeView getHomeScreenInstance() {
        return new HomeView();
    }

    public MainView navigateToViewsScreen() {
        click(VIEWS_ANDROID, VIEWS_IOS);
        return new MainView();
    }
}
