package co.edu.api;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {
	public static void main(String[] args) {
		// 데이터를 변수 하나에 여러개 저장 => 배열
		// 컬렉션 ArrayList => 인덱스로 값 지정, 동일한 값 다른 인덱스
		// 컬렉션 HashSet => 인덱스로 값 지정 x, 동일한 값 저장 x
		
		HashSet<String> set = new HashSet<String>();
		set.add("홍길동");
		set.add("김길동");
		set.add("홍길동");
		
		System.out.println(set.size()); // 중복된 값을 받지 않으므로 2
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) { // hasNext : 컬렉션에서 가져올 요소 체크
			System.out.println(iter.next()); // next : 요소 선택
		}
		System.out.println("===== ArrayList =====");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("홍길동");
		list.add("김길동");
		list.add("홍길동");
		
		System.out.println(list.size());
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
