package e;
import java.util.TreeSet;

public class E02_treeSetEx {

	public static void main(String[] args) {
		// TreeSet
		TreeSet<Integer> ts1 = new TreeSet<>();
		
		ts1.add(5);
		ts1.add(1);
		ts1.add(8);
		ts1.add(3);
		ts1.add(7);
		ts1.add(9);
		ts1.add(2);
		ts1.add(4);
		ts1.add(6);
		for (Integer i : ts1) {
			System.out.print(i + "\t");
		}
		System.out.println();
		TreeSet<String> ts2 = new TreeSet<String>();
		ts2.add("hello");
		ts2.add("java");
		ts2.add("aaa");
		ts2.add("computer");
		for (String str : ts2) {
			System.out.print(str +"\t");
		}
		

	}

}
