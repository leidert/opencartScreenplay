package com.sqa.opencartAutomation.tasks;

import static com.sqa.opencartAutomation.userinterfaces.HomeOpencartPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class GoToUserRegistration implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(USER_BUTTON),
                Click.on(REGISTER_USER_BUTTON),
                Click.on(BUTTON_RESTRICTION),
                Click.on(LINK_OUT_RESTRICTION)
        );
    }
    public static GoToUserRegistration theApp(){
        return instrumented(GoToUserRegistration.class);
    }

}
