package entity;

public class RegistrationInformation {
	
	Integer RegistrationId;
	String FirstName;
	String LastName;
	String UserId;
	String Password;
	public Integer getRegistrationId() {
		return RegistrationId;
	}
	public void setRegistrationId(Integer registrationId) {
		RegistrationId = registrationId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
}
