package step_Def;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Login_Page_Pom;

public class Login_Page_step extends Base{
		Login_Page_Pom pom = new Login_Page_Pom();

	 

	    @Given("I am on the Facebook login page")
	    public void iAmOnTheFacebookLoginPage() {
	    	System.out.println("enter into login");
	    }

	    @When("I enter my username and password")
	    public void iEnterMyUsernameAndPassword() {
	    	
	      pom.login("sakthi", "dummy");
	    }

	    @When("I click the login button")
	    public void iClickTheLoginButton() {
	        
	       System.out.println("Login Clicked");
	    }

	    @Then("I should be redirected to the Facebook home page")
	    public void iShouldBeRedirectedToTheFacebookHomePage() {
	      System.out.println("Log in successful");
	     
	    }
	
}
