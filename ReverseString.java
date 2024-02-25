package com.hughes.exercises.tasks;


/*Problem Statement -> Reverse the characters in a string and print them from right to left
* i/p: "Hyderabad"
* o/p: "dabaredyH"
*/


/*
 * Author: Mrityunjay Shrivastava
 * Employee ID: T00786
 */

public class ReverseString {
	
	public static void main(String args[]) {				//Driver function
		String InputString = "Hyderabad";					//input string
		for(int i=InputString.length()-1;i>=0;i--) {		//For loop runs from last index to 0, printing character at each index
			System.out.print(InputString.charAt(i));	
		}
	}
}
