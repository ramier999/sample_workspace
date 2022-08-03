package co.edu.io.memo;

import java.io.Serializable;

/*
 * 메모번호, 날짜시간, 메모내용
 */
public class Memo implements Serializable { // 직렬화
	
	// 필드
	private int no;
	private String date;
	private String content;
	
	// 생성자
	public Memo(int no, String date, String content) {
		this.no = no;
		this.date = date;
		this.content = content;
	}
	
	public Memo() {}

	// getter
	public int getNo() {
		return no;
	}

	public String getDate() {
		return date;
	}

	public String getContent() {
		return content;
	}

	// setter
	public void setNo(int no) {
		this.no = no;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "번호: "+getNo()+" | 날짜: "+getDate()+" | 내용: "+getContent();
	}

}