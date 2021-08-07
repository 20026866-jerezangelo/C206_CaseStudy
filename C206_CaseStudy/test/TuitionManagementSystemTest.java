import static org.junit.Assert.*;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TuitionManagementSystemTest {
	private Student s;
	private ArrayList<Student> studentList;
	@Before
	public void setUp() throws Exception {
		studentList = new ArrayList<Student>();
		s = new Student("oliver lim yue xuan", "M", 91992299, "20039775@rp.edu.sg", "04/09/2003", "Singapore", 2021);
	}

	@After
	public void tearDown() throws Exception {studentList = null;
	s = null;
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
	}

