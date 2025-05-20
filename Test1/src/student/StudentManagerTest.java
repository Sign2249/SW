package student;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentManagerTest {

	StudentManager sm;
	@BeforeEach
	void setUp() throws Exception {
		sm = new StudentManager();
	}

	@Test
	void testAddStudent() {
		assertFalse(sm.hasStudent("Alice"));
		sm.addStudent("Alice");
	}

	@Test
	void testRemoveStudent() {
		sm.addStudent("Alice");
		assertTrue(sm.hasStudent("Alice"));
		sm.removeStudent("Alice");
		
	}

	@Test
	void testHasStudent() {
		sm.addStudent("Alice");
		assertTrue(sm.hasStudent("Alice"));
		assertThrows(IllegalArgumentException.class, () -> sm.addStudent("Bob"));
	}
	
	void testNoStudent() {
		assertFalse(sm.hasStudent("Bob"));
		assertThrows(IllegalArgumentException.class, () -> sm.removeStudent("Bob"));
	}

}
