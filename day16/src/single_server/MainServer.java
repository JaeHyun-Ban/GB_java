package single_server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
	
	public static void main(String[] args) {
		
		//서버는 한개지만 클라이언트는 여러개 일 수 있다
		//서버의 역활은 단순히 `받고`, `보내주고`이다
		
		try {
			ServerSocket serverSocket = new ServerSocket(8383);
			
			System.out.println("-------연결 대기-------");
			Socket socket = serverSocket.accept();
			
			System.out.println("Hello World!\nWellcome to the Single_Server");
			
			
			//연결된 socket을 메세지를 수신받는 Receive로 전달
			//메세지 수신 클래스 객체 생성
			Receive receive = new Receive(socket);
			receive.start();//받기 기능On
			
			//전송 객체 생성
			Sender sender = new Sender(socket);
			sender.start();//전송 기능On
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
}






































