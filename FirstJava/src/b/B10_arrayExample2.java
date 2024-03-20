package b;

public class B10_arrayExample2 {

	public static void main(String[] args) {
		// 다차원 배열
		// 1차원 배열 : 데이터 타입이 int로 구성되어 있는 배열... 
		int[] numbers = { 1, 2, 3, 4, 5};
		
		// 배열의 요소는 length - 1 번 공간(방, 저장공간)까지 존재함.
		System.out.println(numbers[numbers.length - 1]);
		
		// 2차원 배열 : 데이터 타입이 int[]로 구성되어 있는 배열... 
		int[][] arr2 = {
				{1,2,3},  //  0
				{4,5,6},  //  1
				{7,8,9},  //  2
				numbers   // 1차원 배열
		};
		
		System.out.println("1 : "+ arr2[1][2]);
		System.out.println("2 : "+ arr2[2][1]);
		System.out.println("3 : "+ arr2[2][2]);
		System.out.println("4 : "+ arr2[3][arr2[3].length - 1]);
		System.out.println("int[]의 갯수 : " + arr2.length);

		// 3차원 배열 : int[][]을 요소로 가지고 있는 배열... 
		// int[][][] arr3 = { arr2, arr2, arr2, arr2}
		int[][][] arr3 = new int[4][][];
		arr3[0] = arr2;
		arr3[1] = arr2;
		arr3[2] = arr2;
		arr3[3] = arr2;
		
		System.out.println("5: "+arr3[0][3][2]);
		
		//4 차원 배열은 int[][][]요소로 가지고 있는 배열 
		int[][][][] arr4 = { arr3, arr3, arr3, arr3};
		
		// n 차원 배열 : 배열의 요소로 (n - 1)차원 배열을 가지고 있는 배열
		// n 차원 배열에 대한 모든 요소는 n중복 반복문을 이용하여 탐색할 수 있음. 
		
		// arr2의 요소들의 값을 알아오는 반복문 작성... 
		for (int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		
		// arr3의 요소 값을 알아와서 출력하는 반복문 작성... 
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++ ) {
				System.out.print("[");
				for(int k = 0; k < arr3[i][j].length; k++) {
					System.out.print(arr3[i][j][k]);
					if (k != arr3[i][j].length -1) System.out.print(" "); 
				}
				System.out.print("]");
			}
			System.out.println();
		}
		
	}

}
