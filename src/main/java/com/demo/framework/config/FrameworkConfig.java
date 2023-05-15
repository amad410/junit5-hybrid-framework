package com.demo.framework.config;

import com.demo.framework.config.converters.*;
import com.demo.framework.enums.*;
import org.aeonbits.owner.Config;

import java.net.URL;

/**
 * This class will handle configurations needed for the framework by searching specific property files.
 * It also can handle passing in system properties from maven commandline and environment variables
 * passed in from Jenkins.
 */
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
        "file:${user.dir}/src/test/resources/qa-config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("qa")
    String environment();

    @Key("${environment}.webUrl")
    String webUrl();

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType browserRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();

    @Key("runModeMobile")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType mobileRunMode();

    @Key("mobileRemoteMode")
    @ConverterClass(StringToMobileRemoteModeTypeConverter.class)
    MobileRemoteModeType mobileRemoteMode();
    @Key("seleniumGridURL")
    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();
    @Key("selenoidURL")
    @ConverterClass(StringToURLConverter.class)
    URL selenoidURL();

    @ConverterClass(StringToURLConverter.class)
    @DefaultValue("http://0.0.0.0:4723/wd/hub")
    URL localAppiumServerURL();

    @ConverterClass(StringToMobilePlatformTypeConverter.class)
    @DefaultValue("android")
    MobilePlatformType mobilePlatformType();


}
