/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * oliver lim yue xuan, 4 Aug 2021 7:09:53 pm
 */

/**
 * @author oliver
 *
 */
public class Student {
	private String name;
	private String gender;
	private int mobile;
	private String email;
	private String dateofbirth;
	private String CoR;
	private int yearjoined;
	private static String NewStudent;
	
	public Student(String name, String gender, int mobile, String email, String dateofbirth, String coR, int yearjoined) {
		this.name = name;
		this.gender = gender;
		this.mobile = mobile;
		this.email = email;
		dateofbirth = dateofbirth;
		CoR = coR;
		yearjoined = yearjoined;
	}
	public String toString() {
		return String.format("%-10s %-10s %-30s %-15s %-15s %-15s %-25", getName(), getGender(),getMobile(), getEmail(), getdateofbirth(), getCoR(), getyearjoined());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getdateofbirth() {
		return dateofbirth;
	}

	public void setdateofbirth(String dateofbirth) {
		dateofbirth = dateofbirth;
	}

	public String getCoR() {
		return CoR;
	}

	public void setCoR(String coR) {
		CoR = coR;
	}

	public int getyearjoined() {
		return yearjoined;
	}

	public void setYearJoined(int yearjoined) {
		yearjoined = yearjoined;
	}
	public static String generateStudent() {
		   return NewStudent;
		}

	}
