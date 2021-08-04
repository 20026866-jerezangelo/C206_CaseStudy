import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tuition> tuitionList = new ArrayList<Tuition>();
		ArrayList<Student> studentList = new ArrayList<Student>();
		ArrayList<Registration> regList = new ArrayList<Registration>();
		studentList.add(new Student("Oliver Lim Yue Xuan", "M", 91992299, "20039775@rp.edu.sg", "04/09/2003", "Singapore", 2021));
		tuitionList.add(new Tuition(11 , "A113","Math", "Basic", 2, "none", 2021 ));
		tuitionList.add(new Tuition(12 , "C206","Business", "Advance", 2, "basic must be comepleted", 2021 ));
		regList.add(new Registration(1,"TT01", "Raj01@outlook.com", "pending", "04-08-2021", 81234567));
	    regList.add(new Registration(2,"TT04", "Shafiq15@outlook.com", "pending", "04-03-2021", 89765432));
		
		int option = 0;
		while (option != 4) {
			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");
			
			if(option == 1) {
				C206_CaseStudy.viewAllTuition(tuitionList);
			}
			else if(option == 2) {
				Tuition tui = inputTuition();
				C206_CaseStudy.addTuition(tuitionList, tui);
				}
			else if (option == 3) {
				Tuition tui = inputTuition();
				C206_CaseStudy.deleteTuition(tuitionList, tui);
			}
			else if (option == 4) {
				System.out.println("Bye");
			}
			else {
				System.out.println("Invalid option");
			}
		}
	}
	//menu done by eugene
	public static void menu() {

		C206_CaseStudy.setHeader("TUITION");
		System.out.println("1. Display Tuition");
		System.out.println("2. Add Tuition");
		System.out.println("3. Delete Tuition");
		System.out.println("4. Quit");
		Helper.line(80, "-");
		
	}
	// set header done by eugene
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	
	//option 1 view done by Eugene
	public static String retrieveAllTuition(ArrayList<Tuition> tuitionList) {
		String output = "";
		for( int i = 0 ; i < tuitionList.size(); i++) {
			output += (String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", tuitionList.get(i).getTuitionCode(), tuitionList.get(i).getTitle(), tuitionList.get(i).getSubjectGrpName(),  tuitionList.get(i).getDescription(),tuitionList.get(i).getDuration(), tuitionList.get(i).getPreRequsite(), tuitionList.get(i).getYearStarted()));
			
		}
		return output;
	}
	public static void viewAllTuition(ArrayList<Tuition> tuitionList) {
		C206_CaseStudy.setHeader("TUITION LIST");
		String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", "TUITION CODE", "TITLE","SUBJECT GRP NAME",  "DESCRIPTION","DURATION",
			"PRE-REQUISITE", "YEAR STARTED"	);
		 output += retrieveAllTuition(tuitionList);	
		System.out.println(output);
	}
	
	//option 2 add done by Eugene
	public static Tuition inputTuition() {
		int code = Helper.readInt("Enter tuition code > ");
		String title = Helper.readString("Enter title > ");
		String subjGrpName = Helper.readString("Enter subject group name > ");
		String description = Helper.readString("Enter description > ");
		int duration = Helper.readInt("Enter duration > ");
		String preRequsite = Helper.readString("Enter pre requsite > ");
		int year = Helper.readInt("Enter year started > ");

		Tuition tui= new Tuition(code, title, subjGrpName, description, duration, preRequsite, year);
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
	//Oliver
	  public static String retrieveStudent(ArrayList<Student> studentList) {
	    String output = "";
	    for (int i = 0; i < studentList.size(); i++) {
	      output += String.format("%s", studentList.get(i).toString());
	    }
	    return output;
	  }
	  //Oliver
	  public static void viewStudent(ArrayList<Student> studentList) {
	    C206_CaseStudy.setHeader("STUDENT LIST");
	    String output = String.format("%-20s %-15s %-20s %-25s %-20s %-20s %-15s\n", "NAME", "GENDER", "MOBILE NUMBER",
	        "EMAIL", "dateofbirth", "COR", "year joined");
	    output += retrieveStudent(studentList);
	    System.out.println(output);
	  }
	//Oliver
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
	  //Oliver
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
	    //Oliver
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
	  //add registration done by Ammar
	    
	    public static Registration inputRegistration() {
	      int regNum = Helper.readInt("Enter Registration Number > ");
	      String ttID = Helper.readString("Enter tuition timetable ID > ");
	      String email = Helper.readString("Enter email > ");
	      String status = "pending";
	      String regDate = Helper.readString("Enter Registration Date > ");
	      int emergencyContact = Helper.readInt("Enter Emergency Contact > ");
	      
	      Registration registration = new Registration(regNum, ttID, email, status, regDate, emergencyContact);
	      return registration;
	    }
	  //view registration done by Ammar
	    public static String retrieveAllRegistrations(ArrayList<Registration> regList) {
	      String output = "";
	      for( int i = 0 ; i < regList.size(); i++) {
	        output += (String.format("%-20d %-20s %-20s %-20s %-20s %-20d\n",regList.get(i).getRegNum() , regList.get(i).getTTID(), regList.get(i).getEmail(),  regList.get(i).getStatus(),regList.get(i).getRegDate(), regList.get(i).getEmergencyContact()));    
	      }
	      return output; 
	      
	    }
	    public static void viewAllRegistrations(ArrayList <Registration> regList) {
	      String output = String.format("%-20s %-20s %-20s %-20s %-20s %-20s\n", "REG ID", "TIMETABLE ID", "EMAIL",  "STATUS", "EMERGENCY CONTACT");
	         output += retrieveAllRegistrations(regList);  
	        System.out.println(output);
	    }
	  }

