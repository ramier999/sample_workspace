package homework;

import java.util.Scanner;

public class hw20220701_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String reNum = scanner.nextLine();
		System.out.print("3. 전화번호: ");
		String pNum = scanner.nextLine();
		
		System.out.printf("\n[입력한 내용]\n%1$s\n%2$s\n%3$s", name, reNum, pNum);
	}

}
