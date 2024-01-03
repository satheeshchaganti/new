package stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.*;
import pomPages.Login;
import pomPages.Payment;

public class Pay {
	WebDriver driver;
	
	@Given("user is on Home Page and entered url as {string}")
	public void user_is_on_home_page_and_entered_url_as(String url) throws Exception {
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
	}
	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String uname, String pword) throws Exception {
		Login L=PageFactory.initElements(driver,Login.class);
		   L.Login(uname,pword); 
	}
	

	@When("click on payments to user")
	public void click_on_payments_to_user() throws Exception {
		Payment P=PageFactory.initElements(driver,Payment.class);
       P.pay();

	}

	@When("user entered payment details")
	public void user_entered_payment_details() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".btn .bi")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Hotel Oasis')]")).click();
		driver.findElement(By.xpath("//input")).sendKeys("500");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button.text-left")).click();
		driver.findElement(By.linkText("Pay now")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".btn > span")).click();
		Thread.sleep(3000);
	}

	@Then("clicks on confirm")
	public void clicks_on_confirm() {

		driver.findElement(By.xpath("//span[contains(.,'Confirm')]")).click();


	}


}
