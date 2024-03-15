package com.Assignment_3;

public class WideningConversion {
		public static void main(String[] args) {
		//short i = 10;
		int i = 10;
		double num1 = i;
		//String str = Integer.parseInt(i); Not Applicable  we need to used toString
		String str = Integer.toString(i);
		
		float num3 = i;
		//double wide = num1+num2+num3;
		//boolean b = i;
		System.out.print("Error For widening to boolean Type mismatch: cannot convert from integer to boolean");
		}
}
