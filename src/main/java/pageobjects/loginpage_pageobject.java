package pageobjects;


import static utils.credentials_reader.getUrl;
import static utils.credentials_reader.getUsername;
import static utils.credentials_reader.getPassword;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class loginpage_pageobject {
	
	public WebDriver driver;
	
	By Button1=By.xpath("//a[text()[normalize-space()='Sign in']]");
	By UserName = By.xpath("//input[contains(@class,'form-control input-block js-login-field')]");
	By Password = By.xpath("//input[contains(@class,'form-control input-block js-password-field')]");
	By Signin = By.xpath("//input[contains(@class,'btn btn-primary btn-block js-sign-in-button')]");
	
	  
	 public void viewLoginPage() throws IOException{
		 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(getUrl());

	    }
	
	public void navigatetoLoginpage() throws InterruptedException{
		driver.findElement(Button1).click();
	}
	
	public void passCredentials() throws IOException, InterruptedException {
		driver.findElement(UserName).sendKeys(getUsername());
		driver.findElement(Password).sendKeys(getPassword());
		Thread.sleep(2000);
		driver.findElement(Signin).click();
	}

	
	

}
