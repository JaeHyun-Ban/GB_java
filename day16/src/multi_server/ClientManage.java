package multi_server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Set;

import basic_client.MainClient;

public class ClientManage extends Thread{
	
	public static HashMap<String, Socket> set = new HashMap<>(); //아이디 - 소켓을 저장
	
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
				if(split.length == 2 && split[0].equals("ID")) {
					this.userId = split[1]; //>0번째는 "ID"니까 조심할 것
					System.out.println(this.userId + "님이 입장했습니다");//이 메세지는 모든 클라이언트에게 다 날려준다.
					
					set.put(this.userId, socket); //방에 들어온 사람의 아이디와 소켓 번호를 저장
					
					System.out.println(socket.getPort());
					
					//연결된 모든 소켓에 메세지를 전달
					for(int i = 0; i < MainServer.list.size(); i++) {
						PrintWriter out = MainServer.list.get(i);//PrintWriter를 리턴
						out.println(this.userId + "님이 입장했습니다");
						out.flush();//송신(밀어냄)
						
					}
					continue; //처음으로 돌아감
				}
				
				
				// /w id message 처럼 보낼꺼임
				//귓속말 기능
				String[] split2 = message.split(" ", 3);// /w, id, message 삼등분
				if(split2.length == 3 && split2[0].equals("/w")) { // `/w` - 귓속말 이라면
					//보낸 사람의 포트 번호를 구하라.
					String name = split2[1]; //받은사람 아이디
					
					//저장한 포트에 직접 out시키기
					PrintWriter out = new PrintWriter(set.get(name).getOutputStream());//
					out.println(this.userId + "님의 귓속말>" + split2[2]);
					out.flush();//송신(밀어냄)
					continue;
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
			try {//프로그램 종료시 제거
				MainServer.list.remove(new PrintWriter(socket.getOutputStream()));//한명 나가면 삭제
				set.remove(userId);// hash로 따로 저장한 socket을 지워줍니다.
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	
}


















































