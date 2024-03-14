package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage1;

public class LoginSteps {

	WebDriver driver;
	LoginPage1 lp1;
	SoftAssert sa;

	@Given("User launches Chrome browser")
	public void user_launches_chrome_browser() {
		driver = new ChromeDriver();
		lp1 = new LoginPage1(driver);
		sa = new SoftAssert();
	}

	@When("User navigates to URL {string}")
	public void user_navigates_to_url(String URL) {
		driver.get(URL);
	}

	@Then("User is on log in page and title is {string}")
	public void user_is_on_log_in_page_and_title_is(String title) throws InterruptedException {
		Thread.sleep(3000);
		String expextedTitle = driver.getTitle();
		System.out.println(expextedTitle);
		System.out.println(title);
		assertEquals(expextedTitle, title);

	}

	@Then("USer enters username as {string} and password as {string}")
	public void u_ser_enters_username_as_and_password_as(String userName, String passWord) {
		lp1.enterUsername(userName);
		lp1.enterPassword(passWord);
		
	}



	@Then("User clicks log in")
	public void user_clicks_log_in() throws InterruptedException {
		lp1.clickLogin();
		
		Thread.sleep(5000);
	}
	
	@Then("User should be logged in and able to see {string}")
	public void user_should_be_logged_in_and_able_to_see(String actualKeyword) {
	WebElement expectedKeyword = driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
	 sa.assertEquals(actualKeyword, expectedKeyword);
	
	}

	@Then("close browser")
	public void close_browser()  {
		
	    driver.close();
	}

}
