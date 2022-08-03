package review;

public class Human {
	
	private String name;
	private int height;
	private int weight;
	
	public Human() {}
	
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}

	public int getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public void getInformation() {
		System.out.println(name+"님의 신장 "+height+", 몸무게 "+weight+"입니다.");
	}
	
}
