package com.sqa.opencartAutomation.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://opencart.abstracta.us/index.php")
public class HomeOpencartPage extends PageObject {

    public static Target USER_BUTTON =  Target.the("click on the user icon").located(By.xpath("//a[@class = 'dropdown-toggle']/span[1]"));
    public static Target REGISTER_USER_BUTTON =  Target.the("click on the register user").located(By.xpath("//a[@href='https://opencart.abstracta.us:443/index.php?route=account/register']"));
    public static Target BUTTON_RESTRICTION =  Target.the("click on the configuration button of the https restriction page").located(By.id("details-button"));
    public static Target LINK_OUT_RESTRICTION =  Target.the("click the setting link on the https restriction page").located(By.id("proceed-link"));

}