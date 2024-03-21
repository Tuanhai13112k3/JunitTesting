import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class StudentTest {

    private StudentManagement studentManagement;
    private ArrayList<Student> studentList;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        studentManagement = new StudentManagement();
        studentList = new ArrayList<>();
    }

    @After
    public void tearDown() throws Exception {
    }

//    @Test
//    public void testCreateStudent() {
//        // Simulate user input
//        String input = "123\nJohn\n1\nMath\nN\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        // Execute method
//        studentManagement.createStudent(studentList);
//
//        // Verify student is added
//        assertEquals(1, studentList.size());
//    }

//    @Test
//    public void testFindAndSort() {
//        // Prepare test data
//        studentList.add(new Student("123", "John", "1", "Math"));
//        studentList.add(new Student("456", "Alice", "2", "Physics"));
//
//        // Simulate user input
//        String input = "jo\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        // Execute method
//        studentManagement.findAndSort(studentList);
//
//        // Verify output
//        // Assuming displayList method prints to console, so we can't directly check output here
//        // Instead, we can verify if the method executes without errors
//    }
//
//    @Test
//    public void testUpdateOrDelete() {
//        // Prepare test data
//        Student student = new Student("123", "John", "1", "Math");
//        studentList.add(student);
//
//        // Simulate user input
//        String input = "U\n123\n234\nAlice\n2\nPhysics\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        // Execute method
//        studentManagement.updateOrDelete(studentList);
//
//        // Verify student is updated
//        assertEquals("234", studentList.get(0).getId());
//        assertEquals("Alice", studentList.get(0).getStudentName());
//        assertEquals("2", studentList.get(0).getSemester());
//        assertEquals("Physics", studentList.get(0).getCourseName());
//    }
//
//    @Test
//    public void testReport() {
//        // Prepare test data
//        studentList.add(new Student("123", "John", "1", "Math"));
//        studentList.add(new Student("456", "Alice", "2", "Physics"));
//        studentList.add(new Student("789", "John", "1", "Math"));
//
//        // Execute method
//        studentManagement.report(studentList);
//
//        // Verify output
//        // Assuming displayList method prints to console, so we can't directly check output here
//        // Instead, we can verify if the method executes without errors
//    }

    /**
     * Test of createStudent method, of class StudentManagement.
     */
//    @Test
//    public void testCreateStudent() {
//        System.out.println("createStudent");
//        ArrayList<Student> studentList = null;
//        StudentManagement instance = new StudentManagement();
//        instance.createStudent(studentList);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of findAndSort method, of class StudentManagement.
     */
    @Test
    public void testFindAndSort() {
        System.out.println("findAndSort");
        ArrayList<Student> studentList = null;
        StudentManagement instance = new StudentManagement();
        instance.findAndSort(studentList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of report method, of class StudentManagement.
     */
    @Test
    public void testReport() {
        System.out.println("report");
        ArrayList<Student> studentList = null;
        StudentManagement instance = new StudentManagement();
        instance.report(studentList);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
