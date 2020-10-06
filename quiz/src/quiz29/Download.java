package quiz29;

public class Download implements Runnable {

	@Override
	public void run() {
		
		System.out.println("음악을 15초간 재생합니다.");
		
		System.out.print("동영상을 다운로드 합니다: ");
		for(int i = 0; i < 15; i++) {
			System.out.print("*");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("\n다운로드가 완료되었습니다");
		System.out.println("음악 재생이 끝났습니다.");
		
		
		
		
		
		
		
		
		
	}
	
	
}
