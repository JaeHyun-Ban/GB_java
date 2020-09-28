package quiz25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StreamQuiz02 {
	
	public static void main(String[] args) {
		
		/*
		 * 1. Date클래스를 이용해서 file경로에서 오늘날짜 20200928.txt이름으로 파일을 쓴다.
		 * 2. 내용은 아무거나 작성한다.
		 * 3. 파일을 정상적으로 작성했다면, BufferedReader를 이용해서 파일을 읽어보자
		 */
		
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos = null; //파일 생성
		
		BufferedWriter bw = null; //파일 내용 작성
		BufferedReader br = null; //파일 내용 읽기
		
		
		try {
			//++파일 경로도 String으로 생성하기++ 아주 좋쿠만!
			String path = "D:\\course\\java\\file\\" + sdf.format(date) + ".txt";
			
			//파일 생성
			fos = new FileOutputStream(path); 
			System.out.println(sdf.format(date) + ".txt파일이 생성되었습니다.");
			
			//파일 내용 작성(bufferwriter(fileWriter))
			bw = new BufferedWriter(new FileWriter(path));
			System.out.print("\n파일 내용 입력> ");
			bw.write(sc.nextLine()); //입력받고
			bw.flush(); //내보내고(쓰고)
			System.out.println("내용이 입력 되었습니다.");
			
			System.out.println("--------------");
			//파일 내용 읽기(bufferReader(fileReader))
			br = new BufferedReader(new FileReader(path));
			
			String str = "";//빈 문자열 생성
			while((str = br.readLine()) != null) { //한줄 씩 읽어주기
				System.out.println(str);
			}
			System.out.println("파일 읽기에 성공했습니다.");
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			
			try {
				sc.close(); //스캔 닫고
				fos.close();//파일 생성 닫기
				bw.close();//버퍼 닫고
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
















































