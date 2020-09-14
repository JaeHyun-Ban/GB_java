package day08;

public class ObjectBasic02 {
	public static void main(String[] args) {
		
		System.out.println("------ 1번 계산기 생성 ------");
		
		Calculator calc = new Calculator();
		System.out.println(calc.add(1));
		System.out.println(calc.add(2));
		System.out.println(calc.add(3));
		
		System.out.println("------ 2번 계산기 생성 ------");
		Calculator calc2 = new Calculator();
		System.out.println(calc2.add(10));
		System.out.println(calc2.add(20));
		System.out.println(calc2.add(30));
		
		
	}
}



































