package grades;

import org.junit.Test;
import static org.junit.Assert.*;


public class StudentTest {

    @Test
    public void getGradeAverageTest() {
        Student student = new Student("Tim");
        student.addGrade(100);
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(95);
        assertEquals(96.25, student.getGradeAverage(), 0);
    }

    @Test
    public void getGradeAverageNoGradesTest(){
        Student bad = new Student("Jim");
        assertEquals(0.0, bad.getGradeAverage(), 0);
    }
}