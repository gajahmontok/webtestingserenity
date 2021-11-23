package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.CreateListBookSteps;

public class CreateListBook {

    @Steps
    CreateListBookSteps createListBookSteps;

    @Given("I am success login")
    public void i_am_success_login() {
        createListBookSteps.openHomePage();
    }

    @When("I am create list book")
    public void i_am_create_list_book() {
        createListBookSteps.openLoginPage();
    }

    @Then("I am success add book")
    public void i_am_success_add_book() {
        createListBookSteps.createAddListBook();
    }

}
