//Done by Eugene
public class Tuition {
	private int tuitionCode;
	private String title;
	private String subjectGrpName;
	private String description;
	private int duration;
	private String preRequsite;
	private int yearStarted;
	public Tuition(int tuitionCode, String title, String subjectGrpName, String description, int duration,
			String preRequsite, int yearStarted) {
		this.tuitionCode = tuitionCode;
		this.title = title;
		this.subjectGrpName = subjectGrpName;
		this.description = description;
		this.duration = duration;
		this.preRequsite = preRequsite;
		this.yearStarted = yearStarted;
	}
	public int getTuitionCode() {
		return tuitionCode;
	}
	public void setTuitionCode(int tuitionCode) {
		this.tuitionCode = tuitionCode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubjectGrpName() {
		return subjectGrpName;
	}
	public void setSubjectGrpName(String subjectGrpName) {
		this.subjectGrpName = subjectGrpName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getPreRequsite() {
		return preRequsite;
	}
	public void setPreRequsite(String preRequsite) {
		this.preRequsite = preRequsite;
	}
	public int getYearStarted() {
		return yearStarted;
	}
	public void setYearStarted(int yearStarted) {
		this.yearStarted = yearStarted;
	}
	
	
	
	

}
