package starter.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Steps.ReadBookPageSteps;

public class ReadBook {
    @Steps
    ReadBookPageSteps readBookPageSteps;

    @Given("I am succes login")
    public void i_am_succes_login() {
        readBookPageSteps.openHomePage();
    }

    @When("I read books in the bookstore")
    public void i_read_books_in_the_bookstore() {
        readBookPageSteps.openLoginPage();
    }

    @Then("I am taken to the website of books")
    public void i_am_taken_to_the_website_of_books() {
        readBookPageSteps.readBookPage();
    }
}
