package com.hughes.exercises.tasks;
/*
 * problem statement: 
 * i/p:3
 * o/p:+++
 * 
 * i/p:4
 * o/p:++++
 * 
 * 
 * Author: Mrityunjay Shrivastava
 * emp id:T00786
 */

public class Task4 {
	public static void main(String[] args) {		//driver function
		int Input= 4;								//input integer
		while(Input>0) {							//While loop to run as many times as the integer and print "+"
			System.out.print("+");
			Input--;
		}
	}
}
