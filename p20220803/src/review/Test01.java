package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<String> list = new ArrayList<>(); 
		boolean run = true;
		while(run) {
			System.out.println("1. 단어 입력 | 2. 대소문자 변환 | 3. 단어 길이 | 4. 단어 자르기 | 5. 단어 자르기2 | 99. 프로그램 종료");
			System.out.print("번호를 선택하세요. >> ");
			int menuNo = Integer.parseInt(scn.nextLine());
			// nextLine = String + CRLF = String + Enter
			// Enter 기준으로 입력
			switch(menuNo) {
			case 1:
				while(true) {
					System.out.print("단어를 입력하세요. 종료를 원하면 q를 눌러주세요. >> ");
					String word = scn.nextLine();
					if(word.equals("q")) {
						break;
					}
					list.add(word);
				}
				for(String str : list) {
					System.out.print(str+" ");
				}
				break;
			case 2:
				if(list == null || list.size()==0) {
					System.out.println("단어가 등록되지 않았습니다.");
					return;
				}
				System.out.println("1. 대문자 | 2. 소문자");
				System.out.print("번호를 입력하세요. >> ");
				int menu = Integer.parseInt(scn.nextLine());
				if(menu==1) {
					for(String str : list) {
						System.out.println(str.toUpperCase()+" ");
					}
				} else if(menu==2) {
					for(String str : list) {
						System.out.println(str.toLowerCase()+" ");
					}
				}
				break;
			case 3:
				StringBuilder sb = new StringBuilder();
				for(int i=0; i<list.size(); i++) {
					sb.append(list.get(i));
				}
				System.out.println("입력한 문자의 총 길이 : "+sb.length()+" 입니다.");
				break;
			case 4:
				System.out.println("자르고 싶은 단어의 인덱스를 입력하세요.");
				int i = 0;
				for(String str : list) {
					System.out.println(i+"번째 단어 : "+str);
					i++;
				}
				System.out.print("입력 >> ");
				int idx = Integer.parseInt(scn.nextLine());
				String word = list.get(idx);
				// word.length()/2
				// Math.round(word.length()/2) -> 단어 한 가운데의 인덱스
				System.out.println(word.substring(Math.round(word.length()/2)));
				break;
			case 5:
				System.out.print("단어 입력 >> ");
				String str = scn.nextLine();
				System.out.println("입력하신 단어 : "+str);
				System.out.print("구분자 입력 >> ");
				String splits = scn.nextLine();
				String[] token = str.split(splits);
				for(String str2 : token) {
					System.out.println(str2);
				}
				break;
			case 99:
				run = false;
				break;
			}
			
		}
		
	}
}
