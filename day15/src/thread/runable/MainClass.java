package thread.runable;

public class MainClass {
	
	public static void main(String[] args) {
		
		//Runable을 상속받은 클래스는 직접 Thread클래스에 전달해서 실행한다.
		ThreadTest tt = new ThreadTest();
//		tt.run(); //run()가능함
		
		Thread thread = new Thread(tt, "쓰레드1");//(동작시킬 클래스, 이름)
		thread.start();//쓰레드 시작
		
		System.out.println("메인 종료!");
		
		// main 과 ThreadTest는 따로따로 돌아가고 있다.
		//>둘 다 동시에 진행된다고 생각하면 됨
		
		
		
		
		
		
		
		
	}
}
