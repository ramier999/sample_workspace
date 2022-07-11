package co.edu.api;

public class ReplaceEx {
	public static void main(String[] args) {
	String oldA = "자바는 객체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
	String newA = oldA.replace("자바", "JAVA");
	System.out.println(oldA);
	System.out.println(newA); // 대체라는 단어를 쓰지만 아예 새로운 문자열을 만드는 개념 - 대부분 그럼
	}
}
