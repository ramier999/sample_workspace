package review;

public class EmpDept extends Employee {
	
	private String depName;
	
	public EmpDept() {}

	public EmpDept(String empName, int empSal, String depName) {
		super(empName, empSal);
		this.depName = depName;
	}

	
	public String getDepName() {
		return depName;
	}

	@Override
	public void getInformation() {
		System.out.println("이름:"+empName+"  연봉:"+empSal+"  부서:"+depName);
	}

	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}

}
