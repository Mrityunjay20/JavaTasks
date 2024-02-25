package com.edu.users;

import java.util.Arrays;

/*
 * Sample Array:[20,20,30,40,50,50,50]
 * after removing duplicate elements, program should return 4 as the new length of the array
 * 
 * o/p: new array: [20,30,40,50]
 * 
 * 
 * author: Mrityunjay Shrivastava	
 * emp code: T00786
 */

public class RemoveDuplicate {
	public static void main(String[] args) {  //driver function
		int arr[] = {20,20,30,10,10,40,50,50};  //input array
//		Arrays.sort(arr);                    // array function to sort the input array(only if need sorted array)
		System.out.println("input array");		
		for(int i =0;i<arr.length;i++) {      // prints given input array
				System.out.print(arr[i]+" ");
		}

		for(int i =0;i<arr.length -1;i++) {    //uses 2 for loops to hold index and check for duplicate elements
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					pop(arr, j);			// uses pop function to remove duplicate elements
				}
			}
		}
		System.out.println("\nupdated array");
		int arrlength =0;
		for(int i =0;i<arr.length;i++) {    //prints new array
			if(arr[i] != -1) {
				arrlength++;
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println("\nUpdated array length: "+ arrlength);
		
	}
	public static void pop(int[] arr,int index) {  //function to pop duplicate element out of the array.
		for(int i = index;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = -1;
	}
}
