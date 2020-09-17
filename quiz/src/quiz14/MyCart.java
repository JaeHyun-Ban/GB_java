package quiz14;

public class MyCart {
	// 1. 모든 변수와 메서드에 적절한 접근제한자를 선언하세요.
	int money;
	Product[] cart = new Product[1]; // 상품을 저장할 배열
	int i = 0;

	// 2. MyCart의 생성자는 money만 받아서 초기화
	public MyCart(int money) {
		super();
		this.money = money;
	}

	/*
	 * 3. buy(모든 상품을 받도록 선언)
	 * 
	 * 가진돈과 전달된 물건의 가격을 비교해서 돈이 적으면 "금액부족" 출력후 종료 가진돈이 충분하면 물건의 가격을 money에 빼고
	 * add(상품) 메서드를 호출
	 */
	void buy(Product p) {

		if (this.money < p.price) {
			System.out.println("잔액이 부족합니다!");
			return;
		}

		if (p instanceof Radio) {
			this.money -= p.price;
			add(p);
			return;
		} else if (p instanceof Tv) {
			this.money -= p.price;
			add(p);
			return;
		} else if (p instanceof Computer) {
			this.money -= p.price;
			add(p);
			return;
		}

	}

	/*
	 * 4. add(모든 상품을 받도록 선언) 만약 i의 값이 장바구니의 크기보다 같거나 크다면 기존의 장바구니보다 크기가 * 2큰 배열을 생성.
	 * 기존의 장바구니 값을 새로운 배열에 복사. 새로운 장바구니를 기존의 장바구니와 바꾼다.
	 * 
	 * 상품을 장바구니에 담는다.
	 * 
	 * info()메서드 호출
	 */
	//buy메서드와 연계되어사용가능하고 따로 사용불가능 하게 private로 생성
	private void add(Product p) {

		if (this.i >= cart.length) {
			Product[] tmp = new Product[cart.length * 2];
			for (int i = 0; i < cart.length; i++) {
				tmp[i] = cart[i];
			}
			cart = tmp;
		}
		
		cart[this.i] = p;
		this.i++;
	}

	/*
	 * 5.info() 장바구니 안에 담긴 물건의 목록(name)을 출력한다. 
	 * 장바구니 안에 담긴 물건의 가격을 모두 더해서 출력 남은금액 출력
	 * 메인에서 buy메서드 실행
	 * 
	 */
	void info() {
		
		int sum = 0;
		
		System.out.print("상품 목록: ");
		for(int j = 0; j < i; j++) {//i가 상품의 갯수
			
			System.out.print(cart[j].name + " ");
			
			//이렇게 해도 되는데 너무 길구만
			//그리고 이미 상품의 번호를 통해 값을 뽑아낼 수 있음
//			if(cart[j] instanceof Tv) {
//				sum += cart[j].price;
//			}...
			
			
			sum += cart[j].price;
		}
		
		System.out.println("\n구매 금액: " + sum + "원");
		System.out.println("---------------------");
		System.out.println("남은 금액: " + money + "원");
		
	}
	
}









































