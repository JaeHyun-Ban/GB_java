package quiz17;


import java.util.Scanner;

public class Melon00 implements Music {
	
	int index = 0;
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public String select(String n) {

		return n;
	}

	@Override
	public void playlist() {
		if(list.isEmpty()) {
			System.out.println("노래가 존재하지 않습니다");
			System.out.println();
		}else {
			System.out.print("[");
			for(String s : list) {
				System.out.print(s + "  ");
			}
			System.out.println("]");
		}
		System.out.println("-------------------------------");
		
	}
	
	@Override
	public void add() {
		System.out.println("추가할 노래 입력");
		System.out.print("> ");
		String music = sc.next();
		System.out.println(music + "이(가) 목록에 추가되었습니다.");
		System.out.println("-------------------------------");
		list.add(music);
	}
	
	
	
	@Override
	public void play() {
		System.out.println("현재 노래를 재생합니다.");
		System.out.println("노래: " + list.get(index));
		System.out.println("-------------------------------");
	}

	@Override
	public void next() {
		
		index++;
		if(index >= list.size()) {
			System.out.println("\n다음 노래가 존재하지 않습니다.\n");
			return;
		}
		System.out.println("다음 노래를 재생");
		System.out.println("노래: " + index  + "." + list.get(index));
		System.out.println("-------------------------------");
		
	}
	
	@Override
	public void prev() {
		index--;
		if(index < 0) {
			System.out.println("\n이전 노래가 존재하지 않습니다.\n");
			return;
		}
		System.out.println("이전 노래를 재생");
		System.out.println("노래: " + list.get(index));
		System.out.println("-------------------------------");
	}
	
	@Override
	public void end() {
		System.out.println("\n프로그램을 종료합니다.");
		return;
	}



	
	
}






































