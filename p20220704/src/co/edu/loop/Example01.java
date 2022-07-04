package co.edu.loop;

public class Example01 {
	public static void main(String[] args) {
		
		// num 변수 <= 1 ~ 10까지의 임의의 정수
		// sum 변수 <= 2 or 3의 배수
		// 10번 반복
		// 2와 3의 배수의 합 : ??

		int sum = 0;
		for(int i=1 ; i<=10 ; i++) {
			int num = (int)(Math.random()*10)+1;
			if (num % 2 == 0 || num % 3 == 0) {
				sum += num;
			}
			System.out.printf("변수: %d, 합: %d\n", num, sum);
		}
		System.out.println("2와 3의 배수의 합: " + sum + "\n");
		
		// sum2 <= 2의 배수 / sum3 <= 3의 배수

		int sum2 = 0, sum3 = 0;
		for(int i=1 ; i<=10; i++) {
			int num = (int)(Math.random()*10)+1;
			if (num % 2 == 0){
				sum2 += num;
			}
			if (num % 3 == 0) {
				sum3 += num;
			}
			System.out.printf("변수: %d, 합: %d, %d\n", num, sum2, sum3);
		}
		System.out.println("2의 배수의 합: "+sum2+"\n3의 배수의 합: "+sum3);
	}
}
