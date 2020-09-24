package generic.basic2;

public class Basic<K, V> {
	
	//멀티 제네릭<Key, Value>
	private K key;
	private V value;
	
	public void put(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	//key값을 받아 value를 리턴
	public V get(K key) {
		return value;
	}
	
	//key와 value를 문자열 형태로 출력해 리턴
	@Override
	public String toString() {
		
		return "{" + key + ", " + value + "}";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}





































