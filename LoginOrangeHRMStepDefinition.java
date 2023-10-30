package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginOrangeHRMStepDefinition {
WebDriver driver;
	
	@Given("user is in login page")
	public void user_is_in_login_page() {
	    
		ChromeOptions c = new ChromeOptions(); // I'm new here...
		c.addArguments("--remote-allow-origins=*"); // I'm new here...
		driver = new ChromeDriver(c); // c is declared and setup above...
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		System.out.println("@ Step 01");
		
	}

	@When("User enter valid username and valid password")
	public void User_enter_valid_username_and_valid_password() {
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	    driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
	}

	@And("User clicks the login button")
	public void user_clicks_the_login_button() {
	   	driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Then("User should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
	    
	}
}
	
	    
