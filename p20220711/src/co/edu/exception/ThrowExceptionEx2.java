package co.edu.exception;

public class ThrowExceptionEx2 {
	public static void main(String[] args) {
		String[] str = { "100", "200", "300", "400" };
		
		try {
		subMethod(str);
		} catch(NumberFormatException e) {
			System.out.println("예외종류: Number Format Exception");
		} catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("예외종류: Array Index Out Of Bounds Exception");
		} catch(Exception e2) {
			System.out.println("예외종류: 알 수 없음");
		} finally { // 예외고 정상이고 무조건 실행
		System.out.println("End of Program");
		}
	}
	
	public static void subMethod(String[] strAry)
			throws NumberFormatException, ArrayIndexOutOfBoundsException {
		for(int i=0; i<5; i++) {
			int num = Integer.parseInt(strAry[i]);
			System.out.println(num);
		}
	}
}
