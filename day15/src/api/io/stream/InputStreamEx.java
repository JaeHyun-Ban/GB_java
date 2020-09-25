package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class InputStreamEx {

	public static void main(String[] args) {

		/*
		 * 1. 파일을 읽어들이는데 사용하는 클래스 FileInputStream입니다. 2. 생성자에 매개값으로 읽어들일 파일의 전체경로를 적습니다.
		 * 
		 * 
		 */
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("D:\\course\\java\\file\\hello.txt");
			
//			while (true) {
//				
//				int data = fis.read(); // int로 리턴
//				// >read()메서드는 1byte씩 읽으며 파일 끝에 도달할 시 -1을 리턴한다.
//
//				if(data == -1) break; //탈출 조건
//				
//				System.out.print((char) data);//int데이터를 char로 캐스팅 후 출력
//			}
			
			byte[] arr = new byte[100];
			int result = fis.read(arr); //읽어들인 byte데이터의 길이
//			System.out.println(result);
//			System.out.println(Arrays.toString(arr));
			
			int i = 0;
			while(true) {
				
				if(arr[i] == 0) break; //데이터가 다 나왔다면
				
				System.out.print((char)arr[i]);
				i++;
				
				//i가 전체 길이만 큼 다 나왔다면
				if(i == result)	break;
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}









































