package d;

public class D16_stringbuilderEx {

	public static void main(String[] args) {
		// StringBuilder
		
		String str = "Hello, world! 1234567890";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("StringBuilder에 있는 문자열 : "+sb);
		
		// 1. append : 문자열 뒤에 추가... 
		sb.append(10);
		System.out.println("append(10)의 결과 : "+sb);
		sb.append(true);
		System.out.println("append(true)의 결과 : "+sb);
		
		// 2. insert(idx, 추가할 문자)
		sb.insert(7, "insert합니다.");
		System.out.println("insert 결과 : "+sb);
		
		// 3. delete(시작 인덱스, 끝 인덱스)
		sb.delete(sb.indexOf("insert"), 
				sb.indexOf("insert")+"insert합니다.".length());
		System.out.println("delete 결과 : "+sb);
		
		// 4. deleteCharAt() : 인덱스 위치에 있는 문자를 삭제
		sb.deleteCharAt(12);
		System.out.println("deleteCharAt(12) 결과 : "+sb);
		
		// 5. setCharAt() : 인덱스 위치에 문자를 추가
		sb.setCharAt(12, '!');
		System.out.println("setCharAt(12, '1')의 결과 : "+sb);

		// 6. replace() : 문자열 교체... 
		sb.replace(12, 14, "! 1");
		System.out.println("replace(12, 14, \"! 1\")의 결과 :"+sb);
		
		// 7. reverse() : 문자열의 순서를 반대로... 
		sb.reverse();
		System.out.println("reverse()의 결과 : "+sb);
		
	}

}
