package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	
	public static void main(String[] args) {
		
//		BufferedReader bfr = null;
		
		BufferedReader bf = null;
		
		try {
//			bfr = new BufferedReader(new FileReader("경로"));
			
			//'System.in'을 통해서 '키보트'로 부터 값을 입력 받을 수도 있다.		
//			InputStreamReader is = new InputStreamReader(System.in);//> system.in -> Input.Stream 타입
//			BufferedReader bf = new BufferedReader(is);//버퍼리더는 'Reader in'을 매개변수로 받는다
			
			
			//경로로부터 파일 데이터를 읽어옴
			bf = new BufferedReader(new FileReader("D:\\course\\java\\file\\test3.txt"));
			
//			String str = bf.readLine();//한줄을 통째로 읽어서 받아준다.(하나씩이 아니다)
			
			/*
			System.out.println(bf.readLine());
			System.out.println(bf.readLine());
			System.out.println(bf.readLine());
			 */
			String str = "";
			while((str = bf.readLine()) != null) {
				
				//아래 두줄을 조건문에다가 한번에 작성
//				str = bf.readLine();
//				if(str == null) break; //모두 출력했을 시 탈출
				System.out.println(str);
			}
					
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}finally {
			try {
				bf.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//>BufferedReader는 Reader클래스의 자식을 매개변수로 받는다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}














































