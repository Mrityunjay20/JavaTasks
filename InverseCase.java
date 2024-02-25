package com.hughes.exercises.tasks;

/*Problem Statement -> Convert upper case alphabets to lower case and vice-versa 
* i/p: Welcome To Mumbai 
* o/p: wELCOME tO mUMBAI
*/

/*
 * Author: Mrityunjay Shrivastava
 * Employee ID: T00786
 */

public class InverseCase {
	
	public static void main(String[] args) {         				//Driver function
		String InputString = "Welcome To Mumbai";     				//input string
		for(int i =0;i<InputString.length();i++) {					//For loop runs throughout the length of the string to check each character		
			char ch = InputString.charAt(i);						//extracts each character for checking
			if(Character.isLowerCase(ch)) {							//checks if character at this index is lower case -> If yes, then changes to upper case
				System.out.print(Character.toUpperCase(ch));		//I used character class to access/modify the properties for the single character in "ch" variable
			}
			else if(Character.isUpperCase(ch)) {
				System.out.print(Character.toLowerCase(ch));        //checks if character at this index is upper case -> If yes, then changes to lower case
			}
			else {
				System.out.print(ch);								//prints non alphabet characters that maybe present in the string
			}
		}
	}
}
