package pomPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Fb {

	

	
		
//		element properties
		@FindBy(xpath ="//*[@id='email'")
		WebElement email;
		
		@FindBy(xpath ="//*[@id='pass']")
		WebElement Password;
		
		@FindBy(xpath ="//*[@name='login']")
		WebElement Login;
		
		@FindBy(xpath ="//button[@name='logout']")
		WebElement Logout;
		
		//elements methods

		public void email()
		{
			email.clear();
			email.sendKeys("9550495586");
		
			Password.clear();
			Password.sendKeys("9347440829@kpkp");
			
		}
		
		public void login() throws Exception
		{
			Login.click();
			Thread.sleep(3000);
			
		}
		public void logout()
		{
			Logout.click();
			
			
		}	
			
			
		

	}

