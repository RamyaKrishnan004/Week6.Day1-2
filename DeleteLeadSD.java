package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLeadSD extends BaseClass2{
	@When("Click on Find Lead Button")
	public void findLead() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	@And("Click on Phone from findby")
	public void phone1() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	@Given("Enter the phone number as to Edit <phno>")
	public void phno() {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("12");	
	}
	@When("Click on Find Lead Button ")
	public void findLea() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	@When("Delete the Lead and search")
	public void delete() {
		String str = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"))
				.getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(str);
	}
	
	@Then("Search for deleted Lead ID")
	public void verify() {
		String str2 = driver.findElement(By.className("x-paging-info")).getText();
		if (str2.equals("Records not displayed")) {
			System.out.println("Text Displayed");
		} else {
			System.out.println("Text not displayed");
		}
	}


}
