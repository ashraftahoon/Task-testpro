package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pagebase.AddUserpage;
import pagebase.AssertUserData;
import pagebase.HomePage;
import pagebase.SearchUserPage;
import pagebase.UserLoginPage;

public class HomeTest extends TestBase {
	HomePage HomepPageobjct;
	UserLoginPage userloginobjct;
	AddUserpage AddUserpageobj;
	SearchUserPage SearchUserPageobjct;
	AssertUserData AssertUserDataObjct;
	SoftAssert soft;
		
	   @Test(priority = 1)
	   public void UserCanLoginSuccssfully()
	   {
		   userloginobjct= new UserLoginPage(driver);
		   userloginobjct.UserLogin("Admin","admin123");
		   String url= driver.getCurrentUrl();
		   assertEquals(url, "https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	   }
	
	@Test(priority = 2)
	public void UserCanNavigateToUsersPage()
	{
		HomepPageobjct=new HomePage(driver);
		HomepPageobjct.NavigateToUserPage();
		 String url2= driver.getCurrentUrl();
		 assertEquals(url2, "https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	}
	

	@Test(priority = 3)
	public void CanAddNewUser()
	{
		AddUserpageobj=new AddUserpage(driver);
		AddUserpageobj.AddNewUser();
		String actualTitle = driver.getTitle();
		assertEquals("OrangeHRM", actualTitle);
	}
	
	@Test(priority = 4)
	public void canSearchForAnyUser()
	{
		SearchUserPageobjct=new SearchUserPage(driver);
		SearchUserPageobjct.SearchForUser();
	}
	
	@Test(priority = 5)
	public void AssertcorrectnessOfData()
	{
		AssertUserDataObjct = new AssertUserData(driver);
		soft= new SoftAssert();

		soft.assertEquals("ESS", AssertUserDataObjct.assertuserrole.getText());
		soft.assertEquals("Orange Test", AssertUserDataObjct.assertemployeename.getText());
		soft.assertEquals("Ashraf hussin", AssertUserDataObjct.assertusername.getText());
		soft.assertEquals("Enabled", AssertUserDataObjct.assertstatus.getText());
		
	}
	
}
