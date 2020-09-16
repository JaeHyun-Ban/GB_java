package modi.protec.pac1;

public class B {

	public B() {
		//protected는 같은 패키지에서 사용이 가능하다.
		A a = new A();
		a.bool = true;
		a.method();
		
		
	}

}
