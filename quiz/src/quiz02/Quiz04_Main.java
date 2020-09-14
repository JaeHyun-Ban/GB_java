package quiz02;

public class Quiz04_Main {

	public static void main(String[] args) {
		
		Quiz04_Account myAcc = new Quiz04_Account("홍길동", 1234, 3600);
		
		myAcc.deposit(800);
		myAcc.withDrwa(1900);
		
		int bal = myAcc.getbalance();
		System.out.println(myAcc.name + "님의 계좌 잔액은: " + bal + "원 입니다.");
		
	}
}
