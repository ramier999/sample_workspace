package review;

import java.util.Scanner;

public class Test00 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("주민등록번호 앞자리를 입력하세요 >> ");
		String pNo = scn.nextLine();
//		char fNo = pNo.charAt(0);
//		switch(fNo) {
//		case '0':
//		case '1':
//		case '2':
//			int yNo = Integer.parseInt(pNo.substring(0,2));
//			
//			break;
//		default:
//			yNo = Integer.parseInt(pNo.substring(0,2));
//			System.out.println("나이 : "+(123-yNo));
//		}
		int yNo = Integer.parseInt(pNo.substring(0,2));
		if(yNo<=22) {
			System.out.println("나이 : "+(22-yNo));
		} else {
			System.out.println("나이 : "+(122-yNo));
		}
	}
}
