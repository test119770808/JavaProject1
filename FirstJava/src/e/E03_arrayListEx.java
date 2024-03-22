package e;
import java.util.ArrayList;
import java.util.List;

public class E03_arrayListEx {

	public static void main(String[] args) {
		// List 
		// - 크기가 자동으로 조정
		// - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근할 때 유리.. 
		List list = new ArrayList();  //Object 타입이기 때문에 아무거나 받을 수 있음.
		
		// add() : 리스트에 요소를 추가 
		list.add("홍길동");    
		list.add("010-1234-1234");
		list.add('O');
		list.add(20);
		
		// add(idx, value) : 리스트에 특정 위치에 추가
		list.add(2, "hong@naver.com");
		
		list.add("홍길동");
		list.add("홍길동");
		
		for (int i = 0; i < list.size(); i++ ) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		// set(idx, value) : 원하는 위치에 요소를 추가(덮어쓰기)
		list.set(2, "def123@naver.com");
		
		for (int i = 0; i < list.size(); i++ ) {
			System.out.print(list.get(i)+"\t");
		}
		System.out.println();
		// get(idx) : 원하는 인덱스 데이터를 가져올 때 사용
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.get(4));
		
		// size() : 리스트의 길이 반환
		// indexOf() : 데이터의 인덱스 반환
		int idx = list.indexOf('O');
		System.out.println(idx);
		System.out.println("================================");
		// remove(index) : 그 위치의 데이터를 삭제하면서 값을 반환
		// remove(Object) : 해당 데이터를 삭제하고 그 결과를 반환(true/false).
		System.out.println(list.remove(list.indexOf("홍길동")));	
		System.out.println(list.remove(0));
		System.out.println(list.remove("홍길동"));
		
		// contains : 값을 포함하고 있는지 여부를 반환
		System.out.println(list.contains("홍길동"));
		
		// toString
		System.out.println(list.toString());
		// toArray
		Object[] arr = list.toArray();
				
		// clear
		list.clear();

	}

}
