package mariadb;

public class PersonsVO {
	
	private int id;
	private String lastName;
	private String firstName;
	private int age;
	private String city;
	
	public PersonsVO() {}

	public PersonsVO(int id, String lastName, String firstName, int age, String city) {
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getAge() {
		return age;
	}

	public String getCity() {
		return city;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "[id="+id+", lastName="+lastName+", firstName="+firstName+", age="
				+age+", city="+city+"]";
	}
	
	

}
