package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class PMTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		Employee PM = new Employee();
		String output = PM.addPM("Ramesh", "Singh");
		assertEquals("Ramesh Singh is the Project Manager.", output);

	}

}
