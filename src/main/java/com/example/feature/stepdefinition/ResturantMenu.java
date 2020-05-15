package com.example.feature.stepdefinition;

import java.util.ArrayList;
import java.util.List;

public class ResturantMenu {

	
		List<ResturantMenuItem> MenuItems = new ArrayList<ResturantMenuItem>();
		
		public boolean addMenuItem(ResturantMenuItem newMenuItem) {
			
			return MenuItems.add(newMenuItem);
		}
		
		public boolean DoesItemExist(ResturantMenuItem newMenuItem) {
			boolean Exists = false;
			if(MenuItems.contains(newMenuItem)) {
				Exists = true;
			}
			return Exists;
		}
}
