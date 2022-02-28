package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

class TLNewSal {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		Employee TL=new Employee();
		double result=TL.newSalary(60000);
		assertEquals(66000,result);
	}

}
