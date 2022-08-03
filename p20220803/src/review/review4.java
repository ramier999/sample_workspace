package review;

import java.util.Scanner;

public class review4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Product[] pro = null;
		boolean run = true;
		while(run) {
			System.out.println("1.상품수 | 2.상품&가격입력 | 3.제품별가격 | 4.분석 | 5.종료");
			System.out.print("번호 입력 >> ");
			int menuNo = Integer.parseInt(scn.nextLine());
			switch(menuNo) {
			case 1:
				System.out.print("상품수 입력 >> ");
				int count = Integer.parseInt(scn.nextLine());
				pro = new Product[count];
				break;
			case 2:
				for(int i=0; i<pro.length; i++) {
					pro[i] = new Product();
					System.out.print("상품 이름 입력 >> ");
					String name = scn.nextLine();
					pro[i].setName(name);
					System.out.print("상품 가격 입력 >> ");
					int price = Integer.parseInt(scn.nextLine());
					pro[i].setPrice(price);
				}
				break;
			case 3:
				for(Product product : pro) {
					System.out.println("상품명 : "+product.getName()+", 상품가격 : "+product.getPrice());
				}
//				for(int i=0; i<pro.length; i++) {
//					System.out.println(pro[i].getName()+" : "+pro[i].getPrice());
//				}
				break;
			case 4:
				int sum = 0;
				int max = 0;
				int maxIdx = 0;
//				String maxName = null;
				for(int i=0; i<pro.length; i++) {
					sum += pro[i].getPrice();
					if(max<pro[i].getPrice()) {
						max = pro[i].getPrice();
						maxIdx = i;
//						maxName = pro[i].getName();
					}
				}
//				System.out.println("max : "+max+", "+maxName);
				System.out.println("max : "+max+", "+pro[maxIdx].getName());
				System.out.println("max값을 제외한 총합 : "+(sum-max));
				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
		}
	}
}
