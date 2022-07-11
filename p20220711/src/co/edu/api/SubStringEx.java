package co.edu.api;

public class SubStringEx {
	public static void main(String[] args) {
		String ssn = "000000-1234567";
		
		String firstNum = ssn.substring(0, 6); // 0에서 6까지 표시 (6제외)
		String secondNum = ssn.substring(7); // 7부터 표시 (끝까지)
		System.out.println(firstNum);
		System.out.println(secondNum);
	}
}
