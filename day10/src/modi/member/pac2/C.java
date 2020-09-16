package modi.member.pac2;

import modi.member.pac1.A;

public class C {
 
	public C() {
		
		A a = new A(); //public class A
		
		a.var1 = 1;
//		a.var2 = 2;	//default라 안됨
//		a.var3 = 3; //pirvate라 안됨
		
		a.method1();
//		a.method2(); //default라 안됨
//		a.method3(); //private라 안됨
	
		
	}
	
}
