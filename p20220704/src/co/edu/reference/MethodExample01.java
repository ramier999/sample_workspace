package co.edu.reference;

public class MethodExample01 {
	
	//실행구문
	public static void main(String[] args) {
//		long sum = sum(10); // 매개값(arguments)
//		showInfo("손정빈", 30);
//		showInfo("홍길동", 20);
//		printStar(10, "😮");
//		for(int i=1; i<=9; i++) {
//			gugudan(i);
//			System.out.println();
//		}
		allgugudan();
	}
	
	public static void printStar(int times, String shape) {
		for(int i=1; i<=times; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(shape);
			}
			System.out.println();
		}
	}
	
	public static void printGugudan(int num) {
		System.out.printf("<< %d단 >>\n", num);
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		System.out.println();
	}
	
	public static void showInfo(String name, int age) {
		System.out.printf("안녕하세요. %s입니다. 나이는 %d살입니다.\n", name, age);
	}
	
	// 메소드 정의구문
	public static long/* 반환값의 형태 */ sum(int num) { // 매개변수(parameter)
		int result = num * 2; // 식
		return (long)/* 자동형변환(promotion) */ result; // 결과로 result값을 반환, 
	}
	
	public static void gugudan(int num) {
		for(int i=2; i<=9; i++) {
			if(i*num<10) {
				System.out.print(i+" * "+num+" =  "+i*num+"  ");
			} else {
				System.out.print(i+" * "+num+" = "+i*num+"  ");
			}
		}
	}
	
	public static void allgugudan() {
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %2d  ", i, j, i*j);
			}
		System.out.println();
		}
	}

}
