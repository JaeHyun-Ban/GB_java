package quiz30;

import java.util.Random;

public class ThreadThread extends Thread {

	Random ran = new Random();
	int num = 0;
	
	//Stirng1 + "abc" = String2 / 새로운 String을 만들어내지만
	//String1 + "abc" = String1 그대로 String1에 저장한다
	
	@Override
	public void run() {
		String star = star(num);
		
		while (true) {
			
			if (num >= 100) { //100이거나 클 때
				num = 100;
				System.out.println("location" + getName() + "개표율" + num + "%:" + star);
				break;
			} else { //100미만
				
				System.out.println("location" + getName() + "개표율" + num + "%: " + star);
				star = "";
				num += ran.nextInt(20);
//				System.out.println(num);
				for (int i = 0; i <= num; i++) {
					star += "*";
				}
				
				try { //천천히...
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}
		System.out.println("location" + getName() + "의 개표가 완료되었습니다.");
	}
	
	
	String star(int num) {
		String str = "";
		for(int i = 0; i < num; i++) {
			str += "*";
		}
		return str;
	}

}


























