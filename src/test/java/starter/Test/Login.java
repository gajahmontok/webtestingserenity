package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginSteps;

public class Login {
    @Steps
    LoginSteps loginSteps;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginSteps.openHomePage();
        loginSteps.openLoginPage();
    }

    @When("I enter my username and password correctly")
    public void i_enter_my_username_and_password_correctly() {
        loginSteps.inputValidUsernamePassword();
    }

    @Then("I am taken to the timeline")
    public void i_am_taken_to_the_timeline() {
        loginSteps.validate();
    }
}