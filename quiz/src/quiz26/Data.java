package quiz26;

public class Data {
	
	private String location;
	private String size;
	private String year;
	private String month;
	private String price;
	
	public Data() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Data(String location, String size, String year, String month, String price) {
		super();
		this.location = location;
		this.size = size;
		this.year = year;
		this.month = month;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Data [location=" + location + ", size=" + size + ", year=" + year + ", month=" + month + ", price="
				+ price + "]";
	}


	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
	
}
