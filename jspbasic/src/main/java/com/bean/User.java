package com.bean;

public class User {
	
	/*
	 * 자바빈 클래스는 form과 데이터베이스 통신 과정에서 변수처리를 쉽게 하기 위해서 사용하는 클래스
	 * 관련된 변수들을 선언, getter, setter를 반드시 생성합니다. 
	 * 기본생성자도 반드시 생성합니다. 
	 */
	
	// 멤버변수
	private String id;
	private String pw;
	private String name;
	private String email;
	
	// 기본 생성자
	public User() {
		// TODO Auto-generated constructor stub
	}

	// 필드 생성자
	public User(String id, String pw, String name, String email) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
	}

	// getter, setter
	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
