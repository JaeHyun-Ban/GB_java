package modi.protec.pac2;

import modi.protec.pac1.*;

public class C extends A{
	
	public C(){
		
		super(); //부모 생성자
		super.bool = true; //super로 부모꺼 사용가능
		super.method(); 
		
		
//		A a = new A(); //import해도 소용없음
//		a.bool = true; //안됨
//		a.method();	//안됨
	
	}
	
	
}
