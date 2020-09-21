package inter.basic2;

public class PetShop {
	
	//1. carePet() 메서드 선언
	//- 기능 : 모든 IPet타입을 전달 받을수 있고, 어떤 펫타입인지 각각 확인하는 메서드
	public void carePet(IPet pet) {
		if(pet instanceof Cat) {
			Cat c = (Cat) pet;
			c.play();
			System.out.println("Cat타입 입니다!");
		}else if(pet instanceof Dog) {
			Dog d = (Dog) pet;
			d.play();
			System.out.println("Dog타입 입니다!");
		}else if(pet instanceof GoldFish) {
			GoldFish g = (GoldFish) pet;
			g.play();
			System.out.println("금붕어타입 입니다!");
		}
	}
	
	//2. IPet배열을 받아서  Pet배열 안에 있는 기능을 반복문으로 수행
	
	public void petInfo(IPet[] pets) {
		
		for(IPet p : pets) {
			p.play();
		}
	}
	
	
}
