package stepdefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.createrepository_pageobject;
import pageobjects.loginpage_pageobject;


public class create_repository_stepdef extends loginpage_pageobject{
	public WebDriver driver;
	createrepository_pageobject create_repo_po = new createrepository_pageobject();
	
	@Given("click newrepository")
	public void click_on_the_plus_icon_dropdown_and_newrepository() {
	    create_repo_po.selectNewRepo().click();
	}

	@Then("Insert the repository name")
	public void insert_the_repository_name() {
	    
	}

	@Then("select as a public repo and add readme file")
	public void select_as_a_public_repo_and_add_readme_file() {
	   
	}

	@And("click on the create repository name")
	public void click_on_the_create_repository_name() {
	    
	}
}
