package pagebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AssertUserData extends Pages{
	
	public AssertUserData(WebDriver driver) {
		super(driver);
		
	}
    
	@FindBy(xpath="//option[contains(text(),'ESS')]")
	public WebElement assertuserrole;
	
	@FindBy(xpath="//*[@id=\"systemUser_employeeName_empName\"]")
	public WebElement assertemployeename;
	
	@FindBy(xpath="//*[@id=\"systemUser_userName\"]")
	public WebElement assertusername;
	
	@FindBy(xpath="//*[@id=\"systemUser_status\"]/option[1]")
	public WebElement assertstatus;
	
	
}
