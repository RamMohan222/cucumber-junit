package com.bdd.cucumberjunit.steps.courses;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.bdd.cucumberjunit.common.DriverContext;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddCourseStepDefination {

	private final WebDriver driver;

	public AddCourseStepDefination(DriverContext context) {
		this.driver = context.getDriver();
	}

	@Then("browser navigates to courses list page")
	public void browser_navigates_to_courses_list_page() {
		String acttitle = driver.findElement(By.xpath("//h3[contains(text(),'Courses List')]")).getText();
		Assert.assertTrue("Courses List".equalsIgnoreCase(acttitle));
	}

	@When("admin clicks on the add course button")
	public void admin_clicks_on_the_add_course_button() {
		driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]")).click();
	}

	@Then("browser naviagtes to add course page")
	public void browser_naviagtes_to_add_course_page() {
		String actTitle = driver.findElement(By.xpath("//h3[contains(text(),'Add Course')]")).getText();
		Assert.assertTrue(actTitle.equalsIgnoreCase("Add Course"));
	}

	@Given("following course details")
	public void following_course_details(DataTable dataTable) {
		Map<String, String> details = dataTable.asMap();

		new Select(driver.findElement(By.name("category_id"))).selectByVisibleText(details.get("Category"));
		driver.findElement(By.name("course_name")).sendKeys(details.get("Course Name"));
	}
}
