package co.edu.compound;

public class FriendMain {

	public static void main(String[] args) {
		
		Friend f1 = new Friend();
//		f1.name = "ㅇㅇㅇ";
//		f1.phone = "000-0000-0000";
//		f1.mail = "00000@000000.000";
//		f1.birth = "00/00";
//		f1.height = 177.7;
//		f1.weight = 77.7;
		
		f1.setName("김민수");
		System.out.println("이름은 "+f1.getName()+"입니다.");
		f1.setPhone("010-0000-0000");
		System.out.println("연락처는 "+f1.getPhone()+"입니다.");
		f1.setBirth("7월 6일");
		System.out.println("생일은 "+f1.getBirth()+"입니다.");
		f1.setMail("00000@00000.000");
		System.out.println("메일은 "+f1.getMail()+"입니다.");
		f1.setHeight(177.7);
		System.out.println("키는 "+f1.getHeight()+"cm입니다.");
		f1.setWeight(77.7);
		System.out.println("몸무게는 "+f1.getWeight()+"kg입니다.");
//		f1.showInfo();
	}

}
