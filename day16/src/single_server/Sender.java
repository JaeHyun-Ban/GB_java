package single_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Sender extends Thread {

	/*
	 * 서버측 sender(메세지 전송)
	 * 생성자로 연결된 소캣을 전달받는다
	 * 
	 * 서버 sender - 클라이언트 receive 는 꼭 함께 생성해 준다.
	 */
	
	
	private Socket socket;
	
	public Sender(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			//서버측의 입력을 보낼꺼임
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			//서버측의 상대방에게 보내줄것 > 출력(out)
			PrintWriter out = new PrintWriter(socket.getOutputStream());
		
			while(true) {
				
				String message = bf.readLine();//작성한 메세지 한줄 읽고
				if(message.equals("/exit")) {
					System.out.println("종료합니다");
					break;
				}
				
				out.println(message);//화면에 출력 
				out.flush();//>밀어내서 다음 메세지 받을 준비
			}//while
			
			bf.close();
			out.close();
			
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}














































