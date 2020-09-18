package abs.good;

public class Store extends HeadStore {

	// 생략되어있음
	public Store() {
		super();
	}

	@Override
	public void apple() {
		System.out.println("서울 지점 사과 500원");

	}

	@Override
	public void banana() {
		System.out.println("서울지점 바나나 700원");

	}

	@Override
	public void melon() {
		System.out.println("서울지점 멜론 900원");

	}

	@Override
	public void orange() {
		System.out.println("서울지점 오렌지 1000원");

	}

}
