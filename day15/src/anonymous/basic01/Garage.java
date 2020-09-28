package anonymous.basic01;

interface Car{
	public void run();
}


class Tico implements Car {

	@Override
	public void run() {
		System.out.println("티코~~~~~");
		
	}
	
}


public class Garage {

//	public Car car = new Tico();
	public Car car = new  Car() {
		
		@Override
		public void run() {
			System.out.println("익명 객체 티코입니다~~~~");
			
		}
	};
	
	//이렇게 사용할꺼면 자바는 왜...????
	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.car.run();
		
		
	}
	
	
	
}





















































