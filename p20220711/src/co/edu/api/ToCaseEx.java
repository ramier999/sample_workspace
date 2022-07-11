package co.edu.api;

public class ToCaseEx {
	public static void main(String[] args) {
		String AAA = "Java Programming";
		String BBB = "JAVA Programming";
		
		System.out.println(AAA.equals(BBB));
		
		String lowerAAA = AAA.toLowerCase();
		String upperBBB = BBB.toUpperCase();
		
		System.out.println(lowerAAA);
		System.out.println(upperBBB);
		
		System.out.println(AAA.equalsIgnoreCase(BBB)); // 대소문자 구분 없이 같은 문자인가 바로 비교
	}
}
