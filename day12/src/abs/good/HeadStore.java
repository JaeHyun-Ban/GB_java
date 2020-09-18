package abs.good;

public abstract class HeadStore {
	
	/*
	 * 1. 메서드의 abstract를 붙이면 추상메서드가 된다.
	 * 이 메서드는 상속을 통해서 반드시 오버라이딩 되어야 한다.
	 * 2. 추상메서드는 { }가 없는 메서드의 선언이다.
	 * 추상메서드가 하나라도 있다면, 클래스도 추상클래스가 되어야 합니다.
	 * 
	 * 3. 추상클래스는 일반메서드, 생성자, 멤버변수 모두 사용할 수 있다.
	 */
	private String name = "호식이 두마리 과일가게";
	
	
	public HeadStore() {}
	
	public abstract void apple();
	
	public abstract void banana();
	
	public abstract void melon();
	
	public abstract void orange();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
