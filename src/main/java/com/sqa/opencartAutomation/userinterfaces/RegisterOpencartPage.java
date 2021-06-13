package com.sqa.opencartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class RegisterOpencartPage {
    public static Target INPUT_FIRST_NAME =  Target.the("register first name").located(By.id("input-firstname"));
    public static Target INPUT_LAST_NAME =  Target.the("Register last name").located(By.id("input-lastname"));
    public static Target INPUT_EMAIL_REGISTER =  Target.the("Register the Email").located(By.id("input-email"));
    public static Target INPUT_TELEPHONE_REGISTER =  Target.the("Register the telephone").located(By.id("input-telephone"));
    public static Target INPUT_PASSWORD_REGISTER =  Target.the("Registrar the password").located(By.id("input-password"));
    public static Target INPUT_PASSWORD_CONFIRM =  Target.the("Registrar password confirm").located(By.id("input-confirm"));
    public static Target CHECKBOX_PRIVACY_POLICY =  Target.the("click in privacy policy checkbox").located(By.xpath("//input[@type = 'checkbox']"));
    public static Target BUTTON_CONTINUE_REGISTER =  Target.the("click in de button register").located(By.xpath("//input[@type = 'submit']"));



//    By messageFailure = By.xpath("//div[contains(text(), ' Warning: E-Mail Address is already registered!')]");

}
