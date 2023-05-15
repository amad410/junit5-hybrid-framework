package com.demo.framework.driver.impl.mobile;

import com.demo.framework.driver.IMobileDriver;
import com.demo.framework.driver.entity.MobileDriverData;
import com.demo.framework.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {
    @Override
    public WebDriver getDriver(MobileDriverData driverData) {
        return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(),
                driverData.getMobilePlatformType());
    }
}
