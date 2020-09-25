package api.io.reader_writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * 문자를 써서 저장할 때 사용하는 클래스 FileWriter클래스 이다.
		 * 기본적으로 2byte단위로 처리하기 때문에 문자를 쓰기에 적합하다.
		 */
		
		Writer fw = null; //Writer클래스 사용
		
		try {
			fw = new FileWriter("D:\\course\\java\\file\\test.txt");
			
			//\n줄개행 명령 전 \r을 사용해 커서를 처음으로 이동해 준다.
			String str = "오늘은 9월 25일 입니다~\n와! 금요일이다!\n집에가야지!????";
			//>원랴러면 타자기 처럼 줄 개행 전에 시작 포인터를 처음으로 땡겨주는 "\r" 을 작성 해줘야한다
			
			fw.write(str); //write()메서드는 매개변수로 String을 받는다.
			
			System.out.println("파일이 정상적으로 저장되었습니다");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
			
			}
			
		}
		
		
		
		
		
	}
}





































