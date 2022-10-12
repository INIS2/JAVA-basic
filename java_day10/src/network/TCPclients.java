package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPclients {

	public static void main(String[] args) throws Exception {

		for (int i = 0; i < 100; i++) {
			//클라이언트가 서버가 접족을 승인 받으면 양쪽에 소켓이 만들어짐
			Socket socket = new Socket("localhost", 9100);
			System.out.println("클라이언트가 접속함 >> " + i);
			
			//input스트림을 통해서 임시기억장치에 넣어두자
			//스트림은 (1byte) -- 스트림리더(브릿지클래스) -->임시기억장치(2byte)
			BufferedReader buffer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			
			String data = buffer.readLine();
			System.out.println("서버에서 받아온 데이터는" + data);
			
			
		}
		
	}

}
