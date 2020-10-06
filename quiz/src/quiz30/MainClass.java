package quiz30;

import java.util.Random;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * 랜덤한 숫자로 퍼센트가 증가하며 
		 * 100이 되었을 시 개표가 완료되었읍니다 라는 문구를 출력
		 * 
		 * 각 개표는 독립적으로 진행된다.
		 */
		
		//Runnable
//		VoteRun run = new VoteRun();
//		
//		Thread vote1 = new Thread(run, "location1");
//		Thread vote2 = new Thread(run, "location2");
//		Thread vote3 = new Thread(run, "location3");
//		
//		vote1.start();
//		vote2.start();
//		vote3.start();
		
		//Thread
		ThreadThread t1 = new ThreadThread();
		ThreadThread t2 = new ThreadThread();
		ThreadThread t3 = new ThreadThread();
		t1.setName("1");
		t1.start();
		//요건 안된다잉
//		t1.setName("2");
//		t1.start();
//		t1.setName("3");
//		t1.start();
		t2.setName("2");
		t2.start();
		t3.setName("3");
		t3.start();
		
		
	}
	
}




































