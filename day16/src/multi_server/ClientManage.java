package multi_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientManage extends Thread{
	
	private Socket socket;
	private String userId;//클라이언트로 부터 받은 아이디 저장
	
	public ClientManage(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			//클라이언트로 부터 넘어온 입력 스트림을 받는다
			InputStream is = socket.getInputStream();
			//입력받은 소캣 - UTF-8로 통일
			BufferedReader bf = new BufferedReader(new InputStreamReader(is, "UTF-8"));
			
			while(true) {
				String message = bf.readLine();
				
				//1. message가 null인 경우 연결이 끊어졌다는 의미
				if(message == null) {
					System.out.println(this.userId + "님이 퇴장했습니다");
					
					//연결된 모든 소켓에게 메세지를 전달
					for(int i = 0; i < MainServer.list.size(); i++) {
						PrintWriter out = MainServer.list.get(i);
						out.println(this.userId + "님이 퇴장했습니다");
						out.flush();//송신
					}
					break; //현재 클라이언트와 연결된 스레드가 종료됨
				}
				
				//2. 넘어온 메세지가 id인지 확인하는 부분
				//>클라이언트에서 `ID:id` 로 넘어옴
				String[] split = message.split(":", 2);//`:`기준 2개로 자름
				if(split.length == 2 && split[0].contentEquals("ID")) {
					this.userId = split[1]; //>0번째는 "ID"니까 조심할 것
					System.out.println(this.userId + "님이 입장했습니다");//이 메세지는 모든 클라이언트에게 다 날려준다.
					
					//연결된 모든 소켓에 메세지를 전달
					for(int i = 0; i < MainServer.list.size(); i++) {
						PrintWriter out = MainServer.list.get(i);//PrintWriter를 리턴
						out.println(this.userId + "님이 입장했습니다");
						out.flush();//송신(밀어냄)
						
					}
					continue; //처음으로 돌아감
				}
				
				//일반 메세지를 모든 소켓에 전달.
				for(int i = 0; i < MainServer.list.size(); i++) {
					PrintWriter out = MainServer.list.get(i);
					out.println(this.userId + ">" + message);//모두 합격이니 아이디와 메세지를 스레드에 전송
					out.flush();
					
				}
				
			}//while
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {//뭐가됫든 무조껀 실행
			//종료시점에 실행되는 finally문
			try {
				MainServer.list.remove(new PrintWriter(socket.getOutputStream()));//한명 나가면 삭제
				
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}


















































