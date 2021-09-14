package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver = null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Stpe - browser is open");
		System.setProperty("webdriver.chrome.driver","C:\\Webdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside Stpe - user is on google search page");	
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}

	@When("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
		System.out.println("Inside Stpe - user enter a text in search box");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Celt Abroad");
	}

	@When("hits enter")
	public void hits_enter() {
		System.out.println("Inside Stpe - hits enter");	    
	}

	@Then("user is navigated to search result")
	public void user_is_navigated_to_search_result() {
		System.out.println("Inside Stpe - user is navigated to search result");	    
	}
}
