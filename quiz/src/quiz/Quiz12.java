package quiz;

public class Quiz12 {
	public static void main(String[] args) {
	
		String[] arr = {"안녕", "hello", "니하오", "@#$"};
		
		/*
		 - Math.random()을 이용해서 0~3까지 랜덤수를 만든다.
		 - 해당 랜덤수를 배열에 index에 적용해서
		 - 선택된 단어가 한국어, 영어, 중국어 인지 처리
		 */
		
		int ranNum = (int)(Math.random() * arr.length);		//arr.length사용
		String a;
		System.out.println("선택된 단어: " + arr[ranNum]);
		switch (ranNum) {
		case 0:
			System.out.println("한국어");
			break;
		case 1:
			System.out.println("영어");
			break;
			
		case 2:
			System.out.println("중국어");
			break;	
		
		default:
			System.out.println("잘못된 언어입니다!");
			break;
		}
		
/////////////////////////////////////////////
//		switch (arr[ranNum]) {
//		case "안녕":
//			break;
//		case "hello":
//			break;
//		case "니하오":
//			break;
//		case "@#$":
//			break;
//		default:
//			break;
//		}
		
		
		
		
		
		
		
		
		
		
	}
}



























