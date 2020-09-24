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
		
		while(true) {
			InterPoint.menuInfo();
			
			System.out.print("번호 선택: ");
			int num = sc.nextInt();
			
			
			if(num == 1) {
				s.inputStuInfo();
				students.add(s);
			}else if(num == 2) {
				
				
			}else if(num == 3) {
				
			}else if(num == 4) {
				
			}else if(num == 5 ) {
				
			}else if(num == 6) {
				
			}
		}
		
		

		

	}
}
