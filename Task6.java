package com.hughes.exercises.tasks;
/*
 * problem statement: Design a program 
 * starting number:9
 * ending number:26
 * display all values between starting number and ending number
 * 
 * 
 * author:Mrityunjay Shrivastava
 * emp id:T00786
 */
public class Task6 {
	public static void main(String[] args) {		//Driver function
		int starting=9;								//Starting integer
		int ending=26;								//ending integer
		while(starting<ending-1) {					//While loop runs with value of starting integer as 9 and keeps increasing it over each 
			starting++;								//iteration and stops just as it reaches 25
			System.out.println(starting);			//While printing each value between 9 and 26
		}
	}
}
