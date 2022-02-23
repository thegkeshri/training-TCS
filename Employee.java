package com.java.access.specifier;

import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
	public String name;
	public String add;
	public double Salary;
	public int id;

	public Employee() {
		super();

	}

	public Employee(String name, String add, double salary, int id) {
		// super();
		this.name = name;
		this.add = add;
		Salary = salary;
		this.id = id;
	}

	public static void main(String[] args) {
		Employee ceo = new Employee("Rajesh", "Kolkata", 70000, 1);
		Employee pm = new Employee("Rahul", "Pune", 50000, 2);
		Employee tl = new Employee("Ravi", "Delhi", 45000, 3);
		HR hr = new HR();
		ArrayList<Employee> al = new ArrayList<>();
		al.add(ceo);
		al.add(pm);
		al.add(tl);
		hr.setEmps(al);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp id to  check for Employee details:");
		int id=sc.nextInt();
		for(Employee e:al) {
			if(e.id==id) {
				System.out.println("Emp Name:"+e.name);
				System.out.println("Old Salary:"+e.Salary);
				System.out.println("location:"+e.add);
				System.out.println("new Salary:"+hr.calculateSalary(id));
				
			}
		}
		
		
		
		

	}

}
