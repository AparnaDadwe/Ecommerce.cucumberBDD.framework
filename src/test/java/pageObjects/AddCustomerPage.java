package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver driver;

	public AddCustomerPage()
	{
		PageFactory.initElements(driver, this);
	}
	// for Customer Role
	By txtCustomerRoles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	By listItemAdminstrators=By.xpath("//li[contains(text(),'Administrators')]");
	By listItemGuests=By.xpath("//li[contains(text(),'Guests')]");
	By listItemRegistered=By.xpath("//li[contains(text(),'Registered')]");
	By listItemVendors=By.xpath("//li[contains(text(),'Vendors')]");
	
	public void clickOnCustomerMenu() 
	{
		WebElement linkCustomers_Menu=driver.findElement(By.xpath("//a[@href='#']//p[contains(text(),'Customers')]"));
		linkCustomers_Menu.click();
	}
	
	public void clickOnCustomerMenuItem() 
	{
		WebElement linkCustomers_Menu_Item=driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]"));
		linkCustomers_Menu_Item.click();
	}
	
	public void clickOnAddNew() {
		WebElement btnAddNew=driver.findElement(By.xpath("//a[normalize-space()='Add new']"));
		btnAddNew.click();
	}
	public void setEmail(String email) {
		WebElement txtEmail=driver.findElement(By.xpath("//input[@id='Email']"));
		txtEmail.sendKeys(email);
	}
	public void setPassword(String password) {
		WebElement txtPassword=driver.findElement(By.xpath("//input[@id='Password']"));
		txtPassword.sendKeys(password);
	}
	public void setFirstname(String firstname) {
		WebElement txtFirstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
		txtFirstname.sendKeys(firstname);
	}
	public void setLastname(String lastname) {
		WebElement txtLastname=driver.findElement(By.xpath("//input[@id='LastName']"));
		txtLastname.sendKeys(lastname);
	}
	
	public void setCustomerRoles(String role)
	{
		if(!role.equals("Vendors"))
		{
			
			driver.findElement(By.xpath(""));
		}
		 
		
	}
	
}
