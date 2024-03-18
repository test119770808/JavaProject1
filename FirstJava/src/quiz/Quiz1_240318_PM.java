package quiz;


interface Remocon {
	public void on();
	public void off();
}

class Machine {
	
	protected String name;

	// 기본 생성자 생략
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void machineWork(Remocon remocon, Machine machine) {
		remocon.on();
		remocon.off();
	}
	
	
}

class TV1 extends Machine{
	
	public TV1(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public void setName(String name) {
		super.setName(name);
	}
	
	public void show() {
		System.out.println("방송 중입니다.");
	}
	
}


public class Quiz1_240318_PM {

	public static void main(String[] args) {
		Machine tv = new TV1("TV");
		Machine computer = new Machine();
		computer.setName("컴퓨터");
		
		// TV 구동
		Machine.machineWork(new Remocon() {
			
			@Override
			public void on() {
				System.out.println(tv.getName()+"를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println(tv.getName()+"를 끕니다.");
			}
		}, tv);
		
		// computer 구동
		Machine.machineWork(new Remocon() {
			
			@Override
			public void on() {
				System.out.println(computer.getName()+"를 켭니다.");
			}
			
			@Override
			public void off() {
				System.out.println(computer.getName()+"를 끕니다.");
			}
		}, computer);

	}

}
