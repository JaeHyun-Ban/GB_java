package api.io.buffered;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.CharsetDecoder;

public class BufferedReader_UTF8 {
	
	public static void main(String[] args) {
		
		//파일을 읽을 때 UTF-8이 아닌 것을 읽기
		
		/*
		 * InputStreamReader는 InputStream타입의 클래스를 Reader클래스 형태로 읽어주는 메개차 이다.
		 * 1. 키보드를 통해 값을 받을 수 있고
		 * 2. 인코딩 형식을 지정해서 파일을 읽을 수도 있다.
		 * 
		 */
		
		
		try {
			
//			InputStreamReader is = new InputStreamReader(System.in);
			//> public InputStreamReader(InputStream in, CharsetDecoder dec) 
			//> ImputStream을 받고, CharsetDecoder(문자 디코더)를 UTF-8로 맞춰준다.	
			//한줄로 생성
//			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			
			
//			InputStream i = new FileInputStream("경로"); 			
//			Reader is = new InputStreamReader(i, "UTF-8"); //Reader타입으로 input을 생성
//			BufferedReader bf = new BufferedReader(is); //Reader타입 매개변수를 받는다.
			//>한줄로 생성
			BufferedReader bf = new BufferedReader
					(new InputStreamReader(new FileInputStream("D:\\course\\java\\file\\test3.txt"), "EUC-KR"));
			//>경로의 파일을 EUC-KR로 읽어들인다.
			//>>기본설정이 UTF-8이라 따로 설정해 주어야만 읽을 수 있다.
			
			String str = "";
			while((str = bf.readLine()) != null) {
				System.out.println(str);
			}
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
		
		
		
		
		
	}
}





































