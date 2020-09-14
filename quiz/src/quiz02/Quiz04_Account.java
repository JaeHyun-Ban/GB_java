package quiz02;

public class Quiz04_Account {
	
	String name;
	int password;
	int balace;
	
	//2. 생성자 - 3가지 멤버변수를 모두 매개값으로 받아 초기화하는 생성자를 선언하세요
	Quiz04_Account(String pName, int pPassword, int pBalace){
		name = pName;
		password = pPassword;
		balace = pBalace;
	}
	
	//3. 메서드 - 입금기능 메서드, 출금기능 메서드, 잔액 조회 메서드 생성
	
	//입금
	void deposit(int money) {
		balace += money;
	}
	
	//출금
	void withDrwa(int money) {
		balace -= money;
	}
	
	//잔액 조회
	int getbalance() {
		return balace;
	}
	
	
	
	
}

































