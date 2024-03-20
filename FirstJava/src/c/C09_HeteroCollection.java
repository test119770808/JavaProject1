package c;
import obj.inheritance.Person;
import obj.inheritance.goodcase.Employee;
import obj.inheritance.goodcase.Student;
import obj.inheritance.goodcase.Teacher;

public class C09_HeteroCollection {

	public static void main(String[] args) {
		Person[] pArr = new Person[4];
		
		pArr[0] = new Person("홍씨", 20);
		pArr[1] = new Student("홍학생", 17,"20240315", "도술");
		pArr[2] = new Teacher("홍선생", 22,"Java Programming!");
		pArr[3] = new Employee("홍사원", 25, "교무처");
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getDetails());
		}
		
		for (Person p : pArr) {
			System.out.println(p.getDetails());
		}
		
	}

}
