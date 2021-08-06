
public class Registration {
//Ammar has done registration class
	private int regNum;
	private String ttID;
	private String email;
	private String status;
	private String regDate;
	private int emergencyContact;

	public Registration(int regNum, String ttID, String email, String status, String regDate, int emergencyContact) {
		this.regNum = regNum;
		this.ttID = ttID;
		this.email = email;
		this.status = "Pending";
		this.regDate = regDate;
		this.emergencyContact = emergencyContact;

	}
	
	public int getRegNum() {
		return regNum;
		
	}
	
	public String getTTID() {
		return ttID;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String getRegDate() {
		return regDate;
	}
	
	public int getEmergencyContact() {
		return emergencyContact;
	}
	
	public void setEmergencyContact() {
		this.emergencyContact = emergencyContact;
		
	}
	
	public void setStatus() {
		this.status = status; 
	}
}

	
	

