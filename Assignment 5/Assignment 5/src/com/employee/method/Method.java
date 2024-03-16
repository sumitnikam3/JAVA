package com.employee.method;
import com.employee.main.*;
public class Method extends Employee {
		public void emp(String a) {
			System.out.println("(M1)Single Argument    : "+a);
		}
		public void emp (String a , int b , float c) {
			System.out.println("(M2)Employee Name 		: "+a);
			System.out.println("(M2)Employee id   		: "+b);
			System.out.println("(M3)Employee Salary 	: "+c);
		}
		public void emp (String a , float b , int c) {
			System.out.println("(M3)Employee Name  		: "+a);
			System.out.println("(M3)Employee Salary		: "+b);
			System.out.println("(M3)Employee Experience : "+c);
			
		}
		
		public void emp() {
			System.out.println("(M3)Without Parameters And Arguments :)");
		}
}
