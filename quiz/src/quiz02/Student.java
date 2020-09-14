package quiz02;

public class Student {

	/*
	 * 멤버변수
	 * name = 이름
	 * no = 번호
	 * kor = 국어
	 * eng = 영어
	 * math = 수학
	 * 
	 * 생성자
	 * 멤버변수 5개를 초기화하는 생성자
	 * 
	 * getTotal() - 국, 영, 수 점수의 합계를 '반환'
	 * getAvg()	 - 총점을 나눈 평균을 (소수점 2자리 까지) 반환
	 * 
	 * main에서 학생 2명을 생성해서 각각 확인
	 */
	String name;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(String sName, int sNo, int sKor, int sEng, int sMath){
		name = sName;
		no = sNo;
		kor = sKor;
		eng = sEng;
		math = sMath;
	}
	
	int getTotal() {
		return kor + eng + math;
	}
	
//	double getAvg(double total) {
//		
//		return total/3;
//	}
	
	double getAvg()	{
		int sum = getTotal();
		
		return (int)(sum / 3.0 * 100) / 100.0; //3으로 나누면 단순 정수 연산만 된다
	}
	
	
	void info() {
		System.out.println("------학생 정보------");
		System.out.println("이름: " + name);
		System.out.println("번호: " + no + "번");
		System.out.println("국어: " + kor + "점");
		System.out.println("수학: " + math + "점");
		System.out.println("영어: " + eng + "점");
		System.out.println();
		System.out.println("총점: " + getTotal() + "점");
//		System.out.printf("평균: %.2f점\n", getAvg(getTotal()));
		System.out.println("평균: " + getAvg());
	}
	
	
	
}


































