package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Quiz_240320_PM {

	public static void main(String[] args) {
//		 [[[1. 집합 문제.... ]]] 
//          다음의 리스트를 생성한 요구한 내용을 작성하세요
//		 ArrayList1 : [1,2,3,4,5,6]
//		 ArrayList2 : [4,5,6,7,8,9]
//	
//		 두 리스트의 합집합, 교집합, 차집합을 구해서 출력해 보세요. 
//		 합집합 : [1,2,3,4,5,6,7,8,9]
//		 교집합 : [4,5,6]
//		 차집합 : [1,2,3],[7,8,9]
		int[] arr1 = {1,2,3,4,5,6};
		int[] arr2 = {4,5,6,7,8,9};
		
//		List list1 = Arrays.asList(arr1);
//		List list2 = Arrays.asList(arr2);
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
			list2.add(arr2[i]);
		}
		
		System.out.println("ArrayList1 : "+list1);
		System.out.println("ArrayList2 : "+list2);
		
		ArrayList union = new ArrayList(list1);
		for (Object o : list2) {
			if(!union.contains(o))
				union.add(o);
		}
		System.out.println("합집합 : "+union);
		
//		ArrayList union = new ArrayList();
//		union.addAll(list1);
//		union.addAll(list2);
//		HashSet result = new HashSet(union);
		
		ArrayList intersection = new ArrayList();
		for(Object o : list2)
			if(list1.contains(o))
				intersection.add(o);
		System.out.println("교집합 : "+intersection);
		
		ArrayList diff1 = new ArrayList(list1);
		for(Object o : list2)
			if(diff1.contains(o))
				diff1.remove(o);
		System.out.println("차집합 1 : "+ diff1);
		
		ArrayList diff2 = new ArrayList(list2);
		for(Object o : list1)
			if(diff2.contains(o))
				diff2.remove(o);
		System.out.println("차집합 2 : "+ diff2);
		
		ArrayList diff = new ArrayList();
		diff.add(diff1);
		diff.add(diff2);
		System.out.println("차집합 모음 : "+diff);
		
		// removeAll : 다른 컬렉션의 값과 일치하는 모든 요소를 제거함
//		ArrayList cha1 = new ArrayList(list1);
//		cha1.removeAll(list2);
//		System.out.println("차집합1(쉽게) : "+cha1);
//		
//		ArrayList cha2 = new ArrayList(list2);
//		cha2.removeAll(list1);
//		System.out.println("차집합2(쉽게) : "+cha2);
		
//		[[[2. 로또 번호 생성하기]]]
//		  TreeSet을 이용하여 로또번호 6개를 생성하는 프로그램을 작성하세요!!!
//		 1. TreeSet을 생성하세요
//		 2. 무한루프를 사용하여 1 ~ 45까지의 난수를 발생시키세요. 
//		 3. 발생한 난수를 추가합니다. 
//		 4. 크기가 6이되면 무한 루프를 빠져 나옵니다.
		
		//1. 
		TreeSet<Integer> lotto = new TreeSet<>();
		//2. 
		Random r = new Random();
		while(true) {
			int rn = r.nextInt(45)+1;
			
			//3. 
			lotto.add(rn);
			
			//4. 
			if (lotto.size() == 6) break;
		}
		System.out.println("로또 번호 : "+lotto);

	}

}
