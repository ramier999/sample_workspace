package co.edu.compound;

import java.util.Date;
import java.util.Scanner;

// id: user1, passwd: 1212 => 로그인되었습니다!!
//						   => id, passwd를 확인하세요!!

public class BoardApp {
	public static void main(String[] args) {
		
		// 등록 / 조회 / 수정 / 삭제 / 리스트

		Board[] boards = new Board[100];
		Scanner scn = new Scanner(System.in);
		
		// 로그인 처리 기능
		String rightId = "user1";
		String rightPd = "1212";
		
		boolean login = true;
		
		while(login){
			System.out.print("아이디를 입력하세요 >> ");
			String userId = scn.nextLine();
			System.out.print("비밀번호를 입력하세요 >> ");
			String userPasswd = scn.nextLine();
			if(userId.equals(rightId) && userPasswd.equals(rightPd)) {
				System.out.println("로그인 되었습니다!!");
				break;
				} else {
				System.out.println("아이디와 비밀번호를 다시 확인해주세요!!");
			} 
		}
		
		boolean run = true;
		
		while(run) {
			
			System.out.println("------------------------------------------------------");
			System.out.println("1. 등록 | 2. 조회 | 3. 수정 | 4. 삭제 | 5. 리스트 | 6. 종료 ");
			System.out.println("------------------------------------------------------");
			System.out.print("선택 > ");
			int selectNo = Integer.parseInt(scn.nextLine());
			
			if(selectNo==1) {
				System.out.print("제목 > ");
				String title = scn.nextLine();
				
				System.out.print("내용 > ");
				String content = scn.nextLine();
				
				System.out.print("작성자 > ");
				String writer = scn.nextLine();
				
				Board board = new Board();
				board.setTitle(title);
				board.setContent(content);
				board.setWriter(writer);
				board.setCreateDate(new Date());
				board.setHitCount(0);
				
				// 배열의 비어있는 위치에 저장
				for(int i=0; i<boards.length; i++) {
					if(boards[i]==null) {
						boards[i] = board;
						break;
					} 
				}
				System.out.println("저장되었습니다.");
				
			} else if(selectNo==2) {
				System.out.print("조회할 글의 제목을 입력하세요. > ");
				String findTitle = scn.nextLine();
				for(int i=0; i<boards.length; i++) {
					if(boards[i].getTitle().equals(findTitle)) {
						System.out.println("제목 > "+boards[i].getTitle());
						System.out.println("내용 > "+boards[i].getContent());
						System.out.println("작성자 > "+boards[i].getWriter()
								+" | 작성일시 : "+boards[i].getCreateDate()
								+" | 조회수 : "+boards[i].getHitCount());
						int cnt = boards[i].getHitCount();
						boards[i].setHitCount(++cnt);
						break;
					}
				}
					
			} else if(selectNo==3) {
				System.out.print("수정할 글의 제목을 입력하세요. > ");
				String findTitle = scn.nextLine();
				for(int i=0; i<boards.length; i++) {
					if(boards[i].getTitle().equals(findTitle)) {
						System.out.print("수정할 내용을 입력하세요. > ");
						String content = scn.nextLine();
						boards[i].setContent(content);
						System.out.println("수정되었습니다.");
						break;
					}
				}
				
			} else if(selectNo==4) {
				System.out.print("삭제할 글의 제목을 입력하세요. > ");
				String findTitle = scn.nextLine();
				for(int i=0; i<boards.length; i++) {
					if(boards[i].getTitle().equals(findTitle)) {
						boards[i]=null;
						System.out.println("삭제되었습니다.");
						break;
					}
				}
				
			} else if(selectNo==5) {
				
				for(int i=0; i<boards.length; i++) {
					if(boards[i]!=null) {
						System.out.printf("제목: %s | 작성자: %s | 작성일시: %s | 조회수: %d\n",
								boards[i].getTitle(), boards[i].getWriter(), 
								boards[i].getCreateDate(), boards[i].getHitCount());
					}
				}
				
			} else if(selectNo==6) {
				
				System.out.println("프로그램을 종료합니다...");
				break;
				
			} else {
				
				System.out.println("ERROR");
				
			}
			
			
		}
		System.out.println("End of Program");
		
	}

}
