package com.overloadMethod.vehicle;
import com.vehicle.cdac.*;
public class Overload extends Vehicle {
	String Carname;
	String Model;
	float CC;
		public void car (String name) {
			System.out.println("Car name  (MethodOverloading)	:	"+name);
		}
		public void car (String name,String Model) {
			System.out.println("Car name  (MethodOverloading)	:	"+name);
			System.out.println("Car Model (MethodOverloading)	:	"+Model);
		}
		public void car (String name,String Model,float CC) {
			System.out.println("Car name  (MethodOverloading)	:	"+name);
			System.out.println("Car Model (MethodOverloading)	:	"+Model);
			System.out.println("Car CC	  (MethodOverloading)	:	"+CC);
		}
	
}
