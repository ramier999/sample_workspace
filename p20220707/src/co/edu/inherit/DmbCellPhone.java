package co.edu.inherit;
/*
 * 상속 : 자식이 부모를 선택(extends)
 */
public class DmbCellPhone extends CellPhone {
	private int channel;
	
	public DmbCellPhone() {
		super(); // super -> 부모 class를 가져오는 것
		}
	
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color); // this.model = model, this.color=color와 같음
		// 부모클래스 가져오기 중 super.model = model 도 가능은 하지만 private라 안되므로 유의
		this.channel = channel;
	}
	
	public void turnOn() {
		System.out.println("dmb화면 on");
	}
	public void turnOff() {
		System.out.println("dmb화면 off");
	}
	
	// overriding : 재정의. source - override/implement method

	@Override
	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	@Override
	public String toString() {
		return "model명은 "+getModel()+", 색상은 "+getColor()+", 채널은 "+channel+" 입니다.";
		// super.model << private라서 불가능
	}
	
	
	
}
