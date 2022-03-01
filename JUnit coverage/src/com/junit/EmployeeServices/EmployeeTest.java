package com.junit.EmployeeServices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest {

	@Test
	void testHR() {
		Employee emp = new Employee();
		
		emp.hr.setOldSal(100000);
		double result = emp.newSalHR(emp, 10);
		
		emp.hr.setName("Gaurav keshri");
		
		String output = emp.HRName(emp);
		
		assertEquals(110000, result);
		assertEquals("Gaurav keshri", output);
	}

}
