package day05;

public class ContinueEx01 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("--------------------------------");
		
		int i = 1;
		quiz:while(i <= 10) {	//continue도 이름 붙히기 가능
			
			if(i % 2 == 0) {
				i++;	//추가해서 while이 무한루프에 빠지지 않도록해준다.
				continue quiz;
			}
			System.out.println(i);
			i++;	//continue때문에 만나지 못함
		}
		
		
		
		
	}
}






































