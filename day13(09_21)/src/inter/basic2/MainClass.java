package inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		
		Animal baduk = new Dog();
//		IPet ibabuk = new Dog();
//		Dog dbaduk = new Dog();
		Animal nabi = new Cat();
//		IPet INabi = new Cat();
//		Cat CNabi = new Cat();
		Animal hodol = new Tiger();
		
		
		//1. Animal배열을 생성해서 baduk, nabi, hogol를 저장하고, Animal의 공통기능을 출력
		Animal[] arr = {baduk, nabi, hodol};
		arr[0].eat();
		arr[1].eat();
		arr[2].eat();
		System.out.println("----------------------");
		for(Animal a : arr) {
			a.eat();
		}
		
		//2. IPet 배열을 생성한 후에 baduk, nabi, 금붕어를 저장하고,
		//향상된 for문으로 IPet의 기능을 사용
		//캐스팅을 해야한다.(형변환)
		
		Fish gold = new GoldFish();
//		GoldFish GGold = new GoldFish();
//		IPet IGold = new GoldFish();
		
		System.out.println("----------------------");
		
		IPet[] arr1 = {(IPet) baduk, (IPet) nabi, (IPet) gold};
		for(IPet i : arr1) {
			i.play();
		}
		
		IPet[] pets = new IPet[3];
		pets[0] = (IPet) baduk;
		pets[1] = (IPet) nabi;
		pets[2] = (IPet) gold;
		
		
		
		//3. 
		PetShop shop = new PetShop();
		shop.carePet(pets[0]);
		shop.carePet((IPet)nabi);
		shop.carePet(new GoldFish());
		
		shop.petInfo(arr1);
		
		
		
		
		
		
	}
}
































