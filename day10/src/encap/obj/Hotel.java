package encap.obj;

public class Hotel {
	
	private Chef chef;
	private Employee emp;
	
	public Hotel() {
		this.chef = new Chef();
		this.emp = new Employee();
	}
	
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	//get의 반환유형타입 주의
	public Chef getChef() {
		return chef;
	}
	
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public Employee getEmp() {
		return emp;
	}
	
}














































































