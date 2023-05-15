package com.demo.tests.mobile;

import com.demo.framework.views.mobile.HomeView;
import com.demo.tests.mobile.base.AndroidBase;
import org.junit.jupiter.api.Test;

import static com.demo.framework.views.mobile.enums.ViewsScreenMenuItemType.WEB_VIEW;

/**
 * This sample Android test class handles running mobile tests for Android.
 * However, please refer to clas 'MobileTest' as the optimum approach
 * across platform.
 */

public class AndroidTest extends AndroidBase {

    @Test
    void testLoginAndroid() {
        HomeView.getHomeScreenInstance()
                .navigateToViewsScreen()
                .clickOnViewScreenElement(WEB_VIEW);
        //assertion
    }
}
