package co.edu.exception;
/*
 * 인스턴스 참조변수 = null 일 때
 */
public class NullPointerEx {
	public static void main(String[] args) {

		String name = "ㅇㅇ";
		name = null;
		
		try {
		System.out.println(name.toString());
		System.out.println("name을 출력"); // name값이 있을때만 출력되는 문구
		} catch(NullPointerException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace(); // 오류메세지 출력
		}
		System.out.println("End of Program");
		
	}
}
