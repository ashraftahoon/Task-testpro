package pagebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SearchUserPage extends Pages {
	
	public SearchUserPage(WebDriver driver) {
		super(driver);
		
	}
    
	@FindBy(id ="searchSystemUser_userName")
	WebElement usernameSearchElement;
	
	@FindBy(id="searchSystemUser_userType")
	WebElement userRoeElement;
	
	@FindBy(css="input.ac_input")
	WebElement employeeElement;
	
	@FindBy(id="searchSystemUser_status")
	WebElement statusElement;
	
	@FindBy(css="input.searchbutton")
	WebElement btnsearch;
	
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr/td[2]/a")
	WebElement assertdata;
	
	public void SearchForUser() {
		usernameSearchElement.sendKeys("Ashraf hussin");
		Select =new Select(userRoeElement);
		Select.selectByVisibleText("ESS");
		employeeElement.sendKeys("Orange Test");
		Select =new Select(statusElement);
		Select.selectByIndex(1);
		btnsearch.click();
		assertdata.click();
	}
	
	
	
}
