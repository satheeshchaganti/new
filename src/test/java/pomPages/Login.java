package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
@FindBy(id="login-link")
WebElement Login;

@FindBy(xpath="//input[@type='text']")
WebElement Uname;

@FindBy(xpath="//input[@type='password']")
WebElement Pwd;

@FindBy(xpath="//span[contains(.,'Submit')]")
WebElement submit;

public void Login(String uname,String pword) throws Exception
{
	Thread.sleep(2000);
	Login.click();
	Uname.sendKeys(uname);
	Pwd.sendKeys(pword);
	submit.click();
}










}
