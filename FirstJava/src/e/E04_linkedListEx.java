package e;
import java.util.LinkedList;

public class E04_linkedListEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		
		// add
		list.add("Hello");
		list.add("Java");
		list.add("banana");
		list.addFirst("apple");
		list.addLast("zoo");
		
		System.out.println("list data : "+ list);
		
		// remove
		list.remove();      //head 엘리먼트 삭제... 
		System.out.println("list data after remove() : "+list);
		list.remove(2);      //head 엘리먼트 삭제... 
		System.out.println("list data after remove(2) : "+list);
		
		// set
		list.set(1, "new element");
		System.out.println("list data after set() : "+list);
		
		String str1 = list.peek();   //엘리먼트 조회 
		System.out.println("str1 : "+ str1);
		System.out.println("list data after peek() : "+list);
		
		String str2 = list.poll();   //엘리먼트 조회 후 삭제
		System.out.println("str2 : "+ str2);
		System.out.println("list data after poll() : "+list);
	}

}
