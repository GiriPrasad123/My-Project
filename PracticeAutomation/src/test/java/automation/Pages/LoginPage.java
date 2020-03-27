package automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(xpath="/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")
	public WebElement my;
	
	@FindBy(id="username")
	public WebElement email;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[1]/div/div[1]/form/p[2]/input")
	public WebElement password;
	
	@FindBy(name="login")
	public WebElement login;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li")
	public WebElement invalid;
	
	public void account() {
		my.click();
	}
	
	public void details(String[] data) {
		email.sendKeys(data[0]);
		password.sendKeys(data[1]);
	}
	
	public void login() {
		login.click();
	}
	
	public String invalid() {
		String str=invalid.getText();
		return str;
	}



}
