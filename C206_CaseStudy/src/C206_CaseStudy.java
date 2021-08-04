import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tuition> tuitionList = new ArrayList<Tuition>();
		 ArrayList<Student> studentList = new ArrayList<Student>();
		    studentList.add(new Student("Oliver Lim Yue Xuan", "M", 91992299, "20039775@rp.edu.sg", "04/09/2003", "Singapore", 2021));
		tuitionList.add(new Tuition(11 , "A113","Math", "Basic", 2, "none", 2021 ));
		tuitionList.add(new Tuition(12 , "C206","Business", "Advance", 2, "basic must be comepleted", 2021 ));
		
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
	public static void addTuition(ArrayList<Tuition> tuitionList, Tuition tui) {
		
		tuitionList.add(tui);
		System.out.println("Tuition added");
	}
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
	  }
}
