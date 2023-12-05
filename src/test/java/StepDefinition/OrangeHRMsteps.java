package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;


public class OrangeHRMsteps {
	WebDriver driver;
	@Given("^I Launch chrome Browser$")
	public void i_launch_chrome_browser() {
		
		driver= new ChromeDriver();
	   
	}

	@When("^I open orange hrm home Page$")
	public void i_open_orange_hrm_home_page() {
           driver.get("https://www.orangehrm.com/");
	}

	@Then("^I verify logo present on page$")
	public void i_verify_logo_present_on_page() {
	boolean status=   driver.findElement(By.xpath("//a//img[@alt='OrangeHRM Logo']")).isDisplayed();
	Assert.assertTrue(status);
	}

	@And("^close browser$")
	public void close_browser() {
	    driver.close();
	}

}
