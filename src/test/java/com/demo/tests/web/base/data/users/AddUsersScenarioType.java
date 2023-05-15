package com.demo.tests.web.base.data.users;

import br.com.six2six.fixturefactory.Fixture;
import com.demo.framework.fixtures.addusers.entity.UserData;
import com.demo.framework.views.web.components.users.AddUserComponent;
import lombok.Getter;

import java.util.function.BiPredicate;

/**
 * This class will create and store all user predicates in the AddUsersPredicateFactory class
 */
@Getter
public enum AddUsersScenarioType {

    VALID(AddUsersPredicateFactory.getPredicate("valid"), Fixture.from(UserData.class).gimme("valid")),

    JUST_EMPLOYEE_NAME(AddUsersPredicateFactory.getPredicate("just_employeename"),
            Fixture.from(UserData.class).gimme("just_employeename"));

    private final BiPredicate<UserData, AddUserComponent> predicate;
    private final UserData userData;

    AddUsersScenarioType(BiPredicate<UserData, AddUserComponent> predicate, UserData userData) {
        this.predicate = predicate;
        this.userData = userData;
    }
}
