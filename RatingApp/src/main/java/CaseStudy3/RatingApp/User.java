package CaseStudy3.RatingApp;

public class User {
	private String userName;
	private String emailID;
	private String password;
	private String mobileNo;
	
	public User()
	{
		
	}

	public User(String userName, String emailID, String password, String mobileNo) {
		super();
		this.userName = userName;
		this.emailID = emailID;
		this.password = password;
		this.mobileNo = mobileNo;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	
}
