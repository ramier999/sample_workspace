package co.edu.emp;

public class Employee {
	
	// 필드
	private int 	employeeId; 	// 사번
	private String 	name; 			// 이름
	private int 	departmentId; 	// 부서번호 10:인사, 20:개발, 30:영업(기본값)
	private String 	departmentName; // 부서명
	private int 	salary; 		// 급여
	private String 	email; 			// 이메일
	
	// 생성자
	public Employee() {}
	public Employee(int employeeId, String name, int salary, int departmentId) {
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		if(departmentId == 10) {
			departmentName = "인사";
		} else if(departmentId == 20) {
			departmentName = "개발";
		} else {
			departmentName = "영업";
		}
	}
		
	// 사번, 이름 초기화.
	public Employee(int employeeId, String name) {
		this(employeeId, name, 100, 30); // this 다른 생성자를 호출
	}
	
	// 사번, 이름, 급여
	public Employee(int employeeId, String name, int salary) {
		this(employeeId, name, salary, 30);
	}
	
	// get
	public String getName() {
		return name;
	}
	
	public int getemployeeId() {
		return employeeId;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public String getEmail() {
		return email;
	}
	
	// 상세정보를 반환하는 기능
	public String getDetailInfo() {
		// 사원번호, 이름, 급여, 부서정보
		String info = "사원번호: "+employeeId+", 이름: "+name+", 급여: "+salary+", 부서정보: "+departmentName;
		return info;
	}
	
	//set
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}


