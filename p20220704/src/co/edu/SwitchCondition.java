package co.edu;

public class SwitchCondition {
	public static void main(String[] args) {
		
//		double result = Math.random(); // 0 <= temp < 1
//		System.out.println(result);

		int result1 = (int) (Math.random()*6)+1; // 강제 정수 변환 : 1 ~ 6 사이의 정수 출력
		if (result1 == 1) {
			System.out.println("1번");
		} else if (result1 == 2) {
			System.out.println("2번");
		} else if (result1 == 3) {
			System.out.println("3번");
		} else if (result1 == 4) {
			System.out.println("4번");
		} else if (result1 == 5) {
			System.out.println("5번");
		} else {
			System.out.println("6번");
		}
		
		switch(result1) {
		case 1:
			System.out.println("1번");
			break;
		case 2:
			System.out.println("2번");
			break;
		case 3:
			System.out.println("3번");
			break;
		case 4:
			System.out.println("4번");
			break;
		case 5:
			System.out.println("5번");
			break;
		default:
			System.out.println("6번");
			break;
		}
	}
}
