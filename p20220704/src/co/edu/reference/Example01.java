package co.edu.reference;

public class Example01 {
	public static void main(String[] args) {

		// 1 ~ 100 출력
		
		for(int i=1; i<=100 ; i++) {
			System.out.println(i);
		}
		
		// while 반복문을 사용, 1 ~ 10 출력

		int num = 0;
		while(num < 10) {
			num++;
			System.out.println(num);
		}
		
		// for 반복문을 사용, 구구단 3단을 출력
		System.out.println();
		System.out.println("<<구구단 3단>>");
		System.out.println();
		for(int i=1; i<=9 ; i++) {
			System.out.println("3 * "+i+" = "+3*i);		
		}
		
	}

}
