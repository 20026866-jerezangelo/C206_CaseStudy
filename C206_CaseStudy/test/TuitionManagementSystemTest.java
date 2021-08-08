import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TuitionManagementSystemTest {
	private Student s;
	private ArrayList<Student> studentList;
	private Registration r; 
	private ArrayList<Registration> regList;
	private Tuition t1;
	private Tuition t2;
	private Tuition t3;
	private ArrayList<Tuition>tuitionList;
	@Before
	public void setUp() throws Exception {
		studentList = new ArrayList<Student>();
		s = new Student("oliver lim yue xuan", "M", 91992299, "20039775@rp.edu.sg", "04/09/2003", "Singapore", 2021);
		regList = new ArrayList<Registration>();
		r = new Registration(1, "TT01", "Raj01@outlook.com", "pending", "04-08-2021", 81234567);
		t1 = new Tuition(001,"Introduction to programming", "Java", "Basic", 5, "None", 2021 );
		t2 = new Tuition(002,"Introduction to business", "Business", "Basic", 5,"None",2021);
		t3 = new Tuition(003,"Advance Java", "Java" , "Advance", 6, "Basic" ,2021);
		tuitionList = new ArrayList<Tuition>();
	
	}

	@After
	public void tearDown() throws Exception {studentList = null;
	s = null;
	t1 = null;
	t2 = null;
	tuitionList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
		
	}
	//Oliver
	  @Test
	  public void retrieveStud() {
	    // Test if the list is not null but empty -boundary
	    assertNotNull("Test for valid Student arraylist to retrieve", studentList);

	    // Test if the list retrieved is empty - boundary
	    String all = TuitionManagementSystem.retrieveStudent(studentList);
	    String testOutput = "";
	    assertEquals("Check viewStudentlist", testOutput, all);

	    // Given an empty list, after adding 1 item, test if the size of the list is 1 -
	    // normal
	    TuitionManagementSystem.addStudent(studentList, s);
	    assertEquals("Check that the Student arraylist size = 1", 1, studentList.size());

	    // Test if the expected output string is same as the list of timetable retrieved
	    all = TuitionManagementSystem.retrieveStudent(studentList);
	    testOutput = String.format("%-20s %-15s %-20s %-25s %-20s %-20s %-15s", "Oliver Lim Yue Xuan", "M", 91992299, "20039775@rp.edu.sg", "04/09/2003", "Singapore", 2021);
	  

	    assertEquals("Test that viewStudent", testOutput, all);
	  }
	  //Oliver
	  @Test
	  public void addStud() {
	    // check registration list is not null, so that a new item can be added - boundary
	    assertNotNull("Test if there is a valid Student arraylist to add to the", studentList);

	    // Given an empty list, after adding 1 item, the size of the list is 1 - normal
	    // The item just added is the same as the first item of the list
	    TuitionManagementSystem.addStudent(studentList, s);
	    assertEquals("Test that the size of StudentList arraylist is 1", 1, studentList.size());
	    assertSame("Test that a Student is successfully added", s, studentList.get(0));
	  }

	  // Oliver
	  @Test
	  public void doDeleteStud() {
	    // Boundary
	    assertNotNull("Test if there is a valid Student arraylist to add to the", studentList);
	    TuitionManagementSystem.addStudent(studentList, s);

	    // Error
	    Boolean isFound = TuitionManagementSystem.doFindStud(studentList, Student.generateStudent());
	    assertFalse("Test if there is a available Register found -false?", isFound);

	    // Normal
	    TuitionManagementSystem.addStudent(studentList, s);
	    isFound = TuitionManagementSystem.doFindStud(studentList, s.getName());
	    assertTrue("Test if the Student is found- true", isFound);

	    // Error
	    isFound = TuitionManagementSystem.doFindStud(studentList, Student.generateStudent());
	    assertFalse("Test if a non-existing Student is found - false?", isFound);
	  }
	  
	  // Ammar 
	  public void retrieveRegistration(){
		   // Test if the list is not null but empty -boundary
		    assertNotNull("Test for valid Registration arraylist to retrieve", regList);

		    // Test if the list retrieved is empty - boundary
		    String all = TuitionManagementSystem.retrieveAllRegistrations(regList);
		    String testOutput = "";
		    assertEquals("Check viewRegistrationlist", testOutput, all);

		    // Given an empty list, after adding 1 item, test if the size of the list is 1 -
		    // normal
		    TuitionManagementSystem.addRegistration(regList, r);
		    assertEquals("Check that the Registration arraylist size = 1", 1, studentList.size());

		    // Test if the expected output string is same as the list of timetable retrieved
		    all = TuitionManagementSystem.retrieveAllRegistrations(regList);
		    testOutput = String.format("%-20d %-15s %-20s %-25s %-20s %-20d", 1, "TT01", "Raj01@outlook.com", "pending", "04-08-2021", 81234567);
		  

		    assertEquals("Test that viewRegistration", testOutput, all);
	  }
	  
	  public void addRegistration() {
		  // check registration list is not null, so that a new item can be added - boundary
		    assertNotNull("Test if there is a valid Registration arraylist to add to the", regList);

		    // Given an empty list, after adding 1 item, the size of the list is 1 - normal
		    // The item just added is the same as the first item of the list
		    TuitionManagementSystem.addRegistration(regList, r);
		    assertEquals("Test that the size of Registration arraylist is 1", 1, regList.size());
		    assertSame("Test that a Registration is successfully added", s, studentList.get(0));
	  }
	  // Eugene 
	  public void viewAllTuition() {
			assertNotNull("Test if there is a valid tuition arraylist to retrieve details",tuitionList);
			String all =TuitionManagementSystem.viewAllTuition(tuitionList);
			String testOutput = "";
			assertEquals("Check that ViewAllTuition",testOutput,all);
			TuitionManagementSystem.addTuition(tuitionList, t1);
			TuitionManagementSystem.addTuition(tuitionList, t2 );
			assertEquals("Test that tuition size is 2",2,tuitionList.size());
	}
		public void addTuition() {
			
			assertNotNull("Check if there is a valid Timetable arrayList to add to", tuitionList);
					
			TuitionManagementSystem.addTuition(tuitionList, t3);
			assertEquals("Check that tuition arraylist size is 1", 1,tuitionList.size());
			assertSame("Check that tuition is added",t3,tuitionList.get(0));
					
		
		}
		public void deleteTuition() {
			boolean isDeleted = TuitionManagementSystem.deleteTuition(tuitionList, t1);
			assertFalse("Test if tuition have been deleted", isDeleted);
			
		}
	
	}

