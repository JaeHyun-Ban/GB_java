package inter.basic3;

import java.util.List;

public class MainClass {
	
	public static void main(String[] args) {
		
//		List<E> 리스트 유형또한 인터페이스의 한 형태이다.
		
		
		//인터페이스란 주어진 도구를 사용하기 위한 방향서, 가이드북, 
		Printed p = new LG();//Samsung();
		p.turnOn();
		p.print("안녕하세요.");
		p.colorPrint("반갑습니다", "red");
		p.copy(8);
		p.turnOff();
		
		System.out.println("---------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}









































