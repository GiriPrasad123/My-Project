package automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
	@FindBy(xpath="/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a")
	public WebElement my;
	
	@FindBy(name="email")
	public WebElement email;
	
	@FindBy(id="reg_password")
	public WebElement password;
	
	@FindBy(name="register")
	public WebElement register;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div/div/div/div[1]/ul/li")
	public WebElement invalid;
	
	public void account() {
		my.click();
	}
	
	public void details(String[] data) {
		email.sendKeys(data[0]);
		password.sendKeys(data[1]);
	}
	
	public void register() {
		register.click();
	}
	
	public String invalid() {
		String str=invalid.getText();
		return str;
	}


}
//My Account – Automation Practice Site