package co.edu;

public class MethodExample01 {
	
	public static void main(String[] args) {
		sum(10, 20);
		
		int result = sum2(5, 10);
		System.out.println("결과값은 "+result);
		
		result = sum2(sum2(3,5), sum2(5,7));
		System.out.println("결과값은 "+result);
		
		double weight = properWeight(170);
		System.out.println("적정 몸무게는 "+weight);
		
		// 밑변: 23.4, 높이: 12.2 => 결과?
		double triangle = getTriangle(23.4, 12.2);
		System.out.printf("삼각형의 넓이는 %.1f", triangle);
	}
	
	public static void sum(int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		System.out.println("결과: "+result);
	}
	
	public static int sum2(int n1, int n2) {
		int result = n1 * 2 + n2 * 3;
		return result;
	}
	
	// 키 입력 -> 처리 -> 적정 몸무게 반환 ( 키 - 100) * 0.9
	public static double properWeight(double height) {
		double weight = ( height - 100 ) * 0.9 ;
		return weight;
	}
	
	// 삼각형의 넓이 메소드
	public static double getTriangle(double length, double height) {
		double triangle = length * height / 2 ;
		return triangle;
	}

}
