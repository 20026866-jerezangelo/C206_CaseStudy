
public class Registration {
 //angelo 
	
	private int regNum;
	private int ttID;
	private String email;
	private String status;
	private String regDate;
	private String emergencyContact;

	public Registration(int regNum, int ttID, String email, String status, String regDate, String emergencyContact) {
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
	
	public int getTTID() {
		return ttID;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getStatus() {
		return status;
	}
	
	public String regDate() {
		return regDate();
	}
	
	public String getEmergencyContact() {
		return emergencyContact;
	}
	
	public void setEmergencyContact() {
		this.emergencyContact = emergencyContact;
		
	}
	
	public void setStatus() {
		this.status = status; 
	}
}

	
	

