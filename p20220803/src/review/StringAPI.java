package review;

public class StringAPI {
	public static void main(String[] args) {
		String a = "aaa";
		String b = "bbb";
		String c = "aaa"; // a와 c의 주소값이 같음
		String d = new String("aaa"); // a와 d의 주소값이 다름

		if(a==d) {
			System.out.println("주소값이 같다.");
		} else {
			System.out.println("주소값이 다르다.");
		}
		
		if(a.equals(d)) {
			System.out.println("데이터가 같다.");
		} else {
			System.out.println("데이터가 다르다.");
		}
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("aaa"); // 100번지
		sb.append("bb"); // 100번지
		
		
	}
}
  