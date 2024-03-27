package g;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class G18_parallelStream {
	
	/*
	 *  parallelStream()을 사용하면 병렬 스트림을 쉽게 사용할 수 있음.
	 *   전체요소를 서브요소로 나누고, 각 서브요소들에게 개별 쓰레드로 처리
	 *   결과를 결합하여 최종 처리 결과를 리턴
	 * 
	 *  Stream<Object> stream = list.stream()         -> 일반 스트림
	 *  Stream<Object> stream = list.parallelstream() -> 병렬 스트림
	 *  
	 *  isParallel() 메서드로 병렬 여부를 확인 가능!
	 * 
	 */

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i=0;i<100;i++) {
			list.add(i);
		}
		
		long start = System.nanoTime();
		//stream() 스트림 처리
		list.stream().forEach(a -> {
			try {
				Thread.sleep(1);   // 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		long end = System.nanoTime();
		System.out.println("순차 스트림 처리 시간 : "+(end-start)+"nano sec");
		
		start = System.nanoTime();
		//parallelStream() 스트림 처리
		list.parallelStream().forEach(a -> {
			try {
				Thread.sleep(1);   // 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		end = System.nanoTime();
		System.out.println("병렬 스트림 처리 시간 : "+(end-start)+"nano sec");
		
		// 스트림 연결하기 : Stream.concat() 
		//  두개의 스트림 객체를 연결해서 하나의 새로운 스트림 객체를 생성
		
		// 문자열 스트림 객체
		Stream<String> stream1 = Stream.of("홍길동","김유신","유관순","강감찬");
		
		// 정수 스트림 객체
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		// cancat() 메서드를 사용 위 두개의 스트림 묶기
		Stream<Object> concat = Stream.concat(stream1, stream2);
		concat.forEach(a -> System.out.print(a + " "));
		
		
		
		

	}

}
