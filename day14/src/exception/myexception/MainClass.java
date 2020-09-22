package exception.myexception;

public class MainClass {
	
	public static void main(String[] args) {
		
		Account a = new Account(0);
		
		try {
			a.deposit(5000);
			a.withDraw(1000);
			a.withDraw(1000);
			
			a.getBalance();
			
			a.withDraw(1000);
			a.withDraw(1000);
			a.withDraw(1000);
			
			//잔액 초과
			a.withDraw(1000);
			
		} catch (MyException e) {//MyException으로 만들자
			System.out.println(e.getMessage());
		}
		
		
	}

}
