package quiz22;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	
	private String stuId;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private String grade;
	private Scanner sc = new Scanner(System.in);
	
	
	
	//학생 정보를 입력받는 메서드
	public String inputStuInfo() {
		/*
		 * 학번, 이름, 국영수를 입력받음
		 * 국영수는 문자열이 입력시에 다시 받을 수 있도록 예외 처리. --> 그 예외
		 */
		System.out.print("학번: ");
		setStuId(sc.next());
		System.out.print("이름: ");
		setName(sc.next());
		
		while(true) {
			try {
				System.out.print("국어: ");
				setKor(sc.nextInt());
				System.out.print("영어: ");
				setEng(sc.nextInt());
				System.out.print("수학: ");
				setMath(sc.nextInt());
				break;
				//예외처리
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("숫자만 입력해 주세요");
			}catch (Exception e) {
				sc.nextLine();
				System.out.println("1~100사이의 숫자만 입력하세요");
			}
		}
		calcTotAvg();
		return stuId;
	}
	
	//총점, 평균, 학점을 계산하는 메서드
	public void calcTotAvg() {
		//합계, 평균, 등급을 나누어서 멤버변수 저장
		
		//합계
		int total = getKor() + getEng() + getMath();
		setTotal(total);
		
		//평균
		double avg = total / 3.0;
		setAvg(avg);
		
		//학점
		if(avg == 100) {
			setGrade("A+");
		}else if(avg >= 90) {
			setGrade("A");
		}else if(avg >= 80) {
			setGrade("B");
		}else if(avg >= 70) {
			setGrade("C");
		}else if(avg >= 60) {
			setGrade("D");
		}else {
			setGrade("F");
		}
		
	}
	
	
	//학생정보 출력 메서드
	public void outputInfo() {
		
		System.out.printf("%4s%6s%11d점%11d점%11d점%11d점%11.2f점%10s\n"
				, stuId, name, kor, eng, math, total, avg, grade);		
	}

	//getter, setter
	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	
	
	
	
}








































