package inter.basic2;

public class Cat extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("고양이는 참치를 좋아해요!");
		
	}

	@Override
	public void play() {
		System.out.println("고양이는 방에서 즐겁게 놀아요!");
		
	}
	
}
