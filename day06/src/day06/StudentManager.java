package day06;

import java.util.Scanner;

public class StudentManager {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		String[] emailList = new String[100];
		int[] ageList = new int[100];
		
		System.out.println(nameList.length);
		
		//현재위치를 나타내는 변수 index, -1에서 시작
		int index = -1;
		//저장된 사람 수를 알기 위한 변수 count
		int count = 0;
		
		list:while(true) {
			
			System.out.println("--------------------------------");
			System.out.println("[메뉴] 1.Insert, 2.Prev, 3.Next, 4.Current,"
					+ "5.Update, 6.Delete, 7.Quit");
			System.out.print("메뉴입력> ");
			int menu = sc.nextInt();	//문자가 입력되는것을 막기위해서는 menu도 String으로 받으면 된다.
			System.out.println();
			
			switch (menu) {
			case 1:
				/*
				 * 이름, 성별, 이메일, 나이를 받아서 각각 배열에 저장, 사람 수를 증가
				 */
				System.out.println("--------고객 정보 입력--------");
				System.out.print("이름> ");
				nameList[count] = sc.next();
				System.out.print("성별> ");
				genderList[count] = sc.next();
				System.out.print("이메일> ");
				emailList[count] = sc.next();
				System.out.print("나이> ");
				ageList[count] = sc.nextInt();
				count++; //사람수 증가
				System.out.println();
				System.out.println(count + "번 고객 입력 완료");
				
				break;
				
			case 2:
				System.out.println("--------이전 고객 정보--------");
				/*
				 * index <= 0 "이전 고객정보가 없습니다"
				 * 그렇지 않으면 index를 이동해서 이전 고객 정보 출력 
				 */
				if(index <= 0) {
					System.out.println("이전 고객정보가 존재하지 않습니다.");
				}else {
					index--;
					System.out.println("이름: " + nameList[index]);
					System.out.println("성별: " + genderList[index]);
					System.out.println("이메일: " + emailList[index]);
					System.out.println("나이: " + ageList[index]);
				}
				System.out.println("index:" + index);
				
				break;
				
			case 3:
				System.out.println("--------다음 고객 정보--------");
				/*
				 * 다음 고객정보를 출력할 수 없는 조건을 생각해서 "다음 고객정보가 없습니다"
				 * 그렇지 않으면 index를 이동해서 다음 고객 정보를 출력
				 */
			
//				if(nameList[index+1].equals(null)) {
				if(index >= count -1) { //이렇게 해도 괜찮다
					System.out.println("다음 고객 정보가 없습니다.");
				}else {
					index++;
					System.out.println("이름: " + nameList[index]);
					System.out.println("성별: " + genderList[index]);
					System.out.println("이메일: " + emailList[index]);
					System.out.println("나이: " + ageList[index]);
				}
				System.out.println("index:" + index);
				break;
				
			case 4:
				System.out.println("--------현재 고객 정보--------");
				/*
				 * 현재 위치를 출력할 수 있는 조건을 생각해서 현재 조건을 출력하면 됩니다.
				 * 그렇지 않으면 "현재 고객정보가 없습니다.
				 */
				System.out.println("index:" + index);
//				if(nameList[index].equals(null)) {
				if(index > 0 && index <= count) {
					System.out.println("이름: " + nameList[index]);
					System.out.println("성별: " + genderList[index]);
					System.out.println("이메일: " + emailList[index]);
					System.out.println("나이: " + ageList[index]);
				}else {
					System.out.println("현재 고객정보가 없습니다.");
				}
				
				break;
				
			case 5:
				System.out.println("--------고객 정보 수정--------");
				/*
				 * 현재 위치를 출력할 수 있는 조건을 생각해서
				 * 스캐너를 통해 순서대로 이름, 성별, 이메일, 나이를 입력받고 배열의 값을 수정
				 */
				if(index > 0 && index <= count) {
					System.out.print("이름(" + nameList[index] + "): ");
					nameList[index] = sc.next();
					System.out.print("성별(" + genderList[index] + "): ");
					genderList[index] = sc.next();
					System.out.print("이메일(" + emailList[index] + "): ");
					emailList[index] = sc.next();
					System.out.print("나이(" + ageList[index] + "): ");
					ageList[index] = sc.nextInt();
					System.out.println("정보가 수정되었습니다!");
				}else {
					System.out.println("수정할 정보가 존재하지 않습니다!");
				}		
				break;
				
			case 6:
				System.out.println("--------고객 정보 삭제--------");
				/*
				 * 현재 정보를 삭제할 수 있는 조건을 생각해서
				 * 현재 index부터 ~~뒤에 있는 배열 요소를 당겨와서 덮어 씌웁니다.
				 * 고객수를 감소
				 * 그렇지 않으면 "삭제할 데이터가 없습니다" 출력
				 */
				if(index >= 0 && index < count) {
					for(int i = index; i < count -1; i++) { //현재 위치에서 마지막 -1번째 까지
						nameList[index] = nameList[index+1];
						genderList[index] = genderList[index+1];
						emailList[index] = emailList[index+1];
						ageList[index] = ageList[index+1];
					}
					count--;
					System.out.println(nameList[index] + " 고객님의 정보가 삭제 되었습니다.");
				}else {
					System.out.println("삭제할 데이터가 없습니다.");
				}
				
				break;
			case 7:
				System.out.println("-----------종료-----------");
				//무한 루프 탈출
				sc.close();
				break list;

			default:
				System.out.println("잘못된 번호를 입력하셧습니다!");
				break;
			}
			
			
			
		}
		
		
		
	}
}












































