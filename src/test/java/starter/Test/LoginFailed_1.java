package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginStepsFailed_1;

public class LoginFailed_1 {
    @Steps
    LoginStepsFailed_1 loginStepsFailed_1;

    @Given("I am Login Page")
    public void i_am_Login_Page() {
        loginStepsFailed_1.openHomePage();
        loginStepsFailed_1.openLoginPage();
    }

    @When("I enter my invalid username and valid password")
    public void i_enter_my_invalid_username_and_valid_password() {
        loginStepsFailed_1.inputInvalidUsernameandValidPassword();
    }

    @Then("I am not success login")
    public void i_am_not_success_login() {
        loginStepsFailed_1.valdate();
    }
}