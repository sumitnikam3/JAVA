package com.student.cdac;
import java.util.*;

public class StudentDetails extends Student {
	String name;
	int age;
	int standard;
		
		public void studentEntry() {
			Scanner student = new Scanner(System.in);
			System.out.print("Enter Student Name	");
			this.name = student.nextLine();
			System.out.print("Enter Student Age	");
			this.age = student.nextInt();
			System.out.print("Enter Student Standard	");
			this.standard = student.nextInt();
		}
		public void studentDetail() {
			System.out.println("Enter Student Name	  :		"+name);
			System.out.println("Enter Student Age	  :		"+age);
			System.out.println("Enter Student Standard:		"+standard);
		}
		
		
		
			
}
