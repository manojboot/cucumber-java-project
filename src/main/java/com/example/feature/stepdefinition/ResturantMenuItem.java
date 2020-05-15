package com.example.feature.stepdefinition;

public class ResturantMenuItem {

		private String itemName;
		private String itemDescription;
		private int price;
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getItemDescription() {
			return itemDescription;
		}
		public void setItemDescription(String itemDescription) {
			this.itemDescription = itemDescription;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public ResturantMenuItem(String itemName, String itemDescription, int price) {
			super();
			this.itemName = itemName;
			this.itemDescription = itemDescription;
			this.price = price;
		}
}
