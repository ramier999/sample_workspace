package co.edu;

public class StaticMain {
	public static void main(String[] args) {
		// 정적(static) 기능
		Calculator cal = new Calculator();
//		System.out.println(cal.pi);
//		System.out.println(Calculator.pi);
		int result = Calculator.sum(10,20);
		System.out.println(result);
		
		Singleton sing1 = Singleton.getInstance();
		Singleton sing2 = Singleton.getInstance();
		System.out.println(sing1 == sing2);
		
		Math.random();
	}

}
