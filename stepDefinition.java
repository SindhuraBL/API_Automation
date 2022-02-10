package stepDefinition;

import org.junit.runner.RunWith;

//import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on netbanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("navigated to login url");
      
    }

    @When("^User logs into application with username and password$")
    public void user_logs_into_application_with_username_and_password() throws Throwable {
       System.out.println("loggs in");
    }

    @Then("^Home page is populated And cards are displayed$")
    public void home_page_is_populated_and_cards_are_displayed() throws Throwable {
        System.out.println("Validated home page");
    }

}