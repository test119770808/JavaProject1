package e;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class E07_hashMapEx {

	public static void main(String[] args) {
		// Map
		//  - key/value 가 쌍으로 된 자료
		//  - key값을 넣으면 value를 반환하는 구조
		//  - key는 중복 허용 X. 같은 키로 다른 값을 넣으면? 갱신 처리...
		//  - key와 value는 1:1 관계

		HashMap<String, Integer> map = new HashMap<>();
		HashMap map2 = new HashMap();
		
		// put(k, v) : 맵에 키와 값을 넣습니다. 
		map.put("홍길동", 99);
		map.put("임꺽정", 93);
		map.put("ABC", 123);
		map.put("FF", 123);
		map.put("홍길동", 88);  // 이미  키에 값을 넣은 경우... 값을 덮어쓴다.
		
		// get(k) : 키를 넣으면 해당하는 값을 반환.
		System.out.println(map.get("홍길동"));
		System.out.println(map.get("임꺽정"));
		
		// getOrDefault() : 키를 넣으면 해당 값을 반환, 만약에 값이 없으면? 
		// 두번 매개변수인 default 값을 가져와요... 
		System.out.println(map.getOrDefault("ABC", 1000));
		System.out.println(map.getOrDefault("ABCD", 1000));
		
		// keySet() : Map의 모든 키들을 Set으로 반환.
		for(String key : map.keySet()) {  //Set<String> s = map.keySet()
			System.out.printf("%s : %d\n", key, map.get(key));
		}
		
		//entrySet() : Map의 entrySet을 반환... [k=v, k=v, ... ]형태
		System.out.println(map.entrySet());
		for(Entry<String, Integer> e:map.entrySet()) {
			System.out.print(e.getKey() + ":");
			System.out.println(e.getValue());
		}
		
		// values() : 모든 값을 Collection 타입으로 반환
		System.out.println(map.values());
		
		// containsKey(key) : 키가 포함되어 있는지 여부 확인
		System.out.println(map.containsKey("홍길동"));
		System.out.println(map.containsKey(new Integer(10)));
		
		// containsValue(value) : 값이 존재하는지 여부 확인
		System.out.println(map.containsValue(123));
		
		map2.put(0, "1000");
		map2.put(1, 1000);
		map2.put(2, 1000.0);
		map2.put("key", 100);
		Set set = map2.entrySet();
		System.out.println(set.size());
		for (Object o : set) {
			System.out.println(o);
		}
		
		System.out.println(map2.get(1));
		System.out.println(map2.get(2));
		System.out.println(map2.get("key"));
		
		System.out.println("=================================");
		Map<String, Integer> accounts = new TreeMap<>();
		
		accounts.put("홍길동", 10000);
		accounts.put("이순신", 90000);
		accounts.put("이성계", 40000);
		accounts.put("강감찬", 70000);
		
		System.out.println(accounts);
		
		System.out.println();
		System.out.println("이성계 : "+accounts.get("이성계"));
		
		System.out.println();
		Set<Map.Entry<String, Integer>> s = accounts.entrySet();
		for(Map.Entry<String, Integer> member : s) {
			System.out.println(member.getKey() + ":" +member.getValue());
		}
		
		System.out.println();
		Set<String> ss = accounts.keySet();
		for(String key : ss) {
			System.out.println(key + "::" + accounts.get(key));
		}
		
	}

}
