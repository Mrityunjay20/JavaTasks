package com.hughes.exercises.tasks;

/*
 * problem statement: create a program to validate email
 * i/p: "mjx@gmail.com"
 * o/p: 'correct email'
 * 
 * i/p:'mjxgmail.com'
 * o/p: 'invalid email'
 * 
 * 
 * author: Mrityunjay Shrivastava
 * emp id: T00786
 */

public class EmailValidation {
	public static void main(String[] args) {
		String emailString = "mj21@gmail.com";

		String s = (String) emailString.trim().subSequence(emailString.length() - 10, emailString.length());
		String checkString = "@gmail.com";

		if (s.equals(checkString)) {
			System.out.println("correct email");
		} else {
			System.out.println("invalid email");
		}
		
//		System.out.println(emailString.hashCode());
	}
}
