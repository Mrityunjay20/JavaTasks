package com.hughes.exercises.tasks;
/*
 * problem statement:based on the i/p, you need to display whether it is an integer or float or character or string.
	i/p: c
	o/p: character
	
	
	author:Mrityunjay Shrivastava
	emp id:T00786
	
 */
public class Task7 {
	public static void main(String[] args) {
		Character input1= 'a';					//inputs
		Integer input2= 32;						//inputs
		String input3 = "Hello";				//inputs
		Float input4 = 234234.34f;				//inputs
		
		System.out.println("input1 is of type "+input1.getClass().getSimpleName());		//code is self explanatory
		System.out.println("input2 is of type "+input2.getClass().getSimpleName());	
		System.out.println("input3 is of type "+input3.getClass().getSimpleName());
		System.out.println("input4 is of type "+input4.getClass().getSimpleName());
	}
}
