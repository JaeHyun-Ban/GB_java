package api.io.buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class BufferedInputStreamEx {
	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙은 InputStream은 바이트기반, 입력 속도를 향상시켜주기 위한 클래스입니다.
		 * 
		 */
		BufferedInputStream bfi = null;
		try {
			bfi = new BufferedInputStream(new FileInputStream("D:\\course\\java\\file\\test2.txt"));
			
			while(true) {
				int a = bfi.read(); //한 글자 읽어서 반환
				if(a == -1) break;
				System.out.print((char)a);
				
				
			}
			
			
//			byte[] arr = new byte[100];
//			bfi.read(arr);
			//>읽고 -> 바이트배열에 저장 -> 0이 나올때 까지 하나씩 저장
//			System.out.println(Arrays.toString(arr));
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}
		//>BufferedInputStream또한 InputStream최상위 클래스를 매개변수로 받다.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}










































