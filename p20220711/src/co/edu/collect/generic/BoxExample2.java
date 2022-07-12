package co.edu.collect.generic;

public class BoxExample2 {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("문자열");
		String result = box.get();
//		Integer result1 = box.get(); // String 타입이므로 오류
		System.out.println(result);
		
		Box<Integer> intBox = new Box<Integer>();
		intBox.set(100); // int => Integer (boxing)
		Integer result1 = intBox.get(); // Integer => int (unboxing)
		System.out.println(result1);
	}
}
