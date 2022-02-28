package com.junit;

public class Employee {

	public String addCEO(String fName, String lName) {
		return fName + " " + lName + " is the CEO.";
	}

	public String addTL(String fName, String lName) {
		return fName + " " + lName + " is the Team Lead.";

	}

	public String addPM(String fName, String lName) {
		return fName + " " + lName + " is the Project Manager.";
	}

	public double newSalary(double oldSal) {
		final float salHikePercent = 10;
		double newSal = ((salHikePercent + 100) * oldSal) / 100;
		return newSal;
	}
}
