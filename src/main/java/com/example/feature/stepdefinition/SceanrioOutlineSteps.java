package com.example.feature.stepdefinition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SceanrioOutlineSteps {

	int InitialBillAmount;
	double TaxRate;
	
	@Given("I have a Customer")
	public void i_have_a_Customer() {
	  
	}

	@Given("user enters intial bill amoutn as {int}")
	public void user_enters_intial_bill_amoutn_as(Integer initialBillAmount) {
	    this.InitialBillAmount=initialBillAmount;
	    System.out.println("IntialBillAmount" +InitialBillAmount);
	}

	@Given("Sales Tax Rate is {int} percent")
	public void sales_Tax_Rate_is_percent(Integer taxRate) {
	    // Write code here that turns the phrase above into concrete actions
	    this.TaxRate = taxRate;
	    System.out.println("TaxRate" +taxRate);
	}

	@Then("final bill amount calculate is {int}")
	public void final_bill_amount_calculate_is(Integer expectedValue) {
		double SystemCalculatedValue = 
    			BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount,this.TaxRate);
    	
    		System.out.println("Expected Value: " +expectedValue);
    		System.out.println("System Calculated Value: " +SystemCalculatedValue);
    		assertTrue(expectedValue == SystemCalculatedValue);
	}

	@Given("Sales Tax Rate is {double} percent")
	public void sales_Tax_Rate_is_percent(Double taxRate) {
	    this.TaxRate = taxRate;
	    System.out.println("TaxRate" +taxRate);
	}

	@Then("final bill amount calculate is {double}")
	public void final_bill_amount_calculate_is(Double expectedValue) {
	    	double SystemCalculatedValue = 
	    			BillCalculationHelper.CalculateBillForCustomer(this.InitialBillAmount,this.TaxRate);
	    	
	    		System.out.println("Expected Value: " +expectedValue);
	    		System.out.println("System Calculated Value: " +SystemCalculatedValue);
	    		assertTrue(expectedValue == SystemCalculatedValue);
	    		invokeWebPage(expectedValue);
	}

	
	private void invokeWebPage(Double expectedValue) {
		
        System.setProperty("webdriver.chrome.driver", "C://ChromeDriver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://localhost:8080/welcome1");
		
		WebElement BillAmountTextBox = driver.findElement(By.id("billamount"));
		
		WebElement TaxRateTextBox = driver.findElement(By.id("taxrate"));
		
		WebElement Button = driver.findElement(By.id("mybutton"));
		
		BillAmountTextBox.sendKeys(Integer.toString(InitialBillAmount));
		
		TaxRateTextBox.sendKeys(Double.toString(TaxRate));
		
		Button.click();
		
		WebElement Header1Element = ((RemoteWebDriver) driver).findElementByXPath("//h1");
		
		System.out.println(Header1Element.getText());
		
		boolean Matched = Header1Element.getText().contains("Final Bill Amount is: $" + expectedValue.toString());
		
		System.out.println(Matched);		
		
		
	}
}
