package com.ct.stepDefinitions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ct.pages.CT_HomePage3;
import com.ct.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CT_Loan_CTL41_stepDefinition {

	private WebDriver driver = Driver.getInstance();
	// CT_HomePage3 page3 = new CT_HomePage3();
	// WebDriverWait wait = new WebDriverWait(driver, 10);

	/*
	 * From here starts CTL-41 --
	 */

	@Given("^I click select Title option and see content inside the titleOption$")
	public void i_click_select_Title_option_and_see_content_inside_the_titleOption() throws Throwable {
		List<WebElement> dropDown = Driver.getInstance().findElements(By.xpath("//select[@name='Dropdown']"));
		ArrayList<String> list = new ArrayList<>();
		for (WebElement e : dropDown) {
			list.add(e.getText());
		}
		String temp = list.get(0);
		// System.out.println("OriginalList\n" + list);
		List<String> originalList = new ArrayList<String>(Arrays.asList(temp.split("\n")));
		originalList.remove(0);
		System.out.println("Original List\n" + originalList);

		List<String> duplicateList = new ArrayList<String>(originalList.size());
		for (String s : originalList) {
			duplicateList.add(s);
		}
		Collections.sort(duplicateList);
		System.out.println("\nDuplicate Sorted List\n" + duplicateList);
		Assert.assertTrue(originalList.equals(duplicateList));

	}

	@Given("^I click select Department option and see content inside Department$")
	public void i_click_select_Department_option_and_see_content_inside_Department() throws Throwable {
		List<WebElement> dropDown1 = Driver.getInstance().findElements(By.xpath("//select[@name='Dropdown1']"));
		ArrayList<String> list1 = new ArrayList<>();
		for (WebElement e : dropDown1) {
			list1.add(e.getText());
		}

		String temp = list1.get(0);
		List<String> originalList1 = new ArrayList<String>(Arrays.asList(temp.split("\n")));
		originalList1.remove(0);
		System.out.println("Original List\n" + originalList1);

		List<String> duplicateList1 = new ArrayList<String>(originalList1.size());
		for (String s : originalList1) {
			duplicateList1.add(s);
		}
		Collections.sort(duplicateList1);
		System.out.println("\nDuplicate Sorted List\n" + duplicateList1);
		Assert.assertTrue(originalList1.equals(duplicateList1));

	}

	@Given("^I click select Duration of Employment and see content inside it$")
	public void i_click_select_Duration_of_Employment_and_see_content_inside_it() throws Throwable {
		List<WebElement> dropDown2 = Driver.getInstance().findElements(By.xpath("//select[@name='Dropdown2']"));
		ArrayList<String> list2 = new ArrayList<>();
		for (WebElement e : dropDown2) {
			list2.add(e.getText());
			// System.out.println(list2);
		}

		String temp = list2.get(0);
		List<String> originalList2 = new ArrayList<String>(Arrays.asList(temp.split("\n")));
		originalList2.remove(0);
		System.out.println("Original List\n" + originalList2);

		List<String> duplicateList2 = new ArrayList<String>(originalList2.size());
		for (String s : originalList2) {
			duplicateList2.add(s);
		}
		Collections.sort(duplicateList2);
		System.out.println("\nDuplicate Sorted List\n" + duplicateList2);
		Assert.assertTrue(originalList2.equals(duplicateList2));
		System.out.println();

	}

	@Given("^I click Purpose of Loan and see content inside it$")
	public void i_click_Purpose_of_Loan_and_see_content_inside_it() throws Throwable {
		List<WebElement> dropDown3 = Driver.getInstance().findElements(By.xpath("//select[@name='Dropdown3']"));
		ArrayList<String> list3 = new ArrayList<>();

		for (WebElement e : dropDown3) {
			list3.add(e.getText());
		}

		String temp = list3.get(0);
		List<String> originalList3 = new ArrayList<String>(Arrays.asList(temp.split("\n")));
		originalList3.remove(0);
		System.out.println("Original List\n" + originalList3);

		List<String> duplicateList3 = new ArrayList<String>(originalList3.size());
		for (String s : originalList3) {
			duplicateList3.add(s);
		}
		Collections.sort(duplicateList3);
		System.out.println("\nDuplicate Sorted List\n" + duplicateList3);
		Assert.assertTrue(originalList3.equals(duplicateList3));

	}

	@Given("^I click Supervisor and see content inside it$")
	public void i_click_Supervisor_and_see_content_inside_it() throws Throwable {
		List<WebElement> dropDown4 = Driver.getInstance().findElements(By.xpath("//div/select[@name='Dropdown4']"));
		ArrayList<String> list4 = new ArrayList<>();

		for (WebElement e : dropDown4) {
			list4.add(e.getText());
		}
		String temp = list4.get(0);
		List<String> originalList4 = new ArrayList<String>(Arrays.asList(temp.split("\n")));
		originalList4.remove(0);
		System.out.println("Original List\n" + originalList4);

		List<String> duplicateList4 = new ArrayList<String>(originalList4.size());
		for (String s : originalList4) {
			duplicateList4.add(s);
		}
		Collections.sort(duplicateList4);
		System.out.println("\nDuplicate Sorted List\n" + duplicateList4);
		Assert.assertTrue(originalList4.equals(duplicateList4));

	}

	@Then("^I click on next option$")
	public void i_click_on_next_option() throws Throwable {
		List<WebElement> dropDown = Driver.getInstance().findElements(By.xpath("(//div/button[@elname='next'])[3]"));
		CT_HomePage3 page3 = new CT_HomePage3();
		page3.nextButton.click();
	}

}
