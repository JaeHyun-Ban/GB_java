package exception.myexception;

public class MyException extends Exception{

	private static final long serialVersionUID = 1L;
	//extends Execption을 사용하면 이 클래스는 예외처리용으로 사용할 수 있다.
	
	//사용자 예외클래스는 기본생성자, 메세지를 받는 생성자를 만든다.
	
	//기본생성자
	public MyException() {}
	
	//메세지를 받는 생성자
	public MyException(String message) {
		super(message);
	}
	
	
	//나머지는 부가적으로....
	
	
	
	
}
