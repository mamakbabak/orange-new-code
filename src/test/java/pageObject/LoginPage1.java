package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.*;

public class LoginPage1 {


	WebDriver driver;
	
	public LoginPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@placeholder='Username']")
	WebElement username;
	
	@FindBy (xpath = "//input[@placeholder='Password']")
	WebElement password;
	
	@FindBy (xpath = "//button[normalize-space()='Login']")
	WebElement loginButton;
	
	
	
	
	
	public void enterUsername(String userName) {
		username.sendKeys(userName);
	}
	
	public void enterPassword(String passWord) {
		password.sendKeys(passWord);
		
	}
	
	public void clickLogin() {
		loginButton.click();
	}
	
	
	
	
	


}