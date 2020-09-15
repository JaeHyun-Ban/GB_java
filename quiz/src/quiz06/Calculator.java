package quiz06;

public class Calculator {
	
	int result;
	double pi = 3.14;
	
	//result에 값을 누적
	void add(int num) {
		result += num;
	}
	
	//result에 값을 차감
	void sub(int num) {
		result -= num;
	}
	
	//result에 값을 곱하기
	void multi(int num) {
		result *= num;
	}
	
	//result에 값을 나눔
	void div(int num) {
		result /= num;
	}
	
	//pi를 이용해서 원의 넓이를 구함
	double circle(int r) {
		 return pi * r * r;
	}
	
}








































