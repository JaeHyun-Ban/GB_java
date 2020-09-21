package inter.basic2;

public class Dog extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("강아지는 사료를 좋아해요!");
		
	}

	
	@Override
	public void play() {
		System.out.println("강아지는 밖에서 즐겁게 놓아요!");
		
	}
}
