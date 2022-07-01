package co.edu;

public class Variable {
	public static void main(String[] args) {
		byte b1 = 10; // -128 =< byte =< 127
		short s1 =32767; // -32768 =< short =< 32767 128*2*2*2*2*2*2*2*2\
		int n1 = 0; // -2147483648 =< int =< 2147483647
		long l1 = 372036854775808L; // -9223372036854775808 =< long =<9223372036854775807
		
		int result = b1 + 20;
		long result1 = l1 + (long) 20; // 데이터타입 변환 : 자동형변환(promotion)
		result = (int) l1 + 20; // 데이터타입 변환 : 강제형변환(casting) -> 범위 안의 값만 가능, 값보다 크면 오류
		System.out.println(result);
		
		char c1 = 'A';
		c1++; // c1 = c1 + 1
		for(int i = 0; i < 27; i++) { // System.out.println(c1++); 반복문
			System.out.println(c1++);
		}
	}
}
