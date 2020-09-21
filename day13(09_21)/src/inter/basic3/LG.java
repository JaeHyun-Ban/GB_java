package inter.basic3;

public class LG implements Printed{

	@Override
	public void turnOn() {
		System.out.println("Life is Good");
		System.out.println("전원을 켭니다!");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Life is Good");
		System.out.println("전원을 끕니다!");
		
	}

	@Override
	public void print(String document) {
		System.out.println("Life is Good");
		System.out.println("문서내용: " + document);
		
	}

	@Override
	public void colorPrint(String document, String color) {
		System.out.println("Life is Good");
		System.out.println("문서내용: " + document + ", 색상: " + color);
		
	}

	@Override
	public int copy(int n) {
		System.out.println("Life is Good");
		for(int i = 0; i <= n; i++) {
			System.out.println(i + "장 복사");
		}
		return n;
	}

}































