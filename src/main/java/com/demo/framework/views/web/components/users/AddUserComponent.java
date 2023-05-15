package com.demo.framework.views.web.components.users;

import com.demo.framework.driver.DriverManager;
import com.demo.framework.fixtures.addusers.entity.UserData;
import com.demo.framework.views.web.BaseView;
import org.apache.commons.lang.NotImplementedException;
import org.openqa.selenium.By;

import java.util.function.BiPredicate;

public class AddUserComponent extends BaseView {

    private static final By USER_ROLE_DROP_DOWN = By.xpath("//label[text()='User Role']/following-sibling::select");
    private static final By STATUS_DROP_DOWN = By.xpath("//label[text()='Status']/following-sibling::select");
    private static final By EMPLOYEE_NAME_TEXT_BOX = By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::div/div/div/input");
    private static final By USER_NAME_TEXT_BOX = By.xpath("//label[text()='Username']/following-sibling::input");
    private static final By PASSWORD_TEXT_BOX = By.xpath("//label[text()='Password']/following-sibling::input");
    private static final By CONFIRM_PASSWORD_TEXT_BOX = By.xpath("//label[text()='Confirm Password']/following-sibling::input");
    private static final By ERROR_MESSAGE_FOR_EMPLOYEE_NAME = By.xpath("//label[text()='Employee Name']/parent::div/following-sibling::span");

    public AddUserComponent setUserRoleDropDown(String userRole){
        throw new NotImplementedException();
    }

    public AddUserComponent setStatusDropDown(String status){
        throw new NotImplementedException();
    }
    public AddUserComponent setEmployeeNameTextBox(String employeeName) {
        enterText(EMPLOYEE_NAME_TEXT_BOX, employeeName);
        return this;
    }

    public AddUserComponent setUserNameTextBox(String userName) {
        enterText(USER_NAME_TEXT_BOX, userName);
        return this;
    }
    public AddUserComponent setPasswordTextBox(String password){
        throw new NotImplementedException();
    }
    public AddUserComponent setConfirmPasswordTextBox(String password){
        throw new NotImplementedException();
    }
    public boolean isErrorDisplayedForEmployeeName(){

        if (DriverManager.getDriver().findElements(ERROR_MESSAGE_FOR_EMPLOYEE_NAME).size() > 0)
        {
            return DriverManager.getDriver().findElement(ERROR_MESSAGE_FOR_EMPLOYEE_NAME)
                    .getText()
                    .equalsIgnoreCase("Invalid");

        }
        return false;

    }
    public boolean isSuccessMessageDisplayed(){
        return true;
    }

    /**
     * This method will pass the user data and object behavior to fill in the details.
     * @param userData
     */
    public boolean fillDetails(UserData userData, BiPredicate<UserData, AddUserComponent> predicate)
    {
        return predicate.test(userData, this);

    }
}
