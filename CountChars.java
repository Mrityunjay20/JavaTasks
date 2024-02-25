package com.hughes.exercises.tasks;


/*Problem Statement -> Count the number of alphabets, numbers and special characters in the given string
* i/p: "gygygyg44567@#$"
* o/p: 	Numbers: 5
		Alphabets 7
		Special characters: 3
*/


/*
 * Author: Mrityunjay Shrivastava
 * Employee ID: T00786
 */

public class CountChars {
	
	public static void main(String[] args) {							//Driver function
		String s1 = "gygygyg44567@$@";									//input string
		int nums=0;														//integer variables to count number of each data type present
		int alphas =0;													//"""""""
		int specials=0;													//"""""""
		for(int i =0;i<s1.length();i++) {								//runs for loop for the length of the string
			
			char ch = s1.charAt(i);										//extracts character at each index for checking
			if(Character.isAlphabetic(ch)) {
				alphas++;												//Increments the type of variable if present, alphabet in this line
			}
			else if(Character.isDigit(ch)) {
				nums++;													//increments nums if number present
			}	
			else {
				specials++;												//increments specials if special characters present
			}
		}			
		System.out.println("Numbers: " + nums);							//prints the numbers of numbers present
		System.out.println("Alphabets " + alphas);						//prints the numbers of alphabets present
		System.out.println("Special characters: "+specials);			//prints the Number of special characters present
	}
}
