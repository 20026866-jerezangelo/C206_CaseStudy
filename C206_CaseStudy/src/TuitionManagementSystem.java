import java.util.ArrayList;

public class TuitionManagementSystem {
	// extracted constants done by angelo
	private static final int DELETE_TUITION = 9;
	private static final int VIEW_TUITIONS = 8;
	private static final int ADD_QUESTION = 7;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tuition> tuitionList = new ArrayList<Tuition>();
		ArrayList<Registration> regList = new ArrayList<Registration>();
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Timetable> timetableList = new ArrayList<Timetable>();
		studentList.add(new Student("Oliver Lim Yue Xuan", "M", 91992299, "20039775@rp.edu.sg", "04/09/2003",
				"Singapore", 2021));
		tuitionList.add(new Tuition(11, "A113", "Math", "Basic", 2, "none", 2021));
		tuitionList.add(new Tuition(12, "C206", "Business", "Advance", 2, "basic must be comepleted", 2021));
		regList.add(new Registration(1, "TT01", "Raj01@outlook.com", "pending", "04-08-2021", 81234567));
		regList.add(new Registration(2, "TT04", "Shafiq15@outlook.com", "pending", "04-03-2021", 89765432));
		regList.add(new Registration(1, "TT01", "Raj01@outlook.com", "pending", "04-08-2021", 81234567));
		regList.add(new Registration(2, "TT04", "Shafiq15@outlook.com", "pending", "04-03-2021", 89765432));
		timetableList.add(new Timetable("TT01", 45, "08-08-21", "13-08-21", "1045", "1315", "ENGLISH"));

		int option = 0;
		while (option != 13) {
			TuitionManagementSystem.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == 1) {
				TuitionManagementSystem.viewAllTuition(tuitionList);
			} else if (option == 2) {
				Tuition tui = inputTuition();
				TuitionManagementSystem.addTuition(tuitionList, tui);
			} else if (option == 3) {
				Tuition tui = inputTuition();
				TuitionManagementSystem.deleteTuition(tuitionList, tui);
			} else if (option == 4) {
				TuitionManagementSystem.addRegistration(regList, null);
				
			} else if (option == 5) {
				TuitionManagementSystem.viewAllRegistrations(regList);

			} else if (option == 6) {
				TuitionManagementSystem.deleteRegistration(regList);

			} else if (option == ADD_QUESTION) {
				TuitionManagementSystem.AddTuitionTimetable(timetableList);
			} else if (option == VIEW_TUITIONS) {
				TuitionManagementSystem.viewAllTuitionTimetables(timetableList);
			} else if (option == DELETE_TUITION) {
				TuitionManagementSystem.deleteTuitionTimetable(timetableList);
			} else if (option == 10) {

			} else if (option == 11) {

			} else if (option == 12) {

			}

			else if (option == 13) {
				System.out.println("Thank you for using our Tuition Center Manager Application!");
			} else {
				System.out.println("Invalid option entered!");
			}
		}
	}

	public static void menu() {

		TuitionManagementSystem.setHeader("TUITION MANAGEMENT");
		System.out.println("1. Display Tuition");
		System.out.println("2. Add Tuition");
		System.out.println("3. Delete Tuition");
		System.out.println("4. Add Registration");
		System.out.println("5. View Registrations");
		System.out.println("6. Delete Registrations");
		System.out.println("7. Add Tuition Timetable");
		System.out.println("8. View Tuition Timetables");
		System.out.println("9. Delete Tuition Timetables");
		System.out.println("10.*oliver put ur option here*");
		System.out.println("11.*oliver put ur option here*");
		System.out.println("12.*oliver put ur option here*");
		System.out.println("13. Quit");
		Helper.line(80, "-");

	}

	// set header done by eugene
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}

	// view done by Eugene
	public static String retrieveAllTuition(ArrayList<Tuition> tuitionList) {
		String output = "";
		for (int i = 0; i < tuitionList.size(); i++) {
			output += (String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", tuitionList.get(i).getTuitionCode(),
					tuitionList.get(i).getTitle(), tuitionList.get(i).getSubjectGrpName(),
					tuitionList.get(i).getDescription(), tuitionList.get(i).getDuration(),
					tuitionList.get(i).getPreRequsite(), tuitionList.get(i).getYearStarted()));

		}
		return output;
	}

	public static void viewAllTuition(ArrayList<Tuition> tuitionList) {
		TuitionManagementSystem.setHeader("TUITION LIST");
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", "TUITION CODE", "TITLE",
				"SUBJECT GRP NAME", "DESCRIPTION", "DURATION", "PRE-REQUISITE", "YEAR STARTED");
		output += retrieveAllTuition(tuitionList);
		System.out.println(output);
	}

	// add done by Eugene
	public static Tuition inputTuition() {
		int code = Helper.readInt("Enter tuition code > ");
		String title = Helper.readString("Enter title > ");
		String subjGrpName = Helper.readString("Enter subject group name > ");
		String description = Helper.readString("Enter description > ");
		int duration = Helper.readInt("Enter duration > ");
		String preRequsite = Helper.readString("Enter pre requsite > ");
		int year = Helper.readInt("Enter year started > ");

		Tuition tui = new Tuition(code, title, subjGrpName, description, duration, preRequsite, year);
		return tui;

	}

	// done by eugene
	public static void addTuition(ArrayList<Tuition> tuitionList, Tuition tui) {

		tuitionList.add(tui);
		System.out.println("Tuition added");
	}

	// done by eugene
	public static void deleteTuition(ArrayList<Tuition> tuitionList, Tuition tui) {
		tuitionList.remove(tui);
		System.out.println("Tuition deleted");
	}

	// Oliver
	public static String retrieveStudent(ArrayList<Student> studentList) {
		String output = "";
		for (int i = 0; i < studentList.size(); i++) {
			output += String.format("%s", studentList.get(i).toString());
		}
		return output;
	}

	// Oliver
	public static void viewStudent(ArrayList<Student> studentList) {
		TuitionManagementSystem.setHeader("STUDENT LIST");
		String output = String.format("%-20s %-15s %-20s %-25s %-20s %-20s %-15s\n", "NAME", "GENDER", "MOBILE NUMBER",
				"EMAIL", "dateofbirth", "COR", "year joined");
		output += retrieveStudent(studentList);
		System.out.println(output);
	}

	// Oliver
	public static Student inputStudent() {
		String name = Helper.readString("Enter Student's Name: ");
		String gender = Helper.readString("Enter your Gender: ");
		int mobile = Helper.readInt("Enter your Mobile number: ");
		String email = Helper.readString("Enter your email: ");
		String dateofbirth = Helper.readString("Enter your Date of Birth: ");
		String CoR = Helper.readString("Enter your country of residence: ");
		int yearjoined = Helper.readInt("Enter year that you joined: ");

		Student S = new Student(name, gender, mobile, email, dateofbirth, CoR, yearjoined);
		return S;
	}

	public static void addStudent(ArrayList<Student> studentList, Student S) {

		studentList.add(S);
		System.out.println("Student Added...");
	}

	// Oliver
	public static Boolean doFindStud(ArrayList<Student> studentList, String j) {
		boolean isFound = false;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).getName() == j) {
				studentList.remove(i);
				isFound = true;
			}
		}
		return isFound;
	}

	// Oliver
	public static void deleteStudent(ArrayList<Student> studentList) {
		String name = Helper.readString("Enter your name to delete: ");

		for (int i = 0; i <= studentList.size(); i++) {
			if (studentList.get(i).getName() == name) {

				studentList.remove(i);
				System.out.println("");
			} else {
				System.out.println("Name is not found.");
			}
		}

	}
	// add registration done by Ammar

	public static Registration inputRegistration() {
		int regNum = Helper.readInt("Enter Registration Number > ");
		String ttID = Helper.readString("Enter tuition timetable ID > ");
		String email = Helper.readString("Enter email > ");
		int regNumConfirm = Helper.readInt("Enter Registration Number Again > ");
		String ttIDConfirm = Helper.readString("Enter Tuition Timetable ID again > ");
		String emailConfirm = Helper.readString("Enter email Again > ");
		String status = "pending";
		String regDate = Helper.readString("Enter Registration Date > ");
		int emergencyContact = Helper.readInt("Enter Emergency Contact > ");
		
		if(regNumConfirm != regNum && !ttIDConfirm.equals(ttID) && !emailConfirm.equals(email)) {
			System.out.println("Details do not match!");
			
		}

		Registration registration = new Registration(regNum, ttID, email, status, regDate, emergencyContact);
		return registration;
	}
	
	public static void addRegistration(ArrayList<Registration> regList, Registration registration) {
		
		regList.add(registration);
		System.out.println("Registration added!");
		
	}

	// view registration done by Ammar
	public static String retrieveAllRegistrations(ArrayList<Registration> regList) {
		String output = "";
		for (int i = 0; i < regList.size(); i++) {
			output += (String.format("%-20d %-20s %-20s %-20s %-20s %-20d\n", regList.get(i).getRegNum(),
					regList.get(i).getTTID(), regList.get(i).getEmail(), regList.get(i).getStatus(),
					regList.get(i).getRegDate(), regList.get(i).getEmergencyContact()));
		}
		return output;

	}

	public static void viewAllRegistrations(ArrayList<Registration> regList) {
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", "REG ID", "TIMETABLE ID", "EMAIL",
				"STATUS", "EMERGENCY CONTACT");
		output += retrieveAllRegistrations(regList);
		System.out.println(output);
	}
	
	//Delete registration done by Ammar
	
	public static void deleteRegistration(ArrayList<Registration> regList) {
		int regNumDelete = Helper.readInt("Enter Registration number to Delete > ");
		String  regNumDeleteConfirm = Helper.readString("Are you sure?(Y/N) > " );
		
		for(int i = 0; i < regList.size(); i++) {
			if(regList.get(i).getRegNum() == regNumDelete && regNumDeleteConfirm.equalsIgnoreCase("Y")) {
				regList.remove(i);
				
			}else {
				System.out.println("Register Not Deleted.(Either Register Number not found or operation cancelled");
			}
		}
		
		
	}

	// add tuition timetable done by angelo
	public static void AddTuitionTimetable(ArrayList<Timetable> timetableList) {
		String ttID = Helper.readString("Enter Tuition ID > ");
		double price = Helper.readDouble("Enter Price > ");
		String sDate = Helper.readString("Enter Start Date (DD-MM-YY) > ");
		String sTime = Helper.readString("Enter Start Time (24H FORMAT) > ");
		String eDate = Helper.readString("Enter End Date (DD-MM-YY) > ");
		String eTime = Helper.readString("Enter End Time (24H FORMAT) > ");
		String mode = Helper.readString("Enter Mode > ");
		Timetable newTT = new Timetable(ttID.toUpperCase(), price, sDate, eDate, sTime, eTime, mode);
		timetableList.add(newTT);
		System.out.println(String.format("Timetable with ID '%s' has been successfully added!", ttID.toUpperCase()));
	}

	// view tuition timetable done by angelo
	public static void viewAllTuitionTimetables(ArrayList<Timetable> timetableList) {
		TuitionManagementSystem.setHeader("LIST OF TUITION TIMETABLES");
		String output = String.format("%-15s %-10s %-15s %-15s %-15s %-10s %-10s\n", "TUITION ID", "PRICE",
				"START DATE", "END DATE", "START TIME", "END TIME", "MODE");
		for (int x = 0; x < timetableList.size(); x++) {
			output += String.format("%-15s $%-10.2f %-15s %-15s %-15s %-10s %-10s\n", timetableList.get(x).getTTID(),
					timetableList.get(x).getPrice(), timetableList.get(x).getStartDate(),
					timetableList.get(x).getEndDate(), timetableList.get(x).getStartTime(),
					timetableList.get(x).getEndTime(), timetableList.get(x).getMode().toUpperCase());
		}
		System.out.println(output);
	}

	// delete tuition timetable done by angelo
	public static void deleteTuitionTimetable(ArrayList<Timetable> timetableList) {
		TuitionManagementSystem.viewAllTuitionTimetables(timetableList);
		String deleteInput = Helper.readString("From the above, select the timetable to delete > ");
		for (int x = 0; x < timetableList.size(); x++) {
			String output = String.format("%-15s %-10s %-15s %-15s %-15s %-10s %-10s\n", "TUITION ID", "PRICE",
					"START DATE", "END DATE", "START TIME", "END TIME", "MODE");
			if (timetableList.get(x).getTTID().equalsIgnoreCase(deleteInput)) {
				timetableList.remove(x);
				output += String.format("Timetable with ID '%s' has been successfully deleted!", deleteInput);
				System.out.println(output);
			} else {
				output += String.format("There are no existing timetables with ID '%s'", deleteInput);
				System.out.println(output);
			}
		}
	}
}
