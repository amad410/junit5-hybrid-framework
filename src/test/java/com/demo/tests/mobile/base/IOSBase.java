package com.demo.tests.mobile.base;

import com.demo.framework.driver.Driver;
import com.demo.framework.enums.MobilePlatformType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class IOSBase {

    @BeforeEach
    public void setUp(){
        Driver.initDriverForMobile(MobilePlatformType.IOS);
    }

    @AfterEach
    public void tearDown(){
        Driver.quitDriver();
    }
}
