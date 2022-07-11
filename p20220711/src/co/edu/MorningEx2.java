package co.edu;

public class MorningEx2 {
	public static void main(String[] args) {

		int[] intAry = new int[6];
		
		int max = intAry[0];
		int sum = 0;
		double avg = 0;
		
		for(int i=0; i<intAry.length; i++) {
			intAry[i] = (int)(Math.random()*100)+1;
			sum += intAry[i];
			if(max<intAry[i]) {
				max = intAry[i];
			}
		}
		
		System.out.print("[");
		for(int num : intAry) {
			System.out.print(" "+num);
		}
		System.out.println(" ]");
		
		avg = (double) sum / intAry.length;
		
		System.out.println("최대값 = "+max);
		System.out.println("합계 = "+sum);
		System.out.printf("평균 = %.1f\n", avg);
	}
}
