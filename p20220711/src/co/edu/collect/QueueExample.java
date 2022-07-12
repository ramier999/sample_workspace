package co.edu.collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		
		que.offer("홍길동");
		que.offer("김인수");
		que.offer("박찬호");
		
		while(!que.isEmpty()) {
		String result = que.poll();
		System.out.println(result); // 가장 먼저 들어간 값부터 빼내서 출력
		}
		System.out.println("끝");
	}

}
