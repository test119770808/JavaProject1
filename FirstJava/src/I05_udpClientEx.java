import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class I05_udpClientEx {

	public static void main(String[] args) {
		// UDP클라이언트는 메시지 전송~!!
		try {
			// 키보드 입력 
			BufferedReader sysin = 
					new BufferedReader(new InputStreamReader(System.in));
			// 서버 IP 
			InetAddress serverIP = InetAddress.getByName("230.0.0.1");
			while(true) {
				// 한줄 읽기
				String data = sysin.readLine();
				DatagramSocket dataSocket = new DatagramSocket();
				// 문자열을 바이트 배열에 저장
				byte[] msg1 = data.getBytes();
				
				// 서버로 전송 (데이터, 데이터길이, 서버IP, 포트번호)
				DatagramPacket outPacket = 
						new DatagramPacket(msg1, msg1.length, serverIP, 9000);
				dataSocket.send(outPacket);
				// 소켓 닫기
				dataSocket.close();
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
