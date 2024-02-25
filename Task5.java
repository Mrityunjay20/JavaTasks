package com.hughes.exercises.tasks;
/*
 * i/p:"Computer"
 * o/p: r e t u p m o c
 * 
 * Author:Mrityunjay Shrivastava
 * emp id: T00786
 */
public class Task5 {
	public static void main(String[] args) {				//Driver function
		String InputString = "Computer";					//input string
		for(int i=InputString.length()-1;i>=0;i--) {		//For loop runs from last index to 0, printing character at each index
			System.out.print(InputString.charAt(i)+" ");	//prints a space after printing a char
		}
	}
}
