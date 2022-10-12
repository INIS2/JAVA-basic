package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPreceiver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// UDP는 받는 부분부터 실행
		// UDP용 소켓을 만들자
		DatagramSocket socket = new DatagramSocket(7100);
		// 미리 받아 넣을 byte 배열을 만들어놓아야한다.
		byte[] data = new byte[256];
		
		
		// 받을 패킷을 만들어두자
		DatagramPacket packet = new DatagramPacket(data, data.length);
		System.out.println("upt받을 준비중...");
		
		// 패킷을 받자
		socket.receive(packet);
		// 받은 데이터를 스트링으로 변환해서 프린트
		System.out.println(new String(data));
		
		
	}

}
