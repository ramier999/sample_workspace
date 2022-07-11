package co.edu.api;

import java.lang.reflect.Method;

public class ClassEx {
	public static void main(String[] args) {
		// 클래스의 정보 얻어오기
		try {
			Class cls = Class.forName("java.lang.String");
			cls = String.class; // 위랑 아래랑 둘 다 같은 말임
			
			System.out.println(cls.getName());
			Method[] methods = cls.getMethods();
			for(Method method : methods) {
				System.out.println(method.getName()); // String의 메소드이름 출력
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
