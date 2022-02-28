package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class CEONewSalTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		Employee CEO = new Employee();
		double result = CEO.newSalary(100000);
		assertEquals(110000, result);
	}

}
