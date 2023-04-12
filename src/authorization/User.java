package authorization;

public class User {
	private String name;
	private int age;
	private long mobileNumber;
	private String city;
	private String password;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String name, int age, long mobileNumber, String city, String password) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNumber = mobileNumber;
		this.city = city;
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", mobileNumber=" + mobileNumber + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
