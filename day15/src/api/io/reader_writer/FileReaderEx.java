package api.io.reader_writer;

import java.io.FileReader;

public class FileReaderEx {

	public static void main(String[] args) {

		/*
		 * 문자기반으로 읽어들이는 클래스는 FileReader클래스 입니다. 2byte 단위로 읽고쓰기 대문에 문자를 쓰기에 적합하다.
		 */

		FileReader fr = null; 
		//2byte씩 읽고씀 따라서 한글에 적합함

		try {

			fr = new FileReader("D:\\course\\java\\file\\test.txt");
			
			while(true) {
				int result = fr.read(); //문자를 하나씩 읽어들임
				if( result == -1) break; //읽어들일 문자가 없다면 -1을 리턴
				System.out.print((char)result); //문자형으로 캐스팅 후 출력
			}
			

		} catch (Exception e) {
			// TODO: handle exception
		}

		
		
		
		
	}

}









































