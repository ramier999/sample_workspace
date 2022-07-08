package co.edu.interfaces.emp;

import java.util.Scanner;

/*
 * 배열기반 기능 구현(implement)
 */
public class EmployeeArray implements EmployeeList {
	// 싱글톤
	private static EmployeeArray instance;
	private EmployeeArray() {}
	public static EmployeeArray getInstance() {
		return instance;
	}
	
	Employee[] list;
	int empNum;
	Scanner scn = new Scanner(System.in);
	
	@Override
	public void init() {
		System.out.print("사원수 >> ");
		int num = Integer.parseInt(scn.nextLine());
		list = new Employee[num];
	}

	@Override
	public void input() {
		System.out.print(empNum+" 사번입력 >> ");
		int no = Integer.parseInt(scn.nextLine());
		
		System.out.print("이름 >> ");
		String name = scn.nextLine();
		
		System.out.println("급여 >> ");
		int sal = Integer.parseInt(scn.nextLine());
		
		list[empNum++] = new Employee(no, name, sal);
	}

	@Override
	public Employee search(int empId) {
		for(int i=0; i<list.length; i++) {
			if(list[i].getemployeeId() == empId) {
				return list[i];
			}
		}
		return null;
	}

	@Override
	public void printList() {
		for(int i=0; i<empNum; i++) {
			System.out.printf("%5d %10s %7d\n",list[i].getemployeeId(), list[i].getName(), list[i].getEmail());
		}
		
	}

}
