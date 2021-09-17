package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class EditLeadSD extends BaseClass2 {
	
	@And("Click on Find Lead")
	public void findLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}

	@And("Click on Phone from findby")
	public void phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}

	@Given("Enter the phone number as {string}")
	public void phno(String phno) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phno);
	}

	@When("Click on Find Lead Button")
	public void findLead() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@And(" Click on Edit Button")
	public void Editbutton() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@And("Click on Edit Button")
	public void edit() {
		driver.findElement(By.linkText("Edit")).click();
	}

	@And("Update company name as {string}")
	public void cmpyName(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	}

	@When("Click on Submit Button in Edit")
	public void submit() {
		driver.findElement(By.name("submitButton")).click();
	}

}
