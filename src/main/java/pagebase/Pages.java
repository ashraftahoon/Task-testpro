package pagebase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Pages {
    
	protected  WebDriver driver;
	public Actions actions;
	public Select Select;
	public  Pages (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
	
