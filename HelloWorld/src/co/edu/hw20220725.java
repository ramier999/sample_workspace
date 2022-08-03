package co.edu;

import java.util.Scanner;

public class hw20220725 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		String[] goods = null;
		int[] goodsPrice = null;
		int goodsNo = 0;
		int max = 0;
		String maxGoods = null;
		int sum = 0;
		
		while(run) {
		System.out.println("1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
		System.out.print("메뉴 번호를 선택하세요. >> ");
		int selectNo = Integer.parseInt(scn.nextLine());
		
			switch(selectNo) {
			 case 1:
				 System.out.print("상품의 가짓수를 입력하세요. >> ");
				 goodsNo = Integer.parseInt(scn.nextLine());
				 goods = new String[goodsNo];
				 goodsPrice = new int[goodsNo];
				 break;
			 
			 case 2:
				for(int i=0; i<goodsNo; i++) {
					System.out.print("상품의 이름을 입력하세요. >> ");
					goods[i] = scn.nextLine();
					System.out.print("상품의 가격을 입력하세요 >> ");
					goodsPrice[i] = Integer.parseInt(scn.nextLine());
				}
				break;
				
			 case 3:
				 for(int i=0; i<goodsNo; i++) {
					 System.out.println(goods[i]+" : "+goodsPrice[i]);
				 }
				 break;
				 
			 case 4:
				 for(int i=0; i<goodsNo; i++) {
					 if(max<goodsPrice[i]) {
						 max = goodsPrice[i];
						 maxGoods = goods[i];
					 }
					 sum += goodsPrice[i];
				 }
				 sum -= max;
				 System.out.println("최고 가격 제품 : "+maxGoods+", "+max);
				 System.out.println("최고 가격 제품을 제외한 제품들의 가격 합계 : "+sum);
				 break;
				 
			 case 5:
				 System.out.println("프로그램을 종료합니다.");
				 run = false;
				 break;
			}
		}
	}
}
