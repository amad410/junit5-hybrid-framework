package com.demo.tests.mobile;

import com.demo.framework.annotations.IosTest;
import com.demo.framework.annotations.AndroidTest;
import com.demo.framework.views.mobile.HomeView;
import com.demo.framework.views.mobile.IOSHomeView;
import com.demo.tests.mobile.base.MobileBase;
import static com.demo.framework.views.mobile.enums.ViewsScreenMenuItemType.WEB_VIEW;

/**
 * This sample mobile test class handles running mobile tests across platforms
 */
public class MobileTest extends MobileBase {

    @AndroidTest
    void testLoginAndroid() {
        HomeView.getHomeScreenInstance()
                .navigateToViewsScreen()
                .clickOnViewScreenElement(WEB_VIEW);
        //assertion
    }

    @IosTest
    void testLoginIos() {
        IOSHomeView.getInstance()
                .addANewTask();

        //add assertion
    }

    @AndroidTest
    @IosTest
    void testLoginBoth() {
        HomeView.getHomeScreenInstance()
                .navigateToViewsScreen()
                .clickOnViewScreenElement(WEB_VIEW);
        //assertion
    }
}
