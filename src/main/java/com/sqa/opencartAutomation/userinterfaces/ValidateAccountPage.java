package com.sqa.opencartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class ValidateAccountPage {
    public static Target SUCCESSFULLY_REGISTER = Target.the("registration successful message").located(By.xpath("//div[@id = 'content']/p[1]"));

}
