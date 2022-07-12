package co.edu.collect.generic;
/*
 * 제네릭: 클래스 사용 시점에 타입을 지정하는 것
 */
public class Box<T> { // <T>는 사용시점에 타입을 지정하겠다는 뜻, <대문자>의 형태
	private T obj;
	
	public void set(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
	
}
