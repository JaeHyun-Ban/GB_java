package quiz02;

public class Tv {

	int channel;
	boolean power;
	
	void power() {
		
		if(power) {
			power = true;
			System.out.println("전원을 끕니다");
		}else {
			power = false;
			System.out.println("전원을 켭니다");
		}
	}
	
	
	
	
}
