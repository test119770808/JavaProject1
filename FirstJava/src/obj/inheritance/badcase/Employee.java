package obj.inheritance.badcase;

public class Employee {
	
	// 이름, 나이, 교번, 담당 과목
		String name;
		int age;
		String companyId;
		String department;
		
		public String getDetails() {
			return "[이름: " + name + "\t나이: "+ age + "\t사번: " + companyId 
					+ "\t부서: " + department +"]";
		}

}
