package co.edu.api;

public class LengthEx {
	public static void main(String[] args) {
		String ssn = "12345678912345";
		int length = ssn.length();
		if(length==13) {
			System.out.println("13자리임");
		} else {
			System.out.println("13자리가 아님");
		}
	}

}
