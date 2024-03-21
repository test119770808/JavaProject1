package d;
import java.lang.reflect.Array;
import java.util.Arrays;

public class D11_Arrays {

	public static void main(String[] args) {
		// 배열의 복사... 
		double[] argOrg = {1.1, 2.2, 3.3, 4.4, 5.5};
		System.out.println("원본 배열");
		for (double d : argOrg) {
			System.out.print(d + "\t");
		}
		System.out.println();
		
		// 배열의 전체 복사
		double [] argCpy1 = Arrays.copyOf(argOrg, argOrg.length);
		System.out.println("전체 배열 복사");
		for (double d: argCpy1) {
			System.out.print(d + "\t");
		}
		System.out.println();

		// 배열의 처음부터 세번째 요소까지 복사
		double[] arrCpy2 = Arrays.copyOf(argOrg, 3);
		System.out.println("처음부터 세번째 요소까지 배열 복사");
		for (double d: arrCpy2) {
			System.out.print(d + "\t");
		}
		System.out.println();
		
		// 1번 인덱스에서 3인덱스까지 복사... (특정 범위 내 부분복사)
		double[] arrCpy3 = Arrays.copyOfRange(argOrg, 1, 4);
		System.out.println("1번 인덱스에서 3번인덱스(포함)까지 배열 복사");
		for (double d: arrCpy3) {
			System.out.print(d + "\t");
		}
		System.out.println();
		
		// toString()
		int[] scores = {75, 47, 23, 56, 89};
		System.out.println("원본");
		System.out.println(Arrays.toString(scores));
		
		// 배열의 데이터를 오름차순으로 정렬!!! - sort()
		int[] scores2 = Arrays.copyOf(scores, scores.length);
		Arrays.sort(scores2);
		System.out.println("오름차순으로 정렬");
		System.out.println(Arrays.toString(scores2));
		
		// 배열 내부 데이터의 인덱스를 탐색하는 메서드 : binarySearch()
		int index = Arrays.binarySearch(scores2, 75);
		System.out.println("75가 있는 인덱스 번호 : "+index);
		
		// 배열의 equals()
		int[] scores3 = Arrays.copyOf(scores, scores.length);
		
		scores3[2] = 140;
		if (Arrays.equals(scores, scores3)) {
			System.out.println("배열의 각 항목이 모두 일치함");
		}else {
			System.out.println("배열의 각 항목이 일치하지 않음");
		}
		
	}

}
