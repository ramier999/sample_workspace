package co.edu.collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set (인터페이스) => HashSet, TreeSet
 */
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Apple");
		set.add("Strawberry");
		set.add("Watermelon");
		set.add("Strawberry"); // 중복된 값은 포함x
		System.out.println("Size: "+set.size());
		
		set.remove("Strawberry");
		System.out.println(set.contains("Strawberry")); // 포함된 값 찾기
		
		if(set.isEmpty()) {
			System.out.println("컬렉션이 비어있습니다.");
		}
		
		// 반복 요소 처리
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String val = iter.next();
			System.out.print(val+" ");
		}
		System.out.println();
		// 반복 처리
		iter = set.iterator(); // 반복자 획득
		while(iter.hasNext()) {
			String val = iter.next();
			System.out.print(val+" ");
		}
		System.out.println();
		// 확장 for
		for(String val : set) {
			System.out.println(val);
		}
	}
}
