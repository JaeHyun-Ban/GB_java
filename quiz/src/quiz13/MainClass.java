package quiz13;

public class MainClass {
	
	public static void main(String[] args) {
		
		Warrior me = new Warrior("강한친구대한전사");
		Wizard me2 = new Wizard("강한마법사");
		
		Warrior play1 = new Warrior("전사야캐요");
		Wizard play2 = new Wizard("마법사야캐요");
		
		Player[] arr = {play1, play2};
		
//		me.bash(play1);
//		me.bash(play2);
		
//		me.info();
//		play1.info();
//		play2.info();
		
		me2.Blizzard(arr);
		me2.Blizzard(arr);
		play1.info();
		play2.info();
		
	}
}
