package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.LoginStepsFailed_2;

public class LoginFailed_2 {
    @Steps
    LoginStepsFailed_2 loginStepsFailed_2;

    @Given("I am the Login Page")
    public void i_am_the_Login_Page() {
        loginStepsFailed_2.openHomePage();
        loginStepsFailed_2.openLoginPage();
    }

    @When("I enter my valid username and invalid password")
    public void i_enter_my_valid_username_and_invalid_password() {
        loginStepsFailed_2.inputValidUsernameandInvalidPassword();
    }

    @Then("I am not success on the page login")
    public void i_am_not_success_on_the_page_login() {
        loginStepsFailed_2.valdate();
    }
}