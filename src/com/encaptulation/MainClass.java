package com.encaptulation;

public class MainClass extends EmployeeDetails{
	public static void main(String[] args) {
		MainClass mainClass= new MainClass();
		mainClass.setEmployeeName("Saravanan");
		mainClass.setEmployeeId(12345);
		mainClass.setEmployeeSalary(15000);

		mainClass.getEmployeeId();
		mainClass.getEmployeeSalary();
		System.out.println(	mainClass.getEmployeeName());
		System.out.println(	mainClass.getEmployeeId());
		System.out.println(	mainClass.getEmployeeSalary());
	}
}
