package com.demo.framework.driver;

import com.demo.framework.driver.entity.MobileDriverData;
import com.demo.framework.driver.entity.WebDriverData;
import com.demo.framework.driver.factory.DriverFactory;
import com.demo.framework.config.factory.ConfigFactory;
import com.demo.framework.enums.MobilePlatformType;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

public final class Driver {

    private Driver(){}

    public static WebDriver driver;

    public static void initDriverForWeb(){
        if(Objects.isNull(DriverManager.getDriver()))
        {
            WebDriverData driverData = new WebDriverData(ConfigFactory.getConfig().browser(),ConfigFactory.getConfig().browserRemoteMode());
            WebDriver driver = DriverFactory.getDriverForWeb(ConfigFactory.getConfig().browserRunMode())
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
            loadURL();
        }

    }
    public static void loadURL(){
        DriverManager.getDriver().get(ConfigFactory.getConfig().webUrl());
    }

    public static void initDriverForMobile(MobilePlatformType mobilePlatformType){
        //As of right now, the platform type value is defaulted, but you can
        //parameterize it and have it come from the test.

        MobileDriverData driverData = new MobileDriverData(mobilePlatformType,ConfigFactory.getConfig().mobileRemoteMode());
        WebDriver driver = DriverFactory.getDriverForMobile(ConfigFactory.getConfig()
                .mobileRunMode()).getDriver(driverData);
        DriverManager.setDriver(driver);
    }

    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver()))
        {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }

    }
}
