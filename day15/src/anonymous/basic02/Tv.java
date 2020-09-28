package anonymous.basic02;

public class Tv {
	
	//remote타입을 Tv에 알맞게 익명객체로 초기화
	//main에서 각각 실행
	
	private int sound;
	private RemoteControl remote;
	
	public Tv() {
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				System.out.print("Tv소리를 올립니다> ");
				System.out.println(++sound);
			}
			
			@Override
			public void volumeDown() {
				System.out.print("Tv소리를 내립니다> ");
				System.out.println(--sound);
			}
			
			@Override
			public void turnOn() {
				System.out.println("Tv전원을 켭니다");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Tv전원을 끕니다.");
				
			}
		}; //익명 객체는 세미콜론이 찍힘
	}
	public int getSound() {
		return sound;
	}
	public void setSound(int sound) {
		this.sound = sound;
	}
	public RemoteControl getRemote() {
		return remote;
	}
	public void setRemote(RemoteControl remote) {
		this.remote = remote;
	}
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		tv.remote.turnOn();
		tv.remote.volumeUp();
		tv.remote.volumeDown();
		tv.remote.turnOff();
		
	}
	
	
	
	
}







































