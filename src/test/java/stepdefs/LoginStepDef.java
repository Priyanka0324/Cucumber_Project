package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

	WebDriver driver = Hooks.driver ; //Here the we are using the hooks class for driver

	@Given("I have launched the application")
	public void i_have_launched_the_application() {
		// Write code here that turns the phrase above into concrete actions
		

		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@When("I enter the correct username and password")
	public void i_enter_the_correct_username_and_password() {
		// Write code here that turns the phrase above into concrete actions

		WebElement userID = driver.findElement(By.name("user_login"));
		userID.sendKeys("piya@gmail.com");

		// Step3. Enter pswd
		WebElement Pswd = driver.findElement(By.id("password"));
		Pswd.sendKeys("pomKabcde1");
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		
	}

	@When("I enter the incorrect username and password")
	public void i_enter_the_incorrect_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		WebElement userID = driver.findElement(By.name("user_login"));
		userID.sendKeys("piya@gmail.com");

		// Step3. Enter pswd
		WebElement Pswd = driver.findElement(By.id("password"));
		Pswd.sendKeys("pomKabcde1");
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String Exp_error) {
		// Write code here that turns the phrase above into concrete actions
		WebElement Error = driver.findElement(By.id("msg_box"));
		String ActualError = Error.getText();
		
		Assert.assertEquals(Exp_error, ActualError);
		
	}
	@And("I click on the Login Link")
	public void i_click_on_the_Login_Link() {
		// Write code here that turns the phrase above into concrete actions
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));  // findelement returns a single webelement
		LoginLink.click();

	}

	@When("I click on Login Button")
	public void i_click_on_Login_Button() {
		// Write code here that turns the phrase above into concrete actions
		WebElement Login = driver.findElement(By.name("btn_login"));
		Login.click();
	}
	
	@When("I enter the username as {string} and password as {string}")
	public void i_enter_the_username_as_and_password_as(String UserNameVal, String pwdVal) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement userID = driver.findElement(By.name("user_login"));
		userID.sendKeys(UserNameVal);

		// Step3. Enter pswd
		WebElement Pswd = driver.findElement(By.id("password"));
		Pswd.sendKeys(pwdVal);
	}
}
