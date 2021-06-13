package com.sqa.opencartAutomation.tasks;

import com.sqa.opencartAutomation.models.DataUser;
import static com.sqa.opencartAutomation.userinterfaces.RegisterOpencartPage.*;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserDataRegistration implements Task {

    DataUser dataUser;

    public UserDataRegistration(DataUser dataUser) {
        this.dataUser = dataUser;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(dataUser.getFirstNameUser()).into(INPUT_FIRST_NAME),
                Enter.theValue(dataUser.getLastNameUser()).into(INPUT_LAST_NAME),
                Enter.theValue(dataUser.getEmailUser()).into(INPUT_EMAIL_REGISTER),
                Enter.theValue(dataUser.getTelephoneUser()).into(INPUT_TELEPHONE_REGISTER),
                Enter.theValue(dataUser.getPasswordUser()).into(INPUT_PASSWORD_REGISTER),
                Enter.theValue(dataUser.getPasswordConfirm()).into(INPUT_PASSWORD_CONFIRM),
                Click.on(CHECKBOX_PRIVACY_POLICY),
                Click.on(BUTTON_CONTINUE_REGISTER)
        );
    }
    public static UserDataRegistration inOpencartRegister(DataUser user){
        return instrumented(UserDataRegistration.class, user);
    }
}
