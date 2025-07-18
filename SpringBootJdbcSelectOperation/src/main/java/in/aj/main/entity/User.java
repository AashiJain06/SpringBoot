package in.aj.main.entity;

public class User {
	private String name;
	private int roll;
	private String city;
	public User()
	{
		
	}
	
	public User(String name , int roll, String city)
	{
		this.name = name;
		this.roll = roll;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
