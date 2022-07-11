package co.edu.api;

import java.io.UnsupportedEncodingException;

public class StringEx {
	public static void main(String[] args) {
		
		String name = "홍길동";
		
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 }; // byte값
		
		name = new String(bytes);
		System.out.println(name);

		String name1 = null;
		try {
			name1 = new String(bytes, 0, 5, "UTF-8"); // 0에서부터 5까지 출력 (5 제외함)
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} // byte값 0에서 5까지 출력
		System.out.println(name1);
		
		char fName = name.charAt(0);
		System.out.println(fName);
	}
	
}
