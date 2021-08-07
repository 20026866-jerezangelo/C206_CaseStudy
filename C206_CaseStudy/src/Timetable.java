/**
 * 
 */

/**
 * @author angelo
 *
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
// timetable class done by angelo
public class Timetable {
	private String TTID;
	private double price;
	private String startDate;
	private String endDate;
	private String startTime;
	private String endTime;
	private String mode;
	
	public Timetable(String tTID, double price, String startDate,
			String endDate, String startTime, String endTime, String mode) {
		TTID = tTID;
		this.price = price;
		this.startDate = startDate;
		this.endDate = endDate;
		this.startTime = startTime;
		this.endTime = endTime;
		this.mode = mode;
	}

	public String getTTID() {
		return TTID;
	}

	public void setTTID(String tTID) {
		TTID = tTID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
}

