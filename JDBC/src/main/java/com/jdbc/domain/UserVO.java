package com.jdbc.domain;

public class UserVO {

	// VO 클래스는 DB컬럼을 자바변수로 동일하게 선언
	// 은닉된 클래스 생성
	private String id;
	private String pw;
	private String name;
	private String phone1;
	private String phone2;
	private String gender;
	
	//기본생성자, 필드생성자, getter/setter, toString
	public UserVO() {
		// TODO Auto-generated constructor stub
	}

	public UserVO(String id, String pw, String name, String phone1, String phone2, String gender) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone1 = phone1;
		this.phone2 = phone2;
		this.gender = gender;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public String getPhone1() {
		return phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public String getGender() {
		return gender;
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

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "UserVO [id=" + id + ", pw=" + pw + ", name=" + name + ", phone1=" + phone1 + ", phone2=" + phone2
				+ ", gender=" + gender + "]";
	}
		
	
}
