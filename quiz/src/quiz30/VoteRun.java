package quiz30;

import java.util.Random;

import org.xml.sax.Locator;

public class VoteRun implements Runnable {

	Random ran = new Random(); //랜덤 숫자
	
	int sum = 0;
	String star = ""; //별 개수 누적용
	
	@Override
	public void run() {
		
		String location = Thread.currentThread().getName(); //이름
		
		while (true) {
			//한바퀴 회전시 랜덤수 생성
			int num = ran.nextInt(15);
			sum += num; //누적
			
			if (sum < 100) { //개표율이 100 미만일 시
				
				for(int i = 1; i <= num; i++) {
					star += "*";
				}
				
				System.out.println(location + "의 개표율" + sum + "%:" + star);//같은 줄에 출력시키기 위해 한 작업임
				
				try { //출력시간
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}

			}else {//개표율이 100을 초과한 경우 -> 다시 sum을 100으로 변경
				sum = 100;
				star = ""; //초기화
				for(int i = 1; i <= sum; i++) {
					star += "*";
				}
				System.out.println(location + "의 개표율" + sum + "%:" + star);
				
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		sum = 0;
		System.out.println(location + "의 투표가 종료 되었습니다.");

	}
	//별을 찍고 있는 도중에 독립적으로 먼저 실행될 수 있다.(속도의 문제)
	//상속문 안에 작성 시 반복되는게 출력보다 느림
//	String star(int sum) {
//		for(int i = 0; i < sum; i++) {
//			star += "*";
//		}
//		return star;
//	}
}




























