package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en. *;
import pageObjects.LoginPage;

public class EcommerceSteps {
	public WebDriver driver;
	public LoginPage loginPage;
	@Given("^Launch Chrome Browser$")
	public void launch_chrome_browser() {
	   driver=new ChromeDriver();
	   loginPage= new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	   driver.get(url);
	}

	@And("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_a_and_password_as_a(String email, String password) {
		loginPage.setUserName(email);
		loginPage.setUserPassword(password);
	}

	@And("Click on Login")
	public void click_on_login() {
	   loginPage.clickLogin();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String title) {
	    if(driver.getPageSource().contains("Login was unsuccessful.")) 
	    {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	    	
	    else 
	    	{
	    Assert.assertEquals(title,driver.getTitle());
   	}
	       
	    }
	

	@When("User click on log out Link")
	public void user_click_on_log_out_link() throws InterruptedException {
	   loginPage.clickLogOut();
	   Thread.sleep(3000);
	}
	
//	@Then("Page Title should be the {string}")
//	public void page_title_should_be_the(String title) {
//		
//	      Assert.assertEquals(title,driver.getTitle());
//   	
//	       
//	    }
	
	@And("Close browser")
	public void close_browser() {
	    driver.close();
	}


}
