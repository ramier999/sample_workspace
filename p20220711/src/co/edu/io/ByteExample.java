package co.edu.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExample {
	public static void main(String[] args) {
		long start = System.nanoTime();
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/image.jpg");
			FileOutputStream fos = new FileOutputStream("c:/Dev/image4.jpg");
			
			byte[] buff = new byte[100];
			
			while(true) {
				int buf = fis.read(buff);
				if(buf==-1) {
					break;
				}
				fos.write(buff);
			}
			
			fos.flush();
			fos.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		long end = System.nanoTime();
		System.out.println("처리시간: "+(end-start)+" nanoTime");
	}
		
	public static void read2() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data2.dat");
			byte[] arr = new byte[2]; // 2바이트의 크기만큼 한번에 읽음
			while(true) {
				int buf = fis.read(arr); // 3byte -> 2개씩 read
				if(buf == -1) {
					break;
				}
				for(int i=0; i<buf; i++) {
					System.out.print(arr[i]);
				}
				System.out.println(); // 읽은 갯수로 끊어줌
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}
	
	public static void write2() {
		byte[] arr = new byte[] { 10, 20, 30 };
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data2.dat");
			fos.write(arr); //
			fos.flush(); // 리소스 방출
			fos.close(); // 리소스 반환
		} catch (IOException e) { // IOException이 더 상위의 개념
			e.printStackTrace();
		}
		System.out.println("완료");
	}
	
	// byte기반 입력스트림
	public static void read1() {
		try {
			FileInputStream fis = new FileInputStream("c:/Dev/data1.dat");
			
			while(true) {
				int buf = fis.read(); // 읽을 수 없을 때, -1 출력
				if(buf == -1) {
					break;
				}
				System.out.println(buf);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("실행");
	}
	
	// byte기반 출력스트림
	public static void write1() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/Dev/data1.dat");
			byte a = 10, b = 20, c = 30;
			fos.write(a);
			fos.write(b);
			fos.write(c);
			
			fos.flush();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("실행완료");
	}
}
