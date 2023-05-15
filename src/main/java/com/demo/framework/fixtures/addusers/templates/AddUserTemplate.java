package com.demo.framework.fixtures.addusers.templates;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import com.demo.framework.fixtures.addusers.entity.UserData;

/**
 * This class handles the responsibility in creating templated user data.
 */
public class AddUserTemplate implements TemplateLoader {

    /**
     * This method will load random values from a single or dataset combination
     * for the respective User Data property. It is important to note these data sets can be
     * expanded.
     * There are two templates here with different labels called:
     *  - valid - passes user data
     *  - just_employeename - passes user data with just employee field
     */
    @Override
    public void load(){
        Fixture.of(UserData.class).addTemplate("valid", new Rule(){{
            add("userRole", random("ESS, Admin"));
            add("employeeName", uniqueRandom("John Doe", "Admin A"));
            add("userName", uniqueRandom("jd1292"));
            add("status", uniqueRandom("Enabled", "Disabled"));
            add("password", uniqueRandom("Pass1220"));
            add("message", uniqueRandom("Success Message is not displayed"));
        }});

        Fixture.of(UserData.class).addTemplate("just_employeename", new Rule(){{
            add("employeeName", random("addnd0eedd"));
            add("message", uniqueRandom("Error Message is not displayed"));
        }});
    }
}
