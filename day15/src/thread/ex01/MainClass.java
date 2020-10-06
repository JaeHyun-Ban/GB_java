package thread.ex01;

public class MainClass {
	
	public static void main(String[] args) {

//		//객체 2개 쓰레드 2개 각각 실행된다
//		//독립적으로 실행된다.
//		ThreadTest t1 = new ThreadTest();
//		ThreadTest t2 = new ThreadTest();
//		
//		
//		Thread thread1 = new Thread(t1, "A");
//		Thread thread2 = new Thread(t2, "B");
//		
//		thread1.start();
//		thread2.start();
//		
//		System.out.println("메인 종료");
		
		ThreadTest t1 = new ThreadTest();
		
		//객체 1개 쓰레드 2개 (1개의 객체를 각각 실행)
		Thread thread1 = new Thread(t1, "A");
		Thread thread2 = new Thread(t1, "B");
		//>객체 t1으로 쓰레드 2개를 생성했지만 숫자가 동시에 증가하는 것을 알 수 있다.
		
		thread1.start();
		thread2.start();
		
		System.out.println("메인 종료!");
		
		
		
	}
}

















