package d;

public class D07_runtimeExceptionEx {

	public static void main(String[] args) throws Exception{
		// Runtime Exception => UncheckedException... 
//		makeException1(4);
//		makeException2();
		try {
			makeException3();
			makeException4();
			makeException5();
//			makeException6();
			makeException7();
		}catch (Exception e) {
			System.out.println("예외발생");
		}
		
		makeException8();
	}
	
	public static int makeException1(int input) {
		int divide = 0;
		int result = input/divide;
		return result;
	}
	
	public static void makeException2() {
		String s = "가";
		System.out.println(s.charAt(1));
	}
	
	public static void makeException3() throws Exception {
		int[] a = {1, 2, 3};
		System.out.println(a[3]);
	}
	
	public static void makeException4() {
		String nothing = null;
		System.out.println(nothing.split(""));
	}
	
	public static void makeException5() {
		String notInt = "가나다";
		int a = Integer.parseInt(notInt);
	}
	
	public static void makeException6() {
		for (int i = 0; i < Integer.MAX_VALUE; i++) {
			makeException6();
		}
	}
	
	public static void makeException7() {
		Object[] objArr = new String[3];
		objArr[0] = 0;  //선언자체가 Object로 되어 있음으로 컴파일 오류 발생X
	}
	
	public static void makeException8() {
		Object[] objArr = new String[3];
		objArr[0] = "0";
		Integer a = (Integer) objArr[0];
	}

}
