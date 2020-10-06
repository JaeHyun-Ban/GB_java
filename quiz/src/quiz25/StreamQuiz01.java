package quiz25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StreamQuiz01 {

	public static void main(String[] args) {

		/*
		 * 1. 스캐너를 통해서 파일명을 입력받는다.
		 * 
		 * 2. upload폴더에 해당파일이 있다면, 해당 파일을 uploadcopy폴더로 복사하세요 파일이 없다면 "파일이 없습니다" 예외구문을
		 * 출력
		 * 
		 * 3. 복사도중 에러가 발생하면, "파일 처리중 예외발생" 구문을 출력
		 */

		Scanner sc = new Scanner(System.in);

		FileInputStream file = null;
		FileOutputStream copy = null;

		try {
			// 입력받고
			System.out.print("파일 입력> ");
			String name = sc.next();

			file = new FileInputStream("D:\\course\\java\\upload\\" + name);// 파일을 읽어들이고
			copy = new FileOutputStream("D:\\course\\java\\uploadcopy\\copy" + name);// 복사할 곳

			byte[] arr = new byte[100]; // 임시 저장용

			int result;
			while ((result = file.read(arr)) != -1) { // 크기가 -1일 때까지
				//>while문에서 반복할 때마다 1byte씩 읽어들이다가 더 읽을께없다면 -1을 리턴 
				
				copy.write(arr, 0, result);// arr 을 0부터 result만큼 작성
				//>0부터 읽은 길이까지 써
//				copy.write(arr);//copy에 
			}
			System.out.println("파일이 복사되었습니다.");

		} catch (FileNotFoundException e) {// 파일이 존재하지 않는 다면 예외
			System.out.println("파일이 존재하지 않습니다.");
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.println("파일 처리중 예외 발생.");
		} finally {
			try {
				// 복사 종료
				file.close();
				copy.close();
			} catch (IOException e) {

				e.printStackTrace();
			}

		}

	}
}
