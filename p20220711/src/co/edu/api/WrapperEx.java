package co.edu.api;

import java.util.ArrayList;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i = new Integer("100");
		System.out.println(i);
		
		int i2 = 100;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100); // 100(int) => 100(Integer) 박싱
		list.add(200);
		list.add(new Integer(300)); // deprecated 되어 차후 사용 중지 - 걍 int로 적으삼
		
		for(Integer num : list) { // list 크기만큼 반복하겠다
			System.out.println(num);
		}
		
		// 문자열 -> 숫자
		int n1 = Integer.parseInt("1000"); // 문자열 "1000"을 숫자 1000으로 바꿔주겠다는 말
		double n2 = Double.parseDouble("12.3"); 
	}
}
