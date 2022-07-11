package co.edu.api;

public class StringText {
	public static void main(String[] args) {
		
		// 1. 자바 라는 문자가 몇 번 들어있는지 출력하기
		String[] str = { "자바", "자바다", "이것이자바다", "자바스크립트", "자 바" };
		int count = 0;
		for(int i=0; i<str.length; i++) {
			if(str[i].indexOf("자바")!=-1) {
				count++;
			}
		}
		System.out.printf("자바라는 단어는 %d번 들어있습니다\n", count);
		System.out.println("---------------------------------");
		
		// 2. 파일의 확장자와 파일명 구하기
		String path = "C:/images/hello.png";
		int location = path.lastIndexOf("/");
		int location2 = path.indexOf(".");
		String fileName = path.substring(location+1, location2);
		String fileEx = path.substring(location2+1);
		System.out.println("파일명: "+fileName);
		System.out.println("파일 확장자명: "+fileEx);
		System.out.println("---------------------------------");
		
		// 3. 031-2103-3478로 출력되게 하기
		String[] tels = { " 031", " 210 3", "34 78  " };
		String[] tels2 = new String[tels.length];
		for(int i=0; i<tels.length; i++) {
			tels2[i] = tels[i].replace(" ","");
		}
		System.out.println("tel = "+tels2[0]+"-"+tels2[1]+"-"+tels2[2]);
		System.out.println("---------------------------------");
		
		// 4. checkGender() 만들어서 주민등록번호로 남녀구분하기
		String[] ssn = { "970403-1234123", "010503 3456123", 
				"980123/2412345", "0101013217891"};
		for(int i=0; i<ssn.length; i++) {
			checkGender(ssn[i]);
		}
	}
	
	public static void checkGender(String ssn) {
		char gender = ssn.charAt(7);
		if(ssn.length()==13) {
			gender = ssn.charAt(6);
		}
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}

}
