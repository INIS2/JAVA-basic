package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPserver {
	                                     //throws : 해당 메서드를 호출한 곳으로 예외처리르 떠넘김
	public static void main(String[] args) throws Exception {
		
		//승인용 서버 소켓 필요
		ServerSocket server = new ServerSocket(9100);
		System.out.println("서버 소켓 시작됨");
		System.out.println("클라이언트의 요청을 기다리는 중.....");
		int count = 0;
		
		while(true) {
			//요청을 이 오면 승인을 함 >> 양쪽 소켓 연결
			Socket socket = server.accept();
			count++;
			System.out.println("클라이언트 연결됨!" + count + "명");
			
			//output 스트림을 이용해서 데이터를 클라이언트에게 전송
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.print("i am java programmer");
			out.close();
			socket.close();
		}
	}

}
