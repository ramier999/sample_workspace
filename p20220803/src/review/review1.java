package review;

import java.util.Scanner;

public class review1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("3자리 숫자 입력 >> ");
		int val = Integer.parseInt(scn.nextLine());
		int val1 = val/100;
		int val2 = (val-val1*100)/10;
		int val3 = val-val1*100-val2*10;
		int val4 = val1+val2+val3;
		System.out.printf("%d일 경우 %d + %d + %d = %d으로 결과는 %d입니다", val, val1, val2, val3, val4, val4);
	}
}