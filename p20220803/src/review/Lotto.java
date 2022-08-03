package review;

public class Lotto {
	
	private int[] makeNumber() {
		int[] lottoNo = new int[6];
		for(int i=0; i<lottoNo.length; i++) {
			lottoNo[i] = (int)(Math.random()*45)+1;
			if(i>0) {
				for(int j=0; j<i; j++) {
					if(lottoNo[j] == lottoNo[i]) {
						i--;
						break;
					}
				}		
			}
		}
		return lottoNo;
	}
	
	private void showInfo() {
	}
}
