package com.demo.tests.web;

import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import com.demo.framework.fixtures.addusers.entity.UserData;
import com.demo.framework.views.web.LoginView;
import com.demo.framework.views.web.components.users.AddUserComponent;
import com.demo.tests.web.base.WebBase;
import com.demo.tests.web.base.data.users.AddUsersScenarioType;
import io.github.sskorol.core.DataSupplier;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.util.function.BiPredicate;
import java.util.stream.Stream;

public class WebTest extends WebBase {

    @ParameterizedTest
    @EnumSource(value=AddUsersScenarioType.class,
        names = {"VALID"},
        mode = EnumSource.Mode.EXCLUDE)
    public void addUsers(AddUsersScenarioType addUsersScenarioType) throws InterruptedException {
        boolean isMessageDisplayed = new LoginView().login("Admin", "admin123")
                .navigateToAdminView()
                .getUserListComponent()
                .setAddButton()
                .fillDetails(addUsersScenarioType.getUserData(), addUsersScenarioType.getPredicate());

        Assertions.assertThat(isMessageDisplayed)
                    .withFailMessage(addUsersScenarioType.getUserData().getMesssage())
                    .isFalse();
    }

    @DataSupplier(runInParallel = true)
    public Stream<AddUsersScenarioType> getData(){
        FixtureFactoryLoader.loadTemplates("com.demo.framework.fixtures");
        return Stream.of(AddUsersScenarioType.values());
    }

    BiPredicate<UserData, AddUserComponent> justEmployeeNamePredicate = (userData, addUserComponent) -> {
        addUserComponent.setEmployeeNameTextBox(userData.getEmployeeName());
        return addUserComponent.isErrorDisplayedForEmployeeName();
    };

    BiPredicate<UserData, AddUserComponent> validPredicate = (userData, addUserComponent) -> {
        addUserComponent.setEmployeeNameTextBox(userData.getUserRole());
        addUserComponent.setEmployeeNameTextBox(userData.getUserName());
        addUserComponent.setEmployeeNameTextBox(userData.getPassword());
        addUserComponent.setEmployeeNameTextBox(userData.getStatus());
        addUserComponent.setEmployeeNameTextBox(userData.getEmployeeName());
        return addUserComponent.isSuccessMessageDisplayed();
    };
}
