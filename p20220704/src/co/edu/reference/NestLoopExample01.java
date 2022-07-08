package co.edu.reference;

public class NestLoopExample01 {
	public static void main(String[] args) {
		
		for(int j=1; j<=3; j++) {
			System.out.println("j의 값: "+j);
			for(int i=1; i<=5; i++) { // 중첩선언 불가능
			System.out.println("	i의 값: "+i);
			}
		}
		System.out.println();
		
		for(int j=2; j<=9; j++) {
			for(int i=1; i<=9; i++) {
		System.out.printf("%d * %d = %d\n", j, i, (j*i));
			}
			System.out.println();
		}
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1; i<=4; i++) {
			for (int k=3; k>=i; k--) {
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		for(int x=1; x<=10; x++) {
			for(int y=1; y<=10; y++) {
				if(4*x+5*y==60) {
					System.out.printf("(%d, %d)\n", x, y);
				}
			}
		}
		
	}
}
