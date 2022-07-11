package co.edu.api;

public class TrimEx {
	public static void main(String[] args) {
		String AAA = "       띄어쓰기 없애줌??";
		String BBB = "ㄹㅇ??       ";
		String CCC = "    중간에 띄어쓴건 그대로임    ";
		
		String DDD = AAA.trim()+BBB.trim()+CCC.trim();
		System.out.println(DDD);
	}
}
