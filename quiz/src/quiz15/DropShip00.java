package quiz15;

public class DropShip00 extends Unit{

	private static final String NAME = "DripShip";
	public Unit[] unit = new Unit[8]; //수송선의 공간
	public int index = 0; //unit배열의 index
	
	public DropShip00() {
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
		
	
		if(u instanceof Marine && index <= 7) {	//마린이 들어갈 수 있는 조건
			this.unit[index] = u;
			index++;
		}else if(u instanceof Tank && index <= 4) { //탱크가 들어갈 수 있는 조건
			this.unit[index] = u;
			index+=4;
		}else {//공간이 없는 경우
			System.out.println("수송선 공간이 부족합니다!");
			return;//함수 종료
		}
		
		//수송선 정보 출력
		System.out.println("수송선 정보[");
		for(int i = 0; i < this.unit.length; i++) {
//			if(this.unit[i] == )
		}
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
		System.out.println("드랍쉽이동 거리: " 
					+ (int)(Math.sqrt((int)Math.pow(getX(), 2) + (int)Math.pow(getY(), 2))));
		
		//단, 수송선이 이동하면, 수송선 배열에 있는 모든 유닛의 위치가 수송선 위치로 바뀐다.
		for(int i = 0; i < unit.length; i++	) {
			if(unit[i] != null) {//값이 존재 할 때
				unit[i].setX(x);
				unit[i].setY(y);
			}
		}
		
	}
}
































