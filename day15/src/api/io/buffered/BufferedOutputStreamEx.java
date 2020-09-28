package api.io.buffered;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferedOutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * buffered가 붙은 클래스는 입출력 성능을 향상시키기 위한 클래스이다.
		 * buffered에 outputStream이 있으면, 바이트 기반, 쓰기위한 클래스 입니다.
		 * 
		 * 생성자 매개변수로 바이트기반 클래스를 받을 수 있다.
		 * 
		 * buffered가 붙어 있는 클래스는 flush명령을 통해서 데이터를 밀어주는작업을 해야한다.
		 * - 혹은 종료작업으로 한번에 밀어내 준다.
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		FileOutputStream fos;
		BufferedOutputStream bf = null;
		try {
//			fos = new FileOutputStream("경로");
			
//			BufferedOutputStream bf = new BufferedOutputStream(fos);
			//>최상위 클래스인 outputStream을 매개값으로 받는다.
			
			bf = new BufferedOutputStream(new FileOutputStream("D:\\course\\java\\file\\test2.txt"));
			//>new를 통해 자식클래스를 바로 생성할 수 있다.
			
			//문장하나 받기
			System.out.print("문장을 입력하세요>");
			String str = sc.nextLine();
			
			bf.write(str.getBytes()); //getBytes로 String을 바이트배열로 변경, 파일을 써 내림
			bf.flush();//bf에 쌓인 것을 밀어내준다.
			
			
			
		} catch (FileNotFoundException e) { //파일을 발견 못한 예외
			System.out.println("파일을 발견하지 못했습니다.");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("Input/Output과정의 예외");
			// TODO: handle exception
		}finally {
			sc.close();
			try {
				//close닫을 때는 바깥 클래스 부터 close처리를 한다.(바깥쪽 폴더?파일?)
				bf.close(); //버퍼를 꺼주면 버퍼에 쌓인 글자들이 밀려난다.
				//>close시 flush가 자동으로 호출 된다.
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
