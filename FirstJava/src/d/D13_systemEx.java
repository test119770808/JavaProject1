package d;

public class D13_systemEx {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("시작 시간 : "+start);
		System.out.println(System.getProperties());
		
		//시간 지연... 
		int a = 0;
		for(int i = 0; i<1000000;i++) a+=i;
		System.gc();
		
		long end = System.currentTimeMillis();
		System.out.println("종료 시간 : "+end);
		
		

	}

}
