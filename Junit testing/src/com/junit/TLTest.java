package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class TLTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		Employee TL = new Employee();
		String output = TL.addTL("Rohit", "Kumar");
		assertEquals("Rohit Kumar is the Team Lead.", output);

	}

}
