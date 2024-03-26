import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class G16_optionalEx {
	
	/*
	 *  집계 메서드
	 *   스트림 API에서 요소들의 최소값, 최대값, 합계, 평균값 갯수 등을 구할수 있는 메서드를 제공
	 *   하고 있음. 합계와 갯수를 구해주는 메서드 이외 Optional로 시작하는 타입으로 리턴. 
	 * 
	 */
	

	public static void main(String[] args) {
		
		int[] arr = new int[100];
		for (int i=0;i<100;i++) {
			arr[i] = i+1;
		}
		
		// 갯수는 리턴값이 long
		long count = Arrays.stream(arr).count();
		System.out.println("요소들의 갯수 : "+count);
		
		// 요소(int)들의 합
		int sum = Arrays.stream(arr).sum();
		System.out.println("요소들의 합 : "+sum);
		
		OptionalInt first = Arrays.stream(arr).findFirst();
		System.out.println("요소들 중 첫번째 값 : "+first.getAsInt());
		
		OptionalInt max = Arrays.stream(arr).max();
		System.out.println("요소들 중 최대 값 : "+max.getAsInt());
		
		OptionalInt min = Arrays.stream(arr).min();
		System.out.println("요소들 중 최소 값 : "+min.getAsInt());
		
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println("요소들의 평균 : "+avg.getAsDouble());
		
		//요소가 없는 빈 ArrayList 객체 생성
		List<Integer> list2 = new ArrayList<>();
		
		long count2 = list2.stream().count();
		System.out.println("요소들의 갯수 : "+ count2);
		
		int sum2 = list2.stream().mapToInt(Integer::intValue).sum();
		System.out.println("요소들의 합 : "+sum2);
		
		//OptionalXXX , isPresent() - 값이 있으면 true, isEmpty() - 값이 없으면 true
		OptionalDouble avg2 = list2.stream().mapToInt(Integer::intValue).average();
		
		//요소값이 있는 경우에만 출력
		if(avg2.isPresent()) {
			System.out.println("요소들의 평균 : "+avg2.getAsDouble());
		}
		
		// orElse() : 기본값 설정
		int max2 = list2.stream().mapToInt(Integer::intValue).max().orElse(0);
		System.out.println("요소들 중 최대 값 : "+max2);
		
		int min2 = list2.stream().mapToInt(Integer::intValue).min().orElse(-1);
		System.out.println("요소들 중 최소 값 : "+min2);
		
		//요소가 존재하면 실행 ifPresent()
		list2.stream().mapToInt(Integer::intValue).findFirst()
					.ifPresent(a -> System.out.println("요소의 첫번째 값 : "+a));

	}

}
