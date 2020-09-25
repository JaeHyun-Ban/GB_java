package api.io.folder;

import java.io.File;

public class DeleteFileEx {
	
	public static void main(String[] args) {
		
		try {
			File file = new File("D:\\course\\java\\file\\test_folder");
			
			if(file.exists()) {//폴더가 존재하면 삭제
				
				//delete() - 성공: true, 실패: false
				file.delete();
				System.out.println("폴더가 삭제 되었습니다");
			}else {
				System.out.println("파일삭제 실패");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	
		
		
		
		
		
	}
}













































