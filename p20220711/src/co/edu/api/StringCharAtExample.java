package co.edu.api;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "010624-1230123";
		char sex = ssn.charAt(7); // 주민등록번호 7번째 자리를 비교하여 성별 구분
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;	
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

		String example1 = "123456-1234567";
		checkGender(example1);

	} // end of main()
	
	public static void checkGender(String ssn) {
		char sex = ssn.charAt(7); // 주민등록번호 7번째 자리를 비교하여 성별 구분 (000000-0000000)
		if(ssn.length()==13) {
			sex = ssn.charAt(6); // '-'이 없을 경우 (0000000000000)
			}
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;	
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}

	} // end of main()
}
