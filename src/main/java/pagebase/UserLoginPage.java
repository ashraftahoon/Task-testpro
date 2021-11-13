package pagebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends Pages {

	public UserLoginPage(WebDriver driver) {
		super(driver);
	}
	
    @FindBy(id="txtUsername")
    WebElement UserName;
    
    @FindBy(id="txtPassword")
    WebElement Password;
    
    @FindBy(css="input.button")
    WebElement buttn;
    
    public void UserLogin(String name , String pass)
    {
    	UserName.sendKeys(name);
    	Password.sendKeys(pass);
    	buttn.click();
    }
}
