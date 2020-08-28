package quiz;

import java.util.Scanner;

public class Quiz08 {
	// quiz06
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요.");
		System.out.print("> ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println(num + "은(는) 짝수입니다.");
			} else {
				System.out.println(num + "은(는) 홀수입니다.");
			}
		} else if (num < 0) {
			System.out.println(num + "은(는) 음의 정수입니다.");
		} else {
			System.out.println("입력한 정수는 0입니다.");
		}

		sc.close();

	}
}
