package co.edu.inherit.friend;

public class Friend {
	private String name;
	private String phone;
	public Friend(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}
	
	public void showInfo() {
		System.out.println("이름 	| "+getName());
		System.out.println("연락처	| "+getPhone());
		// 친구이름, 연락처
	}
	
}
