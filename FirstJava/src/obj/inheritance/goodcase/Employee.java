package obj.inheritance.goodcase;

import obj.inheritance.Person;

public class Employee extends Person {

	public String companyId;
	public String department;
	
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return "[이름: "+name+"\t나이: "+age+"\t사번: "+companyId+"\t부서: "
				+department+"]";
	}
	
}
