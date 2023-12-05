package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//button[text()='Log in']")
	WebElement logInBtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logOutBtn;

	
	 public LoginPage(WebDriver driver) {
		   PageFactory.initElements(driver, this);
	   }
	 
	 public void setUserName(String uname) {
		 txtEmail.clear();
		 txtEmail.sendKeys(uname);
		 
	 }
	 
	 public void setUserPassword(String pwd) {
		 txtPassword.clear();
		 txtPassword.sendKeys(pwd);
		 
	 }
	 public void clickLogin() {
		 logInBtn.click();
		 
	 }
	 public void clickLogOut() {
		 logOutBtn.click();
		 
	 }
	 
}
