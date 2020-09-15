package quiz;

import java.util.Arrays;
import java.util.Random;

public class MethodQuiz03 {
	
	//Quiz 18, 19,20,21
	public static void main(String[] args) {
		
		String str = quiz18(8);
		System.out.println("자바자바...?: " + str);
		System.out.println("----------------------------");
		System.out.println("약수의 합: " + quiz19(10));
		System.out.println("----------------------------");
		int num20 = quiz20(10);
		System.out.println("소수의 개수: " + num20);
		System.out.println("----------------------------");
		int num21 = quiz21(7, 9);
		System.out.println("7~9사이의 수의 합: " + num21);
		int num211 = quiz21(9, 7);
		System.out.println("9~7사이의 수의 합: " + num211);
		System.out.println("----------------------------");
		System.out.println("quiz22");
		
		int[] arr = lottoNum();
		long money = lottoRun(arr);
		System.out.println("당첨되기까지 사용한 금액: " + money + "원");
			
	}
	
	static String quiz18(int a) {
		String str = "";
		
		for(int i = 1; i <= a; i++) {
			if(i%2 == 1) {
				str += "자";
			}else {
				str += "바";
			}
		}
		return str;
	}
	static int quiz19(int a) {
		int sum = 0;
		
		for(int i = 1; i < a; i++) {
			sum += i;
		}
		
		return sum;
	}
	static int quiz20(int a) {
		int count;
		int num = 0;
		for(int i = 2; i <= a; i++) {
			count = 0;
			for(int j = 2; j <= i; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 1) {
				num++;
			}
		}
		return num;
	}
	static int quiz21(int a, int b) {
		int sum = 0;
		if(a > b) {
			for(int i = b; i <= a; i++) {
				sum += i;
			}
		}else if(a < b){
			for(int i = a; i <= b; i++) {
				sum += i;
			}	
		}else if(a == b){
			return a;
		}
		return sum;
	}
	
	//quiz22
	static int[] lottoNum() {
		int[] arr = new int[6];	//랜덤 담을 배열
		int arrnum = 0; //배열에 담김 카운트
		
		ran:while(true) {
			if(arrnum == 6) break; //3. 배열이 꽉차면 탈출
			
			int ran = (int)(Math.random()*45) + 1; //랜덤 생성
			
			for(int i = 0; i < 6; i++) { //2. 중복확인
				if(arr[i] == ran) {		//2-1. 배열과 이번 랜덤숫자가 같아면
					continue ran;		//2-2. while 다시 시작(숫자 다시 뽑기)
				}
			}
			arr[arrnum] = ran; //1. 배열에 순서대로 넣고
			arrnum++;	//1-1. 다음순서
		}
		return arr; //반환
	}
	
	static long lottoRun(int[] a) {//당첨까지 달려보기
		int[] you = a;
		
		
		int[] clear = new int[6];
		int clearnum = 0; //중복체크
		int count = 0; //당첨번호
		long money = 0; //갈아넣은 금액
		
		//정답 확인
		long num = 0;
		end:while(true) {
//			count = 0;	//카운트 초기화
			clearnum = 0;//당첨번호 리셋
			//당첨번호생성
			start:while(true) {
				if(clearnum == 6) break;
				
				int ran = (int)(Math.random() * 45) + 1;
				
				for(int i = 0; i < 6; i++) {
					if(clear[i] == ran)
						continue start;	//continue를 통해 while부터 돌고돈다
				}	
				clear[clearnum] = ran;
				clearnum++;
			}
			
			//각 번호 sort정렬
			Arrays.sort(you);
			Arrays.sort(clear);
//			System.out.println(Arrays.toString(clear));
//			System.out.println(Arrays.toString(you));
		
			money += 5000; //한번할때마다 5000원
			num++;
			//Arrays.equals는 배열 그 자체를 비교하기 때문에 무조껀 정렬을 해주어야 한다.
			if(Arrays.equals(clear, you)) {	
				break;
			}else {
				continue end;
			}
		}
		System.out.println("당첨 시도 횟수: " + num + "회");
		return money;
	}
//			for(int i = 0; i < 6; i++) {
//				if(clear[i] == you[i]) {
//					count++;
//				}
//			}
//			if(count == 6) {
//				break;
//			}
			
//			System.out.println("당첨 시도 횟수: " + num);
//			for(int i = 0; i < 6; i++) {		//i번과
//				for(int j = 0; j < 6; j++) {
//					if(clear[i] == you[j]) { //당첨 3번, 내꺼 
//						count++;
//						break;
//					}
//				}
//			//여기 도착시 모든 번호가 다 맞았다는것
//			}
//			if(count == 6) {
//				break;
//			}

	/////////////////////////////////////////
}


























