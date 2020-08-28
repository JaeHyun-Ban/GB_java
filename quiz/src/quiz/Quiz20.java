package quiz;

import java.util.Arrays;

public class Quiz20 {
	public static void main(String[] args) {
		
		//금액을 큰 금액부터 거슬러 몇개가 나와야 하는지 처리.
		
		int[] coin = {1000, 500, 100, 50, 10};	//동전의 금액
		int money = 17780;	//금액
		
		int[] count = new int[coin.length];
		
		/*
		while(i < coin.length) {
			System.out.println(coin[i] + "의 개수: " + money /coin[i]);
			
			money %= coin[i];
			
			i++;
		}
		*/
		
		while(money != 0) {
			
			for(int i = 0; i < coin.length; i++) {
				count[i] = money/coin[i];
				money -= (money/coin[i]) * coin[i];
					
			}
		}
		
		for(int i = 0; i < coin.length; i++) {
			System.out.println(coin[i] + "원: " + count[i] + "개");
		}
		
//		System.out.println(Arrays.toString(count));
	}
}
