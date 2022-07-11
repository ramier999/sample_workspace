package co.edu.api;

public class EqualEx {
	public static void main(String[] args) {
		String A1 = new String("ㅇㅇ");
		String A2 = "ㅇㅇ";
		
		if(A1==A2) {
			System.out.println("같은 객체임");
		} else {
			System.out.println("다른 객체임");
		}
		
		if(A1.equals(A2)) {
			System.out.println("같은 문자임");
		} else {
			System.out.println("다른 문자임");
		}
	}

}
