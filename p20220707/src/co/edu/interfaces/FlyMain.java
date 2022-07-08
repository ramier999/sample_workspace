package co.edu.interfaces;

public class FlyMain {
	public static void main(String[] args) {
		Flyer flier = new Helicopter();
		flier = new AirPlane();
		// 인터페이스(Flyer) <= 구현클래스(Helicopter)
		
		flier.takeOff();
		flier.fly();
		flier.land();
	}
}
