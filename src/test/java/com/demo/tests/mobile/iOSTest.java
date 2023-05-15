package com.demo.tests.mobile;

import com.demo.framework.views.mobile.IOSHomeView;
import com.demo.tests.mobile.base.IOSBase;
import org.junit.jupiter.api.Test;

/**
 * This sample iOS test class handles running mobile tests for Android.
 * However, please refer to clas 'MobileTest' as the optimum approach
 * across platform.
 */

public class iOSTest extends IOSBase {

    @Test
    void testLoginIos() {
        IOSHomeView.getInstance()
                .addANewTask();

        //add assertion
    }
}
