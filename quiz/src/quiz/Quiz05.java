package quiz;

public class Quiz05 {
	
	public static void main(String[] args) {
		
		//-5 ~ 5까지 랜덤값을 만들고 0이라면 0출력, 양수라면 양수, 음수라면 음수 출력
		//3항 연산식으로 처리
		
		int ranNum = (int)(Math.random()*11) - 5;
		String result = ranNum >= 0 ? (ranNum == 0 ? "0" : "양수") : "음수";
		
		System.out.println("ranNum의 값: " + ranNum);
		System.out.println(result);
//		System.out.println(ranNum == 0 ? "0" : ranNum > 0 ? "양수" : "음수");
		
	}
	
	
	
}
