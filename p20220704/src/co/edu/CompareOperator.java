package co.edu;

public class CompareOperator {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		if (num1 == num2) {
			System.out.println("두 수는 같습니다.");
		}
		
		if (num1 != num2) {
			System.out.println("두 수는 다릅니다");
		}
		
		if (num1 >= num2) {
			System.out.printf("%d는 %d보다 큽니다.\n", num1, num2);
		} else {
			System.out.printf("%d는 %d보다 작습니다.\n", num1, num2);
		}
		
		String name1 = new String("홍길동");
		String name2 = new String("홍길동");
		System.out.println(name1 + ", " + name2);
		
		if (name1.equals(name2)) { // 문자열을 비교할 경우에는 equals()
			System.out.println("두 이름이 동일합니다.");
		} else {
			System.out.println("두 이름이 동일하지 않습니다.");
		}
		
		String result = (name1.equals(name2)) ? "두 이름이 동일합니다." : "두 이름이 동일하지 않습니다.";
		System.out.println(result);
		
		boolean isTrue = false;
		if (num1 > num2) {
			isTrue = true;
		} else {
			isTrue = false;
		}
		
		isTrue = (num1 > num2) ? true : false; // 반환타입에 변수를 선언
		System.out.println(isTrue); // 문자열 반환

	}

}
