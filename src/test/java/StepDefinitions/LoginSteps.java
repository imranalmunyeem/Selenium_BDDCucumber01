package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("Inside Stpe - user is on login page");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    System.out.println("Inside Stpe - user enters username and password");
	    //throw new io.cucumber.java.PendingException();
	}

	@When("clicks on login page")
	public void clicks_on_login_page() {
	    System.out.println("Inside Stpe - clicks on login page");
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    System.out.println("Inside Stpe - user is navigated to the home page");
	    //throw new io.cucumber.java.PendingException();
	}
}
