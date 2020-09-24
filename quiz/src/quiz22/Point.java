package quiz22;

import java.util.List;
import java.util.Scanner;

public class Point implements InterPoint {

//	List<Student> list = new ArrayList<>(); >> ????
	private Scanner sc = new Scanner(System.in);
	
	@Override
	public void showPointUI() {
		System.out.println("===========================================================");
		System.out.printf("%4s%10s%10s%10s %11s%11s%11s %11s\n"
				, "학번", "이름", "국어", "영어", "수학", "총점"
				, "평균", "학점");
		System.out.println("===========================================================");
		
	}

	@Override
	public void input(List<Student> students) {
		//input의 기능-학생의 성적정보를 입력할 메서드
		/*
		1. 학생의 객체를 1개 생성합니다.
		2. 학생의 객체에 속성값을 설정하는 메서드들을 호출!
			-만약 입력한 학번이 이미 list에 존재하는 학번이라면 "이미 등록된 학번 입니다"를 출력하고 메서드종료
		3. 정보저장이 완료된 객체를 리스트에 추가!
		4. 저장완료 메세지를 출력하세요.
		ex) XXX님의 성적 정보가 정상적으로 입력되었습니다.
		*/
		
		//1.
		Student s = new Student();
		
		s.inputStuInfo(); //입력 시작
		if(s.getStuId().contains(s.inputStuInfo())) { //반환값이 존재한다면
			System.out.println("이미 등록된 학번입니다.");
		}else {
			students.add(s);
			System.out.println(s.getName() + "님의 정보가 저장 되었습니다.");
		}
		
	}

	@Override
	public void showAll(List<Student> students) {
		//showAll의 기능-전체 학생들의 성적정보를 출력할 메서드
		/*
		1. 리스트 안에 들어있는 학생객체들의 정보를 반복문을 통해 전체 출력하세요.
		2. 우리반의 전체평균을 가장 아랫부분에 출력하세요.
	 	*/
		double totalAvg = 0;
		
		for(int i = 0; i < students.size(); i++	) {
			System.out.println(students.get(i).toString());
			totalAvg += students.get(i).getAvg();
		}
		System.out.printf("전체 평균 : %.2f" + totalAvg / students.size());
		
	}

	@Override
	public void search(List<Student> students) {
		//search의 기능 - 학번과 일치하는 학생을 찾는 메서드
		/*
		1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 정보만 출력하세요.
		2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력하세요.
		*/
		System.out.print("학번 입력: ");
		int stdId = sc.nextInt();
		
		
		
	}

	@Override
	public void modify(List<Student> students) {
		//modify의 기능 - 학번과 일치하는 정보를 수정하는 메서드
		/*
		1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 국어,영어,수학 점수를 수정하세요.
		2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력 하세요.
		*/
		
	}

	@Override
	public void delete(List<Student> students) {
		//delete기능 - 학번과 일치하는 정보를 삭제하는 기능
		/*
		1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 모든 정보를 삭제하세요.
		2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력 하세요.
		*/
		
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	
	 
}





























