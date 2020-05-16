package com.example.feature.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MenuManagementSteps {

	ResturantMenuItem NewMenuItem;
	ResturantMenu LocationMenu = new ResturantMenu();


@Given("I have menu item with name \"([^\"]*)\" and price (\\d+)")
public void i_have_menu_item_with_name_and_price(String newMenuItem, Integer price) {
    // Write code here that turns the phrase above into concrete actions
	
	NewMenuItem = new ResturantMenuItem(newMenuItem, newMenuItem ,price);
}

@When("I add that menu item")
public void i_add_that_menu_item() {
    // Write code here that turns the phrase above into concrete actions
	LocationMenu.addMenuItem(NewMenuItem);
}

@Then("Menu Item with name {string} should be added")
public void menu_Item_with_name_should_be_added(String string) {
    // Write code here that turns the phrase above into concrete actions
	boolean Exists = LocationMenu.DoesItemExist(NewMenuItem);
	System.out.println("Step3 :" +Exists);
}
}
