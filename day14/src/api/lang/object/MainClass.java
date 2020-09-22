package api.lang.object;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * # Object클래스(최상위 부모)
		 * - equals(): 동일객체인지 확인
		 * - hashcode(): 객체의 숫자값
		 * - toString(): 객체자체를 문자열의 형태로 반환(오버라이딩 해서 많이 사용)
		 * - clone(): 객체 복사
		 * - getClass: 현재 실행되는 클래스를 반환
		 * - finallize(): 객체가 소명되기 전에 실행
		 * 
		 */
		
		Person park = new Person("박찬호");
		
		Person kim = new Person("김길동");
		
		boolean bool = park.equals(kim);
		System.out.println("이름이 같음?: " + bool);
		
		System.out.println();
		System.out.println(park.toString()); //toString을 오버라이딩해서 바꿔준다
		
		
		Person clonePerson = new Person("복제인간");
		try {
			Person p = (Person)clonePerson.clone(); //Person타입으로 캐스팅 후 사용
			System.out.println(p.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		//객체 소멸 확인 - finalize()
		park = null;
		kim = null;
		clonePerson = null;
		System.gc(); //garbaegeCollector 실행		
		//쓰레기 수집기는 자동으로 실행하기 때문에 간섭이 불가능하다
		//>소멸되는 순서가 랜덤이다.
		
		
	}
}



































