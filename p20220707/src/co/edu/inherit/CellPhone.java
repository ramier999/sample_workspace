package co.edu.inherit;
/*
 * 상속 ( 부모 <- 자식 )
 * CellPhone <- DmbCellPhone
 */
public class CellPhone /*(extends Object) << 모든 class는 기본적으로 포함*/{
	// field
	private String model;
	private String color;
	
	// constructor
	public CellPhone() {} // default constructor
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	public void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	public void bell() {
		System.out.println("bell");
	}
	public void sendVoice() {
		System.out.println("메세지 전송");
	}
	public void receiveVoice() {
		System.out.println("메세지 수신");
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "model명은 "+model+", 색상은 "+color+"입니다.";
	}

}