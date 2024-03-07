package quiz;

public class Quiz1 {

	public static void main(String[] args) {
		// 놀이공원까지 11개 지하철 역을 지남.
		// 출발역에서 도착역까지 37분 소요. 
		// 한 역을 지나는데 걸리는 시간은? (출력은 소수점 2자리까지...)
		double stat = 11;
		int min = 37;
		double result = (int)((min/stat)*100)/100.0;
		System.out.println("한 역을 지나는데 걸린 시간은 "+result+"분이 소요되었다.");

	}

}
