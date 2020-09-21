package inter.basic3;

public interface Printed {
	
	public void turnOn();
	public void turnOff();
	public void print(String document);
	public void colorPrint(String document, String color);
	public int copy(int n);
	//>'이 양식이 꼭 있어야한다' 라는 가이드
}
