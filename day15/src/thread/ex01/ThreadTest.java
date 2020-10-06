package thread.ex01;

public class ThreadTest implements Runnable {
	
	int num = 0;
	
	//synchronized 를 사용해 사용중인 객체른 다른 스레드가 건들 수 없도록 해준다
	//>하나가 되어서 순서대로 진행됨
	
	@Override
	public synchronized void run() {
		for(int i = 1; i <= 10; i++) {
			
			//현재 돌고 있는  쓰레드 이름이 A라면
			if(Thread.currentThread().getName().equals("A")) {
				num++;
			}
			System.out.println("현재쓰레드: " + Thread.currentThread().getName() + ", num: " + num);
			
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}

	
	
}
