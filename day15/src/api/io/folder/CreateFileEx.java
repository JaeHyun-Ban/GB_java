package api.io.folder;

import java.io.File;

public class CreateFileEx {
	
	public static void main(String[] args) {
		
		
		/*
		 * 자바에서 외부경로로 폴더를 생성할 때는 File클래스를 사용하면 됩니다.
		 * 생성자 매개변수로 '폴더를 생성할 경로 + 폴더명'을 지정한다.
		 */
		
		try {
			File file = new File("D:\\course\\java\\file\\test_folder");
			
			//exists() - 해당파일이 존재하면 true, 없으면 false
			if(!(file.exists())) {
				
				//mkdir() - 폴더 생성
				file.mkdir();
				System.out.println("폴더 생성 완료");
				
			}else {
				System.out.println("해당 폴더가 존재합니다");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}




































