package com.employee.main;
import com.employee.method.*;
public class Employee {
	public static void main(String[] args) {
		Method instance = new Method();
			instance.emp("Sumit");
			instance.emp("Mayur",25001,50000.50f);
			instance.emp("Babu ",125000.5f,21);
			Employee.StaticMethod();
			instance.emp();
	}
	public static void StaticMethod() {
		System.out.println("In Static Method From Same Class");
	}
}
