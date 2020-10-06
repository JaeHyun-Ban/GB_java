package thread.runable;

public class ThreadTest implements Runnable {
	//1. Runnable 인터페이스 상속
	//쓰레드의 기능을 사용하고 싶다면, Thread클래스의 static으로 사용
	
	
	@Override
	public void run() {
		//필수적으로 만들어져야 하함
		
		// 현재 실행되고 있는 스레드의 이름을 가져온다
		System.out.println(Thread.currentThread().getName());
		
		System.out.println("쓰레드 시작1");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);//1초 stop, 밀리초가 기준
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		System.out.println("쓰레드 종료1");
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
