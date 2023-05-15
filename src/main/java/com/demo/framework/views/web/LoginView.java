package com.demo.framework.views.web;

import org.openqa.selenium.By;

public class LoginView extends BaseView {

    private static final By USERNAME_TEXTBOX = By.xpath("//input[@name='username']");
    private static final By PASSWORD_TEXTBOX = By.xpath("//input[@name='password']");
    private static final  By LOGIN_BTN = By.xpath("//button");

    public LoginView setUserNameText(String username){
        enterText(USERNAME_TEXTBOX,username);
        return this;
    }

    public LoginView setPasswordText(String password){
        enterText(PASSWORD_TEXTBOX,password);
        return this;
    }
    public LoginView clickLoginBtn(){
        click(LOGIN_BTN);
        return this;
    }

    public DashboardView login(String username, String password) throws InterruptedException {
        Thread.sleep(8000);
        setUserNameText(username).setPasswordText(password).clickLoginBtn();
        return new DashboardView();
    }

    public LoginView getInstance(){
        return new LoginView();
    }
}
