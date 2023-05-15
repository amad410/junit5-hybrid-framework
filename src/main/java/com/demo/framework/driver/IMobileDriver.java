package com.demo.framework.driver;

import com.demo.framework.driver.entity.MobileDriverData;
import com.demo.framework.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
    WebDriver getDriver(MobileDriverData driverData);
}
