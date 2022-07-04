package co.edu;

public class Example03 {
	public static void main(String[] args) {
		// 월 => 마지막 날은 28, 30, 31일입니다. 
		int month = (int)(Math.random()*12)+1;
		System.out.printf("%d월의 마지막 날은 ", month);
		switch(month) {
		case 1: // 중복된 결과값의 경우 이런식으로 정리 가능
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일입니다.");
			break;
		case 2:
			System.out.println("28일입니다.");
			break;
		default:
			System.out.println("30일입니다.");
			break;
		}
		
		int lastdate = 0;
		if (month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			lastdate = 31;
		} else if (month==2) {
			lastdate = 28;
		} else {
			lastdate = 30;
		}
		System.out.printf("%d월의 마지막 날은 %d일입니다.", month, lastdate);

	}

}
