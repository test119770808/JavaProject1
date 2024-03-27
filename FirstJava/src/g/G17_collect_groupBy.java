package g;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class G17_collect_groupBy {
	
	// collect() 메서드는 스트림의 요소들을 필터링하거 매핑한 후에 새로운 객체로 생성
	// groupingBy() 메서드는 Map객체를 생성할 수 있습니다. 
	
	public static void main(String[] args) {
		
		Shape s1 = new Rectangle(10, 3);
		Shape s2 = new Circle(10);
		Shape s3 = new Rectangle(20, 2);
		Shape s4 = new Circle(11);
		
		List<Shape> list = Arrays.asList(s1, s2, s3, s4);
		
		//요소가 Rectangle 객체인 경우 collect 메서드로 List로 변환
		List<Shape> rectList = list.stream()
				.filter(s -> s instanceof Rectangle).collect(Collectors.toList());
		rectList.stream().forEach(f -> System.out.println(f));
		System.out.println();
		
		// 요소가 Rectangle 객체인 경우 collect 메서드로 Set으로 변환
		Set<Shape> rectSet = list.stream()
				.filter(s -> s instanceof Rectangle).collect(Collectors.toSet());
		rectSet.stream().forEach(System.out::println);

		
		//groupingBy() Map 객체 생성
		try {
			// 객체 타입으로 그룹핑 (Rectangle, Circle)
			Map<Object, List<Shape>> map = list.stream()
					.collect(Collectors.groupingBy(f -> f.getClass()));
			System.out.println("사각형 출력");
			map.get(Class.forName("Rectangle")).stream()
				.forEach(f -> System.out.println(f));
			
			map.get(Class.forName("Circle")).stream()
				.forEach(f -> System.out.println(f));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
