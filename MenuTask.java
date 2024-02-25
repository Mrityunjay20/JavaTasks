package com.edu.users;
/*
* INPUT:give input as 1,\r\n"
*                               + "then data shld be inserted\r\n"
				+ "input is 2\r\n"
				+ "then data shld be deleted\r\n"
				+ "input is 3\r\n"
				+ "then data shld be displayed\r\n"
				+ "input is 4\r\n"
				+ "then duplicate values shld be displayed\r\n"
				+ "input 5 to exit"
*
*
*
*
* Author: Mrityunjay Shrivastava 
* emp id:T00786
*/
import java.util.Scanner;
import java.util.Vector;

public class MenuTask {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in); //INITIATED SCANNER CLASS TO TAKE INPUT
		
		Vector objVector = new Vector(); //INITIATED VECTOR OBJECT TO STORE DATA

		// ADD DATA FOR TEST
		objVector.add("gsdvfgv");

		//PRINT MENU OPTIONS
		System.out.println("give input as 1,\r\n" 
				+ "then data shld be inserted\r\n"
				+ "input is 2\r\n"
				+ "then data shld be deleted\r\n"
				+ "input is 3\r\n"
				+ "then data shld be displayed\r\n"
				+ "input is 4\r\n"
				+ "then duplicate values shld be displayed\r\n"
				+ "input 5 to exit");
		
		
		boolean takeInputs = true; //USING A BOOLEAN FLAG TO HELP USER EXIT THE PROGRAM
		while(takeInputs) {  //USING WHILE LOOP TO ALLOW CONTINOUS INPUTS ONE AFTER OTHER
			System.out.println("enter input:\n");
			int input = sca.nextInt();
			
		
			switch (input) { // USE SWITCH CASE TO PROCESS VARIOUS CASES OF THE MENU
			case 1:
				System.out.println("enter data:");
				String dataString = sca.next();
				objVector.add(dataString);
				break;
			case 2:
				objVector.remove(objVector.size()-1);
				break;
			case 3:
				System.out.println(objVector);
				break;
			case 4:
				System.out.println(objVector);
				break;
			case 5:
				takeInputs = false;
				System.out.println("Successfully exited:\n");
				break;
			default:
					// if A WRONG INPUT IS ENTERED USE DEFAULT CASE
				System.out.println("Wrong input given, give input between 1 to 4\n");
				break;
			}
		}
	}
}
