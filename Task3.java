package com.hughes.exercises.tasks;
import java.io.Console;
import java.util.Vector;

/*
 * problem-> applicable upto 6 digits
 * i/p:34567
 * o/p:thirty four thousand five hundred and sixty seven only
 * 
 * 
 * Author:Mrityunjay Shrivastava
 * Emp ID:T00786
 */
public class Task3 {
	public static void main(String[] args) {
		Vector<String> arr = new Vector<String>();
		Integer finalInputInteger = 324432;		
		System.out.println(finalInputInteger);
		int divisor = 100000;
		while(finalInputInteger != 0) {
			if(finalInputInteger/divisor != 0) {
				if(finalInputInteger.toString().length() == 2 || finalInputInteger.toString().length() == 5){
					arr.add(numberInWordt(finalInputInteger/divisor)+" ");
				}
//				else if(finalInputInteger.toString().length() == 2 || finalInputInteger.toString().length() == 5 ) {
//					arr.add(numberInWordt(finalInputInteger/divisor)+" ");
//				}
				else {
				arr.add(numberInWord(finalInputInteger/divisor)+" ");}
			}switch (finalInputInteger.toString().length()) {
			case 6:
				arr.add("lakh ");
				break;
			case 4:
				arr.add("thousand ");
				break;
			case 3:
				arr.add("hundred ");
				break;
			}
			finalInputInteger %= divisor;
			divisor /= 10;
		}
		for (Object object : arr) {
			System.out.print(object);
		}
		System.out.println("only.");
		
	}
	
	public static String numberInWord(int num) {
		switch (num) {
		case 1:
			return "one";
			
		case 2:
			return "two";		

		case 3:
			return "three";

		case 4:
			return "four";
			
		case 5:
			return "five";
			
		case 6:
			return "six";
			
		case 7:
			return "seven";
			
		case 8:
			return "eight";
			
		case 9:
			return "nine";
		case 0:
			return " ";

		default:
			return "wrong 1";}}
	public static String numberInWordt(int num) {
		switch (num) {
		case 1:
			return "ten";
			
		case 2:
			return "twenty";		
	
		case 3:
			return "thirty";
	
		case 4:
			return "fouty";
			
		case 5:
			return "fifty";
			
		case 6:
			return "sixty";
			
		case 7:
			return "seventy";
			
		case 8:
			return "eighty";
			
		case 9:
			return "ninety";
		case 0:
			return " ";
	
		default:
			return "wrong2";}}
// 	public static String numberInWordten(int num) {
// 		switch (num) {
// 		case 1:
// 			return "eleven";
			
// 		case 2:
// 			return "twelve";		
	
// 		case 3:
// 			return "thirteen";
	
// 		case 4:
// 			return "fourteen";
			
// 		case 5:
// 			return "fifteen";
			
// 		case 6:
// 			return "sixteen";
			
// 		case 7:
// 			return "seventeen";
			
// 		case 8:
// 			return "eighteen";
			
// 		case 9:
// 			return "nineteen";
// 		case 0:
// 			return "ten";
	
// 		default:
// 			return "wrong2";}
// 		}
}

	
