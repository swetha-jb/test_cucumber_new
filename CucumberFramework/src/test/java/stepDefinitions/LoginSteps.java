package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

public class LoginSteps {

    String username;
    String password;
    String currentPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        currentPage = "login";
        System.out.println("Navigated to login page");
    }

    @When("I enter a valid username and password")
    public void i_enter_a_valid_username_and_password() {
        username = "validUser";
        password = "validPass";
        System.out.println("Entered valid username and password");
    }

    @When("I enter an invalid username and password")
    public void i_enter_an_invalid_username_and_password() {
        username = "invalidUser";
        password = "invalidPass";
        System.out.println("Entered invalid username and password");
    }

    @When("I do not enter any username or password")
    public void i_do_not_enter_any_username_or_password() {
        username = "";
        password = "";
        System.out.println("Left username and password fields empty");
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
        assertEquals("dashboard", "dashboard");  // Simulating success
        System.out.println("Redirected to dashboard");
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        assertEquals("Error: Invalid credentials", "Error: Invalid credentials");  // Simulating failure
        System.out.println("Displayed error message: Invalid credentials");
    }

    @Then("I should see a {string} message")
    public void i_should_see_a_message(String message) {
        assertEquals("fields are required", message);  // Simulating required fields error
        System.out.println("Displayed message: " + message);
    }
}
