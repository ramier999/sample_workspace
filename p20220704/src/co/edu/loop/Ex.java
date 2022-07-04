package co.edu.loop;

public class Ex {

	public static void main(String[] args) {
		
		System.out.println("두 주사위의 합이 5가 될 때 까지 굴리세요.");
		int sum = 0;
		while(true) {
			int dice1 = (int)(Math.random()*6)+1;
			int dice2 = (int)(Math.random()*6)+1;
			System.out.printf("(눈 %d, 눈 %d)\n", dice1, dice2);
			sum = dice1 + dice2;
			if(sum==5) {
				break;
			}
		}


	}

}
