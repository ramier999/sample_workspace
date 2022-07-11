package co.edu.exception;
/*
 * 배열의 크기를 벗어나 저장 or 출력
 */
public class ArrayIndexOutofBoundsEx {
	public static void main(String[] args) {
		
		int[] intAry = new int[5];
		intAry[0] = 20;
		intAry[1] = 30;
//		intAry[5] = 50;
		
		for(int i=0; i<=intAry.length; i++) {
			try {
			intAry[i] = (int) Math.random()*100;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("범위를 초과했습니다.");
			}
		}
		
		System.out.println("End of Program");
		
	}
}
