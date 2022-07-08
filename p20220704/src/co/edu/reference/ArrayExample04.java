package co.edu.reference;

public class ArrayExample04 {

	public static void main(String[] args) {
		// A반 80, 85, 83
		// B반 79, 84, 90
		
		int[][] classAry = new int[2][3];
		classAry[0][0] = 80;
		classAry[0][1] = 85;
		classAry[0][2] = 83;
		classAry[1][0] = 79;
		classAry[1][1] = 84;
		classAry[1][2] = 90;
		
//		1번	2번	3번
//	A	80	85	83
//	B	79	84	90
		
		System.out.println(classAry[0]);
		int sum1 = 0;
		int sum2 = 0;
		for(int i=0; i < classAry[0].length ; i++) {
			sum1 += classAry[0][i];
			sum2 += classAry[1][i];
		}
		double avg1 = (double) sum1/classAry[0].length;
		double avg2 = (double) sum2/classAry[1].length;
		System.out.printf("A반의 평균: %.1f점\n", avg1);
		System.out.printf("B반의 평균: %.1f점\n", avg2);

	}

}
