package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 이름, 점수 => map 저장
 * (김민수, 80), (황현익, 75), (이현승, 88)
 * Scanner 클래스 > 학생이름 입력 시 점수로 반환
 */
public class MapExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Map<String, Integer> students = new HashMap<String, Integer>();

		boolean exist = false;
		
		students.put("김민수", 80);
		students.put("황현익", 75);
		students.put("이현승", 88);
		
		int sum = 0;
		int max = 0;
		String maxName = null;
		
		Set<String> keySet = students.keySet();
		for(String key : keySet) {
			Integer val = students.get(key);
			System.out.println("이름: "+key+" | 점수: "+val);
			sum += val;
			if(max<val) {
				max=val;
				maxName=key;
			}
		}
		
		double avg = (double) sum / students.size();
		
		System.out.println("출력결과: ");
		System.out.printf("평균점수: %.0f\n",avg);
		System.out.print("최고점수: "+max);
		System.out.println(", 최고점수 학생의 이름: "+maxName);
		
//		System.out.print("점수를 확인할 학생의 이름을 입력하세요. >> ");
//		String putName = scn.nextLine();

//		Set<String> keySet = students.keySet();
//		for(String key : keySet) {
//			Integer val = students.get(key);
//			if(key.equals(putName)) {
//				System.out.println(val+"점");
//				exist = true;
//				break;
//			}
//		}
//		if(!exist) {
//			System.out.println("찾는 학생이 없습니다.");
//		}
		
//		Set<Entry<String, Integer>> set = students.entrySet();
//		for(Entry<String, Integer> ent : set) {
//			if(ent.getKey().equals(putName)) {
//				System.out.println(ent.getValue()+"점");
//			}
//		}

		System.out.println("===================================");
		
		sum = 0;
		max = 0;
		maxName = null;
		
		Set<Entry<String, Integer>> set = students.entrySet();
		for (Entry<String, Integer> ent : set) {
			sum += ent.getValue();
			if(max<ent.getValue()) {
				max = ent.getValue();
				maxName = ent.getKey();
			}
		}
		
		avg = (double) sum / students.size();
		
		System.out.println("출력결과:");
		System.out.printf("평균점수: %.0f\n",avg);
		System.out.print("최고점수: "+max);
		System.out.println(", 최고점수 학생의 이름: "+maxName);
	}
}
