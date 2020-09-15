package quiz06;

public class Computer extends Calculator{
	
	//오버라이딩으로 생성
	double circle(int r) {
		return r * r * Math.PI; 
	}
	
	//정사각형의 넓이를 리턴
	double rect(double a) {
		return a*a;
	}
	
	//직사각형의 넓이 리턴
	double rect(double a, double b) {
		return a * b;
	}
	
	//직육면체 넓이 리턴
	double rect(double a, double b, double c) {
		return a * b * c;
	}
	
	
}
