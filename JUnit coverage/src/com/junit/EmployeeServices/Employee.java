package com.junit.EmployeeServices;

import com.junit.EmployeeFactory.*;

public class Employee {
	
	HR hr=new HR();
	Manager mngr=new Manager();
	
	
	
	public double newSalHR(Employee emp,int hp) {
		double newSalary=(emp.hr.getOldSal()*(100+hp))/100;
		return newSalary;
	}
	
	public String HRName( Employee emp) {
		return emp.hr.getName();
	}
	
	
}
