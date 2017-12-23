package com.ct.pages;

import java.time.LocalDate;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import com.ct.utilities.Driver;
import com.github.javafaker.Faker;

import cucumber.api.java.en.Given;

public class CT_Cloan_FakePerson {
	/*
	 * change
	 */
	private WebDriver driver = Driver.getInstance();

	Faker fk = new Faker();

	// for page1 info, random and fake
	private String firstName;
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public Faker getFk() {
		return fk;
	}

	public void setFk(Faker fk) {
		this.fk = fk;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPersonalFileID() {
		return personalFileID;
	}

	public void setPersonalFileID(String personalFileID) {
		this.personalFileID = personalFileID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getPpnumber() {
		return ppnumber;
	}

	public void setPpnumber(String ppnumber) {
		this.ppnumber = ppnumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWpnumber() {
		return wpnumber;
	}

	public void setWpnumber(String wpnumber) {
		this.wpnumber = wpnumber;
	}

	public String getExtention() {
		return extention;
	}

	public void setExtention(String extention) {
		this.extention = extention;
	}

	public String getPersonal_email() {
		return personal_email;
	}

	public void setPersonal_email(String personal_email) {
		this.personal_email = personal_email;
	}

	public String getWork_email() {
		return work_email;
	}

	public void setWork_email(String work_email) {
		this.work_email = work_email;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDurationOfEmployement() {
		return durationOfEmployement;
	}

	public void setDurationOfEmployement(String durationOfEmployement) {
		this.durationOfEmployement = durationOfEmployement;
	}

	public String getPurposeOfloam() {
		return purposeOfloam;
	}

	public void setPurposeOfloam(String purposeOfloam) {
		this.purposeOfloam = purposeOfloam;
	}

	public String getSupervosir() {
		return supervosir;
	}

	public void setSupervosir(String supervosir) {
		this.supervosir = supervosir;
	}

	public String getIsItFirstLoan() {
		return isItFirstLoan;
	}

	public void setIsItFirstLoan(String isItFirstLoan) {
		this.isItFirstLoan = isItFirstLoan;
	}

	public String getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(String annualIncome) {
		this.annualIncome = annualIncome;
	}

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	public String getRenrtOrOwn() {
		return renrtOrOwn;
	}

	public void setRenrtOrOwn(String renrtOrOwn) {
		this.renrtOrOwn = renrtOrOwn;
	}

	public String getSpendInMonth() {
		return spendInMonth;
	}

	public void setSpendInMonth(String spendInMonth) {
		this.spendInMonth = spendInMonth;
	}

	public String getDependancy() {
		return dependancy;
	}

	public void setDependancy(String dependancy) {
		this.dependancy = dependancy;
	}

	public String getSaving() {
		return saving;
	}

	public void setSaving(String saving) {
		this.saving = saving;
	}

	public String getLoanTerm() {
		return loanTerm;
	}

	public void setLoanTerm(String loanTerm) {
		this.loanTerm = loanTerm;
	}

	public String getSinglLine() {
		return singlLine;
	}

	public void setSinglLine(String singlLine) {
		this.singlLine = singlLine;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	private String lastName;
	private String dateOfBirth;
	private String personalFileID;

	// for page2 info, random and fake
	private String address;
	private String address1;
	private String city;
	private String state;
	private String zipcode;
	private String ppnumber;
	private String country;
	private String wpnumber;
	private String extention;
	private String personal_email;
	private String work_email;

	// for page3 info, random and fake
	private String title;
	private String department;
	private String durationOfEmployement;
	private String purposeOfloam;
	private String supervosir;

	// for page4 info, random and fake
	private String isItFirstLoan;
	private String annualIncome;
	private String incomeType;
	private String renrtOrOwn;
	private String spendInMonth;
	private String dependancy;
	private String saving;
	private String loanTerm;
	private String singlLine;
	private String date;

	public CT_Cloan_FakePerson() {
		firstName = fk.name().firstName();
		lastName = fk.name().lastName();
		dateOfBirth = generateMonth() + "/" + generateDate() + "/"
				+ generateYear();
		personalFileID = fk.idNumber().ssnValid().replaceAll("-", "");

		// for page2 info, random and fake
		address = fk.address().streetAddress();
		address1 = fk.address().secondaryAddress();
		city = fk.address().city();
		state = fk.address().state();
		zipcode = fk.address().zipCode();
		ppnumber = phoneNumberCorrector(fk.phoneNumber().cellPhone());
		country = "United States";
		wpnumber = phoneNumberCorrector(fk.phoneNumber().phoneNumber());
		extention = "55555";
		personal_email = "testemailforcloan@gmail.com";
		work_email = "testemailforcloan@gmail.com";

		// for page3 info, random and fake
		title = randomTitleP3();
		department = randomDepartmentP3();
		durationOfEmployement = randomDurationOfEmployementP3();
		purposeOfloam = randomPurposeOfLoanP3();
		supervosir = randomSuperVisorP3();

		// for page3 info, random and fake
		// TODO - create random data for page 4
		isItFirstLoan = "no";
		annualIncome = "50";
		incomeType = "Monthly";
		renrtOrOwn = "rent";
		spendInMonth = "45";
		dependancy = "4";
		saving = "2";
		loanTerm = "12 month";
		singlLine = firstName + " " + lastName;
		date = ""; // TODO finish create today day String.

	}

	public void fillOutAllPersonInfoOn_CT_Cloan() throws Throwable {
		// switch to frame
		driver.switchTo().frame(1);

		// fill out page #1
		CT_CloanHomePage_1 p1 = new CT_CloanHomePage_1();
		p1.fillOutTheForm(firstName, "M", lastName, dateOfBirth, personalFileID);
		p1.maleBtn.click();
		p1.nextBtnP1.click();

		// fill out page #2
		CT_CloanHomePage_2 p2 = new CT_CloanHomePage_2();
		p2.fillOutTheForm1(address, address1, city, state, zipcode, country, ppnumber, wpnumber, extention,
				personal_email, work_email);
		p2.next.click();

		// fill out page #3
		CT_CloanHomePage_3 p3 = new CT_CloanHomePage_3();
		p3.fillOutTheForm2(title, department, durationOfEmployement, purposeOfloam, supervosir);
		p3.nextButton.click();

		// fill out page #4
		CT_CloanHomePage_4 p4 = new CT_CloanHomePage_4();
		p4.fiiOutTheForm(isItFirstLoan, annualIncome, incomeType, renrtOrOwn, spendInMonth, dependancy, saving,
				loanTerm, firstName + " M " + lastName, singlLine, date);

	}

	private String phoneNumberCorrector(String phone) {
		if (phone.charAt(3) == '-') {
			return phone;
		} else if (phone.charAt(0) == '(') {
			return phone.replace("(", "").replace(")", "").replace(" ", "-");
		} else if (phone.charAt(3) == '.') {
			return phone.replace(".", "-");
		} else {
			return phone.substring(2);
		}
	}

	private String randomTitleP3() {
		String[] titles = { "Manager", "Developer", "Engineer", "Instructor", "DevOps", "Analyst", "DB Admin" };
		int rnd = new Random().nextInt(titles.length);
		return titles[rnd];
	}

	private String randomDepartmentP3() {
		String[] titles = { "HR", "Development", "Tech Support", "Faculty" };
		int rnd = new Random().nextInt(titles.length);
		return titles[rnd];
	}

	private String randomDurationOfEmployementP3() {
		String[] titles = { "0-2", "3-5", "5-10", "10-14", "15 and more" };
		int rnd = new Random().nextInt(titles.length);
		return titles[rnd];
	}

	private String randomPurposeOfLoanP3() {
		String[] titles = { "Personal", "Education", "Health", "Mortgage", "Travel", "Auto", "Other" };
		int rnd = new Random().nextInt(titles.length);
		return titles[rnd];
	}

	private String randomSuperVisorP3() {
		String[] titles = { "Zachary Taylor", "Marakot Muhabat", "Kimberly Ann Hart", "William Cranston",
				"Katherine Hillard", "Hlebush Buharan" };
		int rnd = new Random().nextInt(titles.length);
		return titles[rnd];
	}

	public static int generateYear() {

		Random rd = new Random();
		int n = rd.nextInt((2002 - 1949) + 1) + 1949;
		return n;

	}
	
	public static int generateMonth() {

		Random rd = new Random();
		int n = rd.nextInt((12 - 10) + 1) + 10;
		return n;

	}
	
	public static int generateDate() {

		Random rd = new Random();
		int n = rd.nextInt((31 - 10) + 1) + 10;
		return n;

	}

}
