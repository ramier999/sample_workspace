package review;

import java.util.Scanner;

public class LottoApp {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		int inM = 0;
		int lottoNo[] = new int[6];
		
		while(run) {
			System.out.println("1.로또생성 | 2.로또조회 | 99.프로그램종료");
			System.out.print(">> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			switch(selectNo) {
			case 1:
				System.out.print("금액을 투입해주세요. >> ");
				inM = Integer.parseInt(scn.nextLine());
				System.out.println("번호 출력 완료");
				break;
			case 2:
				System.out.println("구매한 금액 >> "+inM+"원");
				for(int i=0; i<inM/1000; i++) {
					for(int j=0; j<lottoNo.length; j++) {
						lottoNo[j] = (int)(Math.random()*45)+1;
						if(j>0) {
							for(int k=0; k<j; k++) {
								if(lottoNo[k] == lottoNo[j]) {
									j--;
									break;
								}
							}		
						}
					}			
					for(int w=0; w<6; w++) {
						System.out.print(lottoNo[w]+" ");
					}
					System.out.println();
				}
				break;
			case 99:
				run = false;
				break;
			}
			
		}
		
	}
}
