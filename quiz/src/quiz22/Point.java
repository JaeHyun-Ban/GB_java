package quiz22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Point implements InterPoint {

	List<Student> list = new ArrayList<>();
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
		Student s = new Student();
		//> 메서드 밖에 생성하면 주소값이 같은 객체를 생성하기 때문에 중복되서 즐어가진다
		String stdId = s.inputStuInfo(); //입력
		
		if(students.size() == 0) { //최초 저장
			students.add(s);
			System.out.println(s.getName() + "님의 정보가 저장 되었습니다.");
		}else {
			for(int i = 0; i < students.size(); i++) {
				if(students.get(i).getStuId().equals(stdId)) {
					System.out.println("이미 등록된 학번입니다.");
				}
			}
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
		
		showPointUI();//리스트
		
		for(int i = 0; i < students.size(); i++	) {
			students.get(i).outputInfo();
			totalAvg += students.get(i).getAvg();
		}
		System.out.printf("전체 평균 : %.2f", totalAvg / students.size());
		
	}

	@Override
	public void search(List<Student> students) {
		//search의 기능 - 학번과 일치하는 학생을 찾는 메서드
		/*
		1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 정보만 출력하세요.
		2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력하세요.
		*/
		System.out.print("학번 입력: ");
		String stdId = sc.next();
		
		boolean flag = false;
		
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getStuId().contains(stdId)) {
				showPointUI();//리스트
				students.get(i).outputInfo();
				flag = false;
				break;
			}else flag = true;
			
		}
		if(flag == true) {
			System.out.println("존재하지 않는 학생 입니다.");
		}
		
		
	}

	@Override
	public void modify(List<Student> students) {
		//modify의 기능 - 학번과 일치하는 정보를 수정하는 메서드
		/*
		1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 국어,영어,수학 점수를 수정하세요.
		2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력 하세요.
		*/
		System.out.println("수정하고 싶은 학번 입력");
		System.out.print("> ");
		String stdId = sc.next();
		
		boolean flag = false; //조회 판단
		
		for(int i = 0; i < students.size(); i++) { //학번 조회
			if(students.get(i).getStuId().contains(stdId)) { //학번 발견
				//점수 수정
				System.out.print("국어: ");
				students.get(i).setKor(sc.nextInt());
				System.out.print("영어: ");
				students.get(i).setEng(sc.nextInt());
				System.out.print("수학: ");
				students.get(i).setMath(sc.nextInt());
				flag = false;
//				return;
				break;
				//>return - 쓰여진 메서드에서 탈출
				//>break - 하나의 반복문을 벗어남
			}else flag = true;
		}
		
		if(flag == true) { //
			System.out.println("해당 학번을 검색하지 못하였습니다.");
		}
	}

	@Override
	public void delete(List<Student> students) {
		//delete기능 - 학번과 일치하는 정보를 삭제하는 기능
		/*
		1. 해당 학번과 일치하는 학생객체를 리스트에서 찾아내서 그 학생의 모든 정보를 삭제하세요.
		2. 찾는 학번이 없을시 검색하지 못했다는 메시지를 출력 하세요.
		*/
		System.out.println("삭제하고 싶은 학번 입력");
		System.out.print("> ");
		String stdId = sc.next();
		
		boolean flag = false; //조회 판단
			for(int i = 0; i < students.size(); i++) { //학번 검색
			if(students.get(i).getStuId().contains(stdId)) {//학번 발견
				System.out.println(stdId + "번 정보가 삭제 되었습니다.");
				students.remove(i);
				flag = false;
				break;
			}else flag = true;
		}
	
		if(flag == true) {
			System.out.println("존재하지 않는 학번입니다");
		}
		
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	
	 
}





























