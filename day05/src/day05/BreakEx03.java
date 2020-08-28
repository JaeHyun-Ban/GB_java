package day05;

public class BreakEx03 {
	
	public static void main(String[] args) {
		
		boolean flag = false;	//boolean을 잘 이용하면 아주 유용하게 사용할 수 있다.
		
		/*
		for(char u = 'A'; u <= 'Z'; u++) {
			
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(u + "-" + l);
				
				if(l == 'c') {	//c까지만 돌고 빠져나오기
					System.out.println();
					flag = true;
				}
				
			}//내부 for
			if(flag) break;	//true일 경우에 빠져나간다.

			
		}//외부 for
		*/
		
		//*중요!
		//반복문에 이름을 만들어 줘서 바로 빠져나가기 쉽게 만들어 준다
		// 복잡한 반복문 사이에 사용해주면 아주 편하게 반복문을 빠져나간다.
		name:for(char u = 'A'; u <= 'Z'; u++) {	//중요!
			
			for(char l = 'a'; l <= 'z'; l++) {
				System.out.println(l);
				if(l == 'c') {
					break name;
				}
			
			}
		}
		
	}
}


























