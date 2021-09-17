package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadSD extends BaseClass2 {
/* @Given("Enter the username as {string}")
     	public void enterUserName(String username) {
     	driver.findElement(By.id("username")).sendKeys( username);
     
    @Given("Enter the password as {string}")
		public void enterPassword(String password) {
 		driver.findElement(By.id("password")).sendKeys( password);
 	}
	@When("Click on Login button")
 		public void clickLogin() {
 		driver.findElement(By.className("decorativeSubmit")).click();
	
 	}
	@Given("Click CRMSFA link")
		public void CRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	
	}*/
 
	
	@And("Click on Leads Button")
		public void leads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When("Click on Create Lead Button")
		public void clickleadbutton(){
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter the companyName as {string}")
		public void companyName(String company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}
	@And("Enter the firstName as {string}")
		public void firstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	@And("Enter the lastName as {string}")
		public void lastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	@And("Enter the phonenumber as {string}")
		public void phno(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	}
	@When("Click on Submit button")
		public void submit() {
		driver.findElement(By.name("submitButton")).click();
	}

}
