package co.edu.inherit;

public class MainExample {
	public static void main(String[] args) {
		
		DmbCellPhone phone = new DmbCellPhone();
		phone.powerOn();
		phone.bell();
		phone.sendVoice();
		phone.receiveVoice();
		
		phone.turnOn();
		phone.turnOff();
		
		phone.powerOff();
		
		//SmartPhone 기능
		SmartPhone sphone = new SmartPhone();
		sphone.setModel("Galaxy");
		sphone.setColor("Black");
		
		sphone.powerOn();
		sphone.powerOff();
		
		System.out.println("자동형변환 >> ");
		// 부모 > 자식, long <- int : 자동형변환, int <- long : 강제형변환
		CellPhone dphone = new DmbCellPhone("i-phone", "White", 100);
		System.out.println(dphone.toString());
		
		CellPhone cphone = new CellPhone();
		cphone.setModel("LG Phone");
		cphone.setColor("Red");
		System.out.println(cphone.toString());
		
//		DmbCellPhone dcp = (DmbCellPhone) dphone; // 형변환
		
//		dphone.powerOn();
//		dcp.powerOn(); // 위랑 동일
//		dphone.turnOn(); // 오류. 자식의 기능은 사용 불가능
//		dphone.powerOff();

		if(cphone instanceof DmbCellPhone) { //
		DmbCellPhone dcp = (DmbCellPhone) cphone; // 컴파일 오류는 없으나 실행오류
		dcp.powerOn();
		dcp.powerOff();
		}
	}

}
