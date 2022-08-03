package review;

public class Product {
	// 필드
	private int price;
	private int amount;
	private String name;
	// 생성자
	// 메소드
	public int getPrice() {
		return price;
	}
	public int getAmount() {
		return amount;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void setName(String name) {
		this.name = name;
	}
}