package import_ex;

import java.util.Scanner;

import com.abc.ABC;
import com.def.DEF;

//다른 패키지의 클래스를 사용하고 싶을 때는
//클래스 선언부 위에 패키지명을 포함한 전체 경로를 적습니다.
//import fruit.Apple;
//import fruit.Orange;

import fruit.*;	//하나씩 하면 너무 많으니 패키지를 모두 가져온다

public class MainClass {
	public static void main(String[] args) {
		
		//fruit 패키지 가져오기
		Apple a = new Apple();
		Orange o = new Orange();
		
		ABC abc = new ABC(); 
		DEF def = new DEF();
		
		//JRE폴더 안의 jar파일 속에 기본적인 도움 명령어들이 존재한다.
		//jar = java파일을 알집형태로 압출 한 것
		//rt.jar를 열어보면 그 안에 들어있다, .class는 컴파일이 완료된 파일이라는 것이다.
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		System.out.println(i);
		System.out.println(a);
		System.out.println(o);
		System.out.println(abc);
		
		
	}
}













































