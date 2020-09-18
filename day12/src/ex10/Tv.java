package ex10;

public class Tv {
	// 1.Tv클래스의 멤버변수 power, channel, volume을
	// 클래스 외부에서 접근할 수 없도록 제어자를 붙이세요.
	private boolean power;
	private int channel;
	int prevChannel;
	private int volume;
	
	// 2.이 멤버변수들을 어디서나 사용할 수 있도록 getter, setter를 추가하세요.
	public boolean isPower() {
		return power;
	}
	// 3. power의 setter메서드 에서는 true, false를 이용해서 전원을 끄고, 전원을 키도록 표현하세요.
	public void setPower(boolean power) {
		this.power = power;
		if(this.power == true) {
			System.out.println("전원을 켭니다!");
		}else if(this.power == false) {
			System.out.println("전원을 끕니다!");
		}
	}

	public int getChannel() {
		return channel;
	}
	//4.channel의 setter메서드 안에서는 이전채널 번호를 기억하도록 처리하고, 
	//멤버변수 channel을 변경하세요.
	public void setChannel(int channel) {
		setPrevChannel(this.channel);
		this.channel = channel;
	}

	public int getPrevChannel() {
		return prevChannel;
	}

	public void setPrevChannel(int prevChannel) {
		this.prevChannel = prevChannel;
	}

	public int getVolume() {
		return volume;
	}
	//5. volume의 setter메서드 에서는 1-100까지만 저장 될 수 있도록 처리해 주세요.
	public void setVolume(int volume) {
		if(volume > 100 && volume < 1) {
			System.out.println("잘못된 채널입니다!");
			return; //종료
		}
		this.volume = volume;
	}
}







































