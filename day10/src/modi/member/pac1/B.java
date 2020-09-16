package modi.member.pac1;

public class B {

	public B() {
		A a = new A(); //public class A
		
		a.var1 = 1;
		a.var2 = 2;
//		a.var3 = 3; //pirvate라 안됨
		
		a.method1();
		a.method2();
//		a.method3(); //private라 안됨
		
	}
}
