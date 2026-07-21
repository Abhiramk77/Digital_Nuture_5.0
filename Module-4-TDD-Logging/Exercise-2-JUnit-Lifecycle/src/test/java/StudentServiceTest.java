import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentServiceTest {

    private static int beforeAllCalls;
    private static int afterAllCalls;
    private static int beforeEachCalls;
    private static int afterEachCalls;

    private StudentService studentService;

    @BeforeAll
    static void startSuite() {
        beforeAllCalls++;
    }

    @AfterAll
    static void endSuite() {
        afterAllCalls++;
    }

    @BeforeEach
    void setUp() {
        beforeEachCalls++;
        studentService = new StudentService();
    }

    @AfterEach
    void tearDown() {
        afterEachCalls++;
        studentService = null;
    }

    @Test
    void shouldAddStudent() {
        studentService.addStudent("Rahul");
        assertTrue(studentService.containsStudent("Rahul"));
        assertEquals(1, beforeAllCalls);
        assertTrue(beforeEachCalls >= 1);
    }

    @Test
    void shouldCountStudentsAfterAddition() {
        studentService.addStudent("Rahul");
        studentService.addStudent("Neha");
        assertEquals(2, studentService.countStudents());
    }

    @Test
    void shouldRejectEmptyName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.addStudent("   "));
        assertEquals("Name cannot be empty", exception.getMessage());
    }

    @Test
    void shouldRejectNullName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.addStudent(null));
        assertEquals("Name cannot be empty", exception.getMessage());
    }
}
