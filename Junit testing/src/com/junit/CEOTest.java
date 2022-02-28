package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class CEOTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		Employee CEO = new Employee();
		String output = CEO.addCEO("Gaurav", "Keshri");
		assertEquals("Gaurav Keshri is the CEO.", output);

	}

}
