package quiz15;

public class DropShip extends Unit{

	private static final String NAME = "DripShip";
	public Unit[] unit = new Unit[8]; //수송선의 공간
	public int index = 0; //unit배열의 index
	
	public DropShip() {
		super(0, 0, 200, NAME);
	}
	
	/*
	 * - move()는 마린과 동일
	 * 단, 수송선이 이동하면, 수송선 배열에 있는 모든 유닛의 위치가 수송선 위치로 바뀐다.
	 * 
	 * - location()의 기능 동일함
	 * 
	 * - ride(모든 유닛을 받을 수 있도록 선언)
	 * 1. 배열의 크기는 8, 수송선 배열에는 탱크와 마린이 탈 수 있다.
	 * - 탱크 4칸, 마린 1칸 씩 배열을 사용
	 * 
	 * 2. 배열에 유닛이 탈 수 있으면 유닛을 배열에 저장
	 * 배열이 꽉 차거나, 탈 수 있는 공간이 없으면 "공간이 부족합니다"를 출력
	 * 
	 * 3. 수송선에 탄 유닛을 가로로 출력하기
	 */
	
	//2.3.
	public void ride(Unit u) {
		//마린일때
		if(index > 7) {
			System.out.println("공간이 부족합니다");
			return;
		}
		
		if(u instanceof Marine) {
			unit[index] = u;
			index += Marine.getSize();
			if(index > 8) {
				System.out.println("공간이 부족합니다");
				return;
			}
		//탱크일때
		}else if(u instanceof Tank) {
			unit[index] = u;
			index += Tank.getSize();
			if(index > 8) {
				System.out.println("공간이 부족합니다");
				return;
			}
		}
		
		System.out.print("탑승: [");
		for(int i = 0; i < index; i++) {
			if(unit[i] == null) continue;
			System.out.print(unit[i].getName() + " ");
		}
		System.out.println("]");
	}
	
	@Override
	public void location() {
		System.out.println("==========================");
		System.out.print("드랍쉽현재 위치: ");
		System.out.println("x: " + this.getX() + ", y: " + this.getY());
	}
	
	@Override
	public void move(int x, int y) {
		int preX = x - this.getX(); //
		int preY = y - this.getY();
		setX(preX);
		setY(preY);
		System.out.println("-----------------------------------");
		System.out.println("드랍쉽이동 거리: " + (int)(Math.sqrt(getX()^2 + getY()^2)));
		
		//단, 수송선이 이동하면, 수송선 배열에 있는 모든 유닛의 위치가 수송선 위치로 바뀐다.
		for(int i = 0; i < index; i++) {
			if(unit[i] == null) continue;
			unit[i].move(getX(), getY()); //드랍쉽 위치를 전달
		}
		
	}
}
































