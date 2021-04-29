package kodlamaIoSimulation;

public class User {
	private int userId;
	private String userFirstName;
	private String userLastName;
	private String userPassword;
	
	public User(int userId,String userFirstName,String userLastName,String userPassword) {
		super();
		this.userId=userId;
		this.userFirstName=userFirstName;
		this.userLastName=userLastName;
		this.userPassword=userPassword;
	}
	public User() {
		
	}
	
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserId() {
		return userId;
	}
}
