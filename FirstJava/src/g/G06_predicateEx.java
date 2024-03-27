package g;
import java.util.function.Predicate;

public class G06_predicateEx {
	
	/*
	 *  Predicate 함수적 인터페이스는 매개변수가 있고, 반환값을 boolean으로 처리.
	 *  추상 메서드를 test라는 이름으로 가지고 있습니다. 
	 *  
	 *    인터페이스 				추상 메서드
	 *    Predicate<T>			boolean test(T t)
	 *    BiPredicate<T, U>		boolean test(T t, U u)
	 *    xxxPredicate			boolean test(xxx)
	 * 
	 */

	static Student[] list = {
			new Student("홍길동", 90, 80, "컴공"),
			new Student("이순신", 95, 70, "통계"),
			new Student("김유신", 100, 60, "컴공")
	};
	
	public static void main(String[] args) {
		// 과가 컴공인 학생의 영어 점수 평균
		double avg = avgEng(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 영어 점수 : "+avg);
		
		// 과가 컴공인 학생의 수학 점수 평균
		avg = avgMath(t -> t.getMajor().equals("컴공"));
		System.out.println("컴공과 평균 영어 점수 : "+avg);
	}
	
	private static double avgEng(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			//equal 비교
			if (predicate.test(student)) {
				count ++;
				sum += student.getEng();
			}
		}
		return (double)sum/count;
	}
	
	private static double avgMath(Predicate<Student> predicate) {
		int count = 0;
		int sum = 0;
		for (Student student : list) {
			//equal 비교
			if (predicate.test(student)) {
				count ++;
				sum += student.getMath();
			}
		}
		return (double)sum/count;
	}

}
