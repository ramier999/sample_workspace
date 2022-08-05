package com.yedam.member;

public class MemberDTO {
	
	private String memberId; // member_id
	private String memberPw; // member_pw
	private String memberName; // member_name
	private String memberBelong; // member_belong

	public String getMemberId() {
		return memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberBelong() {
		return memberBelong;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void setMemberBelong(String memberBelong) {
		this.memberBelong = memberBelong;
	}
	
}
