package co.edu;

public class Example02 {
	public static void main( String[] args) {
		// 나의 키 : 변수, 친구 키 : 변수
		double myH = 162.5;
		double yourH = 159.4;
		double theDifference = 0;
		
		if ( myH > yourH ) {
			theDifference = myH - yourH;
			System.out.println("나의 키가 " + theDifference + "만큼 더 큽니다.");
		} else {
			theDifference = yourH - myH;
			System.out.println("나의 키가 " + theDifference + "만큼 더 작습니다.");
		}
	}
}
