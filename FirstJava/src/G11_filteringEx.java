import java.util.Arrays;
import java.util.List;

public class G11_filteringEx {

	/*
	 *  Stream 3단계 처리 순서 : 1)객체 생성, 2)가공, 3)결과 출력
	 *  가공 중간 처리 단계 : 필터링(Filtering), 매핑(Mapping), 정렬(sorting), 그룹핑(grouping)
	 *  
	 *  필터링 : Stream 내에 요소를 걸러내는 기능
	 *  메서드 : distinct()-중복 제거, 
	 *         filter()-조건에 맞는 요소 선택(boolean 결과(true)에 따른 검출)
	 *  
	 */
	
	public static void main(String[] args) {
		
		//List 객체 생성
		List<String> list = Arrays.asList("홍길동","김유신","홍길동",
				"이순신","홍길동","유관순");
		
		// distinct() 메서드로 중복 제거 후 내부 반복자로 출력... 
		System.out.println("distinct()");
		list.stream().distinct().forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		// "홍"으로 시작하는 문자열로 필터링 후 내부 반복자로 출력
		System.out.println("filter()");
		list.stream().filter(n -> n.startsWith("홍"))
				.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		// distinct()와 filter()를 동시에 사용... 
		System.out.println("distinct() + filter()");
		list.stream().distinct().filter(n -> n.startsWith("홍"))
				.forEach(s -> System.out.print(s+" "));
		
	}

}
