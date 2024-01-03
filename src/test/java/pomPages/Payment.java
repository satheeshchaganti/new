package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment {
@FindBy(partialLinkText="Banking")
WebElement Banking;

@FindBy(partialLinkText="Payment to user")
WebElement PayUser;

public void pay() throws Exception
{
	Thread.sleep(2000);
	Banking.click();
	Thread.sleep(3000);
	PayUser.click();

}
}
