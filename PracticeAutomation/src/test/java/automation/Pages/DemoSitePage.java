package automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DemoSitePage {
	@FindBy(xpath="/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")
	public WebElement demo;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/form/div[1]/div[1]/input")
	public WebElement firstName;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/form/div[1]/div[2]/input")
	public WebElement lastName;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/form/div[3]/div[1]/input")
	public WebElement email;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/form/div[4]/div/input")
	public WebElement phone;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/form/div[5]/div/label[1]/input")
	public WebElement gender;
	
	@FindBy(id="countries")
	public WebElement country;
	
	@FindBy(id="yearbox")
	public WebElement year;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/form/div[11]/div[2]/select")
	public WebElement month;
	
	@FindBy(id="daybox")
	public WebElement date;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/form/div[12]/div/input")
	public WebElement pwd;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/form/div[13]/div/input")
	public WebElement cpwd;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/form/div[14]/div/button[1]")
	public WebElement submit;
	
	public void account() {
		demo.click();
	}
	
	public void details(String[] data) {
		firstName.sendKeys(data[0]);
		lastName.sendKeys(data[1]);
		email.sendKeys(data[2]);
		phone.sendKeys(data[3]);
		gender.click();
		Select coun = new Select(country);
		coun.selectByVisibleText(data[4]);
		
		Select yea = new Select(year);
		yea.selectByVisibleText(data[5]);
		
		Select da = new Select(month);
		da.selectByVisibleText(data[6]);
		
		Select dat = new Select(date);
		dat.selectByVisibleText(data[7]);
		pwd.sendKeys(data[8]);
		cpwd.sendKeys(data[8]);
	}
	
	public void submit() {
		submit.click();
	}
	

}
