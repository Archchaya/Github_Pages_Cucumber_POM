package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createrepository_pageobject  {

	public  WebDriver driver;

	
	By new_button = By.xpath("(//a[contains(@class,'btn btn-sm')])[1]");
	By repo_name = By.xpath("(//input[@class='form-control js-repo-name js-repo-name-auto-check short'])");
	By add_readme = By.xpath("(//input[@class='js-toggle-new-repo-default-branch-info js-repo-readme'])");
	By create_repo = By.xpath("//button[@class='btn-primary btn']");
	By public_repo = By.xpath("(//input[@type='radio'])[2]");
		
	
	
	 
	public  WebElement selectNewRepo(){
		WebElement bt =driver.findElement(new_button);
		return bt;
	}
}
