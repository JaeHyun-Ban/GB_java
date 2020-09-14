package day08;

public class Phone {

	String model;
	int price;
	String color;
	
	//기본생성자를 만드는 버릇을 들여놓아야 한다.
	
	//생성자
	Phone() {		//기본 생성자는 멤버 변수 다음에 만들어 준다ㄴ.
		System.out.println("Phone 생성자 호출!");
		//기본 생성자에서는 주로 기본 정보를 초기화 하는데 사용한다.
		model = "롤리팝";
		price = 200000;
		color = "검정";
	}	
	
	//생성자는 중복해서 여러개 선언할 수 있다.
	//단, 매개변수의 종류나 개수가 달라야 함
	Phone(String pColor){
		color = pColor;
		price = 300000;
		model = "애니콜";
	}
	
	Phone(String pColor, int pPrice){
		color = pColor;
		price = pPrice;
		model = "가로본능";
	}
	
	Phone(String pColor, int pPrice, String pModel){
		color = pColor;
		price = pPrice;
		model = pModel;
	}

	void info() {
		System.out.println("-----휴대폰 정보-----");
		System.out.println("기종: " + model);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
	}

}































