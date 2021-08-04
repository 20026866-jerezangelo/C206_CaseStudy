import java.util.ArrayList;

public class C206_CaseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tuition> tuitionList = new ArrayList<Tuition>();
		
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
	
	//add registration done by Ammar
	
	public static Registration inputRegistration() {
		int regNum = Helper.readInt("Enter Registration Number > ");
		int ttID = Helper.readInt("Enter tuition timetable ID > ");
		String email = Helper.readString("Enter email > ");
		String regDate = Helper.readString("Enter Registration Date > ");
		int emergency contact = Helper.readString("Enter Emergency Contact > ");
	}
	
	
}
