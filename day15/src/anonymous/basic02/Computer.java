package anonymous.basic02;

public class Computer {

	//멤버변수
	private int sound;
	private RemoteControl remote;
	
	public Computer() {
		
		//인터페이스를 딱 한번만 사용하고 버릴 때  
		//이렇게 만들어서 사용한다.
		remote = new RemoteControl() {
			
			@Override
			public void volumeUp() {
				 sound++;
				 System.out.println("컴퓨터 볼륨: " + sound);
				
			}
			
			@Override
			public void volumeDown() {
				 sound--;
				 System.out.println("컴퓨터 볼륨: " + sound);
				
			}
			
			@Override
			public void turnOn() {
				 System.out.println("전원 On");
				
			}
			
			@Override
			public void turnOff() {
				 System.out.println("전원 Off");
				
			}
		};
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
	
	
	
	
	
	
	
}








































