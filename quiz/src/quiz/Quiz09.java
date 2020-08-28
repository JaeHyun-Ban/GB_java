package quiz;

public class Quiz09 {
	
	public static void main(String[] args) {
		
		/*
		 1. 1~20까지 랜덤한 정수를 생성해서.
		 	만약 10보다 작고, 3의배수이거나, 4의 배수라면
		 	"10보다 작은 3 또는 4의 배수"를 출력
		 	
			반대의 경우 "10보다 작지 않거나 3또는 4의 배수가 아닙니다."
		 
		 */
		
		int ranNum = (int)(Math.random()*20) +1;
		System.out.println("랜덤숫자: " + ranNum);
		
		
		if(ranNum < 10 && ranNum != 0) {
			if(ranNum%3 == 0) {
				System.out.println("10보다 작은 3 또는 4의 배수");
			}else if(ranNum%4 == 0 && ranNum != 2) {
				System.out.println(ranNum + ": 10보다 작은 3 또는 4의 배수");
			}
		}else {
			System.out.println("10보다 작지 않거나 3또는 4의 배수가 아닙니다.");
		}
		
		
//		if(num < 10 && (num%3 ==0 || num%4 == 0)) {
//			System.out.println("10보다 작은 3 또는 4의 배수");
//		}else {
//			System.out.println(ranNum + ": 10보다 작은 3 또는 4의 배수");
//		}
		
					
	}
}



































