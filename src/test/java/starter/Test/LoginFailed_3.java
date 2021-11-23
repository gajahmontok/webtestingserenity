package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginStepsFailed_3;

public class LoginFailed_3 {
    @Steps
    LoginStepsFailed_3 loginStepsFailed_3;

    @Given("I am on the Login Page")
    public void i_am_on_the_Login_Page() {
        loginStepsFailed_3.openHomePage();
        loginStepsFailed_3.openLoginPage();
    }

    @When("I enter my invalid username and password")
    public void i_enter_my_invalid_username_and_password() {
        loginStepsFailed_3.inputInvalidUsernameandPassword();
    }

    @Then("I am not login")
    public void i_am_not_login() {
        loginStepsFailed_3.inputInvalidUsernameandPassword();
    }
}