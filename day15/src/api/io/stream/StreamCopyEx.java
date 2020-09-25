package api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopyEx {
	
	public static void main(String[] args) {
		
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		try {
			oldFile = new FileInputStream("D:\\course\\eclipse-jee-2020-06-R-win32-x86_64\\study_java\\day15\\src\\api\\io\\stream\\cs50cat.jpg");
			newFile = new FileOutputStream("D:\\course\\java\\file\\copycat.jpg");//복사할 경로\\복사파일 이름
			
			byte[] arr = new byte[100];
			
//			while(true) {
//				int result = oldFile.read(arr); 
//				//>arr길이만큼 데이터를 읽어서 arr에 저장, 더 읽을 데이터가 없으면 -1 반환
//				
//				if(result == -1) break; //탈출
//				
////				newFile.write(arr);
//				newFile.write(arr, 0, result);//배열의 0부터 result(길이)까지 읽어서 파일을 씀
//				//>복사 범위를 설정할 수 있다.
//			}
			
			int result;
			while((result = oldFile.read(arr)) != -1) { //길이가 -1이 아니라면 저장
				newFile.write(arr, 0, result);
				//>result는 결국 반복하는 동안 끝까지 읽게되어 -1이 됨
				//>>그러면 알아서 탈출	
			}
			System.out.println("파일이 정상적으로 복사되었습니다");
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				//복사가 끝나면 둘을 동시에 연결을 종료해준다.
				oldFile.close();
				newFile.close();
			} catch (Exception e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
		}
		
		
		
		
		
		
	}
}






















































