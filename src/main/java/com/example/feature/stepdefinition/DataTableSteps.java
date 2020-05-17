package com.example.feature.stepdefinition;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableSteps {

	
	@Given("I placed an order for the following items")
	public void i_placed_an_order_for_the_following_items(io.cucumber.datatable.DataTable dataTable) {
	   
	/*	List<String> BillData = dataTable.asList(String.class);
			for(String list : BillData) {
				System.out.println(list);
			}	
		
		List<List<String>> BillData = dataTable.asLists(String.class);
		for(List<String> BillItems : BillData) 
		{
			for(String list : BillItems) {
				System.out.println(list);
			}
		} */
		
		List<Map<String,String>> BillData = dataTable.asMaps(String.class,String.class);
		for(Map<String,String> BillItems : BillData) 
		{
			for(Map.Entry<String, String> BillItem : BillItems.entrySet()) {
				
				System.out.println(BillItem.getKey() + " " +BillItem.getValue());
			}
		}
			
	}

	@When("I generate the bill")
	public void i_generate_the_bill() {
	   
	}

	@Then("a bill for ${int} should be generated")
	public void a_bill_for_$_should_be_generated(Integer int1) {
	   	}

}
