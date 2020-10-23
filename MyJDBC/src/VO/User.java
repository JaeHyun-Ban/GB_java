package VO;

public class User {
	private String id;
	private String name;
	private String phone;

	public User() {
	}

	public User(String id, String name, String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
       return name;
   }
}