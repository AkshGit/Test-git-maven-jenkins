package features;



import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utils.AutomationConstants;
import Utils.BrowserFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.CreateQualityPage;
import pages.HomePage;
import pages.LoginPage;
import pages.QualityLibraryPage;
import cucumber.api.java.en.Then;

public class CreateQualityStepDef
{
	public WebDriver driver;
	LoginPage loginPage;
	HomePage homePage ;
	CreateQualityPage qualityPage;
	QualityLibraryPage qualityLibraryPage;

	@Before
	public void start()
	{
		driver = BrowserFactory.getDriver();
	}

	
	
	@Given("^I am on Create New Quality page$")
	public void i_am_on_Create_New_Quality_page() throws Throwable {
		loginPage = new LoginPage();
    	loginPage.login(AutomationConstants.USERNAME,AutomationConstants.PASSWORD );
    	Thread.sleep(3000);
    	
    	//Checking if we are present on home page
    	homePage = loginPage.home();
    	Assert.assertTrue(homePage.isOnHomePage().contains("home.php"));
    	qualityPage=homePage.qualityPage();
    	
    	//Checking if we are on the create quality page
    	Assert.assertTrue(qualityPage.isOnQualityPage().contains("Create Quality"));
    	
	}
	
	@When("^I enter all the valid data$")
	public void i_enter_all_the_valid_data() throws Throwable 
	{
		qualityLibraryPage= qualityPage.createQuality();
		
	}
	
	@Then("^Quality should be added to Quality Library$")
	public void quality_should_be_added_to_Quality_Library() throws Throwable 
	{
		//Checking if we are on Quality Library Page
		Assert.assertTrue(qualityLibraryPage.isOnQualityLibraryPage().contains("Quality Library"));

	}
}