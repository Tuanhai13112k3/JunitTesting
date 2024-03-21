/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author acer
 */
public class StudentManagementTest {

    private ArrayList<Student> studentList;

    public StudentManagementTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        studentList = new ArrayList<>();
    }

    @After
    public void tearDown() {
    }

//1
 @Test
//    public void testFindAndSort() {
//        System.out.println("findAndSort");
//        studentList.add(new Student("123", "John", "1", "Math"));
//        studentList.add(new Student("456", "John Cena", "5", "Physics"));
//        studentList.add(new Student("789", "Alice", "2", "Physics"));
//
//        String input = "jo\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
////
////        // Execute method
////        studentManagement.findAndSort(studentList);
////        ArrayList<Student> studentList = null;
//        StudentManagement instance = new StudentManagement();
//        instance.findAndSort(studentList);
//        // TODO review the generated test code and remove the default call to fail.
//        assertEquals("123", studentList.get(0).getId());
//        assertEquals("456", studentList.get(1).getId());
//    }
    
    
//2
        public void testFindAndSort() {
        System.out.println("findAndSort");
        ArrayList<Student> studentList = new ArrayList<>();
        String input = "jo\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
//
//        // Execute method
//        studentManagement.findAndSort(studentList);
//        ArrayList<Student> studentList = null;
        StudentManagement instance = new StudentManagement();
        instance.findAndSort(studentList);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("", "");
            fail("Student list is empty!");
    }
//        
//        
//        
//        //3
//            public void testFindAndSort() {
//        System.out.println("findAndSort");
//        studentList.add(new Student("123", "John", "1", "Math"));
//        studentList.add(new Student("456", "John Cena", "5", "Physics"));
//        studentList.add(new Student("789", "Alice", "2", "Physics"));
//
//        String input = "Aka\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
////
////        // Execute method
////        studentManagement.findAndSort(studentList);
////        ArrayList<Student> studentList = null;
//        StudentManagement instance = new StudentManagement();
//        instance.findAndSort(studentList);
//        // TODO review the generated test code and remove the default call to fail.
//        assertEquals("", "");
//        fail("No student be found!");
//    }
        
//    /**
//     * Test of report method, of class StudentManagement.
//     */     
    @Test
    public void testReport() {
        System.out.println("report");
        studentList.add(new Student("123", "John", "1", "Math"));
        studentList.add(new Student("456", "John Cena", "5", "Physics"));
        studentList.add(new Student("789", "Alice", "2", "Physics"));
        StudentManagement instance = new StudentManagement();
        instance.report(studentList);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals("John", studentList.get(0).getStudentName());
        assertEquals("John Cena", studentList.get(1).getStudentName());
         assertEquals("Alice", studentList.get(2).getStudentName());
    }
    
    
//    @Test
//    public void testReport() {
//        System.out.println("report");
////        ArrayList<Student> studentList = new ArrayList<>();
//        StudentManagement instance = new StudentManagement();
//        instance.report(studentList);
//        // TODO review the generated test code and remove the default call to fail.
////        assertEquals("John", studentList.get(0).getStudentName());
////        assertEquals("John Cena", studentList.get(1).getStudentName());
//         assertEquals("", "");
//         fail("Student list is empty!");
//    }
}
