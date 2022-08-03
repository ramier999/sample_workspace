package review;

public class ObesityInfo extends StandardWeightInfo {
	
	public ObesityInfo() {}
	
	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	public void getInformation() {
		String ob = null;
		if(getObesity()>=25) {
			ob = "비만";
		} else if(getObesity()<25 && getObesity()>=23) {
			ob = "과체중";
		} else if(getObesity()<23 && getObesity()>=18.5) {
			ob = "정상";
		} else {
			ob = "저체중";
		}
		System.out.println(getName()+"님의 신장 "+getHeight()+", 몸무게 "+getWeight()+", "+ob+"입니다.");
	}
	
	public double getObesity() {
		return (getWeight()-getStandardWeight())/getStandardWeight()*100;
	}
}
