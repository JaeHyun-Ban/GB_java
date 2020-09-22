package exception.myexception;

public class Account {
	
	/*
	 * 1. 잔액(balance: long) 타입으로 멤버변수
	 * 2. 입금기능: deposit
	 * 3. 출금기능: withDraw
	 * 4. 잔액확인: getBalance
	 * 
	 * 단, withDraw() 메서드에서 잔액이 출금보다 작으면 MyExceotion을 발생시키는 
	 * 코드를 생성해보자.
	 * 
	 * 
	 */
	private long balance; //잔액
	
	public Account(long balance) {
		this.balance = balance;
	}

	//입금
	public void deposit(int money) {
		balance += money;
		System.out.println(money + "원 입금 되었습니다.\n");
	}
	
	//출금
	public void withDraw(int money) throws MyException{
		if(balance < money) {
			throw new MyException("잔액이 부족합니다");
		}
		balance -= money;
		System.out.println(money + "원 출금 되었습니다.\n");
		
		
	}
	//잔액확인
	public long getBalance() {
		return balance;
	}

	
	
	
	

	
}











































