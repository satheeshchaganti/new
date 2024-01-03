package newFB;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pomPages.Fb;

public class Facebook {
public 	WebDriver driver;
	Fb f=PageFactory.initElements(driver,Fb.class);

	@Given("User Launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		driver=new FirefoxDriver();
		driver.manage().window().maximize(); 

	}

	@When("User open the URL")
	public void user_open_the_url() {

		driver.get("https://www.Facebook.com");

	}

	@When("User enter email and password")
	public void user_enter_email_and_password() {
	 
		f.email();
	
	
	}
	@When("User click on login")
	public void user_click_on_login() throws Exception {
		f.login();
		Thread.sleep(2000);
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() {
		f.logout();

	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}

}
