package exception.thorws_;

public class ThrowsEx02 {

	//생성자
	public void bbb(int i) throws Exception {
		//throws Exception
		
		System.out.println("bbb호출!");
		System.out.println(10 / i);
		System.out.println("bbb종료!");
		
		
	}
	
	public void aaa() throws Exception{
		System.out.println("aaa호출!");
		//try를 이용해 메서드가 끝까지 진행된다.
//		try {
			bbb(0);
//		} catch (Exception e) {
//		
//		}
		System.out.println("aaa종료!");
	}
	
	public ThrowsEx02() throws Exception{
		System.out.println("성성자 호출");
		aaa();
		System.out.println("생성자 종료");
	}
	
}
