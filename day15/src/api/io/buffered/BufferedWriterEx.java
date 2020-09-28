package api.io.buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferedWriterEx {
	
	public static void main(String[] args) {
		
		/*
		 * BufferedWriter는 문자기반을 읽을 때 사용하고. 성능향상 스트림 입니다.
		 * 
		 * 순서대로 neatLine()으로 두문장을 받아서 파일을 쓰세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter bw = null;
		try {
			
			bw = new BufferedWriter(new FileWriter("D:\\course\\java\\file\\test3.txt"));
			//writer클래스를 매개변수로 입력 받는다.
			//>쓸 파일을 경로를 받음
			
			//2byte씩 받아서 한글도 잘 써짐
			System.out.print("문장1 입력> ");
			String str1 = sc.nextLine();
			System.out.print("문장2 입력> ");
			String str2 = sc.nextLine();
			
			
			//문자열 매개변수로 받을 수 있다(BufferedWriter의 특징)
			String result = str1 + "\r\n" + str2; //합쳐서 입력 가능
			bw.write(result);
			bw.flush();//buffer받았으면 밀어내주기
			
			//하나씩 받음
//			bw.write(str1);
//			bw.flush(); // str1통째로 받고 밀어내기
//			bw.write(str2);
//			bw.flush(); // str2 통째로 받고 밀어내기
			
			
			
			
			
		} catch (IOException e) {
			// TODO: handle exception
		}
		
		catch (Exception e) {
			// TODO: handle exception
		}finally {
			sc.close();
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}





























