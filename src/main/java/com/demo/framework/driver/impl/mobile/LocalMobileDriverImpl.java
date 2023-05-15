package com.demo.framework.driver.impl.mobile;

import com.demo.framework.driver.IMobileDriver;
import com.demo.framework.driver.entity.MobileDriverData;
import com.demo.framework.driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {
    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
    }
}
