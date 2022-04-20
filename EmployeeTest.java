import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EmployeeTest {
	 boolean methodCalled = true;
	@BeforeEach
	void setUp() throws Exception {
	}

	
	
	@AfterEach
    void afterEach() {
        System.out.println("After each test method of the Employee class");
    }
	@Test
	@DisplayName
	("Display Staff class Identity")
    void sampleTestForMethodA() {
        System.out.println("Display Staff class name and class");
        assertTrue( methodCalled);
    }
	

}


