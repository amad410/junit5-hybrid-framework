package com.demo.framework.driver.impl.web;

import com.demo.framework.driver.IWebDriver;
import com.demo.framework.driver.entity.WebDriverData;
import com.demo.framework.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(),
                driverData.getBrowserType());
    }
}
