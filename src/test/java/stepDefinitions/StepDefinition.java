package stepDefinitions;



import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.junit.runner.RunWith;


public class StepDefinition {

    @Given("^user is on landing page $")
    public void user_is_on_landing_page() throws Throwable {
    	System.out.println("user on landing page");
        
    }

    @When("^user login into application by giving user name and password $")
    public void user_login_into_application_by_giving_user_name_and_password()  {
    	System.out.println("try to login ");
    }

    @Then("^home page is populated$")
    public void home_page_is_populated()  {
    	System.out.println("logged in successfully");
        
    }

    @And("^Crads are displayed  $")
    public void crads_are_displayed()  {
    	System.out.println("home page cards are seen ");
        
    }

}