package quiz25;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StreamQuiz03 {

	public static void main(String[] args) {
		
		/*
		 * 1. Date클래스를 이요해서 file경로에 하위폴더로 
		 * 오늘 날짜 20200928file 폴더를 생성한다.
		 * 2. 스캐너로 파일명을 입력받고 '파일명.txt' 파일로 파일을 쓴다.
		 * 3. exit를 입력받을때 까지 엔터를 포함해서 실시간으로 입력을 받는다.
		 *>>채팅이넹
		 * 4. exit로 파일이 정상적으로 써졋다면, 아무 방법으로나 파일을 읽자.
		 * 
		 */
		
		
		Date date = new Date();//날짜 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");//날짜형식 포맷
		
		Scanner sc = new Scanner(System.in); //스캔
		
		File file = null; //'폴더' 생성용
		FileOutputStream fos = null;//'파일' 생성용
		BufferedWriter bfw = null; //파일 내용 입력용
		BufferedReader bfr = null; //파일 내용 읽기용
		
		try {
			
			//++파일 경로를 String으로 생성++
			String path = "D:\\course\\java\\file\\" + sdf.format(date);
			
			//'폴더' 생성
			file = new File(path);//경로 설정
			//++파일이 존재한다면 - 조건
			if(file.exists()) {
				System.out.println("이미 존재하는 폴더입니다.");
			}else {
				file.mkdir();//폴더 생성(make directory)
				System.out.println("폴더 생성 완료");
				System.out.println("-----------------------------");
			}
			
			
			//'파일'이름 입력
			System.out.print("파일명 입력> ");
			String name = sc.nextLine();
			
//			++안해도 됨
//			fos = new FileOutputStream(path + "\\" + name + ".txt");//생성한 폴더에 파일 생성
//			System.out.println(name + ".txt 파일 생성 완료");
//			System.out.println("-----------------------------");
			
			//쓰기			
			//'파일' 내용 입력(BufferWriter > FileWriter)
			bfw = new BufferedWriter(new FileWriter(path + "\\" + name + ".txt")); //작성할 파일 선택
			
			//조건 - exit가 입력받기 전까지
			while(true) {
				System.out.print("입력> ");
				String str = sc.nextLine();
				if(str.equals("exit")) {
					System.out.println("입력을 종료합니다.");
					System.out.println("------------------------");
					break;
				}
				//++문장에 직접 추가하기
//				str += "\r\n"; 
				
				//개행 + 포인터 이동을 함께 추가
				bfw.write(str + "\r\n");//한줄 입력
				bfw.flush();//한번 밀기
			}
			
			//'파일' 내용 읽기(BufferReader > FileReader)
			bfr = new BufferedReader(new FileReader(path + "\\" + name + ".txt"));
			System.out.println(name + ".txt 파일을 읽습니다.");
			String read = "";
			while((read = bfr.readLine()) != null) {
				System.out.println(read);
			}
			
				
		}catch (FileNotFoundException e) {
			System.out.println("FileOutputStream에서 예외 발생");
		} catch (IOException e) {
			System.out.println("BufferedWriter - FileWriter에서 예외 발생");
		}catch (Exception e) {
			// TODO: handle exception
		}finally {
			sc.close();
			try {
				bfw.close();
				bfr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}







































