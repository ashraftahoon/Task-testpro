package test;

import org.testng.annotations.Test;

import pagebase.AddUserpage;
import pagebase.HomePage;
import pagebase.SearchUserPage;
import pagebase.UserLoginPage;

public class SearchForUserTest extends TestBase {
    
	HomePage HomepPageobjct;
	UserLoginPage userloginobjct;
	AddUserpage AddUserpageobj;
	SearchUserPage SearchUserPageobjct;
		
	   @Test(priority = 1)
	   public void UserCanLoginSuccssfully()
	   {
		   userloginobjct= new UserLoginPage(driver);
		   userloginobjct.UserLogin("Admin","admin123");
	   }
	
	@Test(priority = 2)
	public void UserCanNavigateToUsersPage()
	{
		HomepPageobjct=new HomePage(driver);
		HomepPageobjct.NavigateToUserPage();
	}
	
	@Test(priority = 3)
	public void canSearchForAnyUser()
	{
		SearchUserPageobjct=new SearchUserPage(driver);
		SearchUserPageobjct.SearchForUser();
	}
	
}
