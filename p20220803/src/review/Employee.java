package review;

public class Employee {
	
	protected String empName;
	protected int empSal;
	
	public Employee() {}
	
	public Employee(String empName, int empSal) {
		this.empName = empName;
		this.empSal = empSal;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpSal() {
		return empSal;
	}
	
	public void getInformation() {
		System.out.println("이름:"+empName+"  연봉:"+empSal);
	}
	
	public void print() {
		System.out.println("수퍼클래스");
	}
}
