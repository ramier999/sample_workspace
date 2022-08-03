package co.edu.homework;

public class items {
	private String itemName;
	private int itemPrice;
	
	public items() {
		
	}
	
	public items(String itemName, int itemPrice) {
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
		
	public items(String itemName) {
		this.itemName = itemName;
	}
	
	public items(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemName() {
		return itemName;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	
}
