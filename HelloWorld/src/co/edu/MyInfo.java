package co.edu;

public class MyInfo {
	public static void main(String[] args) {
		//이름은 홍길동이고, 나이는 16살이고, 키는 178.8입니다. << 출력
		String name = "홍길동";
		int age = 16;
		double tall = 178.8;
		
		name = "김민수";
		age = 22;
		tall = 173.1;
		
		System.out.println("이름은 " + name + "이고, 나이는 " + age + "살이고, 키는 " + tall + "입니다.");
	}
}
