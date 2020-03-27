package automation.StepDefinition;

import org.openqa.selenium.support.PageFactory;

import automation.Pages.LoginPage;
import automationBaseClass.BaseClass;
import automationBaseClass.ExcelUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLoginTC4 extends BaseClass{
	static LoginPage lpom;
	static String[] data = null;
	
	@Given("^the user launch the app in browser$")
	public void the_user_launch_the_app_in_browser() throws Throwable {
		launchBrowser("chrome", "http://practice.automationtesting.in");
	}

	@When("^user clicks on My Accounts$")
	public void user_clicks_on_My_Accounts() throws Throwable {
		lpom =PageFactory.initElements(driver, LoginPage.class);
		   lpom.account();
	}

	@When("^the user Enters the Invalid username and password$")
	public void the_user_Enters_the_Invalid_username_and_password() throws Throwable {
		ExcelUtility xl=new ExcelUtility();
		int j=0;
		data=new String[2]; 
		for(int i=13;i<=14;i++)
		{
			data[j]=xl.readXL("src\\test\\resources\\TestData\\Book5.xlsx", i, 1);
			System.out.println(data[j]);
			j++;
		}
		lpom.details(data);
	}

	@When("^click on the signin button$")
	public void click_on_the_signin_button() throws Throwable {
		lpom.login();
	}

	@Then("^I validate the outcomes of invalid login$")
	public void i_validate_the_outcomes_of_invalid_login() throws Throwable {
		String ar=lpom.invalid();
		String er="ERROR: Invalid username. Lost your password?";
		if(ar.equals(er))
			System.out.println("pass");
		else
			System.out.println("fail");
		
	    screenShot("src\\test\\resources\\ScreenShots\\invalidLogin.png");
		quit();
	}

}
