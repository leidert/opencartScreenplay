package com.sqa.opencartAutomation.questions;

import static com.sqa.opencartAutomation.userinterfaces.ValidateAccountPage.*;

import com.sqa.opencartAutomation.models.DataUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class RegisterQuestion implements Question {
    private final DataUser dataUser;

    public RegisterQuestion(DataUser dataUser) {
        this.dataUser = dataUser;
    }

    @Override
    public Object answeredBy(Actor actor) {
        if (Text.of(SUCCESSFULLY_REGISTER).viewedBy(actor).asString().equals(dataUser.getSuccessfulMessage()))
            return true;
        else
            return false;
    }
    public static RegisterQuestion validateQuestion(DataUser dataUser){
        return new RegisterQuestion(dataUser);
    }
}