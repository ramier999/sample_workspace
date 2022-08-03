package co.edu.io.memo;

import java.util.Scanner;

public class MemoApp {
	public static void main(String[] args) {
		
		MemoManager memoApp = MemoManager.getInstance();
		Scanner scn = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 || 2.검색 || 3.삭제 || 4.종료");
			System.out.print("메뉴선택 >> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			
			switch(selectNo) {
				case 1:
					memoApp.inputData();
					break;
				case 2:
					memoApp.search();
					break;
				case 3:
					memoApp.deleteData();
					break;
				case 4:
					memoApp.storeToFile();
					run=false;
			}
		}
		System.out.println("<< End of Program >>");
	}
}
