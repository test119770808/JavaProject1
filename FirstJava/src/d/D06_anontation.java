package d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class UserClass {
	@UserAnnot (value = "A")
	public void methodA() {
		System.out.println("methodA() 실행");
	}
	
	@UserAnnot (value= "B", number = 10)
	public void methodB() {
		System.out.println("methodB() 실행");
	}
}


public class D06_anontation {

	public static void main(String[] args) throws Exception  {
		Method method[] = UserClass.class.getDeclaredMethods();
		System.out.println("method[]에 있는 내용의 갯수 : "+method.length);
		for (int i = 0; i < method.length; i++) {
			String methodName = method[i].getName();
			UserAnnot annot = method[i].getAnnotation(UserAnnot.class);
			
			System.out.println(methodName + "의 어노테이션 ");
			System.out.println("value : " + annot.value() + " ");
			System.out.println("number : "+ annot.number() + " " );
			System.out.println();
			method[i].invoke(new UserClass(), null);  //메서드 실행
		}

	}

}
