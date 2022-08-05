package com.yedam.student;

import com.yedam.common.DAO;

public class StudentManage extends DAO {
	
	private static StudentManage SM = new StudentManage();
	
	private StudentManage() {
		
	}
	
	public static StudentManage getInstance() {
		return SM;
	}
	
	public int insertStudent(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "INSERT INTO student(student_id, student_name, student_class, student_addr, student_tel)"
					+ "VALUES(?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentId());
			pstmt.setString(2, std.getStudentName());
			pstmt.setString(3, std.getStudentClass());
			pstmt.setString(4, std.getStudentAddr());
			pstmt.setString(5, std.getStudentTel());
			
			result = pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	
	public int insertKor(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE student SET student_kor = ? WHERE student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentKor());
			pstmt.setInt(2, std.getStudentId());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	
	public int insertEng(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE student SET student_eng = ? WHERE student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentEng());
			pstmt.setInt(2, std.getStudentId());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	
	public int insertMath(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE student SET student_math = ? WHERE student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, std.getStudentMath());
			pstmt.setInt(2, std.getStudentId());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	
	public int updateTel(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE student SET student_tel = ? WHERE student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, std.getStudentTel());
			pstmt.setInt(2, std.getStudentId());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	
	public int insertAddr(StudentDTO std) {
		int result = 0;
		try {
			conn();
			String sql = "UPDATE student SET student_addr = ? WHERE student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, std.getStudentAddr());
			pstmt.setInt(2, std.getStudentId());
			result = pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return result;
	}
	
	public StudentDTO getStudent(int id) {
		StudentDTO std = null;
		try {
			conn();
			String sql = "Select * FROM student WHERE student_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				std = new StudentDTO();
				std.setStudentId(rs.getInt("student_id"));
				std.setStudentName(rs.getString("student_name"));
				std.setStudentTel(rs.getString("student_tel"));
				std.setStudentAddr(rs.getString("student_addr"));
				std.setStudentClass(rs.getString("student_class"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return std;
	}
}
