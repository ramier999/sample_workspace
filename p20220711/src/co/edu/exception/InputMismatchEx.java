package co.edu.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchEx {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요. >> ");
		try {
		int num = scn.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
		}
		
		System.out.println("End of Program");
		
	}
}
