package com.demo.tests.web.base;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.demo.framework.driver.Driver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class WebBase {

    @BeforeAll
    public static void beforeAll(){
        FixtureFactoryLoader.loadTemplates("com.demo.framework.fixtures");
    }

    @BeforeEach
    public void setUp(){
        Driver.initDriverForWeb();
    }

    @AfterEach
    public void tearDown(){
        Driver.quitDriver();
    }
}
