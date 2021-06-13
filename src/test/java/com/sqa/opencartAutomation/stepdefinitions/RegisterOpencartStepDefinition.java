package com.sqa.opencartAutomation.stepdefinitions;
import com.sqa.opencartAutomation.models.DataUser;
import com.sqa.opencartAutomation.questions.RegisterQuestion;
import com.sqa.opencartAutomation.tasks.GoToUserRegistration;
import com.sqa.opencartAutomation.tasks.UserDataRegistration;
import com.sqa.opencartAutomation.userinterfaces.HomeOpencartPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterOpencartStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor leider = Actor.named("Leider");

    @Before
    public void setUp(){
        leider.can(BrowseTheWeb.with(hisBrowser));
        leider.wasAbleTo(Open.browserOn(new HomeOpencartPage()));
    }

    @Given("^that leider enters the user registry$")
    public void thatLeiderEntersTheUserRegistry() {
        leider.attemptsTo(GoToUserRegistration.theApp());
    }

    @When("^he enter the registration data$")
    public void heEnterTheRegistrationData(List<DataUser> dataList) {
        leider.attemptsTo(UserDataRegistration.inOpencartRegister(dataList.get(0)));
    }

    @Then("^Check the message on the screen$")
    public void checkTheMessageOnTheScreen(List<DataUser> dataList) {
        leider.should(seeThat(RegisterQuestion.validateQuestion(dataList.get(0))));
    }
}
