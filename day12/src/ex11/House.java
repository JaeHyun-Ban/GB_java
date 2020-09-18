package ex11;

public class House {

	// 2) House클래스의 생성자에서는 크기가 10인 Person배열을 초기화합니다.
	private Person[] persons = new Person[10];
	private int index = 0;

	// 3) House클래스는 Person객체를 순서대로 저장하는 getIn()메서드를 완성하세요.
	public void getIn(Person p) {
		persons[index] = p;
		index++;
	}

	//5) House클래스는 Person배열을 반환하는 getter메서드를 생성해주세요.
	public Person[] getPersons() {
		return persons;
	}

	public void setPersons(Person[] persons) {
		this.persons = persons;
	}
	//4) House클래스는 배열에 저장된 Person객체의 이름,나이를 출력하는 print()메서드를 선언하세요.
	void print() {

		for (int i = 0; i < index; i++) {
			System.out.println("------------------------------");
			System.out.println("이름: " + persons[i].getName());
			System.out.println("나이: " + persons[i].getAge());
		}

	}

}
