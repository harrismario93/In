import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class FacultyTest {
	boolean methodCalled = true;

	@BeforeEach
	void setUp() throws Exception {
	}

	
	
	@AfterEach
    void afterEach() {
        System.out.println("After each test method of the Faculty  class");
    }
	@Test
	@DisplayName
	("Display Faculty Class Identity")
    void sampleTestForMethodA() {
        System.out.println("Display Faculty identity, as Lecturer, Assistant Professor, Associate Professor, Professor ");
        assertTrue( methodCalled);
    }
	

}