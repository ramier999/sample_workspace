package co.edu.collect.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * main 메소드를 담고있는 클래스
 */
public class BoardApp {
	public static void main(String[] args) {
		BoardDAO app = BoardDAO.getInstance();
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			System.out.println("< 1.목록 | 2.등록 | 3.조회 | 4.삭제 | 5.종료 >");
			
			// 메뉴 선택 => 선택값 => 구현
			
			System.out.print("메뉴 번호를 선택하세요. >> ");
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo==1) {
				app.boardList();
				
			} else if(selectNo==2) {
				System.out.print("제목 >> ");
				String title1 = scn.nextLine();
				System.out.print("작성자 >> ");
				String writer1 = scn.nextLine();
				System.out.print("내용 >> ");
				String content1 = scn.nextLine();
				Board boards = new Board(title1, writer1, content1); 
				app.add(boards);
				
			} else if(selectNo==3) {
				System.out.print("조회할 글의 작성자를 입력하세요. >> ");
				String sWriter = scn.nextLine();
				app.search(sWriter);
				System.out.println("제목 	|");
				System.out.println("작성자	|");
				System.out.println("내용 	|");
			} else if(selectNo==4) {
				System.out.print("삭제할 글의 제목을 입력하세요. >> ");
				String rTitle = scn.nextLine();
				app.remove(rTitle);
				System.out.println();
			} else if(selectNo==5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		System.out.println("End of Program!!");
	}

	private static List<Board> Board(String titlee, String writerr, String contentt) {
		// TODO Auto-generated method stub
		return null;
	}
}
