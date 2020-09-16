package encap.obj;

public class MainClass {
	
	public static void main(String[] args) {
		
		//객체를 빼내는 순서를 잘 생각해보자
		Hotel h = new Hotel();
		Chef c = h.getChef();
		
//		c.cooking(); 
		h.getChef().cooking(); //위와 동일하다
		
//		Chef cc = new Chef();
//		h.setChef(cc);
		h.setChef(new Chef()); //위와 동일
		
		
		
		
		
		
		
	}
}





































