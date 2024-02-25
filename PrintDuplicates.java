package com.edu.users;

import java.util.Arrays;
import java.util.PrimitiveIterator.OfDouble;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,20,30,10,10,40,50,50};  //input array
		Arrays.sort(arr);                    // array function to sort the input array(only if need sorted array)
		System.out.println("input array");		
		for(int i =0;i<arr.length;i++) {      // prints given input array
				System.out.print(arr[i]+" ");
		}
		System.out.println("");

		for(int i =0;i<arr.length -1;i++) {//uses 2 for loops to hold index and check for duplicate elements
			int duplicates = 1;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					duplicates++;
					pop(arr, j);
				}
			}
			if(arr[i]>0) {
			System.out.println("number: "+arr[i]+"-> instances: "+duplicates);}
		}
	}
	public static void pop(int[] arr,int index) {  //function to pop duplicate element out of the array.
		for(int i = index;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = -1;
	}

}
