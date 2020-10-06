package quiz26;

public class Data02 {

	private String ie; // 수출입
	private String name;// 수출입 품목명
	private String mUSD;
	private String yUSD;

	public Data02() {
		// TODO Auto-generated constructor stub
	}

	public Data02(String ie, String name, String mUSD, String yUSD) {
		super();
		this.ie = ie;
		this.name = name;
		this.mUSD = mUSD;
		this.yUSD = yUSD;
	}

	@Override
	public String toString() {
		return "Data02 [ie=" + ie + ", name=" + name + ", mUSD=" + mUSD + ", yUSD=" + yUSD + "]";
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getmUSD() {
		return mUSD;
	}

	public void setmUSD(String mUSD) {
		this.mUSD = mUSD;
	}

	public String getyUSD() {
		return yUSD;
	}

	public void setyUSD(String yUSD) {
		this.yUSD = yUSD;
	}

}
