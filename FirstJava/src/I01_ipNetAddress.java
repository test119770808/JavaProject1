import java.net.InetAddress;

public class I01_ipNetAddress {

	public static void main(String[] args) {
		// 주소 관련 클래스.... INetAddress
		
		try {
			// 1. getByName 메서드를 통한 InetAddress 객체 생성
			InetAddress ip = InetAddress.getByName("www.google.com");
			System.out.println("hostname : " + ip.getHostName());
			System.out.println("ip : "+ip.getHostAddress());
			
			// 2. getAllByName 메서드를 통한 InetAddress 객체 배열 생성
			InetAddress[] ips = 
					InetAddress.getAllByName("www.naver.com");
			for (InetAddress i : ips) {
				System.out.println("ip 주소 : "+i);
			}
			
			// ip 주소값을 byte[] 배열로 리턴...
			byte[] ipAddr = ip.getAddress();
			// byte 자료형의 표현 범위 : - 128 ~ 127
			// 127 이상은 음수로 표현됨... 
			for(byte b : ipAddr) {
				System.out.print(((b < 0)? b + 256: b)+".");
//				System.out.print(b+".");
			}
			System.out.println();
			
			// 3. getLocalHost 메서드를 이용한 InetAddress 객체 생성 호출
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP : "+local);
			
			// 4. getByAddress 메서드로 InetAddress 객체 생성 호출
			InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
			System.out.println(ips[0].getHostAddress() + " 주소 : "+ip2);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
