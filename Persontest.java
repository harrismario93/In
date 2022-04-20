import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Persontest {
	boolean methodCalled = true;

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Beforeeach all test methods");
	}
	@AfterEach
    void afterEach() {
        System.out.println("After each test method of the person  class");
    }

	@Test
	@DisplayName
	("Person Identity")
    void sampleTestForMethodA() {
        System.out.println("Person Class of String name, address, phoneNumber, email");
        assertTrue( methodCalled);
    }
	

}
