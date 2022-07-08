package co.edu;

// 인스턴스를 여러개 생성하지 않고 하나만 존재하도록
public class Singleton {
	
	private static Singleton instance = new Singleton();
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return instance;
	}

}
