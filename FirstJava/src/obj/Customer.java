package obj;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = -2726238373623804L;
	
	private String name;
	private char gender;
	private String email;
	private int birthYear;
	private transient boolean isJoin;
	
	//기본 생성자
	public Customer() {}

	//필드 생성자
	public Customer(String name, char gender, String email, int birthYear) {
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.birthYear = birthYear;
	}

	//getter, setter
	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public int getBirthYear() {
		return birthYear;
	}

	public boolean isJoin() {
		return isJoin;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public void setJoin(boolean isJoin) {
		this.isJoin = isJoin;
	}

	@Override
	public String toString() {
		return "Customer [name="+name+", gender="+gender+", email="+email+
				", birthYear="+birthYear+"]";
	}
	
	
	
	
	
	
	
	
	
}
