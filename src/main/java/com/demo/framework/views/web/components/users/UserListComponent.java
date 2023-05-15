package com.demo.framework.views.web.components.users;

import com.demo.framework.views.web.BaseView;
import org.openqa.selenium.By;

public class UserListComponent extends BaseView {
    private static final By ADD_BTN = By.xpath("//button[text()=' Add ']");

    public AddUserComponent setAddButton(){
        click(ADD_BTN);
        return new AddUserComponent();
    }
}
