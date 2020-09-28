package api.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class OutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * 1. FileOutputStream은 '파일을 쓸 때' 사용하는 클래스 입니다.
		 * 2. 생성자 매개값으로 파일을 쓸 전체 경로를 지정한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("파일명> ");
		String name = sc.next();
		
		FileOutputStream fos = null; //선언은 밖에서 한다 >> finally적용하려고
		
		try {
			
			fos = new FileOutputStream("D:\\course\\java\\file\\" + name + ".txt");
			//> 명령어에서 '\'는 뒤로 혹은 명령어에 사용되기 때문에 경로를 나타낼 때 '\\'를 사용한다
			
			System.out.print("문장을 입력하세요> ");
			sc.nextLine(); //sc.next()에서 발생한 엔터이벤트 제거
			String str = sc.nextLine();
			
			byte[] arr = str.getBytes(); //String을 byte[]로 리턴
			
			fos.write(arr);
			
			
			
		} catch (FileNotFoundException e) { //파일을 찾지 못할 때의 예외처리
			System.out.println("그런파일 없다");
			e.printStackTrace();
		}catch (IOException e) { //Input, Output의 예외처리
			
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				//https://nowonbun.tistory.com/310
				//>IO는 프로그램의 메모리에 상주하는 데이터가 아니라 하드디스크에서 사용하는 다른 리소스이기 때문에
				//>>메모리 자원이 아닌 하드디스크 자원
				//>하드디스크의 자원은 하나의 프로그램이 독점하는 것이 아닌 여러 프로그램이 공용으로 사용한다.
				//>즉, 자원을 사용한다고 연결(Connection)을 하면 반드시 리소스 반환(close)이 이루어 져야 한다
				//>만약 연결(connection)상태가 쭉 이루어 진다면 OutputStream이 파일을 쭉 연결해 시스템을 멈추게하고
				//>연결을 계속 사용중이므로 다른 작업을 할 수 없다
				//>반드시 close를 해야한다.
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
	}
}














































