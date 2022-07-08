package co.edu.compound;

// 이름, 연락처, email, 생일, 키, 몸무게

public class Friend {
	
	// 필드 명명규칙 1. 소문자로 시작  2. 영문이 제일 먼저  3. 특수문자 한정적 사용 (_)
	private String name;
	private String phone;
	private String birth;
	private String mail;
	private double height;
	private double weight;
	
	// 기본 생성자
	public Friend() {
	}
	
	// 이름, 연락처를 보여주는 showInfo
	// private로 필드의 외부 접근을 차단할 경우, 메소드로 접근
	// source - generate getters and setters...로 간단하게 제작 가능
	public void showInfo() {
		System.out.println("이름: "+name+", 연락처: "+phone);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getBirth() {
		return birth;
	}

	public String getMail() {
		return mail;
	}
	
	public void setHeight(double height) {
		if(height<0) {
			System.out.println("ERROR");
		} else {
			this.height = height;
		}
	}

	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		if(weight<0) {
			System.out.println("ERROR");
		} else {
			this.weight = weight;
		}
	}
	
	public double getWeight() {
		return weight;
	}
	
}
