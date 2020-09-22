package api.lang.object;

public class Person implements Cloneable{
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//오버라이딩 
	@Override
	public boolean equals(Object obj) {
		//Person의 이름이 같은지를 확인해서 같다면 true
		
		if(obj instanceof Person) {
			
			Person p = (Person)obj;
			
			if(p.getName().equals(this.name)) {//가리키는 대상을 잘 확인
				System.out.println("이름이 같음");
				return true; //이름이 같음
			}
		}
		
		return false; //이름이 같지 않음
	}

	//오버라이딩
	@Override
	public String toString() {
		
		return "멤버변수: 	" + name;
	}

	//protected는 super를 통해 참조할 수 있다.
	//객체 복사 메서드
	//protected이기 때문에, 사용시 오버라이딩을 통해 생성해야한다.
	//또한 cloneable 인터페이스를 구현해서 사용해야 한다.(비어있는 인터페이스이다)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}

	//메모리에서 사라지는 시점에 동작 함 
	@Override
	protected void finalize() throws Throwable {
		 
		System.out.println(this.name + "님 소멸했습니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
}






























