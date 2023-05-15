package com.demo.framework.config.factory;

import com.demo.framework.config.ApiConfig;
import com.demo.framework.config.FrameworkConfig;
import org.aeonbits.owner.ConfigCache;

public final class ApiConfigFactory {

    private ApiConfigFactory(){}

    public static ApiConfig getConfig(){
        return ConfigCache.getOrCreate(ApiConfig.class);
    }
}
