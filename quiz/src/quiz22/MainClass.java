package quiz22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<>();
		Student s = new Student();
		Point p = new Point();
		
		/*
		ystem.out.println("\n*** 성적관리 프로그램 ***");
		System.out.println("# 1. 성적정보 입력");
		System.out.println("# 2. 전체성적 조회");
		System.out.println("# 3. 개별성적 조회");
		System.out.println("# 4. 성적정보 수정");
		System.out.println("# 5. 성적정보 삭제");
		System.out.println("# 6. 프로그램 종료");
		System.out.println("*********************");
		 */
		while(true) {
			InterPoint.menuInfo(); //메뉴 출력
			System.out.print("번호 선택: "); //선택
			int num = sc.nextInt();
			
			if(num == 1) {
				p.input(students);
				System.out.println();
			}else if(num == 2) {
				p.showAll(students);
				System.out.println();
			}else if(num == 3) {
				p.search(students);
				System.out.println();
			}else if(num == 4) {
				p.modify(students);
				System.out.println();
			}else if(num == 5 ) {
				p.delete(students);
			}else if(num == 6) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		
		

		

	}
}
