package co.edu.api;

import java.io.UnsupportedEncodingException;

public class GetByteEx {
	public static void main(String[] args) {
		String A1 = "안녕하세요";
		byte[] bytes1 = A1.getBytes();
		System.out.println("길이: "+bytes1.length);
		String A2 = new String(bytes1);
		System.out.println("bytes1 -> String: "+A2);
	
		try {
			byte[] bytes2 = A1.getBytes("EUC-KR");
			System.out.println("길이: "+bytes2.length);
			String A3 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2 -> String: "+A3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
