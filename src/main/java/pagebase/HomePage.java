package pagebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends Pages{

	public HomePage(WebDriver driver) {
		super(driver);
		actions= new Actions(driver);
	}
   
	@FindBy (linkText ="Admin")
	WebElement adminMenu;
	
	@FindBy (id ="menu_admin_UserManagement")
	WebElement UserManagement;
	
	@FindBy (id ="menu_admin_viewSystemUsers")
	WebElement User;
	
	public void NavigateToUserPage() {
		actions
		.moveToElement(adminMenu)
		.moveToElement(UserManagement)
		.moveToElement(User)
		.click()
		.build()
		.perform();
	}
	
}
