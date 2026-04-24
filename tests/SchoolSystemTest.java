import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SchoolSystemTest {

    @Test
    void testAddGradeSuccess() {
        SchoolSystem system = new SchoolSystem();

        Student s = new Student("123");
        Course c = new Course("OOP", "OOP");
        Lecturer l = new Lecturer("Jan");

        boolean result = system.addGrade(s, c, 1, l);

        assertTrue(result);
    }

    @Test
    void testAddDuplicateGradeFails() {
        SchoolSystem system = new SchoolSystem();

        Student s = new Student("123");
        Course c = new Course("OOP", "OOP");
        Lecturer l = new Lecturer("Jan");

        system.addGrade(s, c, 1, l);
        boolean result = system.addGrade(s, c, 2, l);

        assertFalse(result);
    }

    @Test
    void testDuplicateWithDifferentInstances() {
        SchoolSystem system = new SchoolSystem();

        Student s1 = new Student("123");
        Student s2 = new Student("123"); // jiná instance

        Course c = new Course("OOP", "OOP");
        Lecturer l = new Lecturer("Jan");

        system.addGrade(s1, c, 1, l);
        boolean result = system.addGrade(s2, c, 2, l);

        assertFalse(result);
    }
}