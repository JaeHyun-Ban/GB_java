package quiz23;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetQuiz01 {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<Integer>();
		
		while(true) {
			if(set.size() == 6) break;
			int ran = (int)(Math.random()* 45) + 1;
			set.add(ran);
		}
		
		//강사님
//		Random ran = new Random();
//		while(set.size() != 6) {
//			set.add(ran.nextInt(45) + 1);
//		}
		
		
		System.out.println(set.toString());
		
		
		
		
	}
}
