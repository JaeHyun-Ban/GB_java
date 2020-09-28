package ramda.basic;
//https://honbabzone.com/java/java-ramda/

public class Person {
	
	public void greeting(Say01 say)	{
		say.talking();
	}
	
	public void greeting(Say02 say) {
		say.talking("bye");
	}
	
	public Person greeting(Say03 say) {
		String finish = say.talking();
		Person p = new Person();
		return p;
	}
	
	
	
	
}
