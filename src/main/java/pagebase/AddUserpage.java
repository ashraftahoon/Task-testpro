package pagebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AddUserpage extends Pages {

	public AddUserpage(WebDriver driver) {
		super(driver);
		
	}
   
	@FindBy(name="btnAdd")
	WebElement addbtnElement;
	
	@FindBy(id="systemUser_userType")
	WebElement userRole;
	
	@FindBy (css="input.formInputText.ac_input")
	WebElement Employeename;
	
	@FindBy(id="systemUser_userName")
	WebElement UserName;
	
	@FindBy(id="systemUser_status")
	WebElement Status;
	
	@FindBy(id="systemUser_password")
	WebElement password;
	
	@FindBy(id="systemUser_confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(css="input.addbutton")
	WebElement SaveBtn;
	
	public void AddNewUser() {
		addbtnElement.click();
		Select =new Select(userRole);
		Select.selectByVisibleText("ESS");
		Employeename.sendKeys("Orange Test");
		UserName.sendKeys("Ashraf hussin");
		Select =new Select(Status);
		Select.selectByIndex(0);
		password.sendKeys("Ashraf1*");
		confirmpassword.sendKeys("Ashraf1*");
		SaveBtn.click();
	}
}
