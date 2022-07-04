package co.edu.loop;

public class ForExample {
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if( i % 2 == 0) {
			sum = sum + i;
			System.out.printf("i의 값: %d, sum의 값: %d\n", i, sum);
			}
		}
			System.out.printf("결과값: %d\n", sum);
			
		// 1 ~ 10까지 result => 누적
		
		int result = 0;
		for(int x=1; x<=10; x++) {
			result += x;
		}
			System.out.println("1에서 10까지 누적 합 : " + result);
		
		// 10 ~ 1 까지 출력
		for(int i=10; i>=1; i--) {
			System.out.println(i);
		}

	}
		
}