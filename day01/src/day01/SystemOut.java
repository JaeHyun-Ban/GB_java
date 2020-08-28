package day01;

public class SystemOut {

	public static void main(String[] args) {

		/*
		 # 코드 실행 단축키
	     - Ctrl + f11
		 - syso + Ctrl + space = 출력문 자동 생성

		 - 되돌리기: ctrl + z
		 - 전체 정렬: ctrl + a, ctrl+i
		 - 코드 위치 이동: alt + 방향키 
		 - 변수 이름 동시에 변경하기 : alt + shift + r
		 */

		//1. 개생을 포함하는 println()
		System.out.println("안녕하세요");			//println을 이용해 \n를 작성할 필요가 없다.
		System.out.println("반가워요!");


		//2. 개행이 없는  pritn()
		System.out.print("줄바꿈이 없음...");
		System.out.print("코드를 가로로 출력할 때 사용합니다\n");


		/*
		 - \n 줄바꿈
		 - \t 8칸 탭 정렬
		 - %s 문자열을 입력받음
		 - %d 정수를 입력받음
		 - %f 실수를 입력받음
		 - %c 한 글자 문자를 입력받음
		 */
		//3. 형식 지정 출력문 printf()
		System.out.printf("안녕하세요. 제 이름은 %s 이고 오늘 날짜는  %d월 %d일 입니다\n", "홍길동", 8, 20);
		System.out.printf("파이 값은  %f입니다.\n", 3.1415);				//%f는 6자리까지 기본적으ㅗㄹ 출력



		System.out.printf("파이 값은  %.4f입니다.\n", 3.1415);


	}



}





































