package stepdefinitions;

import java.io.IOException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageobjects.loginpage_pageobject;
public class github_login_stepdef {

	loginpage_pageobject loginPO = new loginpage_pageobject();
		
	@Given("I am login to the github")
	public void i_am_login_to_the_github() throws IOException, InterruptedException {
		loginPO.viewLoginPage();
	    loginPO.navigatetoLoginpage();
	}

	@And("System navigate to the github home page")
	public void system_navigate_to_the_github_home_page() throws IOException, InterruptedException {
		   loginPO.passCredentials();
	}

}
