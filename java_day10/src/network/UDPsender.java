package network;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPsender {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// UDP socket필요
		DatagramSocket socket = new DatagramSocket();
		
		//packet은 ip,port,data를 실어줘야함
		// ip는 해당부품으로 만들어 주어야 함
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		// packet의 데이터는 byte배열로만들어 보내야 한다
		String str = "iam ai programmer";
		byte[] data = str.getBytes();
		
		//UDP packet필요
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 7100);
		
		socket.send(packet);
		socket.close();
		
		
		
		
		
		
	}

}
