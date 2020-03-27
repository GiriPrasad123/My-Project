package automation.StepDefinition;

import org.openqa.selenium.support.PageFactory;

import automation.Pages.LoginPage;
import automation.Pages.RegisterPage;
import automationBaseClass.BaseClass;
import automationBaseClass.ExcelUtility;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidLoginTC3 extends BaseClass {
	static LoginPage lpom;
	static String[] data = null;
	@Given("^the user launch the application in browser$")
	public void the_user_launch_the_application_in_browser() throws Throwable {
		launchBrowser("chrome", "http://practice.automationtesting.in");
	}

	@When("^the user clicks on My Accounts$")
	public void the_user_clicks_on_My_Accounts() throws Throwable {
		lpom =PageFactory.initElements(driver, LoginPage.class);
		   lpom.account();
	}

	@When("^the user Enters the valid username and password$")
	public void the_user_Enters_the_valid_username_and_password() throws Throwable {
		ExcelUtility xl=new ExcelUtility();
		int j=0;
		data=new String[2]; 
		for(int i=9;i<=10;i++)
		{
			data[j]=xl.readXL("src\\test\\resources\\TestData\\Book5.xlsx", i, 1);
			System.out.println(data[j]);
			j++;
		}
		lpom.details(data);
	}

	@When("^click on signin button$")
	public void click_on_signin_button() throws Throwable {
	    lpom.login();
	}

	@Then("^I validate the outcomes of valid login$")
	public void i_validate_the_outcomes_of_valid_login() throws Throwable {
		String ar=driver.getTitle();
		String er="My Account – Automation Practice Site";
		if(ar.equals(er))
			System.out.println("pass");
		else
			System.out.println("fail");
		
	    screenShot("src\\test\\resources\\ScreenShots\\validLogin.png");
		quit();
	}


}
