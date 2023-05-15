package com.demo.tests.mobile.base;

import com.demo.framework.config.factory.ConfigFactory;
import com.demo.framework.driver.Driver;
import com.demo.framework.enums.MobilePlatformType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class MobileBase {
    private final MobilePlatformType mobilePlatformType = ConfigFactory.getConfig()
            .mobilePlatformType();

    @BeforeEach
    public void setUp(){
        Driver.initDriverForMobile(mobilePlatformType);
    }
    
    @AfterEach
    public void tearDown(){
        Driver.quitDriver();
    }
}
