package co.edu;

public class Example01 {
	public static void main(String[] arge) {
		boolean isTrue = false;
		
		int myAge = 10;
		int yourAge = 11;
		
		isTrue = myAge > yourAge; // false
		if (isTrue) {
			System.out.println("나의 나이가 더 많다.");
		} else {
			System.out.println("나의 나이가 더 적다.");
		}
		
		// float, double : double default.
		float f1 = 23.4f; // 4byte
		double d1 = 23.4; // 8byte
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		// 0 ~ 10 정수
		// 0 ~ 1 실수 <- 근사치
		double result = 1.1 + 2.2;
		System.out.println(result);
		
		// long(8byte) float(4byte)
		float sum = 2345L + 22.3F;
		System.out.println(sum);
	}
}
