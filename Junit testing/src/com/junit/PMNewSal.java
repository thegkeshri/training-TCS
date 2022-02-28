package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class PMNewSal {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		Employee PM = new Employee();
		double result = PM.newSalary(80000);
		assertEquals(88000, result);
	}

}
