package co.edu.reference;

public class DataTypeExample2 {
	public static void main(String[] args) {
		
		// 기본 데이터 타입
		int num1 = 100;
		int num2 = 100;
		
		System.out.println(num1==num2);
		
		// 참조 데이터 타입
		String str1 = new String("홍길동"); // 홍길동 객체 주소값
		String str2 = new String("홍길동"); // 홍길동 객체 주소값

		System.out.println(str1==str2); // 변수의 주소를 비교 - 다름
		System.out.println(str1.equals(str2)); // 변수의 값을 비교 - 같음
		
		int result = 0;
		System.out.println(str1.equals(str2));
		
	}

}
