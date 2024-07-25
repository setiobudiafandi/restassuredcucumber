package test.java.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class user {
    @Given("^I am on the register page$")
    public void I_am_on_the_register_page() throws Throwable {
        
    }

    @When("^I input the correct data$")
    public void I_input_the_correct_data() throws Throwable {
        userStep.register("TokoSet", "ab@c.id", "pass123");
    }

    @Then("^I can register successfully$")
    public void I_can_register() throws Throwable {
        // userStep.getSuccessStatus();
    }
}
