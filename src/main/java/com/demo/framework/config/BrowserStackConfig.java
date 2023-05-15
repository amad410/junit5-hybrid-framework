package com.demo.framework.config;

import com.demo.framework.config.converters.StringToURLConverter;
import org.aeonbits.owner.Config;
import java.net.URL;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/browser-stack.properties"
})
public interface BrowserStackConfig extends Config {

    @Key("username")
    String username();
    @Key("key")
    String key();
    @DefaultValue("https://${username}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToURLConverter.class)
    URL browserStackURL();

}
