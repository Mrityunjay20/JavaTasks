package com.hughes.exercises.tasks;
/*
 * Problem statement:
 * add values from 239 till 699 using for loop
	239+230+241...................+698+699
	
	Author:Mrityunjay Shrivastava
	Emp ID:T00786
 */
public class Task8 {									
	public static void main(String[] args) {				//Driver function	
		int count=0;										//integer to keep sum of the number the code is at
		for(int i=239;i<=699;i++) {
			count += i;										//add numbers to the total count
		}
		System.out.println("Sum of all values from 239 till 699 is: "+ count);  //print the total sum
	}
}
