package com.hughes.exercises.tasks;
/*Problem Statement -> 
* i/p: a b c d e f
  o/p: f1 e2 d3 c4 b5 a6
*/

/*
 * Author: Mrityunjay Shrivastava
 * Employee ID: T00786
 */
public class Task2 {

	public static void main(String[] args) {					//Driver code
		String s1 = "a b c d e f";								//input string
		int count = 0;											//variable to keep track of alphabets printed
		for (int i = s1.length() - 1; i >= 0; i--) {			//For loop runs across the length of the string, from end to index 0
			
			if (Character.isAlphabetic(s1.charAt(i))) {			//checks the type of character at each index of the string
				count++;										//if its an alphabetic character, count increases
				System.out.print(s1.charAt(i)+""+count+" ");	//Prints the letter
			}
		}
	}

}
